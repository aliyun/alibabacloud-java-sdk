// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PutDcdnKvWithHighCapacityRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Url")
    public String url;

    public static PutDcdnKvWithHighCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        PutDcdnKvWithHighCapacityRequest self = new PutDcdnKvWithHighCapacityRequest();
        return TeaModel.build(map, self);
    }

    public PutDcdnKvWithHighCapacityRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public PutDcdnKvWithHighCapacityRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public PutDcdnKvWithHighCapacityRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
