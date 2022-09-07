// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class SupplierOrderProduceRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static SupplierOrderProduceRequest build(java.util.Map<String, ?> map) throws Exception {
        SupplierOrderProduceRequest self = new SupplierOrderProduceRequest();
        return TeaModel.build(map, self);
    }

    public SupplierOrderProduceRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
