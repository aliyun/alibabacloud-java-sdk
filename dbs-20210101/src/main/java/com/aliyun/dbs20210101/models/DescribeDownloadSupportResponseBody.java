// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class DescribeDownloadSupportResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Indicates whether the advanced download feature is supported. Valid values:</p>
     * <br>
     * <p>*   **true**: The advanced download feature is supported.</p>
     * <p>*   **false**: The advanced download feature is not supported.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <p>The error message returned if the request failed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request was successful.</p>
     * <p>*   **false**: The request failed.</p>
     */
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
