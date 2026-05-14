// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class ClinkListCdrIbRequest extends TeaModel {
    /**
     * <p>通话时长范围查询最小值，和bridgeDurationEnd配合使用</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("BridgeDuration")
    public Long bridgeDuration;

    /**
     * <p>通话时长范围查询最大值</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
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
     * <p>座席电话</p>
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
     * <p>1111</p>
     */
    @NameInMap("Cnos")
    public String cnos;

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
     * <p>首呼座席</p>
     * 
     * <strong>example:</strong>
     * <p>1122</p>
     */
    @NameInMap("FirstCallCno")
    public String firstCallCno;

    /**
     * <p>首呼座席电话</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("FirstCallNumber")
    public String firstCallNumber;

    /**
     * <p>首呼队列</p>
     * 
     * <strong>example:</strong>
     * <p>2222</p>
     */
    @NameInMap("FirstCallQno")
    public String firstCallQno;

    /**
     * <p>是否隐藏号码。  0: 不隐藏，1: 中间四位，2: 最后八位，3: 全部号码，4: 最后四位。默认值为 0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("HiddenType")
    public Long hiddenType;

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
     * <p>1122</p>
     */
    @NameInMap("Qnos")
    public String qnos;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>滚动查询ID。配合scrollSearch使用，第一次查询时不需要传递此参数，后续查询可从返回列表中取值，并传参数。当scrollId为空时，代表滚动查询结束。</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ScrollId")
    public String scrollId;

    /**
     * <p>是否滚动查询。默认false，true代表使用滚动查询。</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("ScrollSearch")
    public String scrollSearch;

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

    /**
     * <p>接听状态。取值范围如下：  1: 人工接听  2: 人工未接听  3: 系统应答  4: 系统未应答  默认全部</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Statuses")
    public Long statuses;

    /**
     * <p>总时长范围查询最小值，和totalDurationEnd配合使用</p>
     * 
     * <strong>example:</strong>
     * <p>69</p>
     */
    @NameInMap("TotalDuration")
    public Long totalDuration;

    /**
     * <p>总时长范围查询最大值</p>
     * 
     * <strong>example:</strong>
     * <p>47</p>
     */
    @NameInMap("TotalDurationEnd")
    public Long totalDurationEnd;

    public static ClinkListCdrIbRequest build(java.util.Map<String, ?> map) throws Exception {
        ClinkListCdrIbRequest self = new ClinkListCdrIbRequest();
        return TeaModel.build(map, self);
    }

    public ClinkListCdrIbRequest setBridgeDuration(Long bridgeDuration) {
        this.bridgeDuration = bridgeDuration;
        return this;
    }
    public Long getBridgeDuration() {
        return this.bridgeDuration;
    }

    public ClinkListCdrIbRequest setBridgeDurationEnd(Long bridgeDurationEnd) {
        this.bridgeDurationEnd = bridgeDurationEnd;
        return this;
    }
    public Long getBridgeDurationEnd() {
        return this.bridgeDurationEnd;
    }

    public ClinkListCdrIbRequest setBridgeTime(Long bridgeTime) {
        this.bridgeTime = bridgeTime;
        return this;
    }
    public Long getBridgeTime() {
        return this.bridgeTime;
    }

    public ClinkListCdrIbRequest setBridgeTimeEnd(Long bridgeTimeEnd) {
        this.bridgeTimeEnd = bridgeTimeEnd;
        return this;
    }
    public Long getBridgeTimeEnd() {
        return this.bridgeTimeEnd;
    }

    public ClinkListCdrIbRequest setClientNumber(String clientNumber) {
        this.clientNumber = clientNumber;
        return this;
    }
    public String getClientNumber() {
        return this.clientNumber;
    }

    public ClinkListCdrIbRequest setCnos(String cnos) {
        this.cnos = cnos;
        return this;
    }
    public String getCnos() {
        return this.cnos;
    }

    public ClinkListCdrIbRequest setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    public ClinkListCdrIbRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ClinkListCdrIbRequest setEndTimeEnd(Long endTimeEnd) {
        this.endTimeEnd = endTimeEnd;
        return this;
    }
    public Long getEndTimeEnd() {
        return this.endTimeEnd;
    }

    public ClinkListCdrIbRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ClinkListCdrIbRequest setFirstCallCno(String firstCallCno) {
        this.firstCallCno = firstCallCno;
        return this;
    }
    public String getFirstCallCno() {
        return this.firstCallCno;
    }

    public ClinkListCdrIbRequest setFirstCallNumber(String firstCallNumber) {
        this.firstCallNumber = firstCallNumber;
        return this;
    }
    public String getFirstCallNumber() {
        return this.firstCallNumber;
    }

    public ClinkListCdrIbRequest setFirstCallQno(String firstCallQno) {
        this.firstCallQno = firstCallQno;
        return this;
    }
    public String getFirstCallQno() {
        return this.firstCallQno;
    }

    public ClinkListCdrIbRequest setHiddenType(Long hiddenType) {
        this.hiddenType = hiddenType;
        return this;
    }
    public Long getHiddenType() {
        return this.hiddenType;
    }

    public ClinkListCdrIbRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public ClinkListCdrIbRequest setMainUniqueId(String mainUniqueId) {
        this.mainUniqueId = mainUniqueId;
        return this;
    }
    public String getMainUniqueId() {
        return this.mainUniqueId;
    }

    public ClinkListCdrIbRequest setOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    public Long getOffset() {
        return this.offset;
    }

    public ClinkListCdrIbRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ClinkListCdrIbRequest setQnos(String qnos) {
        this.qnos = qnos;
        return this;
    }
    public String getQnos() {
        return this.qnos;
    }

    public ClinkListCdrIbRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ClinkListCdrIbRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClinkListCdrIbRequest setScrollId(String scrollId) {
        this.scrollId = scrollId;
        return this;
    }
    public String getScrollId() {
        return this.scrollId;
    }

    public ClinkListCdrIbRequest setScrollSearch(String scrollSearch) {
        this.scrollSearch = scrollSearch;
        return this;
    }
    public String getScrollSearch() {
        return this.scrollSearch;
    }

    public ClinkListCdrIbRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ClinkListCdrIbRequest setStartTimeEnd(Long startTimeEnd) {
        this.startTimeEnd = startTimeEnd;
        return this;
    }
    public Long getStartTimeEnd() {
        return this.startTimeEnd;
    }

    public ClinkListCdrIbRequest setStatuses(Long statuses) {
        this.statuses = statuses;
        return this;
    }
    public Long getStatuses() {
        return this.statuses;
    }

    public ClinkListCdrIbRequest setTotalDuration(Long totalDuration) {
        this.totalDuration = totalDuration;
        return this;
    }
    public Long getTotalDuration() {
        return this.totalDuration;
    }

    public ClinkListCdrIbRequest setTotalDurationEnd(Long totalDurationEnd) {
        this.totalDurationEnd = totalDurationEnd;
        return this;
    }
    public Long getTotalDurationEnd() {
        return this.totalDurationEnd;
    }

}
