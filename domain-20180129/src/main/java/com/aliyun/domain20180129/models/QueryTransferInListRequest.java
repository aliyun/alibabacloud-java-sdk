// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTransferInListRequest extends TeaModel {
    /**
     * <p>The domain name, which supports prefix matching (fuzzy query).</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The language of error messages returned by the API. Valid values:</p>
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
     * <p>The page number of the domain name list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The page size for paging the domain name list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Transfer status. Valid values:  </p>
     * <ul>
     * <li><strong>INIT</strong>: Submit transfer-in.  </li>
     * <li><strong>AUTHORIZATION</strong>: Authorize transfer-in (email verification).  </li>
     * <li><strong>NAME_VERIFICATION</strong>: Name review.  </li>
     * <li><strong>PASSWORD_VERIFICATION</strong>: Transfer password verification.  </li>
     * <li><strong>PENDING</strong>: Transfer-in in progress.  </li>
     * <li><strong>SUCCESS</strong>: Transfer-in succeeded.  </li>
     * <li><strong>FAIL</strong>: Transfer-in failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>INIT</p>
     */
    @NameInMap("SimpleTransferInStatus")
    public String simpleTransferInStatus;

    /**
     * <p>End time for submitting the domain name list for transfer-in.</p>
     * 
     * <strong>example:</strong>
     * <p>1514428524669</p>
     */
    @NameInMap("SubmissionEndDate")
    public Long submissionEndDate;

    /**
     * <p>The start time for submitting the domain name list for transfer-in.</p>
     * 
     * <strong>example:</strong>
     * <p>1514428524669</p>
     */
    @NameInMap("SubmissionStartDate")
    public Long submissionStartDate;

    /**
     * <p>The user IP address, which can be set to <strong>127.0.0.1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
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
