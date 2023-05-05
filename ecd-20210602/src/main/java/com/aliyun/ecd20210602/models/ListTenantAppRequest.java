// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class ListTenantAppRequest extends TeaModel {
    @NameInMap("AppUid")
    public String appUid;

    @NameInMap("AuditStatus")
    public Integer auditStatus;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("CateId")
    public Integer cateId;

    @NameInMap("CateIdList")
    public String cateIdList;

    @NameInMap("DistributeTypeList")
    public String distributeTypeList;

    @NameInMap("IsFree")
    public String isFree;

    @NameInMap("IsFreeList")
    public String isFreeList;

    @NameInMap("KeyName")
    public String keyName;

    @NameInMap("Language")
    public String language;

    @NameInMap("OderBy")
    public String oderBy;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("SourceTypeList")
    public String sourceTypeList;

    @NameInMap("Status")
    public String status;

    public static ListTenantAppRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTenantAppRequest self = new ListTenantAppRequest();
        return TeaModel.build(map, self);
    }

    public ListTenantAppRequest setAppUid(String appUid) {
        this.appUid = appUid;
        return this;
    }
    public String getAppUid() {
        return this.appUid;
    }

    public ListTenantAppRequest setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public ListTenantAppRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ListTenantAppRequest setCateId(Integer cateId) {
        this.cateId = cateId;
        return this;
    }
    public Integer getCateId() {
        return this.cateId;
    }

    public ListTenantAppRequest setCateIdList(String cateIdList) {
        this.cateIdList = cateIdList;
        return this;
    }
    public String getCateIdList() {
        return this.cateIdList;
    }

    public ListTenantAppRequest setDistributeTypeList(String distributeTypeList) {
        this.distributeTypeList = distributeTypeList;
        return this;
    }
    public String getDistributeTypeList() {
        return this.distributeTypeList;
    }

    public ListTenantAppRequest setIsFree(String isFree) {
        this.isFree = isFree;
        return this;
    }
    public String getIsFree() {
        return this.isFree;
    }

    public ListTenantAppRequest setIsFreeList(String isFreeList) {
        this.isFreeList = isFreeList;
        return this;
    }
    public String getIsFreeList() {
        return this.isFreeList;
    }

    public ListTenantAppRequest setKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }
    public String getKeyName() {
        return this.keyName;
    }

    public ListTenantAppRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListTenantAppRequest setOderBy(String oderBy) {
        this.oderBy = oderBy;
        return this;
    }
    public String getOderBy() {
        return this.oderBy;
    }

    public ListTenantAppRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public ListTenantAppRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTenantAppRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTenantAppRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public ListTenantAppRequest setSourceTypeList(String sourceTypeList) {
        this.sourceTypeList = sourceTypeList;
        return this;
    }
    public String getSourceTypeList() {
        return this.sourceTypeList;
    }

    public ListTenantAppRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
