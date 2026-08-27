// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateMigrationTaskRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("clusterNamespace")
    public String clusterNamespace;

    /**
     * <strong>example:</strong>
     * <p>迁移测试</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>nginx-ingress-lb</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <strong>example:</strong>
     * <p>lb-bp1xxxx</p>
     */
    @NameInMap("slbId")
    public String slbId;

    /**
     * <strong>example:</strong>
     * <p>SLB</p>
     */
    @NameInMap("switchType")
    public String switchType;

    /**
     * <strong>example:</strong>
     * <p>Task</p>
     */
    @NameInMap("target")
    public String target;

    @NameInMap("virtualServices")
    public java.util.List<UpdateMigrationTaskRequestVirtualServices> virtualServices;

    /**
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
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("port")
        public Integer port;

        /**
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>rsp-xxxx</p>
         */
        @NameInMap("virtualServiceGroupId")
        public String virtualServiceGroupId;

        /**
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
