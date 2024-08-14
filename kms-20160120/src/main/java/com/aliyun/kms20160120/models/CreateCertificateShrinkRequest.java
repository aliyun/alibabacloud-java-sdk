// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class CreateCertificateShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether the private key of the certificate can be exported for use. Valid values:</p>
     * <ul>
     * <li>true: The private key of the certificate can be exported for use. This is the default value.</li>
     * <li>false: The private key of the certificate cannot be exported for use. We recommend that you set this parameter to false to protect keys with a higher security level.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ExportablePrivateKey")
    public Boolean exportablePrivateKey;

    /**
     * <p>The type of the key. Valid values:</p>
     * <ul>
     * <li>RSA_2048</li>
     * <li>EC_P256</li>
     * <li>EC_SM2</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA_2048</p>
     */
    @NameInMap("KeySpec")
    public String keySpec;

    /**
     * <p>The certificate subject, which is the owner of the certificate.</p>
     * <p>Specify the value in the distinguished name (DN) format, as defined in <a href="https://tools.ietf.org/html/rfc2253?spm=a2c4g.11186623.2.13.265f1a1cGFCn3Q">RFC 2253</a>. A DN is a sequence of relative distinguished names (RDNs).</p>
     * <p>RDNs are key-value pairs in the format of <code>attribute1=value1,attribute2=value2</code>. Separate multiple RDNs with commas (,).</p>
     * <p>The Subject parameter consists of the following fields:</p>
     * <ul>
     * <li>CN: required. The name of the certificate subject.</li>
     * <li>C: required. The two-character country or region code in the <a href="https://www.iso.org/obp/ui/#search/code/">ISO 3166-1</a> standard. For example, CN indicates China.</li>
     * <li>O: required. The legal name of the enterprise, company, organization, or institution.</li>
     * <li>OU: required. The name of the department.</li>
     * <li>ST: optional. The name of the province, municipality, autonomous region, or special administrative region.</li>
     * <li>L: optional. The name of the city.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CN=userName,OU=kms,O=aliyun,C=CN</p>
     */
    @NameInMap("Subject")
    public String subject;

    /**
     * <p>The subject alternative names.</p>
     * <p>A domain name list is supported. A maximum of 10 domain names are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;test1.example.com&quot;,&quot;test2.example.com&quot;]</p>
     */
    @NameInMap("SubjectAlternativeNames")
    public String subjectAlternativeNamesShrink;

    public static CreateCertificateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCertificateShrinkRequest self = new CreateCertificateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateCertificateShrinkRequest setExportablePrivateKey(Boolean exportablePrivateKey) {
        this.exportablePrivateKey = exportablePrivateKey;
        return this;
    }
    public Boolean getExportablePrivateKey() {
        return this.exportablePrivateKey;
    }

    public CreateCertificateShrinkRequest setKeySpec(String keySpec) {
        this.keySpec = keySpec;
        return this;
    }
    public String getKeySpec() {
        return this.keySpec;
    }

    public CreateCertificateShrinkRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public CreateCertificateShrinkRequest setSubjectAlternativeNamesShrink(String subjectAlternativeNamesShrink) {
        this.subjectAlternativeNamesShrink = subjectAlternativeNamesShrink;
        return this;
    }
    public String getSubjectAlternativeNamesShrink() {
        return this.subjectAlternativeNamesShrink;
    }

}
