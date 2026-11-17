// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateMigrationTaskRequest extends TeaModel {
    /**
     * <p>The namespace of the source cluster for SLB traffic switching.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("clusterNamespace")
    public String clusterNamespace;

    /**
     * <p>The description of the task. When the target is Engine and the switch type is DNS, only this field can be updated.</p>
     * 
     * <strong>example:</strong>
     * <p>Migration test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The name of the SLB service.</p>
     * 
     * <strong>example:</strong>
     * <p>nginx-ingress-lb</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <p>The ID of the SLB instance. This parameter is required when the status is advanced to Initial and the switch type is SLB. The instance type is determined by the prefix lb- or nlb-.</p>
     * 
     * <strong>example:</strong>
     * <p>lb-bp1xxxx</p>
     */
    @NameInMap("slbId")
    public String slbId;

    /**
     * <p>The traffic switching method. This parameter is required when the status is advanced to Initial.</p>
     * 
     * <strong>example:</strong>
     * <p>SLB</p>
     */
    @NameInMap("switchType")
    public String switchType;

    /**
     * <p>Required. The update target, which determines whether to advance the status or perform an engine operation.</p>
     * 
     * <strong>example:</strong>
     * <p>Task</p>
     */
    @NameInMap("target")
    public String target;

    /**
     * <p>The list of backend group bindings.</p>
     */
    @NameInMap("virtualServices")
    public java.util.List<UpdateMigrationTaskRequestVirtualServices> virtualServices;

    /**
     * <p>The traffic switching weight for the legacy process. Valid values: 0 to 100. This parameter takes effect when the target is Engine.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("weight")
    public Integer weight;

    public static UpdateMigrationTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMigrationTaskRequest self = new UpdateMigrationTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMigrationTaskRequest setClusterNamespace(String clusterNamespace) {
        this.clusterNamespace = clusterNamespace;
        return this;
    }
    public String getClusterNamespace() {
        return this.clusterNamespace;
    }

    public UpdateMigrationTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateMigrationTaskRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public UpdateMigrationTaskRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public UpdateMigrationTaskRequest setSwitchType(String switchType) {
        this.switchType = switchType;
        return this;
    }
    public String getSwitchType() {
        return this.switchType;
    }

    public UpdateMigrationTaskRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public UpdateMigrationTaskRequest setVirtualServices(java.util.List<UpdateMigrationTaskRequestVirtualServices> virtualServices) {
        this.virtualServices = virtualServices;
        return this;
    }
    public java.util.List<UpdateMigrationTaskRequestVirtualServices> getVirtualServices() {
        return this.virtualServices;
    }

    public UpdateMigrationTaskRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public static class UpdateMigrationTaskRequestVirtualServices extends TeaModel {
        /**
         * <p>The port number. Valid values: 1 to 65535.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <p>The protocol. This parameter is required for CLB.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <p>CLB VServerGroupId / NLB ServerGroupId</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-xxxx</p>
         */
        @NameInMap("virtualServiceGroupId")
        public String virtualServiceGroupId;

        /**
         * <p>The name of the group.</p>
         * 
         * <strong>example:</strong>
         * <p>80-tcp</p>
         */
        @NameInMap("virtualServiceGroupName")
        public String virtualServiceGroupName;

        public static UpdateMigrationTaskRequestVirtualServices build(java.util.Map<String, ?> map) throws Exception {
            UpdateMigrationTaskRequestVirtualServices self = new UpdateMigrationTaskRequestVirtualServices();
            return TeaModel.build(map, self);
        }

        public UpdateMigrationTaskRequestVirtualServices setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public UpdateMigrationTaskRequestVirtualServices setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public UpdateMigrationTaskRequestVirtualServices setVirtualServiceGroupId(String virtualServiceGroupId) {
            this.virtualServiceGroupId = virtualServiceGroupId;
            return this;
        }
        public String getVirtualServiceGroupId() {
            return this.virtualServiceGroupId;
        }

        public UpdateMigrationTaskRequestVirtualServices setVirtualServiceGroupName(String virtualServiceGroupName) {
            this.virtualServiceGroupName = virtualServiceGroupName;
            return this;
        }
        public String getVirtualServiceGroupName() {
            return this.virtualServiceGroupName;
        }

    }

}
