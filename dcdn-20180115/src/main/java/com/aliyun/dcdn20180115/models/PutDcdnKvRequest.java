// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PutDcdnKvRequest extends TeaModel {
    /**
     * <p>The time when the key expires.Example: &quot;1690081381&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>1690081381</p>
     */
    @NameInMap("Expiration")
    public Long expiration;

    /**
     * <p>The time when the key expires.Example: &quot;3600&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("ExpirationTtl")
    public Long expirationTtl;

    /**
     * <p>The key. The key can be up to 512 characters in length, and cannot contain spaces.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>key1</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name of the namespace.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ns1</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The value of the key. The maximum size is 2 MB (2 x 1000 x 1000 bytes).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>value1</p>
     */
    @NameInMap("Value")
    public String value;

    public static PutDcdnKvRequest build(java.util.Map<String, ?> map) throws Exception {
        PutDcdnKvRequest self = new PutDcdnKvRequest();
        return TeaModel.build(map, self);
    }

    public PutDcdnKvRequest setExpiration(Long expiration) {
        this.expiration = expiration;
        return this;
    }
    public Long getExpiration() {
        return this.expiration;
    }

    public PutDcdnKvRequest setExpirationTtl(Long expirationTtl) {
        this.expirationTtl = expirationTtl;
        return this;
    }
    public Long getExpirationTtl() {
        return this.expirationTtl;
    }

    public PutDcdnKvRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public PutDcdnKvRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutDcdnKvRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
