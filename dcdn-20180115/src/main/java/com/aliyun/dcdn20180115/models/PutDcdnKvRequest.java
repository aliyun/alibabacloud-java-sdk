// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PutDcdnKvRequest extends TeaModel {
    /**
     * <p>The length of the key.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The content of the key. The maximum size is 2 MB (2 x 1000 x 1000 bytes).</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>The content of the key. If the value exceeds 256 characters in length, the first 100 characters and the last 100 characters are retained and other characters are discarded.</p>
     */
    @NameInMap("Value")
    public String value;

    public static PutDcdnKvRequest build(java.util.Map<String, ?> map) throws Exception {
        PutDcdnKvRequest self = new PutDcdnKvRequest();
        return TeaModel.build(map, self);
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
