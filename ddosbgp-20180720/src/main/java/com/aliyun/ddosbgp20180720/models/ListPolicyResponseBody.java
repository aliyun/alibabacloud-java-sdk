// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListPolicyResponseBody extends TeaModel {
    /**
     * <p>The policies.</p>
     */
    @NameInMap("PolicyList")
    public java.util.List<ListPolicyResponseBodyPolicyList> policyList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4B379C2-9319-4C6B-B579-FE36831B09F4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of policies.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Total")
    public Long total;

    public static ListPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPolicyResponseBody self = new ListPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPolicyResponseBody setPolicyList(java.util.List<ListPolicyResponseBodyPolicyList> policyList) {
        this.policyList = policyList;
        return this;
    }
    public java.util.List<ListPolicyResponseBodyPolicyList> getPolicyList() {
        return this.policyList;
    }

    public ListPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPolicyResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListPolicyResponseBodyPolicyListContentFingerPrintRuleList extends TeaModel {
        /**
         * <p>The end of the destination port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("DstPortEnd")
        public Integer dstPortEnd;

        /**
         * <p>The start of the destination port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
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
         * <p>2c0b09cd-a565-4481-9acb-418b********</p>
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
         * <p>1000</p>
         */
        @NameInMap("RateValue")
        public Integer rateValue;

        /**
         * <p>The sequence number that indicates the order for the rule to take effect. The value is an integer.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeqNo")
        public Integer seqNo;

        /**
         * <p>The end of the source port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("SrcPortEnd")
        public Integer srcPortEnd;

        /**
         * <p>The start of the source port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SrcPortStart")
        public Integer srcPortStart;

        public static ListPolicyResponseBodyPolicyListContentFingerPrintRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyResponseBodyPolicyListContentFingerPrintRuleList self = new ListPolicyResponseBodyPolicyListContentFingerPrintRuleList();
            return TeaModel.build(map, self);
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setDstPortEnd(Integer dstPortEnd) {
            this.dstPortEnd = dstPortEnd;
            return this;
        }
        public Integer getDstPortEnd() {
            return this.dstPortEnd;
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setDstPortStart(Integer dstPortStart) {
            this.dstPortStart = dstPortStart;
            return this;
        }
        public Integer getDstPortStart() {
            return this.dstPortStart;
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setMatchAction(String matchAction) {
            this.matchAction = matchAction;
            return this;
        }
        public String getMatchAction() {
            return this.matchAction;
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setMaxPktLen(Integer maxPktLen) {
            this.maxPktLen = maxPktLen;
            return this;
        }
        public Integer getMaxPktLen() {
            return this.maxPktLen;
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setMinPktLen(Integer minPktLen) {
            this.minPktLen = minPktLen;
            return this;
        }
        public Integer getMinPktLen() {
            return this.minPktLen;
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setOffset(Integer offset) {
            this.offset = offset;
            return this;
        }
        public Integer getOffset() {
            return this.offset;
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setPayloadBytes(String payloadBytes) {
            this.payloadBytes = payloadBytes;
            return this;
        }
        public String getPayloadBytes() {
            return this.payloadBytes;
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setRateValue(Integer rateValue) {
            this.rateValue = rateValue;
            return this;
        }
        public Integer getRateValue() {
            return this.rateValue;
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setSeqNo(Integer seqNo) {
            this.seqNo = seqNo;
            return this;
        }
        public Integer getSeqNo() {
            return this.seqNo;
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setSrcPortEnd(Integer srcPortEnd) {
            this.srcPortEnd = srcPortEnd;
            return this;
        }
        public Integer getSrcPortEnd() {
            return this.srcPortEnd;
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setSrcPortStart(Integer srcPortStart) {
            this.srcPortStart = srcPortStart;
            return this;
        }
        public Integer getSrcPortStart() {
            return this.srcPortStart;
        }

    }

    public static class ListPolicyResponseBodyPolicyListContentL4RuleListConditionList extends TeaModel {
        /**
         * <p>The term that is used for matching.</p>
         * <blockquote>
         * <p> If Method is set to <strong>char</strong>, the value of this parameter must be ASCII strings. If Method is set to <strong>hex</strong>, the value of this parameter must be hexadecimal strings. Maximum length: 2,048.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Arg")
        public String arg;

        /**
         * <p>The number of bytes from the start position for matching. Valid values: <strong>1</strong> to <strong>2048</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Depth")
        public Integer depth;

        /**
         * <p>The start position for matching. Valid values: <strong>0</strong> to <strong>2047</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Position")
        public Integer position;

        public static ListPolicyResponseBodyPolicyListContentL4RuleListConditionList build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyResponseBodyPolicyListContentL4RuleListConditionList self = new ListPolicyResponseBodyPolicyListContentL4RuleListConditionList();
            return TeaModel.build(map, self);
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleListConditionList setArg(String arg) {
            this.arg = arg;
            return this;
        }
        public String getArg() {
            return this.arg;
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleListConditionList setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleListConditionList setPosition(Integer position) {
            this.position = position;
            return this;
        }
        public Integer getPosition() {
            return this.position;
        }

    }

    public static class ListPolicyResponseBodyPolicyListContentL4RuleList extends TeaModel {
        /**
         * <p>The action that is specified in the rule. Valid value:</p>
         * <ul>
         * <li><strong>2</strong>: The traffic is discarded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <p>The match conditions.</p>
         */
        @NameInMap("ConditionList")
        public java.util.List<ListPolicyResponseBodyPolicyListContentL4RuleListConditionList> conditionList;

        /**
         * <p>The minimum number of bytes in a session to trigger matching. Valid values: <strong>0</strong> to <strong>2048</strong>.</p>
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
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Match")
        public String match;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <ul>
         * <li><strong>char</strong>: string match.</li>
         * <li><strong>hex</strong>: hexadecimal string match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>char</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test**</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The priority of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static ListPolicyResponseBodyPolicyListContentL4RuleList build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyResponseBodyPolicyListContentL4RuleList self = new ListPolicyResponseBodyPolicyListContentL4RuleList();
            return TeaModel.build(map, self);
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleList setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleList setConditionList(java.util.List<ListPolicyResponseBodyPolicyListContentL4RuleListConditionList> conditionList) {
            this.conditionList = conditionList;
            return this;
        }
        public java.util.List<ListPolicyResponseBodyPolicyListContentL4RuleListConditionList> getConditionList() {
            return this.conditionList;
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleList setLimited(Integer limited) {
            this.limited = limited;
            return this;
        }
        public Integer getLimited() {
            return this.limited;
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleList setMatch(String match) {
            this.match = match;
            return this;
        }
        public String getMatch() {
            return this.match;
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleList setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleList setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class ListPolicyResponseBodyPolicyListContentPortRuleList extends TeaModel {
        /**
         * <p>The end of the destination port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("DstPortEnd")
        public Integer dstPortEnd;

        /**
         * <p>The start of the destination port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
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
         * <p>8f3c3062-6c20-425d-8405-2bd1********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The action triggered if the rule is matched. Valid value:</p>
         * <ul>
         * <li><strong>drop</strong>: The traffic is discarded.</li>
         * </ul>
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
         * 
         * <strong>example:</strong>
         * <p>udp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <p>The sequence number that indicates the order for the rule to take effect. The value is an integer.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeqNo")
        public Integer seqNo;

        /**
         * <p>The end of the source port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("SrcPortEnd")
        public Integer srcPortEnd;

        /**
         * <p>The start of the source port range. Valid values: <strong>0</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SrcPortStart")
        public Integer srcPortStart;

        public static ListPolicyResponseBodyPolicyListContentPortRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyResponseBodyPolicyListContentPortRuleList self = new ListPolicyResponseBodyPolicyListContentPortRuleList();
            return TeaModel.build(map, self);
        }

        public ListPolicyResponseBodyPolicyListContentPortRuleList setDstPortEnd(Integer dstPortEnd) {
            this.dstPortEnd = dstPortEnd;
            return this;
        }
        public Integer getDstPortEnd() {
            return this.dstPortEnd;
        }

        public ListPolicyResponseBodyPolicyListContentPortRuleList setDstPortStart(Integer dstPortStart) {
            this.dstPortStart = dstPortStart;
            return this;
        }
        public Integer getDstPortStart() {
            return this.dstPortStart;
        }

        public ListPolicyResponseBodyPolicyListContentPortRuleList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPolicyResponseBodyPolicyListContentPortRuleList setMatchAction(String matchAction) {
            this.matchAction = matchAction;
            return this;
        }
        public String getMatchAction() {
            return this.matchAction;
        }

        public ListPolicyResponseBodyPolicyListContentPortRuleList setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public ListPolicyResponseBodyPolicyListContentPortRuleList setSeqNo(Integer seqNo) {
            this.seqNo = seqNo;
            return this;
        }
        public Integer getSeqNo() {
            return this.seqNo;
        }

        public ListPolicyResponseBodyPolicyListContentPortRuleList setSrcPortEnd(Integer srcPortEnd) {
            this.srcPortEnd = srcPortEnd;
            return this;
        }
        public Integer getSrcPortEnd() {
            return this.srcPortEnd;
        }

        public ListPolicyResponseBodyPolicyListContentPortRuleList setSrcPortStart(Integer srcPortStart) {
            this.srcPortStart = srcPortStart;
            return this;
        }
        public Integer getSrcPortStart() {
            return this.srcPortStart;
        }

    }

    public static class ListPolicyResponseBodyPolicyListContentSourceBlockList extends TeaModel {
        /**
         * <p>The validity period of the blacklist to which the source IP address is added. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("BlockExpireSeconds")
        public Integer blockExpireSeconds;

        /**
         * <p>The statistical period during which the system collects data on source IP addresses to determine whether to add the source IP addresses to the blacklist. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("EverySeconds")
        public Integer everySeconds;

        /**
         * <p>The number of times that the source IP address exceeds a limit in a statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ExceedLimitTimes")
        public Integer exceedLimitTimes;

        /**
         * <p>The type of the source rate limit. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: the PPS limit on source IP addresses.</li>
         * <li><strong>4</strong>: the bandwidth limit on source IP addresses.</li>
         * <li><strong>5</strong>: the PPS limit on source SYN packets.</li>
         * <li><strong>6</strong>: the bandwidth limit on source SYN packets.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static ListPolicyResponseBodyPolicyListContentSourceBlockList build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyResponseBodyPolicyListContentSourceBlockList self = new ListPolicyResponseBodyPolicyListContentSourceBlockList();
            return TeaModel.build(map, self);
        }

        public ListPolicyResponseBodyPolicyListContentSourceBlockList setBlockExpireSeconds(Integer blockExpireSeconds) {
            this.blockExpireSeconds = blockExpireSeconds;
            return this;
        }
        public Integer getBlockExpireSeconds() {
            return this.blockExpireSeconds;
        }

        public ListPolicyResponseBodyPolicyListContentSourceBlockList setEverySeconds(Integer everySeconds) {
            this.everySeconds = everySeconds;
            return this;
        }
        public Integer getEverySeconds() {
            return this.everySeconds;
        }

        public ListPolicyResponseBodyPolicyListContentSourceBlockList setExceedLimitTimes(Integer exceedLimitTimes) {
            this.exceedLimitTimes = exceedLimitTimes;
            return this;
        }
        public Integer getExceedLimitTimes() {
            return this.exceedLimitTimes;
        }

        public ListPolicyResponseBodyPolicyListContentSourceBlockList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class ListPolicyResponseBodyPolicyListContentSourceLimit extends TeaModel {
        /**
         * <p>The bandwidth limit on source IP addresses. Unit: bytes per second.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Bps")
        public Integer bps;

        /**
         * <p>The packets per second (PPS) limit on source IP addresses.</p>
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
         * <p>The PPS limit on source SYN packets.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("SynPps")
        public Integer synPps;

        public static ListPolicyResponseBodyPolicyListContentSourceLimit build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyResponseBodyPolicyListContentSourceLimit self = new ListPolicyResponseBodyPolicyListContentSourceLimit();
            return TeaModel.build(map, self);
        }

        public ListPolicyResponseBodyPolicyListContentSourceLimit setBps(Integer bps) {
            this.bps = bps;
            return this;
        }
        public Integer getBps() {
            return this.bps;
        }

        public ListPolicyResponseBodyPolicyListContentSourceLimit setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public ListPolicyResponseBodyPolicyListContentSourceLimit setSynBps(Integer synBps) {
            this.synBps = synBps;
            return this;
        }
        public Integer getSynBps() {
            return this.synBps;
        }

        public ListPolicyResponseBodyPolicyListContentSourceLimit setSynPps(Integer synPps) {
            this.synPps = synPps;
            return this;
        }
        public Integer getSynPps() {
            return this.synPps;
        }

    }

    public static class ListPolicyResponseBodyPolicyListContent extends TeaModel {
        /**
         * <p>The validity period of the IP address blacklist. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1716878000</p>
         */
        @NameInMap("BlackIpListExpireAt")
        public Long blackIpListExpireAt;

        /**
         * <p>Indicates whether ICMP blocking is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableDropIcmp")
        public Boolean enableDropIcmp;

        /**
         * <p>Indicates whether intelligent protection is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIntelligence")
        public Boolean enableIntelligence;

        /**
         * <p>Indicates whether port-specific mitigation is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableL4Defense")
        public Boolean enableL4Defense;

        /**
         * <p>The byte-match filter rules.</p>
         */
        @NameInMap("FingerPrintRuleList")
        public java.util.List<ListPolicyResponseBodyPolicyListContentFingerPrintRuleList> fingerPrintRuleList;

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
        public java.util.List<ListPolicyResponseBodyPolicyListContentL4RuleList> l4RuleList;

        /**
         * <p>The port blocking rules.</p>
         */
        @NameInMap("PortRuleList")
        public java.util.List<ListPolicyResponseBodyPolicyListContentPortRuleList> portRuleList;

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
        public java.util.List<ListPolicyResponseBodyPolicyListContentSourceBlockList> sourceBlockList;

        /**
         * <p>The settings for source rate limiting.</p>
         */
        @NameInMap("SourceLimit")
        public ListPolicyResponseBodyPolicyListContentSourceLimit sourceLimit;

        /**
         * <p>Indicates whether back-to-origin CIDR blocks of Anti-DDoS Proxy are added to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("WhitenGfbrNets")
        public Boolean whitenGfbrNets;

        public static ListPolicyResponseBodyPolicyListContent build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyResponseBodyPolicyListContent self = new ListPolicyResponseBodyPolicyListContent();
            return TeaModel.build(map, self);
        }

        public ListPolicyResponseBodyPolicyListContent setBlackIpListExpireAt(Long blackIpListExpireAt) {
            this.blackIpListExpireAt = blackIpListExpireAt;
            return this;
        }
        public Long getBlackIpListExpireAt() {
            return this.blackIpListExpireAt;
        }

        public ListPolicyResponseBodyPolicyListContent setEnableDropIcmp(Boolean enableDropIcmp) {
            this.enableDropIcmp = enableDropIcmp;
            return this;
        }
        public Boolean getEnableDropIcmp() {
            return this.enableDropIcmp;
        }

        public ListPolicyResponseBodyPolicyListContent setEnableIntelligence(Boolean enableIntelligence) {
            this.enableIntelligence = enableIntelligence;
            return this;
        }
        public Boolean getEnableIntelligence() {
            return this.enableIntelligence;
        }

        public ListPolicyResponseBodyPolicyListContent setEnableL4Defense(Boolean enableL4Defense) {
            this.enableL4Defense = enableL4Defense;
            return this;
        }
        public Boolean getEnableL4Defense() {
            return this.enableL4Defense;
        }

        public ListPolicyResponseBodyPolicyListContent setFingerPrintRuleList(java.util.List<ListPolicyResponseBodyPolicyListContentFingerPrintRuleList> fingerPrintRuleList) {
            this.fingerPrintRuleList = fingerPrintRuleList;
            return this;
        }
        public java.util.List<ListPolicyResponseBodyPolicyListContentFingerPrintRuleList> getFingerPrintRuleList() {
            return this.fingerPrintRuleList;
        }

        public ListPolicyResponseBodyPolicyListContent setIntelligenceLevel(String intelligenceLevel) {
            this.intelligenceLevel = intelligenceLevel;
            return this;
        }
        public String getIntelligenceLevel() {
            return this.intelligenceLevel;
        }

        public ListPolicyResponseBodyPolicyListContent setL4RuleList(java.util.List<ListPolicyResponseBodyPolicyListContentL4RuleList> l4RuleList) {
            this.l4RuleList = l4RuleList;
            return this;
        }
        public java.util.List<ListPolicyResponseBodyPolicyListContentL4RuleList> getL4RuleList() {
            return this.l4RuleList;
        }

        public ListPolicyResponseBodyPolicyListContent setPortRuleList(java.util.List<ListPolicyResponseBodyPolicyListContentPortRuleList> portRuleList) {
            this.portRuleList = portRuleList;
            return this;
        }
        public java.util.List<ListPolicyResponseBodyPolicyListContentPortRuleList> getPortRuleList() {
            return this.portRuleList;
        }

        public ListPolicyResponseBodyPolicyListContent setReflectBlockUdpPortList(java.util.List<Integer> reflectBlockUdpPortList) {
            this.reflectBlockUdpPortList = reflectBlockUdpPortList;
            return this;
        }
        public java.util.List<Integer> getReflectBlockUdpPortList() {
            return this.reflectBlockUdpPortList;
        }

        public ListPolicyResponseBodyPolicyListContent setRegionBlockCountryList(java.util.List<Integer> regionBlockCountryList) {
            this.regionBlockCountryList = regionBlockCountryList;
            return this;
        }
        public java.util.List<Integer> getRegionBlockCountryList() {
            return this.regionBlockCountryList;
        }

        public ListPolicyResponseBodyPolicyListContent setRegionBlockProvinceList(java.util.List<Integer> regionBlockProvinceList) {
            this.regionBlockProvinceList = regionBlockProvinceList;
            return this;
        }
        public java.util.List<Integer> getRegionBlockProvinceList() {
            return this.regionBlockProvinceList;
        }

        public ListPolicyResponseBodyPolicyListContent setSourceBlockList(java.util.List<ListPolicyResponseBodyPolicyListContentSourceBlockList> sourceBlockList) {
            this.sourceBlockList = sourceBlockList;
            return this;
        }
        public java.util.List<ListPolicyResponseBodyPolicyListContentSourceBlockList> getSourceBlockList() {
            return this.sourceBlockList;
        }

        public ListPolicyResponseBodyPolicyListContent setSourceLimit(ListPolicyResponseBodyPolicyListContentSourceLimit sourceLimit) {
            this.sourceLimit = sourceLimit;
            return this;
        }
        public ListPolicyResponseBodyPolicyListContentSourceLimit getSourceLimit() {
            return this.sourceLimit;
        }

        public ListPolicyResponseBodyPolicyListContent setWhitenGfbrNets(Boolean whitenGfbrNets) {
            this.whitenGfbrNets = whitenGfbrNets;
            return this;
        }
        public Boolean getWhitenGfbrNets() {
            return this.whitenGfbrNets;
        }

    }

    public static class ListPolicyResponseBodyPolicyList extends TeaModel {
        /**
         * <p>The number of protected objects that are added to the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AttachedCount")
        public Integer attachedCount;

        /**
         * <p>The content of the policy.</p>
         */
        @NameInMap("Content")
        public ListPolicyResponseBodyPolicyListContent content;

        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>877afbdf-3982-4d36-9886-f043********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test**</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The remarks of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The type of the policy. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: the default mitigation policy.</li>
         * <li><strong>l3</strong>: IP-specific mitigation policies.</li>
         * <li><strong>l4</strong>: port-specific mitigation policies.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>l3</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListPolicyResponseBodyPolicyList build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyResponseBodyPolicyList self = new ListPolicyResponseBodyPolicyList();
            return TeaModel.build(map, self);
        }

        public ListPolicyResponseBodyPolicyList setAttachedCount(Integer attachedCount) {
            this.attachedCount = attachedCount;
            return this;
        }
        public Integer getAttachedCount() {
            return this.attachedCount;
        }

        public ListPolicyResponseBodyPolicyList setContent(ListPolicyResponseBodyPolicyListContent content) {
            this.content = content;
            return this;
        }
        public ListPolicyResponseBodyPolicyListContent getContent() {
            return this.content;
        }

        public ListPolicyResponseBodyPolicyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPolicyResponseBodyPolicyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPolicyResponseBodyPolicyList setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListPolicyResponseBodyPolicyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
