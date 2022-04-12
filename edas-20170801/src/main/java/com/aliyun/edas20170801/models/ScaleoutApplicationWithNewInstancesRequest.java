// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleoutApplicationWithNewInstancesRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("InstanceChargePeriod")
    public Integer instanceChargePeriod;

    @NameInMap("InstanceChargePeriodUnit")
    public String instanceChargePeriodUnit;

    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    @NameInMap("ScalingNum")
    public Integer scalingNum;

    @NameInMap("ScalingPolicy")
    public String scalingPolicy;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("TemplateInstanceId")
    public String templateInstanceId;

    @NameInMap("TemplateVersion")
    public String templateVersion;

    public static ScaleoutApplicationWithNewInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleoutApplicationWithNewInstancesRequest self = new ScaleoutApplicationWithNewInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ScaleoutApplicationWithNewInstancesRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ScaleoutApplicationWithNewInstancesRequest setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public ScaleoutApplicationWithNewInstancesRequest setAutoRenewPeriod(Integer autoRenewPeriod) {
        this.autoRenewPeriod = autoRenewPeriod;
        return this;
    }
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    public ScaleoutApplicationWithNewInstancesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ScaleoutApplicationWithNewInstancesRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ScaleoutApplicationWithNewInstancesRequest setInstanceChargePeriod(Integer instanceChargePeriod) {
        this.instanceChargePeriod = instanceChargePeriod;
        return this;
    }
    public Integer getInstanceChargePeriod() {
        return this.instanceChargePeriod;
    }

    public ScaleoutApplicationWithNewInstancesRequest setInstanceChargePeriodUnit(String instanceChargePeriodUnit) {
        this.instanceChargePeriodUnit = instanceChargePeriodUnit;
        return this;
    }
    public String getInstanceChargePeriodUnit() {
        return this.instanceChargePeriodUnit;
    }

    public ScaleoutApplicationWithNewInstancesRequest setInstanceChargeType(String instanceChargeType) {
        this.instanceChargeType = instanceChargeType;
        return this;
    }
    public String getInstanceChargeType() {
        return this.instanceChargeType;
    }

    public ScaleoutApplicationWithNewInstancesRequest setScalingNum(Integer scalingNum) {
        this.scalingNum = scalingNum;
        return this;
    }
    public Integer getScalingNum() {
        return this.scalingNum;
    }

    public ScaleoutApplicationWithNewInstancesRequest setScalingPolicy(String scalingPolicy) {
        this.scalingPolicy = scalingPolicy;
        return this;
    }
    public String getScalingPolicy() {
        return this.scalingPolicy;
    }

    public ScaleoutApplicationWithNewInstancesRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ScaleoutApplicationWithNewInstancesRequest setTemplateInstanceId(String templateInstanceId) {
        this.templateInstanceId = templateInstanceId;
        return this;
    }
    public String getTemplateInstanceId() {
        return this.templateInstanceId;
    }

    public ScaleoutApplicationWithNewInstancesRequest setTemplateVersion(String templateVersion) {
        this.templateVersion = templateVersion;
        return this;
    }
    public String getTemplateVersion() {
        return this.templateVersion;
    }

}
