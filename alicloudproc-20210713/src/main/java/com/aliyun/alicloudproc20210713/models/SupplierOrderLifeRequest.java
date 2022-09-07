// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alicloudproc20210713.models;

import com.aliyun.tea.*;

public class SupplierOrderLifeRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static SupplierOrderLifeRequest build(java.util.Map<String, ?> map) throws Exception {
        SupplierOrderLifeRequest self = new SupplierOrderLifeRequest();
        return TeaModel.build(map, self);
    }

    public SupplierOrderLifeRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
