// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The type of the action. Valid values:</p>
     * <ul>
     * <li><strong>10</strong>: modifies the name. If you specify this value, <code>Name</code> is required.</li>
     * <li><strong>11</strong>: modifies the blacklist validity period. If you specify this value, <code>BlackIpListExpireAt</code> is required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>12</strong>: changes the status of the feature of adding back-to-origin CIDR blocks of Anti-DDoS Proxy to the whitelist. If you specify this value, <code>WhitenGfbrNets</code> is required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>13</strong>: changes the status of the ICMP blocking feature. If you specify this value, <code>EnableDropIcmp</code> is required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>20</strong>: adds IP addresses to the blacklist or the whitelist. If you specify this value, you must specify at least one of <code>WhiteIpList</code> and <code>BlackIpList</code>. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>21</strong>: removes IP addresses from the blacklist or the whitelist. If you specify this value, at least one of <code>WhiteIpList</code> and <code>BlackIpList</code> is required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>22</strong>: clears the whitelist. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>23</strong>: clears the blacklist. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>30</strong>: modifies the status and level of intelligent protection. If you specify this value, <code>EnableIntelligence</code> and <code>IntelligenceLevel</code> are required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>31</strong>: modifies the location blacklist settings. If you specify this value, one of <code>RegionBlockCountryList</code> and <code>RegionBlockProvinceList</code> is required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>32</strong>: modifies the settings for source rate limiting. If you specify this value, <code>SourceLimit</code> and <code>SourceBlockList</code> are required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>33</strong>: modifies the settings for reflection attack filtering. If you specify this value, <code>ReflectBlockUdpPortList</code> is required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>40</strong>: creates a port blocking rule. If you specify this value, <code>PortRuleList</code> is required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>41</strong>: modifies the port blocking rule. If you specify this value, <code>PortRuleList</code> is required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>42</strong>: deletes the port blocking rule. If you specify this value, <code>PortRuleList</code> is required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>50</strong>: creates a byte-match filter rule. If you specify this value, <code>FingerPrintRuleList</code> is required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>51</strong>: modifies the byte-match filter rule. If you specify this value, <code>FingerPrintRuleList</code> is required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>52</strong>: deletes the byte-match filter rule. If you specify this value, <code>FingerPrintRuleList</code> is required. Only IP-specific mitigation policies support this value.</li>
     * <li><strong>60</strong>: changes the status of the port-specific mitigation feature. If you specify this value, <code>EnableL4Defense</code> is required. Only port-specific mitigation policies support this value.</li>
     * <li><strong>61</strong>: creates a port-specific mitigation rule. If you specify this value, <code>L4RuleList</code> is required. Only port-specific mitigation policies support this value.</li>
     * <li><strong>62</strong>: modifies the port-specific mitigation rule. If you specify this value, <code>L4RuleList</code> is required. Only port-specific mitigation policies support this value.</li>
     * <li><strong>63</strong>: deletes the port-specific mitigation rule. If you specify this value, <code>L4RuleList</code> is required. Only port-specific mitigation policies support this value.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11</p>
     */
    @NameInMap("ActionType")
    public Integer actionType;

    /**
     * <p>The policy content.</p>
     */
    @NameInMap("Content")
    public String contentShrink;

    /**
     * <p>The ID of the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c52c2fa6-fdac-40c4-8753-be7c********</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The name of the policy.</p>
     * 
     * <strong>example:</strong>
     * <p>demo**</p>
     */
    @NameInMap("Name")
    public String name;

    public static ModifyPolicyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyShrinkRequest self = new ModifyPolicyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyShrinkRequest setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }
    public Integer getActionType() {
        return this.actionType;
    }

    public ModifyPolicyShrinkRequest setContentShrink(String contentShrink) {
        this.contentShrink = contentShrink;
        return this;
    }
    public String getContentShrink() {
        return this.contentShrink;
    }

    public ModifyPolicyShrinkRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyPolicyShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
