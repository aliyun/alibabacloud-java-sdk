// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class SupplierOrderVerifyRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static SupplierOrderVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        SupplierOrderVerifyRequest self = new SupplierOrderVerifyRequest();
        return TeaModel.build(map, self);
    }

    public SupplierOrderVerifyRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
