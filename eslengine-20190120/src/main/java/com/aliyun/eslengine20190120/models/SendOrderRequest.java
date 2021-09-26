// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eslengine20190120.models;

import com.aliyun.tea.*;

public class SendOrderRequest extends TeaModel {
    @NameInMap("Head")
    public String head;

    @NameInMap("Parameters")
    public String parameters;

    public static SendOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        SendOrderRequest self = new SendOrderRequest();
        return TeaModel.build(map, self);
    }

    public SendOrderRequest setHead(String head) {
        this.head = head;
        return this;
    }
    public String getHead() {
        return this.head;
    }

    public SendOrderRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
