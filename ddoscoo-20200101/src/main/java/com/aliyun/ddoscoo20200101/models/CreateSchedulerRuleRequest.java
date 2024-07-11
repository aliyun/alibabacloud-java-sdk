// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateSchedulerRuleRequest extends TeaModel {
    /**
     * <p>The details of the CDN interaction rule. This parameter is a JSON string. The following list describes the fields in the value of the parameter:</p>
     * <ul>
     * <li><p><strong>ParamType</strong>: the type of the scheduling rule. This field is required and must be of the string type. Set the value to <strong>cdn</strong>. This indicates that you want to modify a CDN interaction rule.</p>
     * </li>
     * <li><p><strong>ParamData</strong>: the values of parameters that you want to modify for the CDN interaction rule. This field is required and must be of the map type. ParamData contains the following parameters:</p>
     * <ul>
     * <li><strong>Domain</strong>: the accelerated domain in CDN. This parameter is required and must be of the string type.</li>
     * <li><strong>Cname</strong>: the CNAME that is assigned to the accelerated domain. This parameter is required and must be of the string type.</li>
     * <li><strong>AccessQps</strong>: the queries per second (QPS) threshold that is used to switch service traffic to Anti-DDoS Pro or Anti-DDoS Premium. This parameter is required and must be of the integer type.</li>
     * <li><strong>UpstreamQps</strong>: the QPS threshold that is used to switch service traffic to CDN. This parameter is optional and must be of the integer type.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ParamType&quot;:&quot;cdn&quot;,&quot;ParamData&quot;:{&quot;Domain&quot;:&quot;example.aliyundoc.com&quot;,&quot;Cname&quot;:&quot;demo.aliyundoc.com&quot;,&quot;AccessQps&quot;:100,&quot;UpstreamQps&quot;:100}}</p>
     */
    @NameInMap("Param")
    public String param;

    /**
     * <p>The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The name of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testrule</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The type of the rule. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: tiered protection</li>
     * <li><strong>3</strong>: network acceleration</li>
     * <li><strong>5</strong>: Alibaba Cloud CDN (CDN) interaction</li>
     * <li><strong>6</strong>: cloud service interaction</li>
     * <li><strong>8</strong>: secure acceleration</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("RuleType")
    public Integer ruleType;

    /**
     * <p>The details of the scheduling rule. This parameter is a JSON string. The following list describes the fields in the value of the parameter:</p>
     * <ul>
     * <li><p><strong>Type</strong>: the address type of the interaction resource that you want to use in the scheduling rule. This field is required and must be of the string type. Valid values:</p>
     * <ul>
     * <li><strong>A</strong>: IP address</li>
     * <li><strong>CNAME</strong>: domain name</li>
     * </ul>
     * </li>
     * <li><p><strong>Value</strong>: the address of the interaction resource that you want to use in the scheduling rule. This field is required and must be of the string type.</p>
     * </li>
     * <li><p><strong>Priority</strong>: the priority of the scheduling rule. This field is required and must be of the integer type. Valid values: <strong>0</strong> to <strong>100</strong>. A larger value indicates a higher priority.</p>
     * </li>
     * <li><p><strong>ValueType</strong>: the type of the interaction resource that you want to use in the scheduling rule. This field is required and must be of the integer type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: the IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance</li>
     * <li><strong>2</strong>: the IP address of the interaction resource in the tiered protection scenario</li>
     * <li><strong>3</strong>: the IP address that is used to accelerate access in the network acceleration scenario</li>
     * <li><strong>5</strong>: the domain name that is configured in Alibaba Cloud CDN (CDN) in the CDN interaction scenario</li>
     * <li><strong>6</strong> the IP address of the interaction resource in the cloud service interaction scenario</li>
     * </ul>
     * </li>
     * <li><p><strong>RegionId</strong>: the region where the interaction resource is deployed. This parameter must be specified when <strong>ValueType</strong> is set to <strong>2</strong>. The value must be of the string type.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;Type&quot;:&quot;A&quot;, &quot;Value&quot;:&quot;1.1.XX.XX&quot;, &quot;Priority&quot;:80,&quot;ValueType&quot;:2, &quot;RegionId&quot;:&quot;cn-hangzhou&quot; },{&quot;Type&quot;:&quot;A&quot;, &quot;Value&quot;:&quot;203.199.XX.XX&quot;, &quot;Priority&quot;:80,&quot;ValueType&quot;:1}]</p>
     */
    @NameInMap("Rules")
    public String rules;

    public static CreateSchedulerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSchedulerRuleRequest self = new CreateSchedulerRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateSchedulerRuleRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public CreateSchedulerRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSchedulerRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public CreateSchedulerRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public CreateSchedulerRuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
