// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class ListVhostRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VhostNamePrefix")
    public String vhostNamePrefix;

    public static ListVhostRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVhostRequest self = new ListVhostRequest();
        return TeaModel.build(map, self);
    }

    public ListVhostRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public ListVhostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListVhostRequest setVhostNamePrefix(String vhostNamePrefix) {
        this.vhostNamePrefix = vhostNamePrefix;
        return this;
    }
    public String getVhostNamePrefix() {
        return this.vhostNamePrefix;
    }

}
