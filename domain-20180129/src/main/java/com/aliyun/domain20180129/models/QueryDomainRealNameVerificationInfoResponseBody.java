// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainRealNameVerificationInfoResponseBody extends TeaModel {
    /**
     * <p>Domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyundoc.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Base64-encoded image of the real-name verification certificate. Requirements for the image:  </p>
     * <ul>
     * <li>Format must be <strong>jpg</strong> or <strong>bmp</strong>.  </li>
     * <li>Original image size must be between <strong>55 KB and 1 MB</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dGVzdA==</p>
     */
    @NameInMap("IdentityCredential")
    public String identityCredential;

    /**
     * <p>Certificate number used for real-name verification, such as an identity card number or Unified Social Credit Code.</p>
     * 
     * <strong>example:</strong>
     * <p>5****************9</p>
     */
    @NameInMap("IdentityCredentialNo")
    public String identityCredentialNo;

    /**
     * <p>The type of certificate used for real-name verification. Valid values:  </p>
     * <ul>
     * <li><strong>SFZ</strong>: Identity card.  </li>
     * <li><strong>HZ</strong>: Passport.  </li>
     * <li><strong>YYZZ</strong>: Business license.  </li>
     * <li><strong>ORG</strong>: Organization code certificate.  </li>
     * <li><strong>XYDM</strong>: Unified Social Credit Code certificate.  </li>
     * <li><strong>TXZ</strong>: Mainland Travel Permits for Hong Kong and Macao Residents.</li>
     * </ul>
     * <p>If your certificate type is not listed above, see the section <a href="https://help.aliyun.com/document_detail/72209.html">Supported Certificate Types for Real-Name Verification</a> for the corresponding value.  </p>
     * <blockquote>
     * <p>You must select the certificate type that matches the certificate you provide.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SFZ</p>
     */
    @NameInMap("IdentityCredentialType")
    public String identityCredentialType;

    /**
     * <p>Download URL of the real-name verification image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://dbu-nap-p.oss-cn-hangzhou.aliyuncs.com/20190219/140692647406xxxx_5d6baea3e7314fd986afdd86e33exxxx.jpg">http://dbu-nap-p.oss-cn-hangzhou.aliyuncs.com/20190219/140692647406xxxx_5d6baea3e7314fd986afdd86e33exxxx.jpg</a></p>
     */
    @NameInMap("IdentityCredentialUrl")
    public String identityCredentialUrl;

    /**
     * <p>Instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>S2019270W570****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Unique request access token.</p>
     * 
     * <strong>example:</strong>
     * <p>4DF9D693-0D5B-4EB7-8922-7ECA6BD59314</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Updated At.</p>
     * 
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
