// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainCSRCertificateRequest extends TeaModel {
    /**
     * <p>The domain name that is secured by the certificate. The domain name uses HTTPS acceleration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The content of the certificate. The certificate must match the certificate signing request (CSR) created by calling the <a href="https://help.aliyun.com/document_detail/144478.html">CreateDcdnCertificateSigningRequest</a> operation. Make sure that the certificate is in PEM format and its content is Base64-encoded and then encoded by encodeURIComponent.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
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
