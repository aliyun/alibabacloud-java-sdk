// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UploadCsrRequest extends TeaModel {
    /**
     * <p>The content of the CSR.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The content of the certificate\&quot;s private key in PEM format.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN RSA PRIVATE KEY----- MII.... -----END RSA PRIVATE KEY-----</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name of the CSR. The name can be up to 50 characters long and can contain uppercase letters (A–Z), lowercase letters (a–z), digits (0–9), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    public static UploadCsrRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCsrRequest self = new UploadCsrRequest();
        return TeaModel.build(map, self);
    }

    public UploadCsrRequest setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public UploadCsrRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public UploadCsrRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
