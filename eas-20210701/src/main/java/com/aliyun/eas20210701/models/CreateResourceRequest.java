// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Valid values:</p>
     * <ul>
     * <li><p><code>false</code> (default): Auto-renewal is disabled.</p>
     * </li>
     * <li><p><code>true</code>: Auto-renewal is enabled.</p>
     * </li>
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
     * <li><p><code>PrePaid</code>: subscription.</p>
     * </li>
     * <li><p><code>PostPaid</code>: pay-as-you-go.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required when <code>ResourceType</code> is set to <code>Dedicated</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PostPaid</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The number of instances.</p>
     * <blockquote>
     * <p>This parameter is required when <code>ResourceType</code> is set to <code>Dedicated</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("EcsInstanceCount")
    public Integer ecsInstanceCount;

    /**
     * <p>The ECS instance type.</p>
     * <blockquote>
     * <p>This parameter is required when <code>ResourceType</code> is set to <code>Dedicated</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.8xlarge</p>
     */
    @NameInMap("EcsInstanceType")
    public String ecsInstanceType;

    /**
     * <p>The user-defined labels.</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, String> labels;

    /**
     * <p>The name of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>MyResource</p>
     */
    @NameInMap("ResourceName")
    public String resourceName;

    /**
     * <p>The type of the resource group. Valid values:</p>
     * <ul>
     * <li><p><code>Dedicated</code>: a dedicated resource group.</p>
     * </li>
     * <li><p><code>SelfManaged</code>: a self-managed resource group.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>You must be whitelisted to use self-managed resource groups.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Dedicated</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The configuration options for the self-managed resource group.</p>
     */
    @NameInMap("SelfManagedResourceOptions")
    public CreateResourceRequestSelfManagedResourceOptions selfManagedResourceOptions;

    /**
     * <p>The size of the system disk, in GiB. The value must be between 200 and 2,000. If unspecified, the default is 200 GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    @NameInMap("UsageMode")
    public String usageMode;

    /**
     * <p>The zone in which to create the instance.</p>
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

    public CreateResourceRequest setUsageMode(String usageMode) {
        this.usageMode = usageMode;
        return this;
    }
    public String getUsageMode() {
        return this.usageMode;
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
         * <p>The effect of the toleration.</p>
         * 
         * <strong>example:</strong>
         * <p>NoSchedule</p>
         */
        @NameInMap("effect")
        public String effect;

        /**
         * <p>The key of the toleration.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The toleration operator, which defines the relationship between the key and value.</p>
         * 
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("operator")
        public String operator;

        /**
         * <p>The toleration value.</p>
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
         * <p>The node labels to match, specified as key-value pairs.</p>
         */
        @NameInMap("NodeMatchLabels")
        public java.util.Map<String, String> nodeMatchLabels;

        /**
         * <p>A list of tolerations for node taints.</p>
         */
        @NameInMap("NodeTolerations")
        public java.util.List<CreateResourceRequestSelfManagedResourceOptionsNodeTolerations> nodeTolerations;

        /**
         * <p>The name of the RAM role that grants PAI-EAS the required permissions.</p>
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
