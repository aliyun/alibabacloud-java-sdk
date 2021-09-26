// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eslengine20190120.models;

import com.aliyun.tea.*;

public class SendCommandRequest extends TeaModel {
    @NameInMap("Head")
    public String head;

    @NameInMap("Parameters")
    public String parameters;

    public static SendCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        SendCommandRequest self = new SendCommandRequest();
        return TeaModel.build(map, self);
    }

    public SendCommandRequest setHead(String head) {
        this.head = head;
        return this;
    }
    public String getHead() {
        return this.head;
    }

    public SendCommandRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

}
