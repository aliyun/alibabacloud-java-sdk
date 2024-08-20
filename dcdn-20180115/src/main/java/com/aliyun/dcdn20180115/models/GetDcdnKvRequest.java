// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class GetDcdnKvRequest extends TeaModel {
    /**
     * <p>The name of the key that you want to query.</p>
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

    public static GetDcdnKvRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDcdnKvRequest self = new GetDcdnKvRequest();
        return TeaModel.build(map, self);
    }

    public GetDcdnKvRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GetDcdnKvRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
