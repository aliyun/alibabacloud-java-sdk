// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSubscriptionInstanceAlertResponseBody extends TeaModel {
    @NameInMap("ErrorAlertPhone")
    public String errorAlertPhone;

    @NameInMap("SubscriptionInstanceName")
    public String subscriptionInstanceName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DelayAlertPhone")
    public String delayAlertPhone;

    @NameInMap("ErrorAlertStatus")
    public String errorAlertStatus;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("SubscriptionInstanceID")
    public String subscriptionInstanceID;

    @NameInMap("DelayAlertStatus")
    public String delayAlertStatus;

    @NameInMap("Success")
    public String success;

    @NameInMap("DelayOverSeconds")
    public String delayOverSeconds;

    @NameInMap("ErrCode")
    public String errCode;

    public static DescribeSubscriptionInstanceAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSubscriptionInstanceAlertResponseBody self = new DescribeSubscriptionInstanceAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSubscriptionInstanceAlertResponseBody setErrorAlertPhone(String errorAlertPhone) {
        this.errorAlertPhone = errorAlertPhone;
        return this;
    }
    public String getErrorAlertPhone() {
        return this.errorAlertPhone;
    }

    public DescribeSubscriptionInstanceAlertResponseBody setSubscriptionInstanceName(String subscriptionInstanceName) {
        this.subscriptionInstanceName = subscriptionInstanceName;
        return this;
    }
    public String getSubscriptionInstanceName() {
        return this.subscriptionInstanceName;
    }

    public DescribeSubscriptionInstanceAlertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSubscriptionInstanceAlertResponseBody setDelayAlertPhone(String delayAlertPhone) {
        this.delayAlertPhone = delayAlertPhone;
        return this;
    }
    public String getDelayAlertPhone() {
        return this.delayAlertPhone;
    }

    public DescribeSubscriptionInstanceAlertResponseBody setErrorAlertStatus(String errorAlertStatus) {
        this.errorAlertStatus = errorAlertStatus;
        return this;
    }
    public String getErrorAlertStatus() {
        return this.errorAlertStatus;
    }

    public DescribeSubscriptionInstanceAlertResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSubscriptionInstanceAlertResponseBody setSubscriptionInstanceID(String subscriptionInstanceID) {
        this.subscriptionInstanceID = subscriptionInstanceID;
        return this;
    }
    public String getSubscriptionInstanceID() {
        return this.subscriptionInstanceID;
    }

    public DescribeSubscriptionInstanceAlertResponseBody setDelayAlertStatus(String delayAlertStatus) {
        this.delayAlertStatus = delayAlertStatus;
        return this;
    }
    public String getDelayAlertStatus() {
        return this.delayAlertStatus;
    }

    public DescribeSubscriptionInstanceAlertResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSubscriptionInstanceAlertResponseBody setDelayOverSeconds(String delayOverSeconds) {
        this.delayOverSeconds = delayOverSeconds;
        return this;
    }
    public String getDelayOverSeconds() {
        return this.delayOverSeconds;
    }

    public DescribeSubscriptionInstanceAlertResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

}
