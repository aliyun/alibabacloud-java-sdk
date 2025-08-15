// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.actiontrail20200706.models;

import com.aliyun.tea.*;

public class GetTrailStatusResponseBody extends TeaModel {
    /**
     * <p>Indicates whether logging is enabled for the trail. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsLogging")
    public Boolean isLogging;

    /**
     * <p>The log of the last failed delivery.</p>
     * 
     * <strong>example:</strong>
     * <p>write sls failed, exception: the parent of sub user must be project owner, itemscount: 1</p>
     */
    @NameInMap("LatestDeliveryError")
    public String latestDeliveryError;

    /**
     * <p>The log of the last failed delivery to Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>write sls failed, exception: the parent of sub user must be project owner, itemscount: 1</p>
     */
    @NameInMap("LatestDeliveryLogServiceError")
    public String latestDeliveryLogServiceError;

    /**
     * <p>The most recent time when an event was delivered to Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-02-26T09:19:44Z</p>
     */
    @NameInMap("LatestDeliveryLogServiceTime")
    public String latestDeliveryLogServiceTime;

    /**
     * <p>The most recent time when an event was delivered by the trail.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-02-26T09:19:44Z</p>
     */
    @NameInMap("LatestDeliveryTime")
    public String latestDeliveryTime;

    /**
     * <p>Indicates whether the destination Object Storage Service (OSS) bucket is available. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OssBucketStatus")
    public Boolean ossBucketStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8067369B-B923-4D26-85BC-61BF33922505</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the destination Log Service Logstore is available. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SlsLogStoreStatus")
    public Boolean slsLogStoreStatus;

    /**
     * <p>The time when logging was last enabled for the trail.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-02-24T09:19:44Z</p>
     */
    @NameInMap("StartLoggingTime")
    public String startLoggingTime;

    /**
     * <p>The time when logging was last disabled for the trail.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-02-25T09:19:44Z</p>
     */
    @NameInMap("StopLoggingTime")
    public String stopLoggingTime;

    public static GetTrailStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTrailStatusResponseBody self = new GetTrailStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTrailStatusResponseBody setIsLogging(Boolean isLogging) {
        this.isLogging = isLogging;
        return this;
    }
    public Boolean getIsLogging() {
        return this.isLogging;
    }

    public GetTrailStatusResponseBody setLatestDeliveryError(String latestDeliveryError) {
        this.latestDeliveryError = latestDeliveryError;
        return this;
    }
    public String getLatestDeliveryError() {
        return this.latestDeliveryError;
    }

    public GetTrailStatusResponseBody setLatestDeliveryLogServiceError(String latestDeliveryLogServiceError) {
        this.latestDeliveryLogServiceError = latestDeliveryLogServiceError;
        return this;
    }
    public String getLatestDeliveryLogServiceError() {
        return this.latestDeliveryLogServiceError;
    }

    public GetTrailStatusResponseBody setLatestDeliveryLogServiceTime(String latestDeliveryLogServiceTime) {
        this.latestDeliveryLogServiceTime = latestDeliveryLogServiceTime;
        return this;
    }
    public String getLatestDeliveryLogServiceTime() {
        return this.latestDeliveryLogServiceTime;
    }

    public GetTrailStatusResponseBody setLatestDeliveryTime(String latestDeliveryTime) {
        this.latestDeliveryTime = latestDeliveryTime;
        return this;
    }
    public String getLatestDeliveryTime() {
        return this.latestDeliveryTime;
    }

    public GetTrailStatusResponseBody setOssBucketStatus(Boolean ossBucketStatus) {
        this.ossBucketStatus = ossBucketStatus;
        return this;
    }
    public Boolean getOssBucketStatus() {
        return this.ossBucketStatus;
    }

    public GetTrailStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTrailStatusResponseBody setSlsLogStoreStatus(Boolean slsLogStoreStatus) {
        this.slsLogStoreStatus = slsLogStoreStatus;
        return this;
    }
    public Boolean getSlsLogStoreStatus() {
        return this.slsLogStoreStatus;
    }

    public GetTrailStatusResponseBody setStartLoggingTime(String startLoggingTime) {
        this.startLoggingTime = startLoggingTime;
        return this;
    }
    public String getStartLoggingTime() {
        return this.startLoggingTime;
    }

    public GetTrailStatusResponseBody setStopLoggingTime(String stopLoggingTime) {
        this.stopLoggingTime = stopLoggingTime;
        return this;
    }
    public String getStopLoggingTime() {
        return this.stopLoggingTime;
    }

}
