// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class UpdateCACertificateStatusRequest extends TeaModel {
    /**
     * <p>The unique identifier of the CA certificate whose status you want to change.</p>
     * <br>
     * <p>>  You can call the [DescribeCACertificateList](~~328095~~) operation to query the unique identifiers of all CA certificates.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The state to which you want to change the CA certificate. Set to the value to **REVOKE**. After this operation is called, the status of the CA certificate is changed to **REVOKE**.</p>
     * <br>
     * <p>>  You can call this operation only if the status of a CA certificate is **ISSUE**. You can call the [DescribeCACertificate](~~328096~~) operation to query the status of a CA certificate.</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateCACertificateStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCACertificateStatusRequest self = new UpdateCACertificateStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCACertificateStatusRequest setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public UpdateCACertificateStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
