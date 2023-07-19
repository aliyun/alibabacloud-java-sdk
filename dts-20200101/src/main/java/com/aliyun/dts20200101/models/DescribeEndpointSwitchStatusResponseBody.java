// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeEndpointSwitchStatusResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>This parameter is no longer available.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the task. Valid values:</p>
     * <br>
     * <p>*   **NotStarted**: The task is not started.</p>
     * <p>*   **Initializing**: The task is being initialized.</p>
     * <p>*   **Switching**: The task is running.</p>
     * <p>*   **Failed**: The task failed.</p>
     * <p>*   **Finished**: The task is completed.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the call was successful.</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeEndpointSwitchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointSwitchStatusResponseBody self = new DescribeEndpointSwitchStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointSwitchStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeEndpointSwitchStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeEndpointSwitchStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeEndpointSwitchStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEndpointSwitchStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeEndpointSwitchStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
