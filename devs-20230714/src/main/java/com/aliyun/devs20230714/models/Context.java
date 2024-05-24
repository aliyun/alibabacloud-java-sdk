// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class Context extends TeaModel {
    @NameInMap("data")
    public java.util.Map<String, ?> data;

    public static Context build(java.util.Map<String, ?> map) throws Exception {
        Context self = new Context();
        return TeaModel.build(map, self);
    }

    public Context setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

}
