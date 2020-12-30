// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainRealNameVerificationInfoResponseBody extends TeaModel {
    @NameInMap("IdentityCredentialType")
    public String identityCredentialType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("IdentityCredential")
    public String identityCredential;

    @NameInMap("SubmissionDate")
    public String submissionDate;

    @NameInMap("IdentityCredentialNo")
    public String identityCredentialNo;

    @NameInMap("IdentityCredentialUrl")
    public String identityCredentialUrl;

    public static QueryDomainRealNameVerificationInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainRealNameVerificationInfoResponseBody self = new QueryDomainRealNameVerificationInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainRealNameVerificationInfoResponseBody setIdentityCredentialType(String identityCredentialType) {
        this.identityCredentialType = identityCredentialType;
        return this;
    }
    public String getIdentityCredentialType() {
        return this.identityCredentialType;
    }

    public QueryDomainRealNameVerificationInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainRealNameVerificationInfoResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
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

    public QueryDomainRealNameVerificationInfoResponseBody setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
        return this;
    }
    public String getSubmissionDate() {
        return this.submissionDate;
    }

    public QueryDomainRealNameVerificationInfoResponseBody setIdentityCredentialNo(String identityCredentialNo) {
        this.identityCredentialNo = identityCredentialNo;
        return this;
    }
    public String getIdentityCredentialNo() {
        return this.identityCredentialNo;
    }

    public QueryDomainRealNameVerificationInfoResponseBody setIdentityCredentialUrl(String identityCredentialUrl) {
        this.identityCredentialUrl = identityCredentialUrl;
        return this;
    }
    public String getIdentityCredentialUrl() {
        return this.identityCredentialUrl;
    }

}
