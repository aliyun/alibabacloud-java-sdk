// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateCsrRequest extends TeaModel {
    /**
     * <p>The ID of the CSR.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5209</p>
     */
    @NameInMap("CsrId")
    public Long csrId;

    /**
     * <p>The private key content of the certificate in the PEM format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY----- MII.... -----END RSA PRIVATE KEY-----</p>
     */
    @NameInMap("Key")
    public String key;

    public static UpdateCsrRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCsrRequest self = new UpdateCsrRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCsrRequest setCsrId(Long csrId) {
        this.csrId = csrId;
        return this;
    }
    public Long getCsrId() {
        return this.csrId;
    }

    public UpdateCsrRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
