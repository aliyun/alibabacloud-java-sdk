// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class NodeProcessCreateRequest extends TeaModel {
    @NameInMap("Command")
    public String command;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("ProcessUser")
    public String processUser;

    @NameInMap("RegionId")
    public String regionId;

    public static NodeProcessCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        NodeProcessCreateRequest self = new NodeProcessCreateRequest();
        return TeaModel.build(map, self);
    }

    public NodeProcessCreateRequest setCommand(String command) {
        this.command = command;
        return this;
    }
    public String getCommand() {
        return this.command;
    }

    public NodeProcessCreateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public NodeProcessCreateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public NodeProcessCreateRequest setProcessName(String processName) {
        this.processName = processName;
        return this;
    }
    public String getProcessName() {
        return this.processName;
    }

    public NodeProcessCreateRequest setProcessUser(String processUser) {
        this.processUser = processUser;
        return this;
    }
    public String getProcessUser() {
        return this.processUser;
    }

    public NodeProcessCreateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
