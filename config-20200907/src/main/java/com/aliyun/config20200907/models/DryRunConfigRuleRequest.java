// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DryRunConfigRuleRequest extends TeaModel {
    /**
     * <p>The complete configuration information of the resource.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;ResourceCreationTime&quot;: 1741241360000,
     *   &quot;AccountId&quot;: 123,
     *   &quot;Configuration&quot;: {
     *     &quot;ResourceGroupId&quot;: &quot;&quot;,
     *     &quot;Memory&quot;: 1024,
     *     &quot;InstanceChargeType&quot;: &quot;PrePaid&quot;,
     *     &quot;Cpu&quot;: 1,
     *     &quot;OSName&quot;: &quot;Alibaba Cloud Linux  3.2104 LTS 64 bit&quot;,
     *     &quot;InstanceNetworkType&quot;: &quot;vpc&quot;,
     *     &quot;InnerIpAddress&quot;: {
     *       &quot;IpAddress&quot;: []
     *     },
     *     &quot;ExpiredTime&quot;: &quot;2026-05-06T16:00Z&quot;,
     *     &quot;ImageId&quot;: &quot;aliyun_3_x64_20G_alibase_20250117.vhd&quot;,
     *     &quot;EipAddress&quot;: {
     *       &quot;AllocationId&quot;: &quot;&quot;,
     *       &quot;IpAddress&quot;: &quot;&quot;,
     *       &quot;InternetChargeType&quot;: &quot;&quot;
     *     },
     *     &quot;ImageOptions&quot;: {},
     *     &quot;Status&quot;: &quot;Running&quot;,
     *     &quot;AdditionalInfo&quot;: {},
     *     &quot;HibernationOptions&quot;: {
     *       &quot;Configured&quot;: false
     *     }
     *   },
     *   &quot;ResourceId&quot;: &quot;i-bp1d8kd8ztaynb4c****&quot;,
     *   &quot;ResourceName&quot;: &quot;****&quot;,
     *   &quot;ResourceStatus&quot;: &quot;Running&quot;,
     *   &quot;Region&quot;: &quot;cn-hangzhou&quot;,
     *   &quot;AvailabilityZone&quot;: &quot;cn-hangzhou-h&quot;,
     *   &quot;ResourceType&quot;: &quot;ACS::ECS::Instance&quot;,
     *   &quot;ResourceDeleted&quot;: 1
     * }</p>
     */
    @NameInMap("ConfigurationItem")
    public String configurationItem;

    /**
     * <p>The resource type that is evaluated by the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS::ECS::Instance</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DryRunConfigRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DryRunConfigRuleRequest self = new DryRunConfigRuleRequest();
        return TeaModel.build(map, self);
    }

    public DryRunConfigRuleRequest setConfigurationItem(String configurationItem) {
        this.configurationItem = configurationItem;
        return this;
    }
    public String getConfigurationItem() {
        return this.configurationItem;
    }

    public DryRunConfigRuleRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
