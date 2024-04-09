// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable auto-renewal. Valid values: false (default)</p>
     * <br>
     * <p>*   true</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   PrePaid: the subscription billing method.</p>
     * <p>*   PostPaid: the pay-as-you-go billing method.</p>
     */
    @NameInMap("ChargeType")
    public String chargeType;

    /**
     * <p>The number of ECS instances.</p>
     */
    @NameInMap("EcsInstanceCount")
    public Integer ecsInstanceCount;

    /**
     * <p>The type of the Elastic Compute Service (ECS) instance.</p>
     */
    @NameInMap("EcsInstanceType")
    public String ecsInstanceType;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("SelfManagedResourceOptions")
    public CreateResourceRequestSelfManagedResourceOptions selfManagedResourceOptions;

    /**
     * <p>The size of the system disk. Unit: GiB. Valid values: 200 to 2000. Default value: 200.</p>
     */
    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

    /**
     * <p>The zone to which the instance belongs.</p>
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
        @NameInMap("effect")
        public String effect;

        @NameInMap("key")
        public String key;

        @NameInMap("operator")
        public String operator;

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
        @NameInMap("ExternalClusterId")
        public String externalClusterId;

        @NameInMap("NodeMatchLabels")
        public java.util.Map<String, String> nodeMatchLabels;

        @NameInMap("NodeTolerations")
        public java.util.List<CreateResourceRequestSelfManagedResourceOptionsNodeTolerations> nodeTolerations;

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
