// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ConsoleClearPretendStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    public static ConsoleClearPretendStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ConsoleClearPretendStatusRequest self = new ConsoleClearPretendStatusRequest();
        return TeaModel.build(map, self);
    }

    public ConsoleClearPretendStatusRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

}
