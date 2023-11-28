// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class CreateLogstashRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("networkConfig")
    public CreateLogstashRequestNetworkConfig networkConfig;

    @NameInMap("nodeAmount")
    public Integer nodeAmount;

    @NameInMap("nodeSpec")
    public CreateLogstashRequestNodeSpec nodeSpec;

    @NameInMap("paymentInfo")
    public CreateLogstashRequestPaymentInfo paymentInfo;

    @NameInMap("paymentType")
    public String paymentType;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    @NameInMap("version")
    public String version;

    @NameInMap("clientToken")
    public String clientToken;

    public static CreateLogstashRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLogstashRequest self = new CreateLogstashRequest();
        return TeaModel.build(map, self);
    }

    public CreateLogstashRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLogstashRequest setNetworkConfig(CreateLogstashRequestNetworkConfig networkConfig) {
        this.networkConfig = networkConfig;
        return this;
    }
    public CreateLogstashRequestNetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    public CreateLogstashRequest setNodeAmount(Integer nodeAmount) {
        this.nodeAmount = nodeAmount;
        return this;
    }
    public Integer getNodeAmount() {
        return this.nodeAmount;
    }

    public CreateLogstashRequest setNodeSpec(CreateLogstashRequestNodeSpec nodeSpec) {
        this.nodeSpec = nodeSpec;
        return this;
    }
    public CreateLogstashRequestNodeSpec getNodeSpec() {
        return this.nodeSpec;
    }

    public CreateLogstashRequest setPaymentInfo(CreateLogstashRequestPaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
        return this;
    }
    public CreateLogstashRequestPaymentInfo getPaymentInfo() {
        return this.paymentInfo;
    }

    public CreateLogstashRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateLogstashRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateLogstashRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public CreateLogstashRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public static class CreateLogstashRequestNetworkConfig extends TeaModel {
        @NameInMap("type")
        public String type;

        @NameInMap("vpcId")
        public String vpcId;

        @NameInMap("vsArea")
        public String vsArea;

        @NameInMap("vswitchId")
        public String vswitchId;

        public static CreateLogstashRequestNetworkConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateLogstashRequestNetworkConfig self = new CreateLogstashRequestNetworkConfig();
            return TeaModel.build(map, self);
        }

        public CreateLogstashRequestNetworkConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateLogstashRequestNetworkConfig setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public CreateLogstashRequestNetworkConfig setVsArea(String vsArea) {
            this.vsArea = vsArea;
            return this;
        }
        public String getVsArea() {
            return this.vsArea;
        }

        public CreateLogstashRequestNetworkConfig setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

    }

    public static class CreateLogstashRequestNodeSpec extends TeaModel {
        @NameInMap("disk")
        public Long disk;

        @NameInMap("diskType")
        public String diskType;

        @NameInMap("spec")
        public String spec;

        public static CreateLogstashRequestNodeSpec build(java.util.Map<String, ?> map) throws Exception {
            CreateLogstashRequestNodeSpec self = new CreateLogstashRequestNodeSpec();
            return TeaModel.build(map, self);
        }

        public CreateLogstashRequestNodeSpec setDisk(Long disk) {
            this.disk = disk;
            return this;
        }
        public Long getDisk() {
            return this.disk;
        }

        public CreateLogstashRequestNodeSpec setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public CreateLogstashRequestNodeSpec setSpec(String spec) {
            this.spec = spec;
            return this;
        }
        public String getSpec() {
            return this.spec;
        }

    }

    public static class CreateLogstashRequestPaymentInfo extends TeaModel {
        @NameInMap("autoRenewDuration")
        public Long autoRenewDuration;

        @NameInMap("duration")
        public Long duration;

        @NameInMap("isAutoRenew")
        public Boolean isAutoRenew;

        @NameInMap("pricingCycle")
        public String pricingCycle;

        public static CreateLogstashRequestPaymentInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateLogstashRequestPaymentInfo self = new CreateLogstashRequestPaymentInfo();
            return TeaModel.build(map, self);
        }

        public CreateLogstashRequestPaymentInfo setAutoRenewDuration(Long autoRenewDuration) {
            this.autoRenewDuration = autoRenewDuration;
            return this;
        }
        public Long getAutoRenewDuration() {
            return this.autoRenewDuration;
        }

        public CreateLogstashRequestPaymentInfo setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public CreateLogstashRequestPaymentInfo setIsAutoRenew(Boolean isAutoRenew) {
            this.isAutoRenew = isAutoRenew;
            return this;
        }
        public Boolean getIsAutoRenew() {
            return this.isAutoRenew;
        }

        public CreateLogstashRequestPaymentInfo setPricingCycle(String pricingCycle) {
            this.pricingCycle = pricingCycle;
            return this;
        }
        public String getPricingCycle() {
            return this.pricingCycle;
        }

    }

}
