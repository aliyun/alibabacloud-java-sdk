// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ConsoleSavePretendStatusRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public Integer type;

    public static ConsoleSavePretendStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ConsoleSavePretendStatusRequest self = new ConsoleSavePretendStatusRequest();
        return TeaModel.build(map, self);
    }

    public ConsoleSavePretendStatusRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public ConsoleSavePretendStatusRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public ConsoleSavePretendStatusRequest setType(Integer type) {
        this.type = type;
        return this;
    }
    public Integer getType() {
        return this.type;
    }

}
