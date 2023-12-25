// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DescribeAcceleratorServiceStatusResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the GA instance. Valid values:</p>
     * <br>
     * <p>*   Released: The instance was released due to overdue payments.</p>
     * <p>*   Expired: The instance expired due to overdue payments.</p>
     * <p>*   NotOpened: The instance is not activated.</p>
     * <p>*   Normal: The instance is activated.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Indicates whether the request was successful. Valid values: true false</p>
     */
    @NameInMap("Success")
    public String success;

    public static DescribeAcceleratorServiceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAcceleratorServiceStatusResponseBody self = new DescribeAcceleratorServiceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAcceleratorServiceStatusResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAcceleratorServiceStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAcceleratorServiceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAcceleratorServiceStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAcceleratorServiceStatusResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
