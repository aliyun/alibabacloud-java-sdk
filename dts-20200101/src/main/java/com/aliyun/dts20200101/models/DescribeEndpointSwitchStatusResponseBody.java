// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeEndpointSwitchStatusResponseBody extends TeaModel {
    @NameInMap("Status")
    public String status;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrMessage")
    public String errMessage;

    @NameInMap("Success")
    public String success;

    @NameInMap("ErrCode")
    public String errCode;

    public static DescribeEndpointSwitchStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointSwitchStatusResponseBody self = new DescribeEndpointSwitchStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointSwitchStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeEndpointSwitchStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEndpointSwitchStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public DescribeEndpointSwitchStatusResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeEndpointSwitchStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public DescribeEndpointSwitchStatusResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

}
