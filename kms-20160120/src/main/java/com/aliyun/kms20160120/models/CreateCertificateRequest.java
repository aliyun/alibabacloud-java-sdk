// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateCertificateRequest extends TeaModel {
    /**
     * <p>Specifies whether the private key of the certificate can be exported for use. Valid values:</p>
     * <br>
     * <p>*   true: The private key of the certificate can be exported for use. This is the default value.</p>
     * <p>*   false: The private key of the certificate cannot be exported for use. We recommend that you set this parameter to false to protect keys with a higher security level.</p>
     */
    @NameInMap("ExportablePrivateKey")
    public Boolean exportablePrivateKey;

    /**
     * <p>The type of the key. Valid values:</p>
     * <br>
     * <p>*   RSA\_2048</p>
     * <p>*   EC_P256</p>
     * <p>*   EC_SM2</p>
     */
    @NameInMap("KeySpec")
    public String keySpec;

    /**
     * <p>The certificate subject, which is the owner of the certificate.</p>
     * <br>
     * <p>Specify the value in the distinguished name (DN) format, as defined in [RFC 2253](https://tools.ietf.org/html/rfc2253?spm=a2c4g.11186623.2.13.265f1a1cGFCn3Q). A DN is a sequence of relative distinguished names (RDNs).</p>
     * <br>
     * <p>RDNs are key-value pairs in the format of `attribute1=value1,attribute2=value2`. Separate multiple RDNs with commas (,).</p>
     * <br>
     * <p>The Subject parameter consists of the following fields:</p>
     * <br>
     * <p>*   CN: required. The name of the certificate subject.</p>
     * <p>*   C: required. The two-character country or region code in the [ISO 3166-1](https://www.iso.org/obp/ui/#search/code/) standard. For example, CN indicates China.</p>
     * <p>*   O: required. The legal name of the enterprise, company, organization, or institution.</p>
     * <p>*   OU: required. The name of the department.</p>
     * <p>*   ST: optional. The name of the province, municipality, autonomous region, or special administrative region.</p>
     * <p>*   L: optional. The name of the city.</p>
     */
    @NameInMap("Subject")
    public String subject;

    /**
     * <p>The subject alternative names.</p>
     * <br>
     * <p>A domain name list is supported. A maximum of 10 domain names are supported.</p>
     */
    @NameInMap("SubjectAlternativeNames")
    public java.util.Map<String, ?> subjectAlternativeNames;

    public static CreateCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateRequest self = new CreateCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCertificateRequest setExportablePrivateKey(Boolean exportablePrivateKey) {
        this.exportablePrivateKey = exportablePrivateKey;
        return this;
    }
    public Boolean getExportablePrivateKey() {
        return this.exportablePrivateKey;
    }

    public CreateCertificateRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public CreateCertificateRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateCertificateRequest setSubjectAlternativeNames(java.util.Map<String, ?> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }
    public java.util.Map<String, ?> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

}
