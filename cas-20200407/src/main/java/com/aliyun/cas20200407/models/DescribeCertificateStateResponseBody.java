// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class DescribeCertificateStateResponseBody extends TeaModel {
    /**
     * <p>The content of the certificate in the PEM format. For more information about the PEM format and how to convert certificate formats, see [What formats are used for mainstream digital certificates?](~~42214~~)</p>
     * <br>
     * <p>> This parameter is returned only when the value of the **Type** parameter is **certificate**. The value certificate indicates that the certificate is issued.</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>The content that you need to write to the newly created file when you use the file verification method.</p>
     * <br>
     * <p>> This parameter is returned only when the value of the **Type** parameter is **domain\_verify** and the value of the **ValidateType** parameter is **FILE**. The value domain\_verify indicates that the verification of the domain name ownership is not complete, and the value FILE indicates that the file verification method is used.</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The domain name to be verified when you use the file verification method. You must connect to the DNS server of the domain name and create a file on the server. The file is specified by the **Uri** parameter.</p>
     * <br>
     * <p>> This parameter is returned only when the value of the **Type** parameter is **domain\_verify** and the value of the **ValidateType** parameter is **FILE**. The value domain\_verify indicates that the verification of the domain name ownership is not complete, and the value FILE indicates that the file verification method is used.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The private key of the certificate in the PEM format. For more information about the PEM format and how to convert certificate formats, see [What formats are used for mainstream digital certificates?](~~42214~~)</p>
     * <br>
     * <p>> This parameter is returned only when the value of the **Type** parameter is **certificate**. The value certificate indicates that the certificate is issued.</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    /**
     * <p>The DNS record that you need to manage when you use the DNS verification method.</p>
     * <br>
     * <p>> This parameter is returned only when the value of the **Type** parameter is **domain\_verify** and the value of the **ValidateType** parameter is **DNS**. The value domain\_verify indicates that the verification of the domain name ownership is not complete, and the value DNS indicates that the DNS verification method is used.</p>
     */
    @NameInMap("RecordDomain")
    public String recordDomain;

    /**
     * <p>The type of the DNS record that you need to add when you use the DNS verification method. Valid values:</p>
     * <br>
     * <p>*   **TXT**</p>
     * <p>*   **CNAME**</p>
     * <br>
     * <p>> This parameter is returned only when the value of the **Type** parameter is **domain\_verify** and the value of the **ValidateType** parameter is **DNS**. The value domain\_verify indicates that the verification of the domain name ownership is not complete.</p>
     */
    @NameInMap("RecordType")
    public String recordType;

    /**
     * <p>You need to add a TXT record to the DNS records only when you use the DNS verification method.</p>
     * <br>
     * <p>> This parameter is returned only when the value of the **Type** parameter is **domain\_verify** and the value of the **ValidateType** parameter is **DNS**. The value domain\_verify indicates that the verification of the domain name ownership is not complete, and the value DNS indicates that the DNS verification method is used.</p>
     */
    @NameInMap("RecordValue")
    public String recordValue;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the certificate application order. Valid values:</p>
     * <br>
     * <p>*   **domain_verify**: **pending review**, which indicates that you have not completed the verification of the domain name ownership after you submit the certificate application.</p>
     * <br>
     * <p>    > After you submit a certificate application, you must manually complete the verification of the domain name ownership. The CA reviews the certificate application only after the verification is complete. If you have not completed the verification of the domain name ownership, you can complete the verification based on the data returned by this operation.</p>
     * <br>
     * <p>*   **process**: **being reviewed**, which indicates that the certificate application is being reviewed by the CA.</p>
     * <br>
     * <p>*   **verify_fail**: **review failed**, which indicates that the certificate application failed to be reviewed.</p>
     * <br>
     * <p>    > If a certificate application fails to be reviewed, the information that you specified in the certificate application may be incorrect. We recommend that you call the [DeleteCertificateRequest](~~455294~~) operation to delete the certificate application order and resubmit a certificate application. After the order is deleted, the quota that is consumed for the order is released.</p>
     * <br>
     * <p>*   **certificate**: **issued**, which indicates that the certificate is issued.</p>
     * <p>*   **payed**: **pending application**, which indicates that you have not submitted a certificate application.</p>
     * <p>*   **unknow**: The status is **unknown**.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The file that you need to create on the DNS server when you use the file verification method. **The value of this parameter contains the file path and file name.**</p>
     * <br>
     * <p>> This parameter is returned only when the value of the **Type** parameter is **domain\_verify** and the value of the **ValidateType** parameter is **FILE**. The value domain\_verify indicates that the verification of the domain name ownership is not complete, and the value FILE indicates that the file verification method is used.</p>
     */
    @NameInMap("Uri")
    public String uri;

    /**
     * <p>The verification method of the domain name ownership. Valid values:</p>
     * <br>
     * <p>*   **DNS**: DNS verification. If you use this method, you must add a TXT record to the DNS records of the domain name in the management platform of the domain name.</p>
     * <p>*   **FILE**: file verification. If you use this method, you must create a specified file on the DNS server.</p>
     * <br>
     * <p>> This parameter is returned only when the value of the **Type** parameter is **domain\_verify**. The value domain\_verify indicates that the verification of the domain name ownership is not complete.</p>
     */
    @NameInMap("ValidateType")
    public String validateType;

    public static DescribeCertificateStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateStateResponseBody self = new DescribeCertificateStateResponseBody();
        return TeaModel.build(map, self);
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
