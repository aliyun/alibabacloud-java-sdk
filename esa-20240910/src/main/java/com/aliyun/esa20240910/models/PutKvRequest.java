// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PutKvRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Base64")
    public Boolean base64;

    /**
     * <strong>example:</strong>
     * <p>1690081381</p>
     */
    @NameInMap("Expiration")
    public Long expiration;

    /**
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("ExpirationTtl")
    public Long expirationTtl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_key</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_value</p>
     */
    @NameInMap("Value")
    public String value;

    public static PutKvRequest build(java.util.Map<String, ?> map) throws Exception {
        PutKvRequest self = new PutKvRequest();
        return TeaModel.build(map, self);
    }

    public PutKvRequest setBase64(Boolean base64) {
        this.base64 = base64;
        return this;
    }
    public Boolean getBase64() {
        return this.base64;
    }

    public PutKvRequest setExpiration(Long expiration) {
        this.expiration = expiration;
        return this;
    }
    public Long getExpiration() {
        return this.expiration;
    }

    public PutKvRequest setExpirationTtl(Long expirationTtl) {
        this.expirationTtl = expirationTtl;
        return this;
    }
    public Long getExpirationTtl() {
        return this.expirationTtl;
    }

    public PutKvRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public PutKvRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutKvRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
