// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyPolicyRequest extends TeaModel {
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
    public ModifyPolicyRequestContent content;

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

    public ModifyPolicyRequest setPortVersion(String portVersion) {
        this.portVersion = portVersion;
        return this;
    }
    public String getPortVersion() {
        return this.portVersion;
    }

    public static class ModifyPolicyRequestContentFingerPrintRuleList extends TeaModel {
        /**
         * <p>The rule comment.</p>
         * 
         * <strong>example:</strong>
         * <p>comment</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The end value of the destination port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("DstPortEnd")
        public Integer dstPortEnd;

        /**
         * <p>The start value of the destination port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DstPortStart")
        public Integer dstPortStart;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5fbe941f-a0cf-4a49-9c7c-8fac********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The match action. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: Allows traffic that matches the fingerprint.</li>
         * <li><strong>drop</strong>: Drops traffic that matches the fingerprint.</li>
         * <li><strong>ip_rate</strong>: Rate-limits the source IP address of traffic that matches the fingerprint. Set the rate limit value by using the <strong>RateValue</strong> parameter.</li>
         * <li><strong>session_rate</strong>: Rate-limits the source session of traffic that matches the fingerprint. Set the rate limit value by using the <strong>RateValue</strong> parameter.</li>
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
         * 
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("MaxPktLen")
        public Integer maxPktLen;

        /**
         * <p>The minimum packet length. Valid values: <strong>1</strong> to <strong>1500</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinPktLen")
        public Integer minPktLen;

        /**
         * <p>The rule mode.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Mode")
        public Integer mode;

        /**
         * <p>The offset. Valid values: <strong>0</strong> to <strong>1500</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <p>The detection payload. Expressed in hexadecimal string format.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("PayloadBytes")
        public String payloadBytes;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: Transmission Control Protocol.</li>
         * <li><strong>udp</strong>: User Datagram Protocol.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>udp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The rate limit value. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
         * <blockquote>
         * <p>This parameter is required when the match action is source IP rate limiting or source session rate limiting (<strong>MatchAction</strong> is <strong>ip_rate</strong> or <strong>session_rate</strong>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RateValue")
        public Integer rateValue;

        /**
         * <p>The rule.</p>
         * 
         * <strong>example:</strong>
         * <p>(ip.version == 4)</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>The priority number, expressed as an integer.</p>
         * <blockquote>
         * <p>A smaller number indicates a higher priority.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeqNo")
        public Integer seqNo;

        /**
         * <p>The end value of the source port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("SrcPortEnd")
        public Integer srcPortEnd;

        /**
         * <p>The start value of the source port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SrcPortStart")
        public Integer srcPortStart;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static ModifyPolicyRequestContentFingerPrintRuleList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyRequestContentFingerPrintRuleList self = new ModifyPolicyRequestContentFingerPrintRuleList();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyRequestContentFingerPrintRuleList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
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

        public ModifyPolicyRequestContentFingerPrintRuleList setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
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

        public ModifyPolicyRequestContentFingerPrintRuleList setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
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

        public ModifyPolicyRequestContentFingerPrintRuleList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class ModifyPolicyRequestContentL4RuleListConditionListOffset extends TeaModel {
        /**
         * <p>The end position. Valid values: <strong>0</strong> to <strong>1499</strong>.</p>
         * <blockquote>
         * <p>The end position must be greater than or equal to the start position.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1499</p>
         */
        @NameInMap("End")
        public Integer end;

        /**
         * <p>The start position. Valid values: <strong>0</strong> to <strong>1499</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Start")
        public Integer start;

        public static ModifyPolicyRequestContentL4RuleListConditionListOffset build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyRequestContentL4RuleListConditionListOffset self = new ModifyPolicyRequestContentL4RuleListConditionListOffset();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyRequestContentL4RuleListConditionListOffset setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public ModifyPolicyRequestContentL4RuleListConditionListOffset setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

    }

    public static class ModifyPolicyRequestContentL4RuleListConditionList extends TeaModel {
        /**
         * <p>The detection content.</p>
         * <blockquote>
         * <p>If the rule type is <strong>char</strong>, the value must be an ASCII string. If the rule type is <strong>hex</strong>, the value must be a hexadecimal string. Maximum length: 2048.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("Arg")
        public String arg;

        /**
         * <p>The matching content.</p>
         * <ol>
         * <li>When <strong>Encode</strong> is set to <strong>str</strong>, the following requirements must be met:</li>
         * </ol>
         * <ul>
         * <li><p>The length of <strong>Content</strong> must not exceed 1500.</p>
         * </li>
         * <li><p><strong>End</strong> - <strong>Start</strong> &gt;= the length of <strong>Content</strong>.</p>
         * </li>
         * </ul>
         * <ol start="2">
         * <li>When <strong>Encode</strong> is set to <strong>hex</strong>, the following requirements must be met:</li>
         * </ol>
         * <ul>
         * <li><p><strong>Content</strong> must be hexadecimal characters.</p>
         * </li>
         * <li><p>The length of <strong>Content</strong> must be an even number.</p>
         * </li>
         * <li><p>The length of <strong>Content</strong> must not exceed 3000.</p>
         * </li>
         * <li><p><strong>End</strong> - <strong>Start</strong> + 1 &gt;= the length of <strong>Content</strong> / 2.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test**</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The detection window length. Valid values: <strong>1</strong> to <strong>2048</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("Depth")
        public Integer depth;

        /**
         * <p>The character type. Valid values:</p>
         * <ul>
         * <li><p><strong>str</strong>: string.</p>
         * </li>
         * <li><p><strong>hex</strong>: hexadecimal.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>str</p>
         */
        @NameInMap("Encode")
        public String encode;

        /**
         * <p>The matching range.</p>
         */
        @NameInMap("Offset")
        public ModifyPolicyRequestContentL4RuleListConditionListOffset offset;

        /**
         * <p>The matching pattern. Valid values vary depending on the value of the <strong>Encode</strong> field:</p>
         * <p>(1) When <strong>Encode</strong> is set to <strong>str</strong>, valid values:</p>
         * <ul>
         * <li><p><strong>contain</strong>: contains.</p>
         * </li>
         * <li><p><strong>not_contain</strong>: does not contain.</p>
         * </li>
         * <li><p><strong>regex</strong>: regular expression.</p>
         * </li>
         * </ul>
         * <p>(2) When <strong>Encode</strong> is set to <strong>hex</strong>, valid values:</p>
         * <ul>
         * <li><p><strong>contain</strong>: contains.</p>
         * </li>
         * <li><p><strong>not_contain</strong>: does not contain.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>contain</p>
         */
        @NameInMap("Pattern")
        public String pattern;

        /**
         * <p>The detection start position. Valid values: <strong>0</strong> to <strong>2047</strong>.</p>
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

        public ModifyPolicyRequestContentL4RuleListConditionList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ModifyPolicyRequestContentL4RuleListConditionList setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public ModifyPolicyRequestContentL4RuleListConditionList setEncode(String encode) {
            this.encode = encode;
            return this;
        }
        public String getEncode() {
            return this.encode;
        }

        public ModifyPolicyRequestContentL4RuleListConditionList setOffset(ModifyPolicyRequestContentL4RuleListConditionListOffset offset) {
            this.offset = offset;
            return this;
        }
        public ModifyPolicyRequestContentL4RuleListConditionListOffset getOffset() {
            return this.offset;
        }

        public ModifyPolicyRequestContentL4RuleListConditionList setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
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
         * <p>The action.</p>
         * 
         * <strong>example:</strong>
         * <p>block</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The list of detection conditions.</p>
         */
        @NameInMap("ConditionList")
        public java.util.List<ModifyPolicyRequestContentL4RuleListConditionList> conditionList;

        /**
         * <p>The minimum number of bytes in a session flow that triggers rule matching. Valid values: <strong>0</strong> to <strong>2048</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Limited")
        public Integer limited;

        /**
         * <p>The logical operator. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The action is executed when the condition is met.</p>
         * </li>
         * <li><p><strong>1</strong>: The action is executed when the condition is not met.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Match")
        public String match;

        /**
         * <p>The rule type. Valid values:</p>
         * <ul>
         * <li><p><strong>hex</strong>: hexadecimal match.</p>
         * </li>
         * <li><p><strong>char</strong>: string match.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>char</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The rule name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rule priority. Valid values: <strong>1</strong> to <strong>100</strong>.</p>
         * <blockquote>
         * <p>A smaller value indicates a higher priority.</p>
         * </blockquote>
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
         * <p>The end value of the destination port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("DstPortEnd")
        public Integer dstPortEnd;

        /**
         * <p>The start value of the destination port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DstPortStart")
        public Integer dstPortStart;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c52c2fa6-fdac-40c4-8753-be7c*********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The match action. Valid values:</p>
         * <ul>
         * <li><strong>drop</strong>: Drops the traffic.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drop</p>
         */
        @NameInMap("MatchAction")
        public String matchAction;

        /**
         * <p>The protocol type. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong>: Transmission Control Protocol.</li>
         * <li><strong>udp</strong>: User Datagram Protocol.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The priority number, expressed as an integer.</p>
         * <blockquote>
         * <p>A smaller number indicates a higher priority.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeqNo")
        public Integer seqNo;

        /**
         * <p>The end value of the source port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("SrcPortEnd")
        public Integer srcPortEnd;

        /**
         * <p>The start value of the source port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
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

    public static class ModifyPolicyRequestContentSipDefense extends TeaModel {
        /**
         * <p>Specifies whether SIP protection is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The SIP protection level.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>Specifies whether to enable SIP defense mode.</p>
         */
        @NameInMap("SipDefend")
        public Boolean sipDefend;

        /**
         * <p>Specifies whether to enable SIP learning mode.</p>
         */
        @NameInMap("SipLearn")
        public Boolean sipLearn;

        /**
         * <p>Specifies whether to enable the SIP source rate limiting module.</p>
         */
        @NameInMap("SipModule")
        public Boolean sipModule;

        /**
         * <p>The SIP protection port. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5060</p>
         */
        @NameInMap("SipPort")
        public String sipPort;

        /**
         * <p>The SIP source rate limit value in PPS.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SipRate")
        public Long sipRate;

        /**
         * <p>The SIP activation threshold in Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SipStartMbps")
        public Long sipStartMbps;

        /**
         * <p>The SIP activation threshold in PPS.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("SipStartPps")
        public Long sipStartPps;

        public static ModifyPolicyRequestContentSipDefense build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyRequestContentSipDefense self = new ModifyPolicyRequestContentSipDefense();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyRequestContentSipDefense setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ModifyPolicyRequestContentSipDefense setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ModifyPolicyRequestContentSipDefense setSipDefend(Boolean sipDefend) {
            this.sipDefend = sipDefend;
            return this;
        }
        public Boolean getSipDefend() {
            return this.sipDefend;
        }

        public ModifyPolicyRequestContentSipDefense setSipLearn(Boolean sipLearn) {
            this.sipLearn = sipLearn;
            return this;
        }
        public Boolean getSipLearn() {
            return this.sipLearn;
        }

        public ModifyPolicyRequestContentSipDefense setSipModule(Boolean sipModule) {
            this.sipModule = sipModule;
            return this;
        }
        public Boolean getSipModule() {
            return this.sipModule;
        }

        public ModifyPolicyRequestContentSipDefense setSipPort(String sipPort) {
            this.sipPort = sipPort;
            return this;
        }
        public String getSipPort() {
            return this.sipPort;
        }

        public ModifyPolicyRequestContentSipDefense setSipRate(Long sipRate) {
            this.sipRate = sipRate;
            return this;
        }
        public Long getSipRate() {
            return this.sipRate;
        }

        public ModifyPolicyRequestContentSipDefense setSipStartMbps(Long sipStartMbps) {
            this.sipStartMbps = sipStartMbps;
            return this;
        }
        public Long getSipStartMbps() {
            return this.sipStartMbps;
        }

        public ModifyPolicyRequestContentSipDefense setSipStartPps(Long sipStartPps) {
            this.sipStartPps = sipStartPps;
            return this;
        }
        public Long getSipStartPps() {
            return this.sipStartPps;
        }

    }

    public static class ModifyPolicyRequestContentSourceBlockList extends TeaModel {
        /**
         * <p>The duration for which the source IP address is added to the blacklist. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("BlockExpireSeconds")
        public Integer blockExpireSeconds;

        /**
         * <p>The statistical period for source rate limiting blacklisting. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("EverySeconds")
        public Integer everySeconds;

        /**
         * <p>The number of times the source IP address exceeds the rate limit within one statistical period.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ExceedLimitTimes")
        public Integer exceedLimitTimes;

        /**
         * <p>The source rate limiting type. Valid values:</p>
         * <ul>
         * <li><p><strong>3</strong>: source PPS rate limiting.</p>
         * </li>
         * <li><p><strong>4</strong>: source bandwidth throttling.</p>
         * </li>
         * <li><p><strong>5</strong>: source SYN PPS rate limiting.</p>
         * </li>
         * <li><p><strong>6</strong>: source SYN bandwidth throttling.</p>
         * </li>
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
         * <p>The source bandwidth throttling value. Unit: bytes per second.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Bps")
        public Integer bps;

        /**
         * <p>The source PPS rate limit. Unit: packets per second.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        /**
         * <p>The source SYN bandwidth throttling value. Unit: bytes per second.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("SynBps")
        public Integer synBps;

        /**
         * <p>The source SYN PPS rate limit. Unit: packets per second.</p>
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
         * <p>The IP blacklist.</p>
         */
        @NameInMap("BlackIpList")
        public java.util.List<String> blackIpList;

        /**
         * <p>The timeout period of the IP blacklist (UNIX timestamp).</p>
         * 
         * <strong>example:</strong>
         * <p>1716878000</p>
         */
        @NameInMap("BlackIpListExpireAt")
        public Long blackIpListExpireAt;

        /**
         * <p>Specifies whether to disable the ICMP protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableDropIcmp")
        public Boolean enableDropIcmp;

        /**
         * <p>Specifies whether to enable AI-based intelligent protection.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIntelligence")
        public Boolean enableIntelligence;

        /**
         * <p>Specifies whether to enable port-specific mitigation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableL4Defense")
        public Boolean enableL4Defense;

        /**
         * <p>The list of byte-match filter rules.</p>
         */
        @NameInMap("FingerPrintRuleList")
        public java.util.List<ModifyPolicyRequestContentFingerPrintRuleList> fingerPrintRuleList;

        /**
         * <p>The protection level of AI-based intelligent protection. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: Normal.</li>
         * <li><strong>weak</strong>: Loose.</li>
         * <li><strong>hard</strong>: Strict.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("IntelligenceLevel")
        public String intelligenceLevel;

        /**
         * <p>The list of port forwarding rules.</p>
         */
        @NameInMap("L4RuleList")
        public java.util.List<ModifyPolicyRequestContentL4RuleList> l4RuleList;

        /**
         * <p>The list of port blocking rules.</p>
         */
        @NameInMap("PortRuleList")
        public java.util.List<ModifyPolicyRequestContentPortRuleList> portRuleList;

        /**
         * <p>The list of ports filtered by Reflection Attack Filtering.</p>
         */
        @NameInMap("ReflectBlockUdpPortList")
        public java.util.List<Integer> reflectBlockUdpPortList;

        /**
         * <p>The list of countries for the location blacklist.</p>
         */
        @NameInMap("RegionBlockCountryList")
        public java.util.List<Integer> regionBlockCountryList;

        /**
         * <p>The list of provinces for the location blacklist.</p>
         */
        @NameInMap("RegionBlockProvinceList")
        public java.util.List<Integer> regionBlockProvinceList;

        /**
         * <p>The SIP protection settings.</p>
         */
        @NameInMap("SipDefense")
        public ModifyPolicyRequestContentSipDefense sipDefense;

        /**
         * <p>The source rate limiting blacklist.</p>
         */
        @NameInMap("SourceBlockList")
        public java.util.List<ModifyPolicyRequestContentSourceBlockList> sourceBlockList;

        /**
         * <p>The source rate limiting configuration.</p>
         */
        @NameInMap("SourceLimit")
        public ModifyPolicyRequestContentSourceLimit sourceLimit;

        /**
         * <p>The IP whitelist.</p>
         */
        @NameInMap("WhiteIpList")
        public java.util.List<String> whiteIpList;

        /**
         * <p>Specifies whether to enable whitelisting of back-to-origin IP addresses for Anti-DDoS Pro and Anti-DDoS Premium (the Chinese mainland and outside the Chinese mainland).</p>
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

        public ModifyPolicyRequestContent setSipDefense(ModifyPolicyRequestContentSipDefense sipDefense) {
            this.sipDefense = sipDefense;
            return this;
        }
        public ModifyPolicyRequestContentSipDefense getSipDefense() {
            return this.sipDefense;
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
