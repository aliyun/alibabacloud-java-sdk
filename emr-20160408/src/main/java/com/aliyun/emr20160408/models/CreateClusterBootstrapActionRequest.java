// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class CreateClusterBootstrapActionRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("BootstrapAction")
    public java.util.List<CreateClusterBootstrapActionRequestBootstrapAction> bootstrapAction;

    public static CreateClusterBootstrapActionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterBootstrapActionRequest self = new CreateClusterBootstrapActionRequest();
        return TeaModel.build(map, self);
    }

    public CreateClusterBootstrapActionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateClusterBootstrapActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateClusterBootstrapActionRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterBootstrapActionRequest setBootstrapAction(java.util.List<CreateClusterBootstrapActionRequestBootstrapAction> bootstrapAction) {
        this.bootstrapAction = bootstrapAction;
        return this;
    }
    public java.util.List<CreateClusterBootstrapActionRequestBootstrapAction> getBootstrapAction() {
        return this.bootstrapAction;
    }

    public static class CreateClusterBootstrapActionRequestBootstrapAction extends TeaModel {
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

        public static CreateClusterBootstrapActionRequestBootstrapAction build(java.util.Map<String, ?> map) throws Exception {
            CreateClusterBootstrapActionRequestBootstrapAction self = new CreateClusterBootstrapActionRequestBootstrapAction();
            return TeaModel.build(map, self);
        }

        public CreateClusterBootstrapActionRequestBootstrapAction setExecutionFailStrategy(String executionFailStrategy) {
            this.executionFailStrategy = executionFailStrategy;
            return this;
        }
        public String getExecutionFailStrategy() {
            return this.executionFailStrategy;
        }

        public CreateClusterBootstrapActionRequestBootstrapAction setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public CreateClusterBootstrapActionRequestBootstrapAction setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public CreateClusterBootstrapActionRequestBootstrapAction setExecutionTarget(String executionTarget) {
            this.executionTarget = executionTarget;
            return this;
        }
        public String getExecutionTarget() {
            return this.executionTarget;
        }

        public CreateClusterBootstrapActionRequestBootstrapAction setExecutionMoment(String executionMoment) {
            this.executionMoment = executionMoment;
            return this;
        }
        public String getExecutionMoment() {
            return this.executionMoment;
        }

        public CreateClusterBootstrapActionRequestBootstrapAction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
