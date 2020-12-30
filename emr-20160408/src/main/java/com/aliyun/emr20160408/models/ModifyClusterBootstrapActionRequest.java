// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class ModifyClusterBootstrapActionRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Id")
    public String id;

    @NameInMap("BootstrapAction")
    public java.util.List<ModifyClusterBootstrapActionRequestBootstrapAction> bootstrapAction;

    public static ModifyClusterBootstrapActionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterBootstrapActionRequest self = new ModifyClusterBootstrapActionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterBootstrapActionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyClusterBootstrapActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyClusterBootstrapActionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyClusterBootstrapActionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyClusterBootstrapActionRequest setBootstrapAction(java.util.List<ModifyClusterBootstrapActionRequestBootstrapAction> bootstrapAction) {
        this.bootstrapAction = bootstrapAction;
        return this;
    }
    public java.util.List<ModifyClusterBootstrapActionRequestBootstrapAction> getBootstrapAction() {
        return this.bootstrapAction;
    }

    public static class ModifyClusterBootstrapActionRequestBootstrapAction extends TeaModel {
        @NameInMap("ExecutionFailStrategy")
        public String executionFailStrategy;

        @NameInMap("Arg")
        public String arg;

        @NameInMap("Path")
        public String path;

        @NameInMap("ExecutionTarget")
        public String executionTarget;

        @NameInMap("ExecutionMoment")
        public String executionMoment;

        @NameInMap("Name")
        public String name;

        public static ModifyClusterBootstrapActionRequestBootstrapAction build(java.util.Map<String, ?> map) throws Exception {
            ModifyClusterBootstrapActionRequestBootstrapAction self = new ModifyClusterBootstrapActionRequestBootstrapAction();
            return TeaModel.build(map, self);
        }

        public ModifyClusterBootstrapActionRequestBootstrapAction setExecutionFailStrategy(String executionFailStrategy) {
            this.executionFailStrategy = executionFailStrategy;
            return this;
        }
        public String getExecutionFailStrategy() {
            return this.executionFailStrategy;
        }

        public ModifyClusterBootstrapActionRequestBootstrapAction setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public ModifyClusterBootstrapActionRequestBootstrapAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ModifyClusterBootstrapActionRequestBootstrapAction setExecutionTarget(String executionTarget) {
            this.executionTarget = executionTarget;
            return this;
        }
        public String getExecutionTarget() {
            return this.executionTarget;
        }

        public ModifyClusterBootstrapActionRequestBootstrapAction setExecutionMoment(String executionMoment) {
            this.executionMoment = executionMoment;
            return this;
        }
        public String getExecutionMoment() {
            return this.executionMoment;
        }

        public ModifyClusterBootstrapActionRequestBootstrapAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
