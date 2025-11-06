// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class DeleteVhostRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VhostName")
    public String vhostName;

    @NameInMap("VhostNames")
    public java.util.Map<String, ?> vhostNames;

    public static DeleteVhostRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVhostRequest self = new DeleteVhostRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVhostRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public DeleteVhostRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteVhostRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

    public DeleteVhostRequest setVhostNames(java.util.Map<String, ?> vhostNames) {
        this.vhostNames = vhostNames;
        return this;
    }
    public java.util.Map<String, ?> getVhostNames() {
        return this.vhostNames;
    }

}
