// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class AttachStandardRoomHttpsCertificateRequest extends TeaModel {
    // 应用唯一标识
    @NameInMap("AppId")
    public String appId;

    // 使用证书的确切域名
    @NameInMap("DomainName")
    public String domainName;

    // NGINX格式证书公钥
    @NameInMap("CertificatePublicKey")
    public String certificatePublicKey;

    // NGINX格式证书私钥
    @NameInMap("CertificatePrivateKey")
    public String certificatePrivateKey;

    public static AttachStandardRoomHttpsCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachStandardRoomHttpsCertificateRequest self = new AttachStandardRoomHttpsCertificateRequest();
        return TeaModel.build(map, self);
    }

    public AttachStandardRoomHttpsCertificateRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AttachStandardRoomHttpsCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public AttachStandardRoomHttpsCertificateRequest setCertificatePublicKey(String certificatePublicKey) {
        this.certificatePublicKey = certificatePublicKey;
        return this;
    }
    public String getCertificatePublicKey() {
        return this.certificatePublicKey;
    }

    public AttachStandardRoomHttpsCertificateRequest setCertificatePrivateKey(String certificatePrivateKey) {
        this.certificatePrivateKey = certificatePrivateKey;
        return this;
    }
    public String getCertificatePrivateKey() {
        return this.certificatePrivateKey;
    }

}
