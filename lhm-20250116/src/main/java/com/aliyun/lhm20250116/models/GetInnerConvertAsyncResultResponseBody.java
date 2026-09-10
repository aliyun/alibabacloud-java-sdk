// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetInnerConvertAsyncResultResponseBody extends TeaModel {
    /**
     * <p>The business data returned by the operation in string format. The specific content varies by operation.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>The error code. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>The error message. An empty string is returned if the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>The request ID that uniquely identifies the call. Provide this value when troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values:</p>
     * <ul>
     * <li>true: The call is successful.</li>
     * <li>false: The call failed. Troubleshoot the issue based on errCode and errMessage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static GetInnerConvertAsyncResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInnerConvertAsyncResultResponseBody self = new GetInnerConvertAsyncResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInnerConvertAsyncResultResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetInnerConvertAsyncResultResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetInnerConvertAsyncResultResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetInnerConvertAsyncResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetInnerConvertAsyncResultResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
