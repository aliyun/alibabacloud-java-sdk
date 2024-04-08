// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchPutDcdnKvWithHighCapacityRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Url")
    public String url;

    public static BatchPutDcdnKvWithHighCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchPutDcdnKvWithHighCapacityRequest self = new BatchPutDcdnKvWithHighCapacityRequest();
        return TeaModel.build(map, self);
    }

    public BatchPutDcdnKvWithHighCapacityRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public BatchPutDcdnKvWithHighCapacityRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
