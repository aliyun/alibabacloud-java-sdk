// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DescribeUserProduceResponseBody extends TeaModel {
    @NameInMap("Status")
    public Integer status;

    @NameInMap("OrderPrice")
    public String orderPrice;

    @NameInMap("SolutionBizId")
    public String solutionBizId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("BizId")
    public String bizId;

    @NameInMap("PartnerCode")
    public String partnerCode;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("IntentionBizId")
    public String intentionBizId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("OrderId")
    public String orderId;

    public static DescribeUserProduceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserProduceResponseBody self = new DescribeUserProduceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserProduceResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public DescribeUserProduceResponseBody setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
        return this;
    }
    public String getOrderPrice() {
        return this.orderPrice;
    }

    public DescribeUserProduceResponseBody setSolutionBizId(String solutionBizId) {
        this.solutionBizId = solutionBizId;
        return this;
    }
    public String getSolutionBizId() {
        return this.solutionBizId;
    }

    public DescribeUserProduceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeUserProduceResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DescribeUserProduceResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public DescribeUserProduceResponseBody setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
        return this;
    }
    public String getPartnerCode() {
        return this.partnerCode;
    }

    public DescribeUserProduceResponseBody setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public DescribeUserProduceResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeUserProduceResponseBody setIntentionBizId(String intentionBizId) {
        this.intentionBizId = intentionBizId;
        return this;
    }
    public String getIntentionBizId() {
        return this.intentionBizId;
    }

    public DescribeUserProduceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeUserProduceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeUserProduceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserProduceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeUserProduceResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public DescribeUserProduceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

}
