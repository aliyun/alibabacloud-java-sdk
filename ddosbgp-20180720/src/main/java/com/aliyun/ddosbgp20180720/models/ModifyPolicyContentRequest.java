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
     * <p>The ID of the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>83967609-7ea5-4f6d-a6ea-380b09e****</p>
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

    public static class ModifyPolicyContentRequestContentFingerPrintRuleList extends TeaModel {
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
         * <p>83967609-7ea5-4f6d-a6ea-380b09e****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The action triggered if the rule is matched. Valid values:</p>
         * <ul>
         * <li><strong>permit</strong>: allows the traffic that matches the conditions in the byte-match filter rule.</li>
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
         * <p>The protocol type. Valid values:</p>
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

    public static class ModifyPolicyContentRequestContentL4RuleListConditionList extends TeaModel {
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

        public ModifyPolicyContentRequestContentL4RuleListConditionList setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
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
        public java.util.List<ModifyPolicyContentRequestContentL4RuleListConditionList> conditionList;

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
         * <p>test**</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The priority of the rule. Valid values: 1 to 100.</p>
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
         * <p>412a7312-58ff-4e32-a202-0ab0*******</p>
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
         * <p>The protocol type. Valid values:</p>
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

    public static class ModifyPolicyContentRequestContentSourceBlockList extends TeaModel {
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
        public java.util.List<ModifyPolicyContentRequestContentFingerPrintRuleList> fingerPrintRuleList;

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
        public java.util.List<ModifyPolicyContentRequestContentL4RuleList> l4RuleList;

        /**
         * <p>The port blocking rules.</p>
         */
        @NameInMap("PortRuleList")
        public java.util.List<ModifyPolicyContentRequestContentPortRuleList> portRuleList;

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
        public java.util.List<ModifyPolicyContentRequestContentSourceBlockList> sourceBlockList;

        /**
         * <p>The settings for source rate limiting.</p>
         */
        @NameInMap("SourceLimit")
        public ModifyPolicyContentRequestContentSourceLimit sourceLimit;

        /**
         * <p>Specifies whether to add back-to-origin CIDR blocks of Anti-DDoS Proxy to the whitelist.</p>
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
