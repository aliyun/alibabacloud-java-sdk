// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class GetDcdnKvStatusRequest extends TeaModel {
    /**
     * <p>The name of the key that you want to query.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The name of the namespace.</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    public static GetDcdnKvStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDcdnKvStatusRequest self = new GetDcdnKvStatusRequest();
        return TeaModel.build(map, self);
    }

    public GetDcdnKvStatusRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public GetDcdnKvStatusRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
