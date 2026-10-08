// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryOperationAuditInfoDetailResponseBody extends TeaModel {
    /**
     * <p>Review information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;regType&quot;:1,&quot;registrantName&quot;:&quot;张三&quot;,&quot;telephone&quot;:&quot;1390123****&quot;,&quot;account&quot;:&quot;<a href="mailto:username@example.com">username@example.com</a>&quot;,&quot;reason&quot;:1,&quot;remark&quot;:&quot;账号丢失&quot;}</p>
     */
    @NameInMap("AuditInfo")
    public String auditInfo;

    /**
     * <p>Review Status. Valid values:  </p>
     * <ul>
     * <li><strong>0</strong>: Pending supplementary information.  </li>
     * <li><strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>: Under review.  </li>
     * <li><strong>5</strong>: Review failed.  </li>
     * <li><strong>6</strong>: Review succeeded.  </li>
     * <li><strong>7</strong>: Review canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    /**
     * <p>Review Type. Valid value:  </p>
     * <p><strong>1</strong>: Offline domain name transfer.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditType")
    public Integer auditType;

    /**
     * <p>Name of the reviewed business.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com等域名线下转移</p>
     */
    @NameInMap("BusinessName")
    public String businessName;

    /**
     * <p>Record creation time.</p>
     * 
     * <strong>example:</strong>
     * <p>1581919010100</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <p>Domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com,aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Review record ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>Review remark.</p>
     * 
     * <strong>example:</strong>
     * <p>审核通过</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9DFCF6F8-243C-40EC-8035-4B12FEFD7D1L</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Record update time.</p>
     * 
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
