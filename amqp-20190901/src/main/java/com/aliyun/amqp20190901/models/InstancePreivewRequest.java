// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class InstancePreivewRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("Tags")
    public String tags;

    public static InstancePreivewRequest build(java.util.Map<String, ?> map) throws Exception {
        InstancePreivewRequest self = new InstancePreivewRequest();
        return TeaModel.build(map, self);
    }

    public InstancePreivewRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public InstancePreivewRequest setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

}
