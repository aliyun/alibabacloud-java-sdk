// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20171204.models;

import com.aliyun.tea.*;

public class GetTrailStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StartLoggingTime")
    public String startLoggingTime;

    @NameInMap("LatestDeliveryError")
    public String latestDeliveryError;

    @NameInMap("StopLoggingTime")
    public String stopLoggingTime;

    @NameInMap("IsLogging")
    public Boolean isLogging;

    @NameInMap("LatestDeliveryTime")
    public String latestDeliveryTime;

    public static GetTrailStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrailStatusResponseBody self = new GetTrailStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrailStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrailStatusResponseBody setStartLoggingTime(String startLoggingTime) {
        this.startLoggingTime = startLoggingTime;
        return this;
    }
    public String getStartLoggingTime() {
        return this.startLoggingTime;
    }

    public GetTrailStatusResponseBody setLatestDeliveryError(String latestDeliveryError) {
        this.latestDeliveryError = latestDeliveryError;
        return this;
    }
    public String getLatestDeliveryError() {
        return this.latestDeliveryError;
    }

    public GetTrailStatusResponseBody setStopLoggingTime(String stopLoggingTime) {
        this.stopLoggingTime = stopLoggingTime;
        return this;
    }
    public String getStopLoggingTime() {
        return this.stopLoggingTime;
    }

    public GetTrailStatusResponseBody setIsLogging(Boolean isLogging) {
        this.isLogging = isLogging;
        return this;
    }
    public Boolean getIsLogging() {
        return this.isLogging;
    }

    public GetTrailStatusResponseBody setLatestDeliveryTime(String latestDeliveryTime) {
        this.latestDeliveryTime = latestDeliveryTime;
        return this;
    }
    public String getLatestDeliveryTime() {
        return this.latestDeliveryTime;
    }

}
