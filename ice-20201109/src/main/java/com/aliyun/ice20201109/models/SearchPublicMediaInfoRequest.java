// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchPublicMediaInfoRequest extends TeaModel {
    @NameInMap("Authorized")
    public Boolean authorized;

    @NameInMap("DynamicMetaDataMatchFields")
    public String dynamicMetaDataMatchFields;

    @NameInMap("EntityId")
    public String entityId;

    @NameInMap("Favorite")
    public Boolean favorite;

    @NameInMap("MediaIds")
    public String mediaIds;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SortBy")
    public String sortBy;

    public static SearchPublicMediaInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchPublicMediaInfoRequest self = new SearchPublicMediaInfoRequest();
        return TeaModel.build(map, self);
    }

    public SearchPublicMediaInfoRequest setAuthorized(Boolean authorized) {
        this.authorized = authorized;
        return this;
    }
    public Boolean getAuthorized() {
        return this.authorized;
    }

    public SearchPublicMediaInfoRequest setDynamicMetaDataMatchFields(String dynamicMetaDataMatchFields) {
        this.dynamicMetaDataMatchFields = dynamicMetaDataMatchFields;
        return this;
    }
    public String getDynamicMetaDataMatchFields() {
        return this.dynamicMetaDataMatchFields;
    }

    public SearchPublicMediaInfoRequest setEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }
    public String getEntityId() {
        return this.entityId;
    }

    public SearchPublicMediaInfoRequest setFavorite(Boolean favorite) {
        this.favorite = favorite;
        return this;
    }
    public Boolean getFavorite() {
        return this.favorite;
    }

    public SearchPublicMediaInfoRequest setMediaIds(String mediaIds) {
        this.mediaIds = mediaIds;
        return this;
    }
    public String getMediaIds() {
        return this.mediaIds;
    }

    public SearchPublicMediaInfoRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public SearchPublicMediaInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchPublicMediaInfoRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

}
