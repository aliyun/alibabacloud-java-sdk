// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateRevokeClientCertificateRequest extends TeaModel {
    /**
     * <p>The unique identifier of the client certificate or server certificate that you want to revoke.</p>
     * <br>
     * <p>>  You can call the [ListClientCertificate](~~330884~~) operation to query the unique identifiers of all client certificates and server certificates.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    public static CreateRevokeClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRevokeClientCertificateRequest self = new CreateRevokeClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public CreateRevokeClientCertificateRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
