// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PutKvRequest extends TeaModel {
    /**
     * <p>Indicates whether the Value parameter uses Base64 encoding. Set this to true when storing a binary value. If this parameter is true, Value must be a valid Base64-encoded string.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Base64")
    public Boolean base64;

    /**
     * <p>The expiration time for the key-value pair, as a Unix timestamp in seconds. This value cannot be earlier than the current time. If you specify both Expiration and ExpirationTtl, ExpirationTtl takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>1690081381</p>
     */
    @NameInMap("Expiration")
    public Long expiration;

    /**
     * <p>The time-to-live (TTL) for the key-value pair, in seconds. If you specify both Expiration and ExpirationTtl, ExpirationTtl takes precedence.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("ExpirationTtl")
    public Long expirationTtl;

    /**
     * <p>The key can be up to 512 bytes long and cannot contain spaces or forward slashes (/).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_key</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name of the namespace. You specify this name when you call the <a href="https://help.aliyun.com/document_detail/2850317.html">CreateKvNamespace</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The value to associate with the key. The maximum size is 2 MB (2,000,000 bytes). For values that exceed this limit, use the <a href="https://help.aliyun.com/document_detail/2850486.html">PutKvWithHighCapacity</a> operation.</p>
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
