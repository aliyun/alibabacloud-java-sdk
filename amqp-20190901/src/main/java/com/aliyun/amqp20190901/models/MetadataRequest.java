// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class MetadataRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    public static MetadataRequest build(java.util.Map<String, ?> map) throws Exception {
        MetadataRequest self = new MetadataRequest();
        return TeaModel.build(map, self);
    }

    public MetadataRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

}
