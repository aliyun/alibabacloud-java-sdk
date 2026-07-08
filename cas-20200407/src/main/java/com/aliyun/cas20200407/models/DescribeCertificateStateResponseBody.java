// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeCertificateStateResponseBody extends TeaModel {
    /**
     * <p>The certificate ID.</p>
     * <blockquote>
     * <p>This parameter is returned when the certificate is issued.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <p>The certificate content (in PEM format). For more information about the PEM format and how to convert the format of a certificate, see <a href="https://help.aliyun.com/document_detail/42214.html">What are the formats of mainstream digital certificates?</a>.</p>
     * <blockquote>
     * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>certificate</strong> (indicating that the certificate has been issued).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE----- …… -----END CERTIFICATE-----</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The content that you need to write to the newly created file when you use the file validation method for domain validation.</p>
     * <blockquote>
     * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage) and <strong>ValidateType</strong> is set to <strong>FILE</strong> (indicating the file validation method).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.com/.well-known/pki-validation/fileauth.txt">http://example.com/.well-known/pki-validation/fileauth.txt</a></p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The domain name to be validated when you use the file validation method for domain validation. You need to connect to the server corresponding to this domain name and create the specified file (i.e., <strong>Uri</strong>) on the server.</p>
     * <blockquote>
     * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage) and <strong>ValidateType</strong> is set to <strong>FILE</strong> (indicating the file validation method).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The content of the certificate private key (in PEM format). For more information about the PEM format and how to convert the format of a certificate, see <a href="https://help.aliyun.com/document_detail/42214.html">What are the formats of mainstream digital certificates?</a>.</p>
     * <blockquote>
     * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>certificate</strong> (indicating that the certificate has been issued).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY-----…… -----END RSA PRIVATE KEY-----</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The host record that you need to operate when you use the DNS validation method for domain validation.</p>
     * <blockquote>
     * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage) and <strong>ValidateType</strong> is set to <strong>DNS</strong> (indicating the DNS validation method).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>_dnsauth</p>
     */
    @NameInMap("RecordDomain")
    public String recordDomain;

    /**
     * <p>The type of DNS record that you need to add when you use the DNS validation method for domain validation. Valid values:</p>
     * <ul>
     * <li><p><strong>TXT</strong>: text record.</p>
     * </li>
     * <li><p><strong>CNAME</strong>: alias record.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage) and <strong>ValidateType</strong> is set to <strong>DNS</strong> (indicating the DNS validation method).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>TXT</p>
     */
    @NameInMap("RecordType")
    public String recordType;

    /**
     * <p>The record value that you need to add when you use the DNS validation method for domain validation.</p>
     * <blockquote>
     * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage) and <strong>ValidateType</strong> is set to <strong>DNS</strong> (indicating the DNS validation method).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>20200420000000223erigacv46uhaubchcm0o7spxi7i2isvjq59mlx9lucnkqcy</p>
     */
    @NameInMap("RecordValue")
    public String recordValue;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>082FAB35-6AB9-4FD5-8750-D36673548E76</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the certificate request order. Valid values:</p>
     * <ul>
     * <li><p><strong>domain_verify</strong>: <strong>Pending validation</strong>, which indicates that you have not completed domain validation after submitting the certificate request.</p>
     * <blockquote>
     * <p>After you submit a certificate request, you must manually complete domain ownership validation before the certificate request can enter the review stage. If you have not completed domain validation, you can refer to the response parameters of this operation to complete domain validation.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>process</strong>: <strong>Under review</strong>, which indicates that the certificate request is being reviewed by the CA center.</p>
     * </li>
     * <li><p><strong>verify_fail</strong>: <strong>Review failed</strong>, which indicates that the certificate request failed the review.</p>
     * <blockquote>
     * <p>The review may fail because the certificate request information you submitted is incorrect. We recommend that you call <a href="https://help.aliyun.com/document_detail/455294.html">DeleteCertificateRequest</a> to delete the order that failed the review (deleted orders do not consume certificate resource plan quota) and submit a new certificate request.</p>
     * </blockquote>
     * </li>
     * <li><p><strong>certificate</strong>: <strong>Issued</strong>, which indicates that the certificate has been issued.</p>
     * </li>
     * <li><p><strong>payed</strong>: <strong>Pending request</strong>, which indicates that the certificate is pending request.</p>
     * </li>
     * <li><p><strong>unknow</strong>: <strong>Unknown status</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>domain_verify</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The file that you need to create on the domain server when you use the file validation method for domain validation. <strong>Uri</strong> includes the file path and name.</p>
     * <blockquote>
     * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage) and <strong>ValidateType</strong> is set to <strong>FILE</strong> (indicating the file validation method).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>/.well-known/pki-validation/fileauth.txt</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The domain validation method selected when submitting the certificate request. Valid values:</p>
     * <ul>
     * <li><p><strong>DNS</strong>: DNS validation. This method validates domain ownership by adding the specified DNS record to the domain on the DNS management platform.</p>
     * </li>
     * <li><p><strong>FILE</strong>: file validation. This method validates domain ownership by creating the specified file on the domain server.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only when <strong>Type</strong> is set to <strong>domain_verify</strong> (indicating the domain validation stage).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FILE</p>
     */
    @NameInMap("ValidateType")
    public String validateType;

    public static DescribeCertificateStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateStateResponseBody self = new DescribeCertificateStateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateStateResponseBody setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public DescribeCertificateStateResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public DescribeCertificateStateResponseBody setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DescribeCertificateStateResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeCertificateStateResponseBody setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

    public DescribeCertificateStateResponseBody setRecordDomain(String recordDomain) {
        this.recordDomain = recordDomain;
        return this;
    }
    public String getRecordDomain() {
        return this.recordDomain;
    }

    public DescribeCertificateStateResponseBody setRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }
    public String getRecordType() {
        return this.recordType;
    }

    public DescribeCertificateStateResponseBody setRecordValue(String recordValue) {
        this.recordValue = recordValue;
        return this;
    }
    public String getRecordValue() {
        return this.recordValue;
    }

    public DescribeCertificateStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCertificateStateResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeCertificateStateResponseBody setUri(String uri) {
        this.uri = uri;
        return this;
    }
    public String getUri() {
        return this.uri;
    }

    public DescribeCertificateStateResponseBody setValidateType(String validateType) {
        this.validateType = validateType;
        return this;
    }
    public String getValidateType() {
        return this.validateType;
    }

}
