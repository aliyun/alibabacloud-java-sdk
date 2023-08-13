// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeHotBigKeysRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The ID of the ApsaraDB for Redis instance. You can call the [DescribeInstances](~~60933~~) operation to query the ID.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the data shard on the ApsaraDB for Redis instance. You can call the [DescribeRoleZoneInfo](~~190794~~) operation to query the ID.</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static DescribeHotBigKeysRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHotBigKeysRequest self = new DescribeHotBigKeysRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHotBigKeysRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public DescribeHotBigKeysRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHotBigKeysRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
