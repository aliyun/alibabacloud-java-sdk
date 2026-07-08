// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateCsrRequest extends TeaModel {
    /**
     * <p>The unique ID of the CSR. This ID is generated when you upload a CSR. To obtain the ID, call the <a href="https://help.aliyun.com/document_detail/2709717.html">ListCsr</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5209</p>
     */
    @NameInMap("CsrId")
    public Long csrId;

    /**
     * <p>The content of the certificate private key in PEM format.</p>
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
