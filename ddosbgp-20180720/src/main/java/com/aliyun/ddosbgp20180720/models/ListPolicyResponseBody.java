// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class ListPolicyResponseBody extends TeaModel {
    @NameInMap("PolicyList")
    public java.util.List<ListPolicyResponseBodyPolicyList> policyList;

    /**
     * <strong>example:</strong>
     * <p>B4B379C2-9319-4C6B-B579-FE36831B09F4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("DstPortEnd")
        public Integer dstPortEnd;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DstPortStart")
        public Integer dstPortStart;

        /**
         * <strong>example:</strong>
         * <p>2c0b09cd-a565-4481-9acb-418b********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>drop</p>
         */
        @NameInMap("MatchAction")
        public String matchAction;

        /**
         * <strong>example:</strong>
         * <p>1500</p>
         */
        @NameInMap("MaxPktLen")
        public Integer maxPktLen;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MinPktLen")
        public Integer minPktLen;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Offset")
        public Integer offset;

        /**
         * <strong>example:</strong>
         * <p>abcd</p>
         */
        @NameInMap("PayloadBytes")
        public String payloadBytes;

        /**
         * <strong>example:</strong>
         * <p>udp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RateValue")
        public Integer rateValue;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeqNo")
        public Integer seqNo;

        /**
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("SrcPortEnd")
        public Integer srcPortEnd;

        /**
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
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Arg")
        public String arg;

        /**
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Depth")
        public Integer depth;

        /**
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
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Action")
        public String action;

        @NameInMap("ConditionList")
        public java.util.List<ListPolicyResponseBodyPolicyListContentL4RuleListConditionList> conditionList;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Limited")
        public Integer limited;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Match")
        public String match;

        /**
         * <strong>example:</strong>
         * <p>char</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>test**</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("DstPortEnd")
        public Integer dstPortEnd;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DstPortStart")
        public Integer dstPortStart;

        /**
         * <strong>example:</strong>
         * <p>8f3c3062-6c20-425d-8405-2bd1********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>drop</p>
         */
        @NameInMap("MatchAction")
        public String matchAction;

        /**
         * <strong>example:</strong>
         * <p>udp</p>
         */
        @NameInMap("Protocol")
        public String protocol;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SeqNo")
        public Integer seqNo;

        /**
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("SrcPortEnd")
        public Integer srcPortEnd;

        /**
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
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("BlockExpireSeconds")
        public Integer blockExpireSeconds;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("EverySeconds")
        public Integer everySeconds;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ExceedLimitTimes")
        public Integer exceedLimitTimes;

        /**
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
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("Bps")
        public Integer bps;

        /**
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("Pps")
        public Integer pps;

        /**
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("SynBps")
        public Integer synBps;

        /**
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
         * <strong>example:</strong>
         * <p>1716878000</p>
         */
        @NameInMap("BlackIpListExpireAt")
        public Long blackIpListExpireAt;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableDropIcmp")
        public Boolean enableDropIcmp;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIntelligence")
        public Boolean enableIntelligence;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableL4Defense")
        public Boolean enableL4Defense;

        @NameInMap("FingerPrintRuleList")
        public java.util.List<ListPolicyResponseBodyPolicyListContentFingerPrintRuleList> fingerPrintRuleList;

        /**
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("IntelligenceLevel")
        public String intelligenceLevel;

        @NameInMap("L4RuleList")
        public java.util.List<ListPolicyResponseBodyPolicyListContentL4RuleList> l4RuleList;

        @NameInMap("PortRuleList")
        public java.util.List<ListPolicyResponseBodyPolicyListContentPortRuleList> portRuleList;

        @NameInMap("ReflectBlockUdpPortList")
        public java.util.List<Integer> reflectBlockUdpPortList;

        @NameInMap("RegionBlockCountryList")
        public java.util.List<Integer> regionBlockCountryList;

        @NameInMap("RegionBlockProvinceList")
        public java.util.List<Integer> regionBlockProvinceList;

        @NameInMap("SourceBlockList")
        public java.util.List<ListPolicyResponseBodyPolicyListContentSourceBlockList> sourceBlockList;

        @NameInMap("SourceLimit")
        public ListPolicyResponseBodyPolicyListContentSourceLimit sourceLimit;

        /**
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
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AttachedCount")
        public Integer attachedCount;

        @NameInMap("Content")
        public ListPolicyResponseBodyPolicyListContent content;

        /**
         * <strong>example:</strong>
         * <p>877afbdf-3982-4d36-9886-f043********</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>test**</p>
         */
        @NameInMap("Name")
        public String name;

        /**
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

        public ListPolicyResponseBodyPolicyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
