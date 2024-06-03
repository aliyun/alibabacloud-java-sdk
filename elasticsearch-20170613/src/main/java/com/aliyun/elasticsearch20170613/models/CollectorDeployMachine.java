// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CollectorDeployMachine extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("configType")
    public String configType;

    @NameInMap("groupId")
    public String groupId;

    @NameInMap("instanceId")
    public String instanceId;

    @NameInMap("machines")
    public java.util.List<CollectorDeployMachineMachines> machines;

    @NameInMap("successPodsCount")
    public String successPodsCount;

    @NameInMap("totalPodsCount")
    public String totalPodsCount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static CollectorDeployMachine build(java.util.Map<String, ?> map) throws Exception {
        CollectorDeployMachine self = new CollectorDeployMachine();
        return TeaModel.build(map, self);
    }

    public CollectorDeployMachine setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public CollectorDeployMachine setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CollectorDeployMachine setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CollectorDeployMachine setMachines(java.util.List<CollectorDeployMachineMachines> machines) {
        this.machines = machines;
        return this;
    }
    public java.util.List<CollectorDeployMachineMachines> getMachines() {
        return this.machines;
    }

    public CollectorDeployMachine setSuccessPodsCount(String successPodsCount) {
        this.successPodsCount = successPodsCount;
        return this;
    }
    public String getSuccessPodsCount() {
        return this.successPodsCount;
    }

    public CollectorDeployMachine setTotalPodsCount(String totalPodsCount) {
        this.totalPodsCount = totalPodsCount;
        return this;
    }
    public String getTotalPodsCount() {
        return this.totalPodsCount;
    }

    public CollectorDeployMachine setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class CollectorDeployMachineMachines extends TeaModel {
        @NameInMap("agentStatus")
        public String agentStatus;

        @NameInMap("instanceId")
        public String instanceId;

        public static CollectorDeployMachineMachines build(java.util.Map<String, ?> map) throws Exception {
            CollectorDeployMachineMachines self = new CollectorDeployMachineMachines();
            return TeaModel.build(map, self);
        }

        public CollectorDeployMachineMachines setAgentStatus(String agentStatus) {
            this.agentStatus = agentStatus;
            return this;
        }
        public String getAgentStatus() {
            return this.agentStatus;
        }

        public CollectorDeployMachineMachines setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
