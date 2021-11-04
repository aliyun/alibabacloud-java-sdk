// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class ListUserPointRecordsRequest extends TeaModel {
    @NameInMap("AccountType")
    public String accountType;

    // 业务ID
    @NameInMap("BizId")
    public String bizId;

    // 发放说明
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    // 操作
    @NameInMap("PointAction")
    public String pointAction;

    @NameInMap("PointActions")
    public String pointActions;

    // 规则ID
    @NameInMap("RecordId")
    public String recordId;

    // 数额
    @NameInMap("RuleId")
    public String ruleId;

    // 发放主题
    @NameInMap("StartTime")
    public Long startTime;

    // 业务方用户ID
    @NameInMap("ThirdPartyUserId")
    public String thirdPartyUserId;

    public static ListUserPointRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserPointRecordsRequest self = new ListUserPointRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserPointRecordsRequest setAccountType(String accountType) {
        this.accountType = accountType;
        return this;
    }
    public String getAccountType() {
        return this.accountType;
    }

    public ListUserPointRecordsRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public ListUserPointRecordsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListUserPointRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListUserPointRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUserPointRecordsRequest setPointAction(String pointAction) {
        this.pointAction = pointAction;
        return this;
    }
    public String getPointAction() {
        return this.pointAction;
    }

    public ListUserPointRecordsRequest setPointActions(String pointActions) {
        this.pointActions = pointActions;
        return this;
    }
    public String getPointActions() {
        return this.pointActions;
    }

    public ListUserPointRecordsRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

    public ListUserPointRecordsRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public ListUserPointRecordsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListUserPointRecordsRequest setThirdPartyUserId(String thirdPartyUserId) {
        this.thirdPartyUserId = thirdPartyUserId;
        return this;
    }
    public String getThirdPartyUserId() {
        return this.thirdPartyUserId;
    }

}
