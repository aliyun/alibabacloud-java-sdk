// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfileRealNameVerificationInfoResponseBody extends TeaModel {
    @NameInMap("IdentityCredentialType")
    public String identityCredentialType;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ModificationDate")
    public String modificationDate;

    @NameInMap("IdentityCredential")
    public String identityCredential;

    @NameInMap("SubmissionDate")
    public String submissionDate;

    @NameInMap("IdentityCredentialNo")
    public String identityCredentialNo;

    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    @NameInMap("IdentityCredentialUrl")
    public String identityCredentialUrl;

    public static QueryRegistrantProfileRealNameVerificationInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRegistrantProfileRealNameVerificationInfoResponseBody self = new QueryRegistrantProfileRealNameVerificationInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setIdentityCredentialType(String identityCredentialType) {
        this.identityCredentialType = identityCredentialType;
        return this;
    }
    public String getIdentityCredentialType() {
        return this.identityCredentialType;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
        return this;
    }
    public String getModificationDate() {
        return this.modificationDate;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setIdentityCredential(String identityCredential) {
        this.identityCredential = identityCredential;
        return this;
    }
    public String getIdentityCredential() {
        return this.identityCredential;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
        return this;
    }
    public String getSubmissionDate() {
        return this.submissionDate;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setIdentityCredentialNo(String identityCredentialNo) {
        this.identityCredentialNo = identityCredentialNo;
        return this;
    }
    public String getIdentityCredentialNo() {
        return this.identityCredentialNo;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setIdentityCredentialUrl(String identityCredentialUrl) {
        this.identityCredentialUrl = identityCredentialUrl;
        return this;
    }
    public String getIdentityCredentialUrl() {
        return this.identityCredentialUrl;
    }

}
