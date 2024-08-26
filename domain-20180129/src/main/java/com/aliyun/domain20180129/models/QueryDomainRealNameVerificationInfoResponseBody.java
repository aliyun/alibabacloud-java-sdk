// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainRealNameVerificationInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>dGVzdA==</p>
     */
    @NameInMap("IdentityCredential")
    public String identityCredential;

    /**
     * <strong>example:</strong>
     * <p>5****************9</p>
     */
    @NameInMap("IdentityCredentialNo")
    public String identityCredentialNo;

    /**
     * <strong>example:</strong>
     * <p>SFZ</p>
     */
    @NameInMap("IdentityCredentialType")
    public String identityCredentialType;

    /**
     * <strong>example:</strong>
     * <p><a href="http://dbu-nap-p.oss-cn-hangzhou.aliyuncs.com/20190219/140692647406xxxx_5d6baea3e7314fd986afdd86e33exxxx.jpg">http://dbu-nap-p.oss-cn-hangzhou.aliyuncs.com/20190219/140692647406xxxx_5d6baea3e7314fd986afdd86e33exxxx.jpg</a></p>
     */
    @NameInMap("IdentityCredentialUrl")
    public String identityCredentialUrl;

    /**
     * <strong>example:</strong>
     * <p>S2019270W570****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>4DF9D693-0D5B-4EB7-8922-7ECA6BD59314</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2018-03-28 00:41:42</p>
     */
    @NameInMap("SubmissionDate")
    public String submissionDate;

    public static QueryDomainRealNameVerificationInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainRealNameVerificationInfoResponseBody self = new QueryDomainRealNameVerificationInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainRealNameVerificationInfoResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryDomainRealNameVerificationInfoResponseBody setIdentityCredential(String identityCredential) {
        this.identityCredential = identityCredential;
        return this;
    }
    public String getIdentityCredential() {
        return this.identityCredential;
    }

    public QueryDomainRealNameVerificationInfoResponseBody setIdentityCredentialNo(String identityCredentialNo) {
        this.identityCredentialNo = identityCredentialNo;
        return this;
    }
    public String getIdentityCredentialNo() {
        return this.identityCredentialNo;
    }

    public QueryDomainRealNameVerificationInfoResponseBody setIdentityCredentialType(String identityCredentialType) {
        this.identityCredentialType = identityCredentialType;
        return this;
    }
    public String getIdentityCredentialType() {
        return this.identityCredentialType;
    }

    public QueryDomainRealNameVerificationInfoResponseBody setIdentityCredentialUrl(String identityCredentialUrl) {
        this.identityCredentialUrl = identityCredentialUrl;
        return this;
    }
    public String getIdentityCredentialUrl() {
        return this.identityCredentialUrl;
    }

    public QueryDomainRealNameVerificationInfoResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDomainRealNameVerificationInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainRealNameVerificationInfoResponseBody setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
        return this;
    }
    public String getSubmissionDate() {
        return this.submissionDate;
    }

}
