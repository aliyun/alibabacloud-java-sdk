// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SearchPublicMediaInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Authorized")
    public Boolean authorized;

    /**
     * <strong>example:</strong>
     * <p>&quot;ApprovalStatus=\&quot;Available\&quot;&amp;MaterialBags=\&quot;boutiquemusic\&quot;&amp;Mood=\&quot;Nervous\&quot;&quot;</p>
     */
    @NameInMap("DynamicMetaDataMatchFields")
    public String dynamicMetaDataMatchFields;

    /**
     * <strong>example:</strong>
     * <p>Copyright_Music</p>
     */
    @NameInMap("EntityId")
    public String entityId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Favorite")
    public Boolean favorite;

    /**
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong>,<strong><strong>15d4a4b0448391508f2cb486</strong></strong></p>
     */
    @NameInMap("MediaIds")
    public String mediaIds;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>UsageCount:Desc,UnitPrice:Asc</p>
     */
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
