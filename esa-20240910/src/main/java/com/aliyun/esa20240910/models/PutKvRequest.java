// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PutKvRequest extends TeaModel {
    /**
     * <p>Specifies whether the content of the key is Base64-encoded. Set this parameter to true if you want to store the key content in binary format. When this parameter is set to true, the Value parameter must be Base64-encoded.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Base64")
    public Boolean base64;

    /**
     * <p>The time when the key-value pair expires, which cannot be earlier than the current time. The value is a timestamp in seconds. If you specify both Expiration and ExpirationTtl, only ExpirationTtl takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>1690081381</p>
     */
    @NameInMap("Expiration")
    public Long expiration;

    /**
     * <p>The relative expiration time. Unit: seconds. If you specify both Expiration and ExpirationTtl, only ExpirationTtl takes effect.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("ExpirationTtl")
    public Long expirationTtl;

    /**
     * <p>The key name. The name can be up to 512 characters in length and cannot contain spaces or backslashes (\\).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_key</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name of the namespace that you specify when you call the <a href="https://help.aliyun.com/document_detail/2850317.html">CreateKvNamespace</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The content of the key, which can be up to 2 MB (2 × 1000 × 1000). If the content is larger than 2 MB, call <a href="https://help.aliyun.com/document_detail/2850486.html">PutKvWithHighCapacity</a>.</p>
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
