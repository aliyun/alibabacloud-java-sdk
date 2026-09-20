// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The action type. Valid values:</p>
     * <ul>
     * <li><strong>10</strong>: modifies the name (Name is required).</li>
     * <li><strong>11</strong>: modifies the blacklist timeout period (BlackIpListExpireAt is required). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>12</strong>: modifies the switch for whitelisting back-to-origin IP addresses of Anti-DDoS Pro and Anti-DDoS Premium (WhitenGfbrNets is required). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>13</strong>: modifies the switch for ICMP Blocking (EnableDropIcmp is required). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>20</strong>: adds entries to blacklists and whitelists (WhiteIpList and BlackIpList are optional). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>21</strong>: deletes entries from blacklists and whitelists (WhiteIpList and BlackIpList are optional). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>22</strong>: clears the whitelist. Only IP-specific mitigation policy is supported.</li>
     * <li><strong>23</strong>: clears the blacklist. Only IP-specific mitigation policy is supported.</li>
     * <li><strong>30</strong>: modifies the AI-based intelligent protection switch and level (EnableIntelligence and IntelligenceLevel are required). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>31</strong>: modifies the Location Blacklist configuration (RegionBlockCountryList and RegionBlockProvinceList are optional). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>32</strong>: modifies the source rate limiting configuration (SourceLimit and SourceBlockList are required). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>33</strong>: modifies the reflection attack port filtering (ReflectBlockUdpPortList is required). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>40</strong>: creates a port blocking rule (PortRuleList is required). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>41</strong>: modifies a port blocking rule (PortRuleList is required). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>42</strong>: deletes a port blocking rule (PortRuleList is required). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>50</strong>: creates a byte-match filter rule (FingerPrintRuleList is required). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>51</strong>: modifies a byte-match filter rule (FingerPrintRuleList is required). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>52</strong>: deletes a byte-match filter rule (FingerPrintRuleList is required). Only IP-specific mitigation policy is supported.</li>
     * <li><strong>60</strong>: modifies the port-specific mitigation switch (EnableL4Defense is required). Only port-specific mitigation policy is supported.</li>
     * <li><strong>61</strong>: creates a port-specific mitigation rule (L4RuleList is required). Only port-specific mitigation policy is supported.</li>
     * <li><strong>62</strong>: modifies a port-specific mitigation rule (L4RuleList is required). Only port-specific mitigation policy is supported.</li>
     * <li><strong>63</strong>: deletes a port-specific mitigation rule (L4RuleList is required). Only port-specific mitigation policy is supported.</li>
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
     * <p>The policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c52c2fa6-fdac-40c4-8753-be7c********</p>
     */
    @NameInMap("Id")
    public String id;

    /**
     * <p>The policy name.</p>
     * 
     * <strong>example:</strong>
     * <p>demo**</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The version of the port-specific mitigation policy. Valid values:</p>
     * <ul>
     * <li><strong>Not specified</strong>: Modifies the default surf mitigation engine policy.</li>
     * <li><strong>2</strong>: Modifies the new stream mitigation engine policy.<blockquote>
     * <p>Only port-specific mitigation policies are supported.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PortVersion")
    public String portVersion;

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

    public ModifyPolicyShrinkRequest setPortVersion(String portVersion) {
        this.portVersion = portVersion;
        return this;
    }
    public String getPortVersion() {
        return this.portVersion;
    }

}
