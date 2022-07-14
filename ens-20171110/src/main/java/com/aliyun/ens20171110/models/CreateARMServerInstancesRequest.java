// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateARMServerInstancesRequest extends TeaModel {
    // 数量，最大支持10
    @NameInMap("Amount")
    public Integer amount;

    // 是否自动续费，默认为false。
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    // ENS节点ID。
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    @NameInMap("Frequency")
    public Integer frequency;

    // 镜像ID。
    @NameInMap("ImageId")
    public String imageId;

    // AIC容器实例规格。
    @NameInMap("InstanceType")
    public String instanceType;

    // keypair名称
    @NameInMap("KeyPairName")
    public String keyPairName;

    // 付费类型。PrePaid（目前只支持此种）：包年包月
    @NameInMap("PayType")
    public String payType;

    // 购买周期。
    @NameInMap("Period")
    public Integer period;

    // Month（默认）：按月计费的价格单位。
    @NameInMap("PeriodUnit")
    public String periodUnit;

    // 分辨率。目前取值
    // 1920*1080
    // 1280*720
    // 1080*1920
    // 720*1280
    @NameInMap("Resolution")
    public String resolution;

    // 服务器规格。
    @NameInMap("ServerType")
    public String serverType;

    public static CreateARMServerInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateARMServerInstancesRequest self = new CreateARMServerInstancesRequest();
        return TeaModel.build(map, self);
    }

    public CreateARMServerInstancesRequest setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public CreateARMServerInstancesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public CreateARMServerInstancesRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateARMServerInstancesRequest setFrequency(Integer frequency) {
        this.frequency = frequency;
        return this;
    }
    public Integer getFrequency() {
        return this.frequency;
    }

    public CreateARMServerInstancesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateARMServerInstancesRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateARMServerInstancesRequest setKeyPairName(String keyPairName) {
        this.keyPairName = keyPairName;
        return this;
    }
    public String getKeyPairName() {
        return this.keyPairName;
    }

    public CreateARMServerInstancesRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateARMServerInstancesRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public CreateARMServerInstancesRequest setPeriodUnit(String periodUnit) {
        this.periodUnit = periodUnit;
        return this;
    }
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    public CreateARMServerInstancesRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

    public CreateARMServerInstancesRequest setServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }
    public String getServerType() {
        return this.serverType;
    }

}
