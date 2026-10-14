// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AssociateWebCertRequest extends TeaModel {
    /**
     * <p>The public key of the certificate to associate. This parameter must be used together with CertName and Key. </p>
     * <blockquote>
     * <p>If you specify CertName, Cert, and Key, you do not need to specify CertId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE----- 62EcYPWd2Oy1vs6MTXcJSf*************************************************************************************************************************************************************************ZIo2ZUhl02SIDNggIEeg== -----END CERTIFICATE-----</p>
     */
    @NameInMap("Cert")
    public String cert;

    /**
     * <p>The certificate ID.</p>
     * <blockquote>
     * <p>If you specify the certificate ID, you do not need to specify CertName, Cert, or Key. This parameter cannot be used together with CertIdentifier.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2404693</p>
     */
    @NameInMap("CertId")
    public Integer certId;

    /**
     * <p>The global certificate ID, which is in the format of certificate ID + &quot;-cn-hangzhou&quot;. For example, if the certificate ID is 123, set CertIdentifier to &quot;123-cn-hangzhou&quot;.</p>
     * <blockquote>
     * <p>This parameter cannot be used together with CertId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>9430680-cn-hangzhou</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The certificate name. </p>
     * <blockquote>
     * <p>The name of the certificate to associate. This parameter must be used together with Cert and Key.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example-cert</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The region where the certificate is stored. Valid values: <strong>cn-hangzhou</strong> and <strong>ap-southeast-1</strong>. Default value: <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("CertRegion")
    public String certRegion;

    /**
     * <p>The domain name of the website service.</p>
     * <blockquote>
     * <p>The domain name must have a website forwarding rule configured. You can call <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The private key of the certificate to associate. This parameter must be used together with CertName and Cert. </p>
     * <blockquote>
     * <p>If you specify CertName, Cert, and Key, you do not need to specify CertId.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY----- DADTPZoOHd9WtZ3UKHJT**************************************************************************************************************************************************************************qf0YF8bv5UK5G04RtKadOw== -----END RSA PRIVATE KEY-----</p>
     */
    @NameInMap("Key")
    public String key;

    public static AssociateWebCertRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateWebCertRequest self = new AssociateWebCertRequest();
        return TeaModel.build(map, self);
    }

    public AssociateWebCertRequest setCert(String cert) {
        this.cert = cert;
        return this;
    }
    public String getCert() {
        return this.cert;
    }

    public AssociateWebCertRequest setCertId(Integer certId) {
        this.certId = certId;
        return this;
    }
    public Integer getCertId() {
        return this.certId;
    }

    public AssociateWebCertRequest setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public AssociateWebCertRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public AssociateWebCertRequest setCertRegion(String certRegion) {
        this.certRegion = certRegion;
        return this;
    }
    public String getCertRegion() {
        return this.certRegion;
    }

    public AssociateWebCertRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AssociateWebCertRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
