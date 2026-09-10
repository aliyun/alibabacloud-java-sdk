// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class UpdateDataCheckTaskResponseBody extends TeaModel {
    /**
     * <p>The business data value returned by the operation. The specific meaning varies by operation.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("data")
    public Long data;

    /**
     * <p>The error code. This value is an empty string if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. This value is an empty string if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID. This value is used to locate and troubleshoot issues with the call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. A value of true indicates success. A value of false indicates failure. If the call fails, check errCode and errMessage for troubleshooting.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateDataCheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataCheckTaskResponseBody self = new UpdateDataCheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateDataCheckTaskResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public UpdateDataCheckTaskResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public UpdateDataCheckTaskResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public UpdateDataCheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateDataCheckTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
