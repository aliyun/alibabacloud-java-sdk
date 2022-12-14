// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDownloadSupportResponseBody extends TeaModel {
    // The error code.
    @NameInMap("Code")
    public String code;

    // Indicates whether the advanced download feature is supported. Valid values:
    // 
    // *   **true**: The advanced download feature is supported.
    // *   **false**: The advanced download feature is not supported.
    @NameInMap("Data")
    public String data;

    // The error code returned if the request fails.
    @NameInMap("ErrCode")
    public String errCode;

    // The error message returned if the request fails.
    @NameInMap("ErrMessage")
    public String errMessage;

    // The error message.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // 
    // *   **true**: The request is successful.
    // *   **false**: The request fails.
    @NameInMap("Success")
    public String success;

    public static DescribeDownloadSupportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadSupportResponseBody self = new DescribeDownloadSupportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadSupportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDownloadSupportResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeDownloadSupportResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeDownloadSupportResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeDownloadSupportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDownloadSupportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDownloadSupportResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
