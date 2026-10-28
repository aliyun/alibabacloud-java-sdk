// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeEndpointSwitchStatusResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>The request processing has failed due to some unknown error.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>400</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0DD6B201-604B-4CAB-B6A8-4B2953B5****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The execution status of the task. Valid values:</p>
     * <ul>
     * <li><strong>NotStarted</strong>: The task is not started.</li>
     * <li><strong>Initializing</strong>: The task is being initialized.</li>
     * <li><strong>Switching</strong>: The task is being switched.</li>
     * <li><strong>Failed</strong>: The task failed.</li>
     * <li><strong>Finished</strong>: The task is completed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Finished</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
