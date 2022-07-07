// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class CheckItemMarketingStatusResponseBody extends TeaModel {
    @NameInMap("ActivityStatus")
    public Boolean activityStatus;

    // Code
    @NameInMap("Code")
    public String code;

    // Message
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    public static CheckItemMarketingStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckItemMarketingStatusResponseBody self = new CheckItemMarketingStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckItemMarketingStatusResponseBody setActivityStatus(Boolean activityStatus) {
        this.activityStatus = activityStatus;
        return this;
    }
    public Boolean getActivityStatus() {
        return this.activityStatus;
    }

    public CheckItemMarketingStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckItemMarketingStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckItemMarketingStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckItemMarketingStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
