// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryOperationAuditInfoDetailResponseBody extends TeaModel {
    @NameInMap("AuditInfo")
    public String auditInfo;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditType")
    public Integer auditType;

    @NameInMap("BusinessName")
    public String businessName;

    /**
     * <strong>example:</strong>
     * <p>1581919010100</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>example.com,aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public String id;

    @NameInMap("Remark")
    public String remark;

    /**
     * <strong>example:</strong>
     * <p>9DFCF6F8-243C-40EC-8035-4B12FEFD7D1L</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1581919010101</p>
     */
    @NameInMap("UpdateTime")
    public Long updateTime;

    public static QueryOperationAuditInfoDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationAuditInfoDetailResponseBody self = new QueryOperationAuditInfoDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOperationAuditInfoDetailResponseBody setAuditInfo(String auditInfo) {
        this.auditInfo = auditInfo;
        return this;
    }
    public String getAuditInfo() {
        return this.auditInfo;
    }

    public QueryOperationAuditInfoDetailResponseBody setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public QueryOperationAuditInfoDetailResponseBody setAuditType(Integer auditType) {
        this.auditType = auditType;
        return this;
    }
    public Integer getAuditType() {
        return this.auditType;
    }

    public QueryOperationAuditInfoDetailResponseBody setBusinessName(String businessName) {
        this.businessName = businessName;
        return this;
    }
    public String getBusinessName() {
        return this.businessName;
    }

    public QueryOperationAuditInfoDetailResponseBody setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public QueryOperationAuditInfoDetailResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryOperationAuditInfoDetailResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryOperationAuditInfoDetailResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QueryOperationAuditInfoDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOperationAuditInfoDetailResponseBody setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }
    public Long getUpdateTime() {
        return this.updateTime;
    }

}
