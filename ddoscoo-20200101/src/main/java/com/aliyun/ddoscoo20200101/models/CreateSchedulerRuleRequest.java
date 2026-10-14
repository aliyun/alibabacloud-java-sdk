// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class CreateSchedulerRuleRequest extends TeaModel {
    /**
     * <p>The details of the CDN interaction rule. This parameter is a JSON format character string. The following list describes the structure:</p>
     * <ul>
     * <li><strong>ParamType</strong>: Required. String type. The type of CDN interaction. Valid values: <strong>cdn</strong>, which indicates CDN interaction.</li>
     * <li><strong>ParamData</strong>: Required. Map type. The CDN interaction parameters. The following list describes the structure:<ul>
     * <li><strong>Domain</strong>: Required. String type. The CDN-accelerated domain name.</li>
     * <li><strong>Cname</strong>: Required. String type. The CNAME of the accelerated domain name.</li>
     * <li><strong>AccessQps</strong>: Required. Integer type. The access QPS threshold. If the QPS exceeds this threshold, traffic is switched to Anti-DDoS Pro and Anti-DDoS Premium.</li>
     * <li><strong>UpstreamQps</strong>: Optional. Integer type. The back-to-origin QPS threshold. If the QPS is lower than this threshold, traffic is switched to CDN.</li>
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
     * <p>The ID of the resource group to which the Anti-DDoS Pro or Anti-DDoS Premium instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.</p>
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
     * <li><strong>3</strong>: acceleration for China-to-global traffic</li>
     * <li><strong>5</strong>: CDN interaction</li>
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
     * <p>The details of the general interaction rule. This parameter is a JSON string that consists of the following characters. The following list describes the structure:</p>
     * <ul>
     * <li><strong>Type</strong>: String type. Required. The format of the Resource for Interaction address. Valid values:<ul>
     * <li><strong>A</strong>: IP address</li>
     * <li><strong>CNAME</strong>: domain name</li>
     * </ul>
     * </li>
     * <li><strong>Value</strong>: String type. Required. The address of the Resource for Interaction.</li>
     * <li><strong>Priority</strong>: Integer type. Required. The priority of the rule. Valid values: <strong>0</strong> to <strong>100</strong>. A larger value indicates a higher priority.</li>
     * <li><strong>ValueType</strong>: Integer type. Required. The type of the Resource for Interaction. Valid values:<ul>
     * <li><strong>1</strong>: IP Address of Anti-DDoS Proxy instance </li>
     * <li><strong>2</strong>: (Tiered protection) IP addresses of cloud resources</li>
     * <li><strong>3</strong>: (Sec-acceleration for China-to-global traffic) acceleration line IP address</li>
     * <li><strong>5</strong>: (CDN interaction) acceleration domain name</li>
     * <li><strong>6</strong>: (Cloud service interaction) IP addresses of cloud resources</li>
     * </ul>
     * </li>
     * <li><strong>RegionId</strong>: String type. Optional (required when <strong>ValueType</strong> is <strong>2</strong>). The region ID.</li>
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
