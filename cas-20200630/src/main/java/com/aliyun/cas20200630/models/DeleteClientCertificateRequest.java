// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class DeleteClientCertificateRequest extends TeaModel {
    /**
     * <p>The unique identifier of the client certificate or server certificate that you want to delete. The status of the certificate must be **REVOKE**.</p>
     * <br>
     * <p>>  You can call the [ListClientCertificate](~~330884~~) operation to query the unique identifiers and status of all client certificates and server certificates.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    public static DeleteClientCertificateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientCertificateRequest self = new DeleteClientCertificateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClientCertificateRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

}
