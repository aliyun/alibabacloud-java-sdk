// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchDeleteDcdnKvWithHighCapacityRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Url")
    public String url;

    public static BatchDeleteDcdnKvWithHighCapacityRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDcdnKvWithHighCapacityRequest self = new BatchDeleteDcdnKvWithHighCapacityRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDcdnKvWithHighCapacityRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public BatchDeleteDcdnKvWithHighCapacityRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
