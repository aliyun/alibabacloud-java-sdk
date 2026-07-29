// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ModifyPolicyContentRequest extends TeaModel {
    /**
     * <p>The policy content.</p>
     */
    @NameInMap("Content")
    public ModifyPolicyContentRequestContent content;

    /**
     * <p>The policy ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>83967609-7ea5-4f6d-a6ea-380b09e****</p>
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
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PortVersion")
    public String portVersion;

    public static ModifyPolicyContentRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPolicyContentRequest self = new ModifyPolicyContentRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPolicyContentRequest setContent(ModifyPolicyContentRequestContent content) {
        this.content = content;
        return this;
    }
    public ModifyPolicyContentRequestContent getContent() {
        return this.content;
    }

    public ModifyPolicyContentRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public ModifyPolicyContentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyPolicyContentRequest setPortVersion(String portVersion) {
        this.portVersion = portVersion;
        return this;
    }
    public String getPortVersion() {
        return this.portVersion;
    }

    public static class ModifyPolicyContentRequestContentFingerPrintRuleList extends TeaModel {
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
         * <p>83967609-7ea5-4f6d-a6ea-380b09e****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The action to take when a fingerprint match is found. Valid values:</p>
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
         * <p>The detection payload, expressed in hexadecimal string format.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("PayloadBytes")
        public String payloadBytes;

        /**
         * <p>The protocol type. Valid values:</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The rate limit value. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RateValue")
        public Integer rateValue;

        /**
         * <p>The priority number, expressed as an integer.</p>
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

        public static ModifyPolicyContentRequestContentFingerPrintRuleList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyContentRequestContentFingerPrintRuleList self = new ModifyPolicyContentRequestContentFingerPrintRuleList();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyContentRequestContentFingerPrintRuleList setDstPortEnd(Integer dstPortEnd) {
            this.dstPortEnd = dstPortEnd;
            return this;
        }
        public Integer getDstPortEnd() {
            return this.dstPortEnd;
        }

        public ModifyPolicyContentRequestContentFingerPrintRuleList setDstPortStart(Integer dstPortStart) {
            this.dstPortStart = dstPortStart;
            return this;
        }
        public Integer getDstPortStart() {
            return this.dstPortStart;
        }

        public ModifyPolicyContentRequestContentFingerPrintRuleList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyPolicyContentRequestContentFingerPrintRuleList setMatchAction(String matchAction) {
            this.matchAction = matchAction;
            return this;
        }
        public String getMatchAction() {
            return this.matchAction;
        }

        public ModifyPolicyContentRequestContentFingerPrintRuleList setMaxPktLen(Integer maxPktLen) {
            this.maxPktLen = maxPktLen;
            return this;
        }
        public Integer getMaxPktLen() {
            return this.maxPktLen;
        }

        public ModifyPolicyContentRequestContentFingerPrintRuleList setMinPktLen(Integer minPktLen) {
            this.minPktLen = minPktLen;
            return this;
        }
        public Integer getMinPktLen() {
            return this.minPktLen;
        }

        public ModifyPolicyContentRequestContentFingerPrintRuleList setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

        public ModifyPolicyContentRequestContentFingerPrintRuleList setPayloadBytes(String payloadBytes) {
            this.payloadBytes = payloadBytes;
            return this;
        }
        public String getPayloadBytes() {
            return this.payloadBytes;
        }

        public ModifyPolicyContentRequestContentFingerPrintRuleList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ModifyPolicyContentRequestContentFingerPrintRuleList setRateValue(Integer rateValue) {
            this.rateValue = rateValue;
            return this;
        }
        public Integer getRateValue() {
            return this.rateValue;
        }

        public ModifyPolicyContentRequestContentFingerPrintRuleList setSeqNo(Integer seqNo) {
            this.seqNo = seqNo;
            return this;
        }
        public Integer getSeqNo() {
            return this.seqNo;
        }

        public ModifyPolicyContentRequestContentFingerPrintRuleList setSrcPortEnd(Integer srcPortEnd) {
            this.srcPortEnd = srcPortEnd;
            return this;
        }
        public Integer getSrcPortEnd() {
            return this.srcPortEnd;
        }

        public ModifyPolicyContentRequestContentFingerPrintRuleList setSrcPortStart(Integer srcPortStart) {
            this.srcPortStart = srcPortStart;
            return this;
        }
        public Integer getSrcPortStart() {
            return this.srcPortStart;
        }

    }

    public static class ModifyPolicyContentRequestContentL4RuleListConditionListOffset extends TeaModel {
        /**
         * <p>The end position. Valid values: <strong>0</strong> to <strong>1499</strong>.</p>
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

        public static ModifyPolicyContentRequestContentL4RuleListConditionListOffset build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyContentRequestContentL4RuleListConditionListOffset self = new ModifyPolicyContentRequestContentL4RuleListConditionListOffset();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyContentRequestContentL4RuleListConditionListOffset setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public ModifyPolicyContentRequestContentL4RuleListConditionListOffset setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

    }

    public static class ModifyPolicyContentRequestContentL4RuleListConditionList extends TeaModel {
        /**
         * <p>The detection content.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("Arg")
        public String arg;

        /**
         * <p>The matching content.</p>
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
        public ModifyPolicyContentRequestContentL4RuleListConditionListOffset offset;

        /**
         * <p>The matching pattern. Valid values:</p>
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

        public static ModifyPolicyContentRequestContentL4RuleListConditionList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyContentRequestContentL4RuleListConditionList self = new ModifyPolicyContentRequestContentL4RuleListConditionList();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyContentRequestContentL4RuleListConditionList setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public ModifyPolicyContentRequestContentL4RuleListConditionList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ModifyPolicyContentRequestContentL4RuleListConditionList setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public ModifyPolicyContentRequestContentL4RuleListConditionList setEncode(String encode) {
            this.encode = encode;
            return this;
        }
        public String getEncode() {
            return this.encode;
        }

        public ModifyPolicyContentRequestContentL4RuleListConditionList setOffset(ModifyPolicyContentRequestContentL4RuleListConditionListOffset offset) {
            this.offset = offset;
            return this;
        }
        public ModifyPolicyContentRequestContentL4RuleListConditionListOffset getOffset() {
            return this.offset;
        }

        public ModifyPolicyContentRequestContentL4RuleListConditionList setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
        }

        public ModifyPolicyContentRequestContentL4RuleListConditionList setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

    }

    public static class ModifyPolicyContentRequestContentL4RuleList extends TeaModel {
        /**
         * <p>The action.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The list of detection conditions.</p>
         */
        @NameInMap("ConditionList")
        public java.util.List<ModifyPolicyContentRequestContentL4RuleListConditionList> conditionList;

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
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Match")
        public String match;

        /**
         * <p>The rule type. Valid values:</p>
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
         * <p>test**</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rule priority. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static ModifyPolicyContentRequestContentL4RuleList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyContentRequestContentL4RuleList self = new ModifyPolicyContentRequestContentL4RuleList();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyContentRequestContentL4RuleList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ModifyPolicyContentRequestContentL4RuleList setConditionList(java.util.List<ModifyPolicyContentRequestContentL4RuleListConditionList> conditionList) {
            this.conditionList = conditionList;
            return this;
        }
        public java.util.List<ModifyPolicyContentRequestContentL4RuleListConditionList> getConditionList() {
            return this.conditionList;
        }

        public ModifyPolicyContentRequestContentL4RuleList setLimited(Integer limited) {
            this.limited = limited;
            return this;
        }
        public Integer getLimited() {
            return this.limited;
        }

        public ModifyPolicyContentRequestContentL4RuleList setMatch(String match) {
            this.match = match;
            return this;
        }
        public String getMatch() {
            return this.match;
        }

        public ModifyPolicyContentRequestContentL4RuleList setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ModifyPolicyContentRequestContentL4RuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyPolicyContentRequestContentL4RuleList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class ModifyPolicyContentRequestContentPortRuleList extends TeaModel {
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
         * <p>412a7312-58ff-4e32-a202-0ab0*******</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The match action. Valid values:</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drop</p>
         */
        @NameInMap("MatchAction")
        public String matchAction;

        /**
         * <p>The protocol type. Valid values:</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The priority number, expressed as an integer.</p>
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

        public static ModifyPolicyContentRequestContentPortRuleList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyContentRequestContentPortRuleList self = new ModifyPolicyContentRequestContentPortRuleList();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyContentRequestContentPortRuleList setDstPortEnd(Integer dstPortEnd) {
            this.dstPortEnd = dstPortEnd;
            return this;
        }
        public Integer getDstPortEnd() {
            return this.dstPortEnd;
        }

        public ModifyPolicyContentRequestContentPortRuleList setDstPortStart(Integer dstPortStart) {
            this.dstPortStart = dstPortStart;
            return this;
        }
        public Integer getDstPortStart() {
            return this.dstPortStart;
        }

        public ModifyPolicyContentRequestContentPortRuleList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ModifyPolicyContentRequestContentPortRuleList setMatchAction(String matchAction) {
            this.matchAction = matchAction;
            return this;
        }
        public String getMatchAction() {
            return this.matchAction;
        }

        public ModifyPolicyContentRequestContentPortRuleList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ModifyPolicyContentRequestContentPortRuleList setSeqNo(Integer seqNo) {
            this.seqNo = seqNo;
            return this;
        }
        public Integer getSeqNo() {
            return this.seqNo;
        }

        public ModifyPolicyContentRequestContentPortRuleList setSrcPortEnd(Integer srcPortEnd) {
            this.srcPortEnd = srcPortEnd;
            return this;
        }
        public Integer getSrcPortEnd() {
            return this.srcPortEnd;
        }

        public ModifyPolicyContentRequestContentPortRuleList setSrcPortStart(Integer srcPortStart) {
            this.srcPortStart = srcPortStart;
            return this;
        }
        public Integer getSrcPortStart() {
            return this.srcPortStart;
        }

    }

    public static class ModifyPolicyContentRequestContentSipDefense extends TeaModel {
        /**
         * <p>Specifies whether to enable SIP protection. Valid values:</p>
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

        public static ModifyPolicyContentRequestContentSipDefense build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyContentRequestContentSipDefense self = new ModifyPolicyContentRequestContentSipDefense();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyContentRequestContentSipDefense setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ModifyPolicyContentRequestContentSipDefense setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ModifyPolicyContentRequestContentSipDefense setSipDefend(Boolean sipDefend) {
            this.sipDefend = sipDefend;
            return this;
        }
        public Boolean getSipDefend() {
            return this.sipDefend;
        }

        public ModifyPolicyContentRequestContentSipDefense setSipLearn(Boolean sipLearn) {
            this.sipLearn = sipLearn;
            return this;
        }
        public Boolean getSipLearn() {
            return this.sipLearn;
        }

        public ModifyPolicyContentRequestContentSipDefense setSipModule(Boolean sipModule) {
            this.sipModule = sipModule;
            return this;
        }
        public Boolean getSipModule() {
            return this.sipModule;
        }

        public ModifyPolicyContentRequestContentSipDefense setSipPort(String sipPort) {
            this.sipPort = sipPort;
            return this;
        }
        public String getSipPort() {
            return this.sipPort;
        }

        public ModifyPolicyContentRequestContentSipDefense setSipRate(Long sipRate) {
            this.sipRate = sipRate;
            return this;
        }
        public Long getSipRate() {
            return this.sipRate;
        }

        public ModifyPolicyContentRequestContentSipDefense setSipStartMbps(Long sipStartMbps) {
            this.sipStartMbps = sipStartMbps;
            return this;
        }
        public Long getSipStartMbps() {
            return this.sipStartMbps;
        }

        public ModifyPolicyContentRequestContentSipDefense setSipStartPps(Long sipStartPps) {
            this.sipStartPps = sipStartPps;
            return this;
        }
        public Long getSipStartPps() {
            return this.sipStartPps;
        }

    }

    public static class ModifyPolicyContentRequestContentSourceBlockList extends TeaModel {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static ModifyPolicyContentRequestContentSourceBlockList build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyContentRequestContentSourceBlockList self = new ModifyPolicyContentRequestContentSourceBlockList();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyContentRequestContentSourceBlockList setBlockExpireSeconds(Integer blockExpireSeconds) {
            this.blockExpireSeconds = blockExpireSeconds;
            return this;
        }
        public Integer getBlockExpireSeconds() {
            return this.blockExpireSeconds;
        }

        public ModifyPolicyContentRequestContentSourceBlockList setEverySeconds(Integer everySeconds) {
            this.everySeconds = everySeconds;
            return this;
        }
        public Integer getEverySeconds() {
            return this.everySeconds;
        }

        public ModifyPolicyContentRequestContentSourceBlockList setExceedLimitTimes(Integer exceedLimitTimes) {
            this.exceedLimitTimes = exceedLimitTimes;
            return this;
        }
        public Integer getExceedLimitTimes() {
            return this.exceedLimitTimes;
        }

        public ModifyPolicyContentRequestContentSourceBlockList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class ModifyPolicyContentRequestContentSourceLimit extends TeaModel {
        /**
         * <p>The source bandwidth throttling value, in bytes per second.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Bps")
        public Integer bps;

        /**
         * <p>The source PPS rate limit, in packets per second.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        /**
         * <p>The source SYN bandwidth throttling value, in bytes per second.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("SynBps")
        public Integer synBps;

        /**
         * <p>The source SYN PPS rate limit, in packets per second.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("SynPps")
        public Integer synPps;

        public static ModifyPolicyContentRequestContentSourceLimit build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyContentRequestContentSourceLimit self = new ModifyPolicyContentRequestContentSourceLimit();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyContentRequestContentSourceLimit setBps(Integer bps) {
            this.bps = bps;
            return this;
        }
        public Integer getBps() {
            return this.bps;
        }

        public ModifyPolicyContentRequestContentSourceLimit setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public ModifyPolicyContentRequestContentSourceLimit setSynBps(Integer synBps) {
            this.synBps = synBps;
            return this;
        }
        public Integer getSynBps() {
            return this.synBps;
        }

        public ModifyPolicyContentRequestContentSourceLimit setSynPps(Integer synPps) {
            this.synPps = synPps;
            return this;
        }
        public Integer getSynPps() {
            return this.synPps;
        }

    }

    public static class ModifyPolicyContentRequestContent extends TeaModel {
        /**
         * <p>The expiration time of the IP blacklist (UNIX timestamp).</p>
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
         * <p>Specifies whether to enable port protection.</p>
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
        public java.util.List<ModifyPolicyContentRequestContentFingerPrintRuleList> fingerPrintRuleList;

        /**
         * <p>The protection level of AI-based intelligent protection. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("IntelligenceLevel")
        public String intelligenceLevel;

        /**
         * <p>The list of port-specific mitigation rules.</p>
         */
        @NameInMap("L4RuleList")
        public java.util.List<ModifyPolicyContentRequestContentL4RuleList> l4RuleList;

        /**
         * <p>The list of port blocking rules.</p>
         */
        @NameInMap("PortRuleList")
        public java.util.List<ModifyPolicyContentRequestContentPortRuleList> portRuleList;

        /**
         * <p>The list of ports filtered by reflection attack prevention.</p>
         */
        @NameInMap("ReflectBlockUdpPortList")
        public java.util.List<Integer> reflectBlockUdpPortList;

        /**
         * <p>The list of countries for location blacklist.</p>
         */
        @NameInMap("RegionBlockCountryList")
        public java.util.List<Integer> regionBlockCountryList;

        /**
         * <p>The list of provinces for location blacklist.</p>
         */
        @NameInMap("RegionBlockProvinceList")
        public java.util.List<Integer> regionBlockProvinceList;

        /**
         * <p>The SIP Protection Settings.</p>
         */
        @NameInMap("SipDefense")
        public ModifyPolicyContentRequestContentSipDefense sipDefense;

        /**
         * <p>The source rate limiting blacklist.</p>
         */
        @NameInMap("SourceBlockList")
        public java.util.List<ModifyPolicyContentRequestContentSourceBlockList> sourceBlockList;

        /**
         * <p>The source rate limiting configuration.</p>
         */
        @NameInMap("SourceLimit")
        public ModifyPolicyContentRequestContentSourceLimit sourceLimit;

        /**
         * <p>Specifies whether to whitelist the back-to-origin IP addresses of Anti-DDoS Pro and Anti-DDoS Premium (the Chinese mainland &amp; outside the Chinese mainland).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WhitenGfbrNets")
        public Boolean whitenGfbrNets;

        public static ModifyPolicyContentRequestContent build(java.util.Map<String, ?> map) throws Exception {
            ModifyPolicyContentRequestContent self = new ModifyPolicyContentRequestContent();
            return TeaModel.build(map, self);
        }

        public ModifyPolicyContentRequestContent setBlackIpListExpireAt(Long blackIpListExpireAt) {
            this.blackIpListExpireAt = blackIpListExpireAt;
            return this;
        }
        public Long getBlackIpListExpireAt() {
            return this.blackIpListExpireAt;
        }

        public ModifyPolicyContentRequestContent setEnableDropIcmp(Boolean enableDropIcmp) {
            this.enableDropIcmp = enableDropIcmp;
            return this;
        }
        public Boolean getEnableDropIcmp() {
            return this.enableDropIcmp;
        }

        public ModifyPolicyContentRequestContent setEnableIntelligence(Boolean enableIntelligence) {
            this.enableIntelligence = enableIntelligence;
            return this;
        }
        public Boolean getEnableIntelligence() {
            return this.enableIntelligence;
        }

        public ModifyPolicyContentRequestContent setEnableL4Defense(Boolean enableL4Defense) {
            this.enableL4Defense = enableL4Defense;
            return this;
        }
        public Boolean getEnableL4Defense() {
            return this.enableL4Defense;
        }

        public ModifyPolicyContentRequestContent setFingerPrintRuleList(java.util.List<ModifyPolicyContentRequestContentFingerPrintRuleList> fingerPrintRuleList) {
            this.fingerPrintRuleList = fingerPrintRuleList;
            return this;
        }
        public java.util.List<ModifyPolicyContentRequestContentFingerPrintRuleList> getFingerPrintRuleList() {
            return this.fingerPrintRuleList;
        }

        public ModifyPolicyContentRequestContent setIntelligenceLevel(String intelligenceLevel) {
            this.intelligenceLevel = intelligenceLevel;
            return this;
        }
        public String getIntelligenceLevel() {
            return this.intelligenceLevel;
        }

        public ModifyPolicyContentRequestContent setL4RuleList(java.util.List<ModifyPolicyContentRequestContentL4RuleList> l4RuleList) {
            this.l4RuleList = l4RuleList;
            return this;
        }
        public java.util.List<ModifyPolicyContentRequestContentL4RuleList> getL4RuleList() {
            return this.l4RuleList;
        }

        public ModifyPolicyContentRequestContent setPortRuleList(java.util.List<ModifyPolicyContentRequestContentPortRuleList> portRuleList) {
            this.portRuleList = portRuleList;
            return this;
        }
        public java.util.List<ModifyPolicyContentRequestContentPortRuleList> getPortRuleList() {
            return this.portRuleList;
        }

        public ModifyPolicyContentRequestContent setReflectBlockUdpPortList(java.util.List<Integer> reflectBlockUdpPortList) {
            this.reflectBlockUdpPortList = reflectBlockUdpPortList;
            return this;
        }
        public java.util.List<Integer> getReflectBlockUdpPortList() {
            return this.reflectBlockUdpPortList;
        }

        public ModifyPolicyContentRequestContent setRegionBlockCountryList(java.util.List<Integer> regionBlockCountryList) {
            this.regionBlockCountryList = regionBlockCountryList;
            return this;
        }
        public java.util.List<Integer> getRegionBlockCountryList() {
            return this.regionBlockCountryList;
        }

        public ModifyPolicyContentRequestContent setRegionBlockProvinceList(java.util.List<Integer> regionBlockProvinceList) {
            this.regionBlockProvinceList = regionBlockProvinceList;
            return this;
        }
        public java.util.List<Integer> getRegionBlockProvinceList() {
            return this.regionBlockProvinceList;
        }

        public ModifyPolicyContentRequestContent setSipDefense(ModifyPolicyContentRequestContentSipDefense sipDefense) {
            this.sipDefense = sipDefense;
            return this;
        }
        public ModifyPolicyContentRequestContentSipDefense getSipDefense() {
            return this.sipDefense;
        }

        public ModifyPolicyContentRequestContent setSourceBlockList(java.util.List<ModifyPolicyContentRequestContentSourceBlockList> sourceBlockList) {
            this.sourceBlockList = sourceBlockList;
            return this;
        }
        public java.util.List<ModifyPolicyContentRequestContentSourceBlockList> getSourceBlockList() {
            return this.sourceBlockList;
        }

        public ModifyPolicyContentRequestContent setSourceLimit(ModifyPolicyContentRequestContentSourceLimit sourceLimit) {
            this.sourceLimit = sourceLimit;
            return this;
        }
        public ModifyPolicyContentRequestContentSourceLimit getSourceLimit() {
            return this.sourceLimit;
        }

        public ModifyPolicyContentRequestContent setWhitenGfbrNets(Boolean whitenGfbrNets) {
            this.whitenGfbrNets = whitenGfbrNets;
            return this;
        }
        public Boolean getWhitenGfbrNets() {
            return this.whitenGfbrNets;
        }

    }

}
