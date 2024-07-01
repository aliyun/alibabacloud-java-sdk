// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class QueryTransferInListRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SimpleTransferInStatus")
    public String simpleTransferInStatus;

    @NameInMap("SubmissionEndDate")
    public Long submissionEndDate;

    @NameInMap("SubmissionStartDate")
    public Long submissionStartDate;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static QueryTransferInListRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTransferInListRequest self = new QueryTransferInListRequest();
        return TeaModel.build(map, self);
    }

    public QueryTransferInListRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryTransferInListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryTransferInListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryTransferInListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTransferInListRequest setSimpleTransferInStatus(String simpleTransferInStatus) {
        this.simpleTransferInStatus = simpleTransferInStatus;
        return this;
    }
    public String getSimpleTransferInStatus() {
        return this.simpleTransferInStatus;
    }

    public QueryTransferInListRequest setSubmissionEndDate(Long submissionEndDate) {
        this.submissionEndDate = submissionEndDate;
        return this;
    }
    public Long getSubmissionEndDate() {
        return this.submissionEndDate;
    }

    public QueryTransferInListRequest setSubmissionStartDate(Long submissionStartDate) {
        this.submissionStartDate = submissionStartDate;
        return this;
    }
    public Long getSubmissionStartDate() {
        return this.submissionStartDate;
    }

    public QueryTransferInListRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
