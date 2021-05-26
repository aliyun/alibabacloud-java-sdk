// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class EchoRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    public static EchoRequest build(java.util.Map<String, ?> map) throws Exception {
        EchoRequest self = new EchoRequest();
        return TeaModel.build(map, self);
    }

    public EchoRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
