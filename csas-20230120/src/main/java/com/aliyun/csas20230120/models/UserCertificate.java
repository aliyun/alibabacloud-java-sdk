// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class UserCertificate extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cert-aabbccdd</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <strong>example:</strong>
     * <p>用于测试</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("DnsNames")
    public java.util.List<String> dnsNames;

    /**
     * <strong>example:</strong>
     * <p>1734492686</p>
     */
    @NameInMap("ExpTimeUnix")
    public Long expTimeUnix;

    /**
     * <strong>example:</strong>
     * <p>1734523812</p>
     */
    @NameInMap("GmtCreateUnix")
    public Long gmtCreateUnix;

    /**
     * <strong>example:</strong>
     * <p>1734523812</p>
     */
    @NameInMap("GmtModifiedUnix")
    public Long gmtModifiedUnix;

    /**
     * <strong>example:</strong>
     * <p>证书1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("PrivateKey")
    public String privateKey;

    public static UserCertificate build(java.util.Map<String, ?> map) throws Exception {
        UserCertificate self = new UserCertificate();
        return TeaModel.build(map, self);
    }

    public UserCertificate setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public UserCertificate setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public UserCertificate setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UserCertificate setDnsNames(java.util.List<String> dnsNames) {
        this.dnsNames = dnsNames;
        return this;
    }
    public java.util.List<String> getDnsNames() {
        return this.dnsNames;
    }

    public UserCertificate setExpTimeUnix(Long expTimeUnix) {
        this.expTimeUnix = expTimeUnix;
        return this;
    }
    public Long getExpTimeUnix() {
        return this.expTimeUnix;
    }

    public UserCertificate setGmtCreateUnix(Long gmtCreateUnix) {
        this.gmtCreateUnix = gmtCreateUnix;
        return this;
    }
    public Long getGmtCreateUnix() {
        return this.gmtCreateUnix;
    }

    public UserCertificate setGmtModifiedUnix(Long gmtModifiedUnix) {
        this.gmtModifiedUnix = gmtModifiedUnix;
        return this;
    }
    public Long getGmtModifiedUnix() {
        return this.gmtModifiedUnix;
    }

    public UserCertificate setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UserCertificate setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }
    public String getPrivateKey() {
        return this.privateKey;
    }

}
