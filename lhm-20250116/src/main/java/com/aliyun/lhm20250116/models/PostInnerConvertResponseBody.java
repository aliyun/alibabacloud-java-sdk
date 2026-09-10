// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class PostInnerConvertResponseBody extends TeaModel {
    /**
     * <p>Business data, the identifier of the transformation task returned upon successful submission of this interface.</p>
     * 
     * <strong>example:</strong>
     * <p>c8f3a1b2e9d74c5f</p>
     */
    @NameInMap("data")
    public String data;

    /**
     * <p>Error code, which is an empty string when the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("errCode")
    public String errCode;

    /**
     * <p>Error message, which is an empty string when the call is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errMessage")
    public String errMessage;

    /**
     * <p>Request ID, used for locating and troubleshooting issues with this call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful: <code>true</code> indicates success, <code>false</code> indicates failure. In case of failure, troubleshoot using <code>errCode</code> and <code>errMessage</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static PostInnerConvertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PostInnerConvertResponseBody self = new PostInnerConvertResponseBody();
        return TeaModel.build(map, self);
    }

    public PostInnerConvertResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public PostInnerConvertResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public PostInnerConvertResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public PostInnerConvertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PostInnerConvertResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
