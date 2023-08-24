// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceRequest extends TeaModel {
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    @NameInMap("ChargeType")
    public String chargeType;

    @NameInMap("EcsInstanceCount")
    public Integer ecsInstanceCount;

    @NameInMap("EcsInstanceType")
    public String ecsInstanceType;

    @NameInMap("ExternalClusterId")
    public String externalClusterId;

    @NameInMap("NodeMatchLabels")
    public java.util.Map<String, String> nodeMatchLabels;

    @NameInMap("NodeTolerations")
    public java.util.List<CreateResourceRequestNodeTolerations> nodeTolerations;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("SystemDiskSize")
    public Integer systemDiskSize;

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

    public CreateResourceRequest setExternalClusterId(String externalClusterId) {
        this.externalClusterId = externalClusterId;
        return this;
    }
    public String getExternalClusterId() {
        return this.externalClusterId;
    }

    public CreateResourceRequest setNodeMatchLabels(java.util.Map<String, String> nodeMatchLabels) {
        this.nodeMatchLabels = nodeMatchLabels;
        return this;
    }
    public java.util.Map<String, String> getNodeMatchLabels() {
        return this.nodeMatchLabels;
    }

    public CreateResourceRequest setNodeTolerations(java.util.List<CreateResourceRequestNodeTolerations> nodeTolerations) {
        this.nodeTolerations = nodeTolerations;
        return this;
    }
    public java.util.List<CreateResourceRequestNodeTolerations> getNodeTolerations() {
        return this.nodeTolerations;
    }

    public CreateResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public CreateResourceRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
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

    public static class CreateResourceRequestNodeTolerations extends TeaModel {
        @NameInMap("effect")
        public String effect;

        @NameInMap("key")
        public String key;

        @NameInMap("operator")
        public String operator;

        @NameInMap("value")
        public String value;

        public static CreateResourceRequestNodeTolerations build(java.util.Map<String, ?> map) throws Exception {
            CreateResourceRequestNodeTolerations self = new CreateResourceRequestNodeTolerations();
            return TeaModel.build(map, self);
        }

        public CreateResourceRequestNodeTolerations setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public CreateResourceRequestNodeTolerations setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateResourceRequestNodeTolerations setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateResourceRequestNodeTolerations setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
