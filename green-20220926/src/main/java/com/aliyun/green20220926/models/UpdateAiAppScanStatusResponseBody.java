// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateAiAppScanStatusResponseBody extends TeaModel {
    /**
     * <p>The list of application IDs that failed.</p>
     */
    @NameInMap("FailedAppIds")
    public java.util.List<String> failedAppIds;

    /**
     * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status. Valid values:</p>
     * <ul>
     * <li><p>SUCCESS: Succeeded.</p>
     * </li>
     * <li><p>PARTIAL_SUCCESS: Partially succeeded.</p>
     * </li>
     * <li><p>FAILED: Failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The list of application IDs that succeeded.</p>
     */
    @NameInMap("SuccessAppIds")
    public java.util.List<String> successAppIds;

    public static UpdateAiAppScanStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAiAppScanStatusResponseBody self = new UpdateAiAppScanStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAiAppScanStatusResponseBody setFailedAppIds(java.util.List<String> failedAppIds) {
        this.failedAppIds = failedAppIds;
        return this;
    }
    public java.util.List<String> getFailedAppIds() {
        return this.failedAppIds;
    }

    public UpdateAiAppScanStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateAiAppScanStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateAiAppScanStatusResponseBody setSuccessAppIds(java.util.List<String> successAppIds) {
        this.successAppIds = successAppIds;
        return this;
    }
    public java.util.List<String> getSuccessAppIds() {
        return this.successAppIds;
    }

}
