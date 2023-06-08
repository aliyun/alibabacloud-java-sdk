// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class GetDcdnKvRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

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
