// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainCSRCertificateRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ServerCertificate")
    public String serverCertificate;

    public static SetDcdnDomainCSRCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnDomainCSRCertificateRequest self = new SetDcdnDomainCSRCertificateRequest();
        return TeaModel.build(map, self);
    }

    public SetDcdnDomainCSRCertificateRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDcdnDomainCSRCertificateRequest setServerCertificate(String serverCertificate) {
        this.serverCertificate = serverCertificate;
        return this;
    }
    public String getServerCertificate() {
        return this.serverCertificate;
    }

}
