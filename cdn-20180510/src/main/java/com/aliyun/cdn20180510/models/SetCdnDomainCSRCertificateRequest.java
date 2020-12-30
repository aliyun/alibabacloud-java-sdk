// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainCSRCertificateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ServerCertificate")
    public String serverCertificate;

    @NameInMap("DomainName")
    public String domainName;

    public static SetCdnDomainCSRCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainCSRCertificateRequest self = new SetCdnDomainCSRCertificateRequest();
        return TeaModel.build(map, self);
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

    public SetCdnDomainCSRCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
