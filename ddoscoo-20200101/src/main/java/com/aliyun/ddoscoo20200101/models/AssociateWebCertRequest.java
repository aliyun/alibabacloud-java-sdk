// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class AssociateWebCertRequest extends TeaModel {
    /**
     * <p>The public key of the certificate that you want to associate. This parameter must be used together with the CertName and Key parameters.</p>
     * <blockquote>
     * <p> If you specify a value for the CertName, Cert, and Key parameters, you do not need to specify a value for the CertId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE----- 62EcYPWd2Oy1vs6MTXcJSfN9Z7rZ9fmxWr2BFN2XbahgnsSXM48ixZJ4krc+1M+j2kcubVpsE2cgHdj4v8H6jUz9Ji4mr7vMNS6dXv8PUkl/qoDeNGCNdyTS5NIL5ir+g92cL8IGOkjgvhlqt9vc65Cgb4mL+n5+DV9uOyTZTW/MojmlgfUekC2xiXa54nxJf17Y1TADGSbyJbsC0Q9nIrHsPl8YKkvRWvIAqYxXZ7wRwWWmv4TMxFhWRiNY7yZIo2ZUhl02SIDNggIEeg== -----END CERTIFICATE-----</p>
     */
    @NameInMap("Cert")
    public String cert;

    /**
     * <p>The ID of the certificate.</p>
     * <blockquote>
     * <p> If you specify a certificate ID, you do not need to specify a value for the CertName, Cert, and Key parameters. You can specify only one of this parameter and the CertIdentifier parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2404693</p>
     */
    @NameInMap("CertId")
    public Integer certId;

    /**
     * <p>The globally unique ID of the certificate. The value is in the &quot;Certificate ID-cn-hangzhou&quot; format. For example, if the ID of the certificate is 123, the value of the CertIdentifier parameter is 123-cn-hangzhou.</p>
     * <blockquote>
     * <p> You can specify only one of this parameter and the CertId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>9430680-cn-hangzhou</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    /**
     * <p>The name of the certificate.</p>
     * <blockquote>
     * <p> You can specify the name of the certificate that you want to associate. This parameter must be used together with the Cert and Key parameters.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>example-cert</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>The region of the certificate. Valid values: <strong>cn-hangzhou</strong> and <strong>ap-southeast-1</strong>. Default value: <strong>cn-hangzhou</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("CertRegion")
    public String certRegion;

    /**
     * <p>The domain name of the website.</p>
     * <blockquote>
     * <p> A forwarding rule must be configured for the domain name. You can call the <a href="https://help.aliyun.com/document_detail/91724.html">DescribeDomains</a> operation to query all domain names.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The private key of the certificate that you want to associate. This parameter must be used together with the CertName and Cert parameters.</p>
     * <blockquote>
     * <p> If you specify a value for the CertName, Cert, and Key parameters, you do not need to specify a value for the CertId parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY----- DADTPZoOHd9WtZ3UKHJTRgNQmioPQn2bqdKHop+B/dn/4VZL7Jt8zSDGM9sTMThLyvsmLQKBgQCr+ujntC1kN6pGBj2Fw2l/EA/W3rYEce2tyhjgmG7rZ+A/jVE9fld5sQra6ZdwBcQJaiygoIYoaMF2EjRwc0qwHaluq0C15f6ujSoHh2e+D5zdmkTg/3NKNjqNv6xA2gYpinVDzFdZ9Zujxvuh9o4Vqf0YF8bv5UK5G04RtKadOw== -----END RSA PRIVATE KEY-----</p>
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
