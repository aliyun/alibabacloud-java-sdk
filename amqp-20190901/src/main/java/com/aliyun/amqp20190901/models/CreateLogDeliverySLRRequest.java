// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class CreateLogDeliverySLRRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    public static CreateLogDeliverySLRRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogDeliverySLRRequest self = new CreateLogDeliverySLRRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogDeliverySLRRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

}
