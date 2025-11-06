// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.amqp20190901.models;

import com.aliyun.tea.*;

public class DeleteVhostShrinkRequest extends TeaModel {
    @NameInMap("ConsoleSessionId")
    public String consoleSessionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("VhostName")
    public String vhostName;

    @NameInMap("VhostNames")
    public String vhostNamesShrink;

    public static DeleteVhostShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteVhostShrinkRequest self = new DeleteVhostShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteVhostShrinkRequest setConsoleSessionId(String consoleSessionId) {
        this.consoleSessionId = consoleSessionId;
        return this;
    }
    public String getConsoleSessionId() {
        return this.consoleSessionId;
    }

    public DeleteVhostShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteVhostShrinkRequest setVhostName(String vhostName) {
        this.vhostName = vhostName;
        return this;
    }
    public String getVhostName() {
        return this.vhostName;
    }

    public DeleteVhostShrinkRequest setVhostNamesShrink(String vhostNamesShrink) {
        this.vhostNamesShrink = vhostNamesShrink;
        return this;
    }
    public String getVhostNamesShrink() {
        return this.vhostNamesShrink;
    }

}
