// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryOperationAuditInfoListRequest extends TeaModel {
    /**
     * <p>Review status. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Information pending completion.</li>
     * <li><strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>: Under review.</li>
     * <li><strong>5</strong>: Review failed.</li>
     * <li><strong>6</strong>: Review succeeded.</li>
     * <li><strong>7</strong>: Review canceled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditStatus")
    public Integer auditStatus;

    /**
     * <p>Review type. Valid value:</p>
     * <p><strong>1</strong>: Offline domain name transfer.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AuditType")
    public Integer auditType;

    /**
     * <p>Domain name to query.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Language of error messages returned by the API. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryOperationAuditInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOperationAuditInfoListRequest self = new QueryOperationAuditInfoListRequest();
        return TeaModel.build(map, self);
    }

    public QueryOperationAuditInfoListRequest setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
        return this;
    }
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    public QueryOperationAuditInfoListRequest setAuditType(Integer auditType) {
        this.auditType = auditType;
        return this;
    }
    public Integer getAuditType() {
        return this.auditType;
    }

    public QueryOperationAuditInfoListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryOperationAuditInfoListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryOperationAuditInfoListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryOperationAuditInfoListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
