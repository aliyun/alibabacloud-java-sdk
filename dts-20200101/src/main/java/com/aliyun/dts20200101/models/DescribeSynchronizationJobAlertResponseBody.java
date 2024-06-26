// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeSynchronizationJobAlertResponseBody extends TeaModel {
    /**
     * <p>The mobile phone numbers that receive latency-related alerts.</p>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("DelayAlertPhone")
    public String delayAlertPhone;

    /**
     * <p>Indicates whether task latency is monitored. Valid values:</p>
     * <ul>
     * <li><strong>enable</strong>: yes</li>
     * <li><strong>disable</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("DelayAlertStatus")
    public String delayAlertStatus;

    /**
     * <p>The threshold for triggering latency alerts. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("DelayOverSeconds")
    public String delayOverSeconds;

    /**
     * <p>The error code returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The mobile phone numbers that receive status-related alerts.</p>
     * 
     * <strong>example:</strong>
     * <p>1361234****,1371234****</p>
     */
    @NameInMap("ErrorAlertPhone")
    public String errorAlertPhone;

    /**
     * <p>Indicates whether task status is monitored. Valid values:</p>
     * <ul>
     * <li><strong>enable</strong>: yes</li>
     * <li><strong>disable</strong>: no</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>enable</p>
     */
    @NameInMap("ErrorAlertStatus")
    public String errorAlertStatus;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>210ec20e16055205968635339d****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    /**
     * <p>The synchronization direction. Valid values:</p>
     * <ul>
     * <li><p><strong>Forward</strong></p>
     * </li>
     * <li><p><strong>Reverse</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This parameter is returned only when the topology of data synchronization is two-way synchronization.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Forward</p>
     */
    @NameInMap("SynchronizationDirection")
    public String synchronizationDirection;

    /**
     * <p>The ID of the data synchronization instance.</p>
     * 
     * <strong>example:</strong>
     * <p>kxz1170c10p****</p>
     */
    @NameInMap("SynchronizationJobId")
    public String synchronizationJobId;

    /**
     * <p>The name of the data synchronization task.</p>
     * 
     * <strong>example:</strong>
     * <p>Polar MySQL_TO_RDS MySQL</p>
     */
    @NameInMap("SynchronizationJobName")
    public String synchronizationJobName;

    public static DescribeSynchronizationJobAlertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSynchronizationJobAlertResponseBody self = new DescribeSynchronizationJobAlertResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSynchronizationJobAlertResponseBody setDelayAlertPhone(String delayAlertPhone) {
        this.delayAlertPhone = delayAlertPhone;
        return this;
    }
    public String getDelayAlertPhone() {
        return this.delayAlertPhone;
    }

    public DescribeSynchronizationJobAlertResponseBody setDelayAlertStatus(String delayAlertStatus) {
        this.delayAlertStatus = delayAlertStatus;
        return this;
    }
    public String getDelayAlertStatus() {
        return this.delayAlertStatus;
    }

    public DescribeSynchronizationJobAlertResponseBody setDelayOverSeconds(String delayOverSeconds) {
        this.delayOverSeconds = delayOverSeconds;
        return this;
    }
    public String getDelayOverSeconds() {
        return this.delayOverSeconds;
    }

    public DescribeSynchronizationJobAlertResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeSynchronizationJobAlertResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeSynchronizationJobAlertResponseBody setErrorAlertPhone(String errorAlertPhone) {
        this.errorAlertPhone = errorAlertPhone;
        return this;
    }
    public String getErrorAlertPhone() {
        return this.errorAlertPhone;
    }

    public DescribeSynchronizationJobAlertResponseBody setErrorAlertStatus(String errorAlertStatus) {
        this.errorAlertStatus = errorAlertStatus;
        return this;
    }
    public String getErrorAlertStatus() {
        return this.errorAlertStatus;
    }

    public DescribeSynchronizationJobAlertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSynchronizationJobAlertResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeSynchronizationJobAlertResponseBody setSynchronizationDirection(String synchronizationDirection) {
        this.synchronizationDirection = synchronizationDirection;
        return this;
    }
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
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

}
