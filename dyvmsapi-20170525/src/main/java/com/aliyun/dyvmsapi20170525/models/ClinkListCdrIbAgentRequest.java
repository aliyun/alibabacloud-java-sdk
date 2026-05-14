// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListCdrIbAgentRequest extends TeaModel {
    /**
     * <p>及时应答。取值范围如下： 0: 否 1: 是 默认全部</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AgentAnswerInTime")
    public Long agentAnswerInTime;

    /**
     * <p>通话时长范围查询最小值，和bridgeDurationEnd配合使用</p>
     * 
     * <strong>example:</strong>
     * <p>25</p>
     */
    @NameInMap("BridgeDuration")
    public Long bridgeDuration;

    /**
     * <p>通话时长范围查询最大值</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("BridgeDurationEnd")
    public Long bridgeDurationEnd;

    /**
     * <p>接听时间，时间戳格式精确到秒。</p>
     * 
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("BridgeTime")
    public Long bridgeTime;

    /**
     * <p>接听时间查询截止，时间戳格式精确到秒。</p>
     * 
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("BridgeTimeEnd")
    public Long bridgeTimeEnd;

    /**
     * <p>座席号码</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ClientNumber")
    public String clientNumber;

    /**
     * <p>座席号</p>
     * 
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("Cno")
    public String cno;

    /**
     * <p>客户号码</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("CustomerNumber")
    public String customerNumber;

    /**
     * <p>结束时间，时间戳格式精确到秒。</p>
     * 
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>结束时间查询截止，时间戳格式精确到秒。</p>
     * 
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("EndTimeEnd")
    public Long endTimeEnd;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8004970</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>是否隐藏号码。 0: 不隐藏，1: 中间四位，2: 最后八位，3: 全部号码，4: 最后四位。默认值为 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HiddenType")
    public Long hiddenType;

    /**
     * <p>热线别名</p>
     * 
     * <strong>example:</strong>
     * <p>HotlineName</p>
     */
    @NameInMap("HotlineName")
    public String hotlineName;

    /**
     * <p>查询条数，范围 10-100。默认值为 10。注：limit + offset 不允许超过100000</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public Long limit;

    /**
     * <p>通话记录唯一标识</p>
     * 
     * <strong>example:</strong>
     * <p>uniq_1-162046xxxx.12</p>
     */
    @NameInMap("MainUniqueId")
    public String mainUniqueId;

    /**
     * <p>偏移量，范围 0-99990。默认值为 0。注：limit + offset 不允许超过100000</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public Long offset;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>队列号</p>
     * 
     * <strong>example:</strong>
     * <p>2211</p>
     */
    @NameInMap("Qno")
    public String qno;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>滚动查询ID。配合scrollSearch使用，第一次查询时不需要传递此参数，后续查询可从返回列表中取值，并传参数。当scrollId为空时，代表滚动查询结束。</p>
     * 
     * <strong>example:</strong>
     * <p>ScrollId</p>
     */
    @NameInMap("ScrollId")
    public String scrollId;

    /**
     * <p>开始时间，时间戳格式精确到秒。默认值取当前月份第一天</p>
     * 
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>开始时间查询截止，时间戳格式精确到秒，开始时间和结束时间跨度不能超过一个月。默认值取当前时间</p>
     * 
     * <strong>example:</strong>
     * <p>1775024775</p>
     */
    @NameInMap("StartTimeEnd")
    public Long startTimeEnd;

    public static ClinkListCdrIbAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkListCdrIbAgentRequest self = new ClinkListCdrIbAgentRequest();
        return TeaModel.build(map, self);
    }

    public ClinkListCdrIbAgentRequest setAgentAnswerInTime(Long agentAnswerInTime) {
        this.agentAnswerInTime = agentAnswerInTime;
        return this;
    }
    public Long getAgentAnswerInTime() {
        return this.agentAnswerInTime;
    }

    public ClinkListCdrIbAgentRequest setBridgeDuration(Long bridgeDuration) {
        this.bridgeDuration = bridgeDuration;
        return this;
    }
    public Long getBridgeDuration() {
        return this.bridgeDuration;
    }

    public ClinkListCdrIbAgentRequest setBridgeDurationEnd(Long bridgeDurationEnd) {
        this.bridgeDurationEnd = bridgeDurationEnd;
        return this;
    }
    public Long getBridgeDurationEnd() {
        return this.bridgeDurationEnd;
    }

    public ClinkListCdrIbAgentRequest setBridgeTime(Long bridgeTime) {
        this.bridgeTime = bridgeTime;
        return this;
    }
    public Long getBridgeTime() {
        return this.bridgeTime;
    }

    public ClinkListCdrIbAgentRequest setBridgeTimeEnd(Long bridgeTimeEnd) {
        this.bridgeTimeEnd = bridgeTimeEnd;
        return this;
    }
    public Long getBridgeTimeEnd() {
        return this.bridgeTimeEnd;
    }

    public ClinkListCdrIbAgentRequest setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
        return this;
    }
    public String getClientNumber() {
        return this.clientNumber;
    }

    public ClinkListCdrIbAgentRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public ClinkListCdrIbAgentRequest setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public ClinkListCdrIbAgentRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ClinkListCdrIbAgentRequest setEndTimeEnd(Long endTimeEnd) {
        this.endTimeEnd = endTimeEnd;
        return this;
    }
    public Long getEndTimeEnd() {
        return this.endTimeEnd;
    }

    public ClinkListCdrIbAgentRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkListCdrIbAgentRequest setHiddenType(Long hiddenType) {
        this.hiddenType = hiddenType;
        return this;
    }
    public Long getHiddenType() {
        return this.hiddenType;
    }

    public ClinkListCdrIbAgentRequest setHotlineName(String hotlineName) {
        this.hotlineName = hotlineName;
        return this;
    }
    public String getHotlineName() {
        return this.hotlineName;
    }

    public ClinkListCdrIbAgentRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ClinkListCdrIbAgentRequest setMainUniqueId(String mainUniqueId) {
        this.mainUniqueId = mainUniqueId;
        return this;
    }
    public String getMainUniqueId() {
        return this.mainUniqueId;
    }

    public ClinkListCdrIbAgentRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ClinkListCdrIbAgentRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkListCdrIbAgentRequest setQno(String qno) {
        this.qno = qno;
        return this;
    }
    public String getQno() {
        return this.qno;
    }

    public ClinkListCdrIbAgentRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkListCdrIbAgentRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClinkListCdrIbAgentRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public ClinkListCdrIbAgentRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ClinkListCdrIbAgentRequest setStartTimeEnd(Long startTimeEnd) {
        this.startTimeEnd = startTimeEnd;
        return this;
    }
    public Long getStartTimeEnd() {
        return this.startTimeEnd;
    }

}
