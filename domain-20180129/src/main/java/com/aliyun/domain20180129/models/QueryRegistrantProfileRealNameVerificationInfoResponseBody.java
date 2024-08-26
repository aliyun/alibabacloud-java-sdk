// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfileRealNameVerificationInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dGVzdA==</p>
     */
    @NameInMap("IdentityCredential")
    public String identityCredential;

    /**
     * <strong>example:</strong>
     * <p>4111111111111110**</p>
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
     * <p><a href="http://test.oss-cn-hangzhou.aliyuncs.com/20170522/1219541161213057_070445190.jpg">http://test.oss-cn-hangzhou.aliyuncs.com/20170522/1219541161213057_070445190.jpg</a></p>
     */
    @NameInMap("IdentityCredentialUrl")
    public String identityCredentialUrl;

    /**
     * <strong>example:</strong>
     * <p>2017-05-22 19:04:49</p>
     */
    @NameInMap("ModificationDate")
    public String modificationDate;

    /**
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <strong>example:</strong>
     * <p>4D73432C-7600-4779-ACBB-C3B5CA145D32</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>2017-05-22 19:04:49</p>
     */
    @NameInMap("SubmissionDate")
    public String submissionDate;

    public static QueryRegistrantProfileRealNameVerificationInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRegistrantProfileRealNameVerificationInfoResponseBody self = new QueryRegistrantProfileRealNameVerificationInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setIdentityCredential(String identityCredential) {
        this.identityCredential = identityCredential;
        return this;
    }
    public String getIdentityCredential() {
        return this.identityCredential;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setIdentityCredentialNo(String identityCredentialNo) {
        this.identityCredentialNo = identityCredentialNo;
        return this;
    }
    public String getIdentityCredentialNo() {
        return this.identityCredentialNo;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setIdentityCredentialType(String identityCredentialType) {
        this.identityCredentialType = identityCredentialType;
        return this;
    }
    public String getIdentityCredentialType() {
        return this.identityCredentialType;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setIdentityCredentialUrl(String identityCredentialUrl) {
        this.identityCredentialUrl = identityCredentialUrl;
        return this;
    }
    public String getIdentityCredentialUrl() {
        return this.identityCredentialUrl;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setModificationDate(String modificationDate) {
        this.modificationDate = modificationDate;
        return this;
    }
    public String getModificationDate() {
        return this.modificationDate;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRegistrantProfileRealNameVerificationInfoResponseBody setSubmissionDate(String submissionDate) {
        this.submissionDate = submissionDate;
        return this;
    }
    public String getSubmissionDate() {
        return this.submissionDate;
    }

}
