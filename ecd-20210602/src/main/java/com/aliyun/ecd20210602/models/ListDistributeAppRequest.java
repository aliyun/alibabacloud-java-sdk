// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListDistributeAppRequest extends TeaModel {
    @NameInMap("CateId")
    public Long cateId;

    @NameInMap("IsFree")
    public String isFree;

    @NameInMap("KeyName")
    public String keyName;

    @NameInMap("Language")
    public String language;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceType")
    public String sourceType;

    public static ListDistributeAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDistributeAppRequest self = new ListDistributeAppRequest();
        return TeaModel.build(map, self);
    }

    public ListDistributeAppRequest setCateId(Long cateId) {
        this.cateId = cateId;
        return this;
    }
    public Long getCateId() {
        return this.cateId;
    }

    public ListDistributeAppRequest setIsFree(String isFree) {
        this.isFree = isFree;
        return this;
    }
    public String getIsFree() {
        return this.isFree;
    }

    public ListDistributeAppRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public ListDistributeAppRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListDistributeAppRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListDistributeAppRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDistributeAppRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDistributeAppRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDistributeAppRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
