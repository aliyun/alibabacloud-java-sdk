// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListPolicyResponseBody extends TeaModel {
    /**
     * <p>The list of policies.</p>
     */
    @NameInMap("PolicyList")
    public java.util.List<ListPolicyResponseBodyPolicyList> policyList;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique identifier for each request. You can use the ID to troubleshoot issues.</p>
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
         * <p>The remarks of the rule.</p>
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
         * <p>2c0b09cd-a565-4481-9acb-418b********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The match action. Valid values:</p>
         * <ul>
         * <li><strong>accept</strong>: Allow traffic that matches the fingerprint.</li>
         * <li><strong>drop</strong>: Drop traffic that matches the fingerprint.</li>
         * <li><strong>ip_rate</strong>: Apply rate limiting to the source IP address of traffic that matches the fingerprint. The rate limit is specified by the <strong>RateValue</strong> parameter.</li>
         * <li><strong>session_rate</strong>: Apply rate limiting to the source session of traffic that matches the fingerprint. The rate limit is specified by the <strong>RateValue</strong> parameter.</li>
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
         * <p>The detection payload, represented as a hexadecimal string.</p>
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
         * <p>The rate limit. Valid values: <strong>1</strong> to <strong>100000</strong>.</p>
         * <blockquote>
         * <p>This parameter is required when the match action is source IP rate limiting or source session rate limiting (<strong>MatchAction</strong> is <strong>ip_rate</strong> or <strong>session_rate</strong>).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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
         * <p>The priority of the rule, represented as an integer.</p>
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

        public static ListPolicyResponseBodyPolicyListContentFingerPrintRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyResponseBodyPolicyListContentFingerPrintRuleList self = new ListPolicyResponseBodyPolicyListContentFingerPrintRuleList();
            return TeaModel.build(map, self);
        }

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
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

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setMode(Integer mode) {
            this.mode = mode;
            return this;
        }
        public Integer getMode() {
            return this.mode;
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

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
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

        public ListPolicyResponseBodyPolicyListContentFingerPrintRuleList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class ListPolicyResponseBodyPolicyListContentL4RuleListConditionListOffset extends TeaModel {
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

        public static ListPolicyResponseBodyPolicyListContentL4RuleListConditionListOffset build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyResponseBodyPolicyListContentL4RuleListConditionListOffset self = new ListPolicyResponseBodyPolicyListContentL4RuleListConditionListOffset();
            return TeaModel.build(map, self);
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleListConditionListOffset setEnd(Integer end) {
            this.end = end;
            return this;
        }
        public Integer getEnd() {
            return this.end;
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleListConditionListOffset setStart(Integer start) {
            this.start = start;
            return this;
        }
        public Integer getStart() {
            return this.start;
        }

    }

    public static class ListPolicyResponseBodyPolicyListContentL4RuleListConditionList extends TeaModel {
        /**
         * <p>The detection content.</p>
         * <blockquote>
         * <p>If the rule type is <strong>char</strong>, the value must be an ASCII string. If the rule type is <strong>hex</strong>, the value must be a hexadecimal string. Maximum length: 2048.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Arg")
        public String arg;

        /**
         * <p>The match content.</p>
         * <ol>
         * <li>When <strong>Encode</strong> is set to <strong>str</strong>, the following requirements must be met:</li>
         * </ol>
         * <ul>
         * <li><p>The length of <strong>Content</strong> cannot exceed 1500.</p>
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
         * <li><p>The length of <strong>Content</strong> cannot exceed 3000.</p>
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
         * <p>32</p>
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
         * <p>The match range.</p>
         */
        @NameInMap("Offset")
        public ListPolicyResponseBodyPolicyListContentL4RuleListConditionListOffset offset;

        /**
         * <p>The match pattern. Valid values:</p>
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
         * <p>The start position of detection. Valid values: <strong>0</strong> to <strong>2047</strong>.</p>
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

        public ListPolicyResponseBodyPolicyListContentL4RuleListConditionList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleListConditionList setDepth(Integer depth) {
            this.depth = depth;
            return this;
        }
        public Integer getDepth() {
            return this.depth;
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleListConditionList setEncode(String encode) {
            this.encode = encode;
            return this;
        }
        public String getEncode() {
            return this.encode;
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleListConditionList setOffset(ListPolicyResponseBodyPolicyListContentL4RuleListConditionListOffset offset) {
            this.offset = offset;
            return this;
        }
        public ListPolicyResponseBodyPolicyListContentL4RuleListConditionListOffset getOffset() {
            return this.offset;
        }

        public ListPolicyResponseBodyPolicyListContentL4RuleListConditionList setPattern(String pattern) {
            this.pattern = pattern;
            return this;
        }
        public String getPattern() {
            return this.pattern;
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
         * <p>The action. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: Drop.</li>
         * </ul>
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
        public java.util.List<ListPolicyResponseBodyPolicyListContentL4RuleListConditionList> conditionList;

        /**
         * <p>The minimum number of bytes in a session flow to trigger rule matching. Valid values: <strong>0</strong> to <strong>2048</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Limited")
        public Integer limited;

        /**
         * <p>The logical operator. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Execute the action when the rule is matched.</p>
         * </li>
         * <li><p><strong>1</strong>: Execute the action when the rule is not matched.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Match")
        public String match;

        /**
         * <p>The rule type. Valid values:</p>
         * <ul>
         * <li><p><strong>char</strong>: string match.</p>
         * </li>
         * <li><p><strong>hex</strong>: hexadecimal match.</p>
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
         * 
         * <strong>example:</strong>
         * <p>test**</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The rule priority.</p>
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
         * <p>8f3c3062-6c20-425d-8405-2bd1********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The match action. Valid values:</p>
         * <ul>
         * <li><strong>drop</strong>: Drop.</li>
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
         * <p>The priority of the rule, represented as an integer.</p>
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

    public static class ListPolicyResponseBodyPolicyListContentSipDefense extends TeaModel {
        /**
         * <p>Indicates whether SIP protection is enabled. Valid values:</p>
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
         * <p>Indicates whether SIP defense mode is enabled.</p>
         */
        @NameInMap("SipDefend")
        public Boolean sipDefend;

        /**
         * <p>Indicates whether SIP learning mode is enabled.</p>
         */
        @NameInMap("SipLearn")
        public Boolean sipLearn;

        /**
         * <p>Indicates whether the SIP source rate limiting module is enabled.</p>
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
         * <p>The SIP source rate limit value (PPS).</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SipRate")
        public Long sipRate;

        /**
         * <p>The SIP activation threshold (Mbit/s).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SipStartMbps")
        public Long sipStartMbps;

        /**
         * <p>The SIP activation threshold (PPS).</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("SipStartPps")
        public Long sipStartPps;

        public static ListPolicyResponseBodyPolicyListContentSipDefense build(java.util.Map<String, ?> map) throws Exception {
            ListPolicyResponseBodyPolicyListContentSipDefense self = new ListPolicyResponseBodyPolicyListContentSipDefense();
            return TeaModel.build(map, self);
        }

        public ListPolicyResponseBodyPolicyListContentSipDefense setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListPolicyResponseBodyPolicyListContentSipDefense setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListPolicyResponseBodyPolicyListContentSipDefense setSipDefend(Boolean sipDefend) {
            this.sipDefend = sipDefend;
            return this;
        }
        public Boolean getSipDefend() {
            return this.sipDefend;
        }

        public ListPolicyResponseBodyPolicyListContentSipDefense setSipLearn(Boolean sipLearn) {
            this.sipLearn = sipLearn;
            return this;
        }
        public Boolean getSipLearn() {
            return this.sipLearn;
        }

        public ListPolicyResponseBodyPolicyListContentSipDefense setSipModule(Boolean sipModule) {
            this.sipModule = sipModule;
            return this;
        }
        public Boolean getSipModule() {
            return this.sipModule;
        }

        public ListPolicyResponseBodyPolicyListContentSipDefense setSipPort(String sipPort) {
            this.sipPort = sipPort;
            return this;
        }
        public String getSipPort() {
            return this.sipPort;
        }

        public ListPolicyResponseBodyPolicyListContentSipDefense setSipRate(Long sipRate) {
            this.sipRate = sipRate;
            return this;
        }
        public Long getSipRate() {
            return this.sipRate;
        }

        public ListPolicyResponseBodyPolicyListContentSipDefense setSipStartMbps(Long sipStartMbps) {
            this.sipStartMbps = sipStartMbps;
            return this;
        }
        public Long getSipStartMbps() {
            return this.sipStartMbps;
        }

        public ListPolicyResponseBodyPolicyListContentSipDefense setSipStartPps(Long sipStartPps) {
            this.sipStartPps = sipStartPps;
            return this;
        }
        public Long getSipStartPps() {
            return this.sipStartPps;
        }

    }

    public static class ListPolicyResponseBodyPolicyListContentSourceBlockList extends TeaModel {
        /**
         * <p>The duration for which the source IP address is added to the blacklist. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("BlockExpireSeconds")
        public Integer blockExpireSeconds;

        /**
         * <p>The statistical period for source rate limiting and blacklisting. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("EverySeconds")
        public Integer everySeconds;

        /**
         * <p>The number of times that the source IP address exceeds the rate limit within a single statistical period.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ExceedLimitTimes")
        public Integer exceedLimitTimes;

        /**
         * <p>The type of source rate limiting. Valid values:</p>
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
         * <p>The expiration time of the IP blacklist. The value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1716878000</p>
         */
        @NameInMap("BlackIpListExpireAt")
        public Long blackIpListExpireAt;

        /**
         * <p>Indicates whether ICMP Blocking is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableDropIcmp")
        public Boolean enableDropIcmp;

        /**
         * <p>Indicates whether AI-based intelligent analysis is enabled.</p>
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
         * <p>The list of Byte-Match Filter rules.</p>
         */
        @NameInMap("FingerPrintRuleList")
        public java.util.List<ListPolicyResponseBodyPolicyListContentFingerPrintRuleList> fingerPrintRuleList;

        /**
         * <p>The protection level of AI-based intelligent analysis. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: Normal.</li>
         * <li><strong>hard</strong>: Strict.</li>
         * <li><strong>weak</strong>: Loose.</li>
         * </ul>
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
        public java.util.List<ListPolicyResponseBodyPolicyListContentL4RuleList> l4RuleList;

        /**
         * <p>The list of Port Blocking rules.</p>
         */
        @NameInMap("PortRuleList")
        public java.util.List<ListPolicyResponseBodyPolicyListContentPortRuleList> portRuleList;

        /**
         * <p>The version of the port-specific mitigation policy. Valid values:</p>
         * <ul>
         * <li><strong>Empty</strong>: the default surf protection engine policy.</li>
         * <li><strong>2</strong>: the new stream protection engine policy.<blockquote>
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

        /**
         * <p>The list of ports filtered by the reflection attack prevention feature.</p>
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
        public ListPolicyResponseBodyPolicyListContentSipDefense sipDefense;

        /**
         * <p>The list of source rate limiting and blacklisting rules.</p>
         */
        @NameInMap("SourceBlockList")
        public java.util.List<ListPolicyResponseBodyPolicyListContentSourceBlockList> sourceBlockList;

        /**
         * <p>The source rate limiting configuration.</p>
         */
        @NameInMap("SourceLimit")
        public ListPolicyResponseBodyPolicyListContentSourceLimit sourceLimit;

        /**
         * <p>Indicates whether the back-to-origin CIDR blocks of Anti-DDoS Pro and Anti-DDoS Premium (the Chinese mainland &amp; outside the Chinese mainland) are added to the whitelist.</p>
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

        public ListPolicyResponseBodyPolicyListContent setPortVersion(String portVersion) {
            this.portVersion = portVersion;
            return this;
        }
        public String getPortVersion() {
            return this.portVersion;
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

        public ListPolicyResponseBodyPolicyListContent setSipDefense(ListPolicyResponseBodyPolicyListContentSipDefense sipDefense) {
            this.sipDefense = sipDefense;
            return this;
        }
        public ListPolicyResponseBodyPolicyListContentSipDefense getSipDefense() {
            return this.sipDefense;
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
         * <p>The number of protected objects that are associated with the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AttachedCount")
        public Integer attachedCount;

        /**
         * <p>The policy content.</p>
         */
        @NameInMap("Content")
        public ListPolicyResponseBodyPolicyListContent content;

        /**
         * <p>The policy ID.</p>
         * 
         * <strong>example:</strong>
         * <p>877afbdf-3982-4d36-9886-f043********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The policy name.</p>
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
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: default mitigation policy.</li>
         * <li><strong>l3</strong>: IP-specific mitigation policy.</li>
         * <li><strong>l4</strong>: port-specific mitigation policy.</li>
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
