// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li>false (default)</li>
     * <li>true</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The billing method. Valid values:</p>
     * <ul>
     * <li>PrePaid: the subscription billing method.</li>
     * <li>PostPaid: the pay-as-you-go billing method.</li>
     * </ul>
     * <blockquote>
     * <p> This parameter is required when the ResourceType parameter is set to Dedicated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The number of ECS instances.</p>
     * <blockquote>
     * <p> This parameter is required when the ResourceType parameter is set to Dedicated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("EcsInstanceCount")
    public Integer ecsInstanceCount;

    /**
     * <p>The type of the Elastic Compute Service (ECS) instance.</p>
     * <blockquote>
     * <p> This parameter is required when the ResourceType parameter is set to Dedicated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.8xlarge</p>
     */
    @NameInMap("EcsInstanceType")
    public String ecsInstanceType;

    /**
     * <p>The custom tag.</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The type of the resource group. Valid values:</p>
     * <ul>
     * <li>Dedicated: the dedicated resource group.</li>
     * <li>SelfManaged: the self-managed resource group.</li>
     * </ul>
     * <blockquote>
     * <p> If you use a self-managed resource group, you must configure a whitelist.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Dedicated</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The configurations of the self-managed resource group.</p>
     */
    @NameInMap("SelfManagedResourceOptions")
    public CreateResourceRequestSelfManagedResourceOptions selfManagedResourceOptions;

    /**
     * <p>The size of the system disk. Unit: GiB. Valid values: 200 to 2000. Default value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The ID of the zone in which the instance resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai-f</p>
     */
    @NameInMap("Zone")
    public String zone;

    public static CreateResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceRequest self = new CreateResourceRequest();
        return TeaModel.build(map, self);
    }

    public CreateResourceRequest setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    public CreateResourceRequest setChargeType(String chargeType) {
        this.chargeType = chargeType;
        return this;
    }
    public String getChargeType() {
        return this.chargeType;
    }

    public CreateResourceRequest setEcsInstanceCount(Integer ecsInstanceCount) {
        this.ecsInstanceCount = ecsInstanceCount;
        return this;
    }
    public Integer getEcsInstanceCount() {
        return this.ecsInstanceCount;
    }

    public CreateResourceRequest setEcsInstanceType(String ecsInstanceType) {
        this.ecsInstanceType = ecsInstanceType;
        return this;
    }
    public String getEcsInstanceType() {
        return this.ecsInstanceType;
    }

    public CreateResourceRequest setLabels(java.util.Map<String, String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    public CreateResourceRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public CreateResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateResourceRequest setSelfManagedResourceOptions(CreateResourceRequestSelfManagedResourceOptions selfManagedResourceOptions) {
        this.selfManagedResourceOptions = selfManagedResourceOptions;
        return this;
    }
    public CreateResourceRequestSelfManagedResourceOptions getSelfManagedResourceOptions() {
        return this.selfManagedResourceOptions;
    }

    public CreateResourceRequest setSystemDiskSize(Integer systemDiskSize) {
        this.systemDiskSize = systemDiskSize;
        return this;
    }
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    public CreateResourceRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

    public static class CreateResourceRequestSelfManagedResourceOptionsNodeTolerations extends TeaModel {
        /**
         * <p>The result.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PreferNoSchedule</li>
         * <li>NoSchedule</li>
         * <li>NoExecute</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NoSchedule</p>
         */
        @NameInMap("effect")
        public String effect;

        /**
         * <p>The key name.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The relationship between key names and key values.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>Equal</li>
         * <li>Exists</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The key value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("value")
        public String value;

        public static CreateResourceRequestSelfManagedResourceOptionsNodeTolerations build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceRequestSelfManagedResourceOptionsNodeTolerations self = new CreateResourceRequestSelfManagedResourceOptionsNodeTolerations();
            return TeaModel.build(map, self);
        }

        public CreateResourceRequestSelfManagedResourceOptionsNodeTolerations setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public CreateResourceRequestSelfManagedResourceOptionsNodeTolerations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateResourceRequestSelfManagedResourceOptionsNodeTolerations setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateResourceRequestSelfManagedResourceOptionsNodeTolerations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateResourceRequestSelfManagedResourceOptions extends TeaModel {
        /**
         * <p>The ID of the self-managed cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>cf0386f250f2545689ca7fdd1cd******</p>
         */
        @NameInMap("ExternalClusterId")
        public String externalClusterId;

        /**
         * <p>The tag key-value pairs of the node.</p>
         */
        @NameInMap("NodeMatchLabels")
        public java.util.Map<String, String> nodeMatchLabels;

        /**
         * <p>The tolerations for the node taint.</p>
         */
        @NameInMap("NodeTolerations")
        public java.util.List<CreateResourceRequestSelfManagedResourceOptionsNodeTolerations> nodeTolerations;

        /**
         * <p>The name of the RAM user to which the permissions on Elastic Algorithm Service (EAS) of Platform for AI (PAI) are granted.</p>
         * 
         * <strong>example:</strong>
         * <p>clusterrole</p>
         */
        @NameInMap("RoleName")
        public String roleName;

        public static CreateResourceRequestSelfManagedResourceOptions build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceRequestSelfManagedResourceOptions self = new CreateResourceRequestSelfManagedResourceOptions();
            return TeaModel.build(map, self);
        }

        public CreateResourceRequestSelfManagedResourceOptions setExternalClusterId(String externalClusterId) {
            this.externalClusterId = externalClusterId;
            return this;
        }
        public String getExternalClusterId() {
            return this.externalClusterId;
        }

        public CreateResourceRequestSelfManagedResourceOptions setNodeMatchLabels(java.util.Map<String, String> nodeMatchLabels) {
            this.nodeMatchLabels = nodeMatchLabels;
            return this;
        }
        public java.util.Map<String, String> getNodeMatchLabels() {
            return this.nodeMatchLabels;
        }

        public CreateResourceRequestSelfManagedResourceOptions setNodeTolerations(java.util.List<CreateResourceRequestSelfManagedResourceOptionsNodeTolerations> nodeTolerations) {
            this.nodeTolerations = nodeTolerations;
            return this;
        }
        public java.util.List<CreateResourceRequestSelfManagedResourceOptionsNodeTolerations> getNodeTolerations() {
            return this.nodeTolerations;
        }

        public CreateResourceRequestSelfManagedResourceOptions setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

    }

}
