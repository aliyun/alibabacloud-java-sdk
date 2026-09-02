// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyPolicyShrinkRequest extends TeaModel {
    /**
     * <p>The action type. Valid values:</p>
     * <ul>
     * <li><strong>10</strong>: Modifies the name (Name is required).</li>
     * <li><strong>11</strong>: Modifies the blacklist timeout period (BlackIpListExpireAt is required). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>12</strong>: Modifies the switch for whitelisting back-to-origin IP addresses of Anti-DDoS Pro and Anti-DDoS Premium (WhitenGfbrNets is required). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>13</strong>: Modifies the switch for ICMP Blocking (EnableDropIcmp is required). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>20</strong>: Adds blacklist and whitelist entries (WhiteIpList and BlackIpList are optional). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>21</strong>: Deletes blacklist and whitelist entries (WhiteIpList and BlackIpList are optional). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>22</strong>: Clears the whitelist. Only IP-specific mitigation policies are supported.</li>
     * <li><strong>23</strong>: Clears the blacklist. Only IP-specific mitigation policies are supported.</li>
     * <li><strong>30</strong>: Modifies the AI-based intelligent protection switch and level (EnableIntelligence and IntelligenceLevel are required). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>31</strong>: Modifies the Location Blacklist configuration (RegionBlockCountryList and RegionBlockProvinceList are optional). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>32</strong>: Modifies the Source Rate Limiting configuration (SourceLimit and SourceBlockList are required). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>33</strong>: Modifies the Reflection Attack Filtering (ReflectBlockUdpPortList is required). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>40</strong>: Creates a Port Blocking rule (PortRuleList is required). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>41</strong>: Modifies a Port Blocking rule (PortRuleList is required). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>42</strong>: Deletes a Port Blocking rule (PortRuleList is required). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>50</strong>: Creates a Byte-Match Filter rule (FingerPrintRuleList is required). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>51</strong>: Modifies a Byte-Match Filter rule (FingerPrintRuleList is required). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>52</strong>: Deletes a Byte-Match Filter rule (FingerPrintRuleList is required). Only IP-specific mitigation policies are supported.</li>
     * <li><strong>60</strong>: Modifies the port-specific mitigation switch (EnableL4Defense is required). Only port-specific mitigation policies are supported.</li>
     * <li><strong>61</strong>: Creates a port-specific mitigation rule (L4RuleList is required). Only port-specific mitigation policies are supported.</li>
     * <li><strong>62</strong>: Modifies a port-specific mitigation rule (L4RuleList is required). Only port-specific mitigation policies are supported.</li>
     * <li><strong>63</strong>: Deletes a port-specific mitigation rule (L4RuleList is required). Only port-specific mitigation policies are supported.</li>
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
     * <p>The port-specific mitigation policy version. Valid values:</p>
     * <ul>
     * <li><strong>Empty</strong>: Modifies the default surf DPI engine policy.</li>
     * <li><strong>2</strong>: Modifies the new stream DPI engine policy.<blockquote>
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
