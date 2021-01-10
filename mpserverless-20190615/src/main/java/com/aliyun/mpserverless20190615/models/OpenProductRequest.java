// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class OpenProductRequest extends TeaModel {
    @NameInMap("data")
    public String data;

    public static OpenProductRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenProductRequest self = new OpenProductRequest();
        return TeaModel.build(map, self);
    }

    public OpenProductRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
