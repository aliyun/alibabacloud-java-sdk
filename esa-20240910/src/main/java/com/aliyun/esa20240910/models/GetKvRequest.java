// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKvRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Base64")
    public Boolean base64;

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

    public static GetKvRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKvRequest self = new GetKvRequest();
        return TeaModel.build(map, self);
    }

    public GetKvRequest setBase64(Boolean base64) {
        this.base64 = base64;
        return this;
    }
    public Boolean getBase64() {
        return this.base64;
    }

    public GetKvRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GetKvRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
