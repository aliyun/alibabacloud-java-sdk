// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKvDetailRequest extends TeaModel {
    /**
     * <p>The key name for the query.</p>
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

    public static GetKvDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetKvDetailRequest self = new GetKvDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetKvDetailRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GetKvDetailRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
