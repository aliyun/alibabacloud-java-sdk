// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobAlertResponseBody extends TeaModel {
    @NameInMap("ErrorAlertPhone")
    public String errorAlertPhone;

    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    @NameInMap("SynchronizationJobName")
    public String synchronizationJobName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DelayAlertPhone")
    public String delayAlertPhone;

    @NameInMap("ErrorAlertStatus")
    public String errorAlertStatus;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("DelayAlertStatus")
    public String delayAlertStatus;

    @NameInMap("Success")
    public String success;

    @NameInMap("DelayOverSeconds")
    public String delayOverSeconds;

    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    @NameInMap("ErrCode")
    public String errCode;

    public static DescribeSynchronizationJobAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobAlertResponseBody self = new DescribeSynchronizationJobAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobAlertResponseBody setErrorAlertPhone(String errorAlertPhone) {
        this.errorAlertPhone = errorAlertPhone;
        return this;
    }
    public String getErrorAlertPhone() {
        return this.errorAlertPhone;
    }

    public DescribeSynchronizationJobAlertResponseBody setSynchronizationJobId(String synchronizationJobId) {
        this.synchronizationJobId = synchronizationJobId;
        return this;
    }
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public DescribeSynchronizationJobAlertResponseBody setSynchronizationJobName(String synchronizationJobName) {
        this.synchronizationJobName = synchronizationJobName;
        return this;
    }
    public String getSynchronizationJobName() {
        return this.synchronizationJobName;
    }

    public DescribeSynchronizationJobAlertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynchronizationJobAlertResponseBody setDelayAlertPhone(String delayAlertPhone) {
        this.delayAlertPhone = delayAlertPhone;
        return this;
    }
    public String getDelayAlertPhone() {
        return this.delayAlertPhone;
    }

    public DescribeSynchronizationJobAlertResponseBody setErrorAlertStatus(String errorAlertStatus) {
        this.errorAlertStatus = errorAlertStatus;
        return this;
    }
    public String getErrorAlertStatus() {
        return this.errorAlertStatus;
    }

    public DescribeSynchronizationJobAlertResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSynchronizationJobAlertResponseBody setDelayAlertStatus(String delayAlertStatus) {
        this.delayAlertStatus = delayAlertStatus;
        return this;
    }
    public String getDelayAlertStatus() {
        return this.delayAlertStatus;
    }

    public DescribeSynchronizationJobAlertResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSynchronizationJobAlertResponseBody setDelayOverSeconds(String delayOverSeconds) {
        this.delayOverSeconds = delayOverSeconds;
        return this;
    }
    public String getDelayOverSeconds() {
        return this.delayOverSeconds;
    }

    public DescribeSynchronizationJobAlertResponseBody setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    public DescribeSynchronizationJobAlertResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

}
