// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ScaleoutApplicationWithNewInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the application that you want to scale out. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](https://help.aliyun.com/document_detail/149390.html).</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether to enable auto-renewal. This parameter takes effect only when the InstanceChargeType parameter is set to PrePaid. Valid values:</p>
     * <br>
     * <p>*   true: enables auto-renewal.</p>
     * <p>*   false: does not enable auto-renewal. This is the default value.</p>
     */
    @NameInMap("AutoRenew")
    public Boolean autoRenew;

    /**
     * <p>The auto-renewal period. Valid values:</p>
     * <br>
     * <p>*   If the InstanceChargePeriodUnit parameter is set to Week, the valid values of the AutoRenewPeriod parameter are 1, 2, and 3.</p>
     * <p>*   If the InstanceChargePeriodUnit parameter is set to Month, the valid values of the AutoRenewPeriod parameter are 1, 2, 3, 6, 12, 24, 36, 48, and 60.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("AutoRenewPeriod")
    public Integer autoRenewPeriod;

    /**
     * <p>The ID of the cluster to which you want to add ECS instances. If the application and application instance group for the scale-out are specified, this parameter is ignored.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The ID of the instance group that you want to scale out. You can call the ListDeployGroup operation to query the group ID. For more information, see [ListDeployGroup](https://help.aliyun.com/document_detail/62077.html).</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The duration of the subscription. The unit of the subscription duration is specified by the InstanceChargePeriodUnit parameter. This parameter takes effect only when the InstanceChargeType parameter is set to PrePaid.</p>
     * <br>
     * <p>*   If the InstanceChargePeriodUnit parameter is set to Week, the valid values of the InstanceChargePeriod parameter are 1, 2, 3, and 4.</p>
     * <p>*   If the InstanceChargePeriodUnit parameter is set to Month, the valid values of the InstanceChargePeriod parameter are 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.</p>
     */
    @NameInMap("InstanceChargePeriod")
    public Integer instanceChargePeriod;

    /**
     * <p>The unit of the subscription period. Valid values:</p>
     * <br>
     * <p>*   Week: billed on a weekly basis.</p>
     * <p>*   Month: billed on a monthly basis. This is the default value.</p>
     */
    @NameInMap("InstanceChargePeriodUnit")
    public String instanceChargePeriodUnit;

    /**
     * <p>The billing method of the instance. Valid values:</p>
     * <br>
     * <p>*   PrePaid: subscription.</p>
     * <p>*   PostPaid: pay-as-you-go. This is the default value.</p>
     */
    @NameInMap("InstanceChargeType")
    public String instanceChargeType;

    /**
     * <p>The number of instances to be added for the scale-out.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ScalingNum")
    public Integer scalingNum;

    /**
     * <p>The instance reclaim mode of the scaling group. Valid values:</p>
     * <br>
     * <p>*   recycle: economical mode</p>
     * <p>*   release: release mode</p>
     * <br>
     * <p>For more information about how to remove instances from a specified scaling group, see [RemoveInstances](https://help.aliyun.com/document_detail/25955.html).</p>
     */
    @NameInMap("ScalingPolicy")
    public String scalingPolicy;

    /**
     * <p>The ID of the ECS instance launch template. You can call the DescribeLaunchTemplates operation to query the launch template ID. For more information, see [DescribeLaunchTemplates](https://help.aliyun.com/document_detail/73759.html).</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The ID of the existing ECS instance used for the scale-out. If this parameter is specified, the specifications and configurations of the specified ECS instance are used as a template to purchase new instances.</p>
     */
    @NameInMap("TemplateInstanceId")
    public String templateInstanceId;

    /**
     * <p>The version of the ECS instance launch template. You can call the DescribeLaunchTemplateVersions operation to query the launch template version. For more information, see [DescribeLaunchTemplateVersions](https://help.aliyun.com/document_detail/73761.html).</p>
     * <br>
     * <p>> If you set this parameter to `-1`, the default launch template version is used.</p>
     */
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
