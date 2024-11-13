// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyPolicyRequest extends TeaModel {
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
    public ModifyPolicyRequestContent content;

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

    public static ModifyPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyRequest self = new ModifyPolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyRequest setActionType(Integer actionType) {
        this.actionType = actionType;
        return this;
    }
    public Integer getActionType() {
        return this.actionType;
    }

    public ModifyPolicyRequest setContent(ModifyPolicyRequestContent content) {
        this.content = content;
        return this;
    }
    public ModifyPolicyRequestContent getContent() {
        return this.content;
    }

    public ModifyPolicyRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyPolicyRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class ModifyPolicyRequestContentFingerPrintRuleList extends TeaModel {
        /**
         * <p>The end of the destination port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("DstPortEnd")
        public Integer dstPortEnd;

        /**
         * <p>The start of the destination port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DstPortStart")
        public Integer dstPortStart;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>5fbe941f-a0cf-4a49-9c7c-8fac********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The action triggered if the rule is matched. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: allows the traffic that matches the conditions in the byte-match filter rule.</li>
         * <li><strong>drop</strong>: discards the traffic that matches the conditions in the byte-match filter rule.</li>
         * <li><strong>ip_rate</strong>: limits rates on the source IP address whose traffic matches the conditions in the byte-match filter rule. The rate limit is specified by <strong>RateValue</strong>.</li>
         * <li><strong>session_rate</strong>: limits the number of sessions from the source IP address whose traffic matches the conditions in the byte-match filter rule. The rate limit is specified by <strong>RateValue</strong>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drop</p>
         */
        @NameInMap("MatchAction")
        public String matchAction;

        /**
         * <p>The maximum packet length. Valid values: <strong>1</strong> to <strong>1500</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("MaxPktLen")
        public Integer maxPktLen;

        /**
         * <p>The minimum packet length. Valid values: <strong>1</strong> to <strong>1500</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinPktLen")
        public Integer minPktLen;

        /**
         * <p>The offset. Valid values: <strong>0</strong> to <strong>1500</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <p>The payload. The value is a hexadecimal string.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("PayloadBytes")
        public String payloadBytes;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong></li>
         * <li><strong>udp</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>udp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The rate limit. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
         * <blockquote>
         * <p> This parameter is required when <strong>MatchAction</strong> is set to <strong>ip_rate</strong> or <strong>session_rate</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RateValue")
        public Integer rateValue;

        /**
         * <p>The sequence number that indicates the order for the rule to take effect. The value is an integer.</p>
         * <blockquote>
         * <p> A smaller number indicates a higher priority.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeqNo")
        public Integer seqNo;

        /**
         * <p>The end of the source port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("SrcPortEnd")
        public Integer srcPortEnd;

        /**
         * <p>The start of the source port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SrcPortStart")
        public Integer srcPortStart;

        public static ModifyPolicyRequestContentFingerPrintRuleList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyRequestContentFingerPrintRuleList self = new ModifyPolicyRequestContentFingerPrintRuleList();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setDstPortEnd(Integer dstPortEnd) {
            this.dstPortEnd = dstPortEnd;
            return this;
        }
        public Integer getDstPortEnd() {
            return this.dstPortEnd;
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setDstPortStart(Integer dstPortStart) {
            this.dstPortStart = dstPortStart;
            return this;
        }
        public Integer getDstPortStart() {
            return this.dstPortStart;
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setMatchAction(String matchAction) {
            this.matchAction = matchAction;
            return this;
        }
        public String getMatchAction() {
            return this.matchAction;
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setMaxPktLen(Integer maxPktLen) {
            this.maxPktLen = maxPktLen;
            return this;
        }
        public Integer getMaxPktLen() {
            return this.maxPktLen;
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setMinPktLen(Integer minPktLen) {
            this.minPktLen = minPktLen;
            return this;
        }
        public Integer getMinPktLen() {
            return this.minPktLen;
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setPayloadBytes(String payloadBytes) {
            this.payloadBytes = payloadBytes;
            return this;
        }
        public String getPayloadBytes() {
            return this.payloadBytes;
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setRateValue(Integer rateValue) {
            this.rateValue = rateValue;
            return this;
        }
        public Integer getRateValue() {
            return this.rateValue;
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setSeqNo(Integer seqNo) {
            this.seqNo = seqNo;
            return this;
        }
        public Integer getSeqNo() {
            return this.seqNo;
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setSrcPortEnd(Integer srcPortEnd) {
            this.srcPortEnd = srcPortEnd;
            return this;
        }
        public Integer getSrcPortEnd() {
            return this.srcPortEnd;
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setSrcPortStart(Integer srcPortStart) {
            this.srcPortStart = srcPortStart;
            return this;
        }
        public Integer getSrcPortStart() {
            return this.srcPortStart;
        }

    }

    public static class ModifyPolicyRequestContentL4RuleListConditionList extends TeaModel {
        /**
         * <p>The term that is used for matching.</p>
         * <blockquote>
         * <p> If Method is set to <strong>char</strong>, the value of this parameter must be ASCII strings. If Method is set to <strong>hex</strong>, the value of this parameter must be hexadecimal strings. Maximum length: 2,048.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("Arg")
        public String arg;

        /**
         * <p>The number of bytes from the start position for matching. Valid values: <strong>1</strong> to <strong>2048</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("Depth")
        public Integer depth;

        /**
         * <p>The start position for matching. Valid values: <strong>0</strong> to <strong>2047</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Position")
        public Integer position;

        public static ModifyPolicyRequestContentL4RuleListConditionList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyRequestContentL4RuleListConditionList self = new ModifyPolicyRequestContentL4RuleListConditionList();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyRequestContentL4RuleListConditionList setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public ModifyPolicyRequestContentL4RuleListConditionList setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public ModifyPolicyRequestContentL4RuleListConditionList setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

    }

    public static class ModifyPolicyRequestContentL4RuleList extends TeaModel {
        /**
         * <p>The action that is specified in the rule. Valid value:</p>
         * <ul>
         * <li><strong>2</strong>: The traffic is discarded.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The match conditions.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ConditionList")
        public java.util.List<ModifyPolicyRequestContentL4RuleListConditionList> conditionList;

        /**
         * <p>The minimum number of bytes in a session to trigger matching. Valid values: <strong>0</strong> to <strong>2048</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Limited")
        public Integer limited;

        /**
         * <p>The condition based on which an action is performed. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: If the rule is matched, the action specified in the rule is performed.</li>
         * <li><strong>1</strong>: If the rule is not matched, the action specified in the rule is performed.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Match")
        public String match;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li><strong>char</strong>: string match.</li>
         * <li><strong>hex</strong>: hexadecimal string match.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>char</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The name of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The priority of the rule. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * <blockquote>
         * <p> A smaller value indicates a higher priority.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static ModifyPolicyRequestContentL4RuleList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyRequestContentL4RuleList self = new ModifyPolicyRequestContentL4RuleList();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyRequestContentL4RuleList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ModifyPolicyRequestContentL4RuleList setConditionList(java.util.List<ModifyPolicyRequestContentL4RuleListConditionList> conditionList) {
            this.conditionList = conditionList;
            return this;
        }
        public java.util.List<ModifyPolicyRequestContentL4RuleListConditionList> getConditionList() {
            return this.conditionList;
        }

        public ModifyPolicyRequestContentL4RuleList setLimited(Integer limited) {
            this.limited = limited;
            return this;
        }
        public Integer getLimited() {
            return this.limited;
        }

        public ModifyPolicyRequestContentL4RuleList setMatch(String match) {
            this.match = match;
            return this;
        }
        public String getMatch() {
            return this.match;
        }

        public ModifyPolicyRequestContentL4RuleList setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ModifyPolicyRequestContentL4RuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyPolicyRequestContentL4RuleList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class ModifyPolicyRequestContentPortRuleList extends TeaModel {
        /**
         * <p>The end of the destination port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("DstPortEnd")
        public Integer dstPortEnd;

        /**
         * <p>The start of the destination port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DstPortStart")
        public Integer dstPortStart;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>c52c2fa6-fdac-40c4-8753-be7c*********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The action triggered if the rule is matched. Valid values:</p>
         * <ul>
         * <li><strong>drop</strong>: The traffic is discarded.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drop</p>
         */
        @NameInMap("MatchAction")
        public String matchAction;

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong></li>
         * <li><strong>udp</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The sequence number that indicates the order for the rule to take effect. The value is an integer.</p>
         * <blockquote>
         * <p> A smaller number indicates a higher priority.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeqNo")
        public Integer seqNo;

        /**
         * <p>The end of the source port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("SrcPortEnd")
        public Integer srcPortEnd;

        /**
         * <p>The start of the source port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SrcPortStart")
        public Integer srcPortStart;

        public static ModifyPolicyRequestContentPortRuleList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyRequestContentPortRuleList self = new ModifyPolicyRequestContentPortRuleList();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyRequestContentPortRuleList setDstPortEnd(Integer dstPortEnd) {
            this.dstPortEnd = dstPortEnd;
            return this;
        }
        public Integer getDstPortEnd() {
            return this.dstPortEnd;
        }

        public ModifyPolicyRequestContentPortRuleList setDstPortStart(Integer dstPortStart) {
            this.dstPortStart = dstPortStart;
            return this;
        }
        public Integer getDstPortStart() {
            return this.dstPortStart;
        }

        public ModifyPolicyRequestContentPortRuleList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyPolicyRequestContentPortRuleList setMatchAction(String matchAction) {
            this.matchAction = matchAction;
            return this;
        }
        public String getMatchAction() {
            return this.matchAction;
        }

        public ModifyPolicyRequestContentPortRuleList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ModifyPolicyRequestContentPortRuleList setSeqNo(Integer seqNo) {
            this.seqNo = seqNo;
            return this;
        }
        public Integer getSeqNo() {
            return this.seqNo;
        }

        public ModifyPolicyRequestContentPortRuleList setSrcPortEnd(Integer srcPortEnd) {
            this.srcPortEnd = srcPortEnd;
            return this;
        }
        public Integer getSrcPortEnd() {
            return this.srcPortEnd;
        }

        public ModifyPolicyRequestContentPortRuleList setSrcPortStart(Integer srcPortStart) {
            this.srcPortStart = srcPortStart;
            return this;
        }
        public Integer getSrcPortStart() {
            return this.srcPortStart;
        }

    }

    public static class ModifyPolicyRequestContentSourceBlockList extends TeaModel {
        /**
         * <p>The validity period of the blacklist to which the source IP address is added. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("BlockExpireSeconds")
        public Integer blockExpireSeconds;

        /**
         * <p>The statistical period during which the system collects data on source IP addresses to determine whether to add the source IP addresses to the blacklist. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("EverySeconds")
        public Integer everySeconds;

        /**
         * <p>The number of times that the source IP address exceeds a limit in a statistical period.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ExceedLimitTimes")
        public Integer exceedLimitTimes;

        /**
         * <p>The type of the source rate limit. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: the pps limit on source IP addresses.</li>
         * <li><strong>4</strong>: the bandwidth limit on source IP addresses.</li>
         * <li><strong>5</strong>: the pps limit on source SYN packets.</li>
         * <li><strong>6</strong>: the bandwidth limit on source SYN packets.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static ModifyPolicyRequestContentSourceBlockList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyRequestContentSourceBlockList self = new ModifyPolicyRequestContentSourceBlockList();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyRequestContentSourceBlockList setBlockExpireSeconds(Integer blockExpireSeconds) {
            this.blockExpireSeconds = blockExpireSeconds;
            return this;
        }
        public Integer getBlockExpireSeconds() {
            return this.blockExpireSeconds;
        }

        public ModifyPolicyRequestContentSourceBlockList setEverySeconds(Integer everySeconds) {
            this.everySeconds = everySeconds;
            return this;
        }
        public Integer getEverySeconds() {
            return this.everySeconds;
        }

        public ModifyPolicyRequestContentSourceBlockList setExceedLimitTimes(Integer exceedLimitTimes) {
            this.exceedLimitTimes = exceedLimitTimes;
            return this;
        }
        public Integer getExceedLimitTimes() {
            return this.exceedLimitTimes;
        }

        public ModifyPolicyRequestContentSourceBlockList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class ModifyPolicyRequestContentSourceLimit extends TeaModel {
        /**
         * <p>The bandwidth limit on source IP addresses. Unit: bytes per second.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Bps")
        public Integer bps;

        /**
         * <p>The packets per second (pps) limit on source IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        /**
         * <p>The bandwidth limit on source SYN packets. Unit: bytes per second.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("SynBps")
        public Integer synBps;

        /**
         * <p>The pps limit on source SYN packets.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("SynPps")
        public Integer synPps;

        public static ModifyPolicyRequestContentSourceLimit build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyRequestContentSourceLimit self = new ModifyPolicyRequestContentSourceLimit();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyRequestContentSourceLimit setBps(Integer bps) {
            this.bps = bps;
            return this;
        }
        public Integer getBps() {
            return this.bps;
        }

        public ModifyPolicyRequestContentSourceLimit setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public ModifyPolicyRequestContentSourceLimit setSynBps(Integer synBps) {
            this.synBps = synBps;
            return this;
        }
        public Integer getSynBps() {
            return this.synBps;
        }

        public ModifyPolicyRequestContentSourceLimit setSynPps(Integer synPps) {
            this.synPps = synPps;
            return this;
        }
        public Integer getSynPps() {
            return this.synPps;
        }

    }

    public static class ModifyPolicyRequestContent extends TeaModel {
        /**
         * <p>The IP addresses in the blacklist.</p>
         */
        @NameInMap("BlackIpList")
        public java.util.List<String> blackIpList;

        /**
         * <p>The validity period of the IP address blacklist. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1716878000</p>
         */
        @NameInMap("BlackIpListExpireAt")
        public Long blackIpListExpireAt;

        /**
         * <p>Specifies whether to enable ICMP blocking.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableDropIcmp")
        public Boolean enableDropIcmp;

        /**
         * <p>Specifies whether to enable intelligent protection.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIntelligence")
        public Boolean enableIntelligence;

        /**
         * <p>Specifies whether to enable port-specific mitigation.</p>
         */
        @NameInMap("EnableL4Defense")
        public Boolean enableL4Defense;

        /**
         * <p>The byte-match filter rules.</p>
         */
        @NameInMap("FingerPrintRuleList")
        public java.util.List<ModifyPolicyRequestContentFingerPrintRuleList> fingerPrintRuleList;

        /**
         * <p>The level of intelligent protection. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: normal.</li>
         * <li><strong>hard</strong>: strict.</li>
         * <li><strong>weak</strong>: loose.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("IntelligenceLevel")
        public String intelligenceLevel;

        /**
         * <p>The port-specific mitigation rules.</p>
         */
        @NameInMap("L4RuleList")
        public java.util.List<ModifyPolicyRequestContentL4RuleList> l4RuleList;

        /**
         * <p>The port blocking rules.</p>
         */
        @NameInMap("PortRuleList")
        public java.util.List<ModifyPolicyRequestContentPortRuleList> portRuleList;

        /**
         * <p>The ports whose traffic is filtered out by the filtering policies for UDP reflection attacks.</p>
         */
        @NameInMap("ReflectBlockUdpPortList")
        public java.util.List<Integer> reflectBlockUdpPortList;

        /**
         * <p>The countries in the location blacklist.</p>
         */
        @NameInMap("RegionBlockCountryList")
        public java.util.List<Integer> regionBlockCountryList;

        /**
         * <p>The provinces in the location blacklist.</p>
         */
        @NameInMap("RegionBlockProvinceList")
        public java.util.List<Integer> regionBlockProvinceList;

        /**
         * <p>The source IP addresses that are added to the blacklist.</p>
         */
        @NameInMap("SourceBlockList")
        public java.util.List<ModifyPolicyRequestContentSourceBlockList> sourceBlockList;

        /**
         * <p>The settings for source rate limiting.</p>
         */
        @NameInMap("SourceLimit")
        public ModifyPolicyRequestContentSourceLimit sourceLimit;

        /**
         * <p>The IP addresses in the whitelist.</p>
         */
        @NameInMap("WhiteIpList")
        public java.util.List<String> whiteIpList;

        /**
         * <p>Specifies whether to add back-to-origin CIDR blocks of Anti-DDoS Proxy to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WhitenGfbrNets")
        public Boolean whitenGfbrNets;

        public static ModifyPolicyRequestContent build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyRequestContent self = new ModifyPolicyRequestContent();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyRequestContent setBlackIpList(java.util.List<String> blackIpList) {
            this.blackIpList = blackIpList;
            return this;
        }
        public java.util.List<String> getBlackIpList() {
            return this.blackIpList;
        }

        public ModifyPolicyRequestContent setBlackIpListExpireAt(Long blackIpListExpireAt) {
            this.blackIpListExpireAt = blackIpListExpireAt;
            return this;
        }
        public Long getBlackIpListExpireAt() {
            return this.blackIpListExpireAt;
        }

        public ModifyPolicyRequestContent setEnableDropIcmp(Boolean enableDropIcmp) {
            this.enableDropIcmp = enableDropIcmp;
            return this;
        }
        public Boolean getEnableDropIcmp() {
            return this.enableDropIcmp;
        }

        public ModifyPolicyRequestContent setEnableIntelligence(Boolean enableIntelligence) {
            this.enableIntelligence = enableIntelligence;
            return this;
        }
        public Boolean getEnableIntelligence() {
            return this.enableIntelligence;
        }

        public ModifyPolicyRequestContent setEnableL4Defense(Boolean enableL4Defense) {
            this.enableL4Defense = enableL4Defense;
            return this;
        }
        public Boolean getEnableL4Defense() {
            return this.enableL4Defense;
        }

        public ModifyPolicyRequestContent setFingerPrintRuleList(java.util.List<ModifyPolicyRequestContentFingerPrintRuleList> fingerPrintRuleList) {
            this.fingerPrintRuleList = fingerPrintRuleList;
            return this;
        }
        public java.util.List<ModifyPolicyRequestContentFingerPrintRuleList> getFingerPrintRuleList() {
            return this.fingerPrintRuleList;
        }

        public ModifyPolicyRequestContent setIntelligenceLevel(String intelligenceLevel) {
            this.intelligenceLevel = intelligenceLevel;
            return this;
        }
        public String getIntelligenceLevel() {
            return this.intelligenceLevel;
        }

        public ModifyPolicyRequestContent setL4RuleList(java.util.List<ModifyPolicyRequestContentL4RuleList> l4RuleList) {
            this.l4RuleList = l4RuleList;
            return this;
        }
        public java.util.List<ModifyPolicyRequestContentL4RuleList> getL4RuleList() {
            return this.l4RuleList;
        }

        public ModifyPolicyRequestContent setPortRuleList(java.util.List<ModifyPolicyRequestContentPortRuleList> portRuleList) {
            this.portRuleList = portRuleList;
            return this;
        }
        public java.util.List<ModifyPolicyRequestContentPortRuleList> getPortRuleList() {
            return this.portRuleList;
        }

        public ModifyPolicyRequestContent setReflectBlockUdpPortList(java.util.List<Integer> reflectBlockUdpPortList) {
            this.reflectBlockUdpPortList = reflectBlockUdpPortList;
            return this;
        }
        public java.util.List<Integer> getReflectBlockUdpPortList() {
            return this.reflectBlockUdpPortList;
        }

        public ModifyPolicyRequestContent setRegionBlockCountryList(java.util.List<Integer> regionBlockCountryList) {
            this.regionBlockCountryList = regionBlockCountryList;
            return this;
        }
        public java.util.List<Integer> getRegionBlockCountryList() {
            return this.regionBlockCountryList;
        }

        public ModifyPolicyRequestContent setRegionBlockProvinceList(java.util.List<Integer> regionBlockProvinceList) {
            this.regionBlockProvinceList = regionBlockProvinceList;
            return this;
        }
        public java.util.List<Integer> getRegionBlockProvinceList() {
            return this.regionBlockProvinceList;
        }

        public ModifyPolicyRequestContent setSourceBlockList(java.util.List<ModifyPolicyRequestContentSourceBlockList> sourceBlockList) {
            this.sourceBlockList = sourceBlockList;
            return this;
        }
        public java.util.List<ModifyPolicyRequestContentSourceBlockList> getSourceBlockList() {
            return this.sourceBlockList;
        }

        public ModifyPolicyRequestContent setSourceLimit(ModifyPolicyRequestContentSourceLimit sourceLimit) {
            this.sourceLimit = sourceLimit;
            return this;
        }
        public ModifyPolicyRequestContentSourceLimit getSourceLimit() {
            return this.sourceLimit;
        }

        public ModifyPolicyRequestContent setWhiteIpList(java.util.List<String> whiteIpList) {
            this.whiteIpList = whiteIpList;
            return this;
        }
        public java.util.List<String> getWhiteIpList() {
            return this.whiteIpList;
        }

        public ModifyPolicyRequestContent setWhitenGfbrNets(Boolean whitenGfbrNets) {
            this.whitenGfbrNets = whitenGfbrNets;
            return this;
        }
        public Boolean getWhitenGfbrNets() {
            return this.whitenGfbrNets;
        }

    }

}
