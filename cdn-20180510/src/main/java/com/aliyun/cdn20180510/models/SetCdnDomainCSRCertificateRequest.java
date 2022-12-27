// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainCSRCertificateRequest extends TeaModel {
    // The accelerated domain name for which you want to configure an SSL certificate. The domain name must have HTTPS secure acceleration enabled.
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The content of the certificate. The certificate must match the certificate signing request (CSR) created by calling the [CreateCdnCertificateSigningRequest](~~144478~~) operation. Make sure that the certificate is in the PEM format, and the content of the certificate is encoded in Base64 and then encoded by encodeURIComponent.
    @NameInMap("ServerCertificate")
    public String serverCertificate;

    public static SetCdnDomainCSRCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainCSRCertificateRequest self = new SetCdnDomainCSRCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainCSRCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetCdnDomainCSRCertificateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SetCdnDomainCSRCertificateRequest setServerCertificate(String serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }
    public String getServerCertificate() {
        return this.serverCertificate;
    }

}
