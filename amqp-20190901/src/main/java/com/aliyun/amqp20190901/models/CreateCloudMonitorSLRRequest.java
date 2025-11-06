// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class CreateCloudMonitorSLRRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    public static CreateCloudMonitorSLRRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudMonitorSLRRequest self = new CreateCloudMonitorSLRRequest();
        return TeaModel.build(map, self);
    }

    public CreateCloudMonitorSLRRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

}
