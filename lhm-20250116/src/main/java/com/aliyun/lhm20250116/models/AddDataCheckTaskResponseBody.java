// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class AddDataCheckTaskResponseBody extends TeaModel {
    /**
     * <p>The task ID of the newly created validation task. Use this ID for subsequent operations such as configuring table details, executing validations, or deleting the task.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("data")
    public Long data;

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
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
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
     * <li>false: The call failed. Use errCode and errMessage to identify the cause.</li>
     * </ul>
     */
    @NameInMap("success")
    public Boolean success;

    public static AddDataCheckTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDataCheckTaskResponseBody self = new AddDataCheckTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDataCheckTaskResponseBody setData(Long data) {
        this.data = data;
        return this;
    }
    public Long getData() {
        return this.data;
    }

    public AddDataCheckTaskResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public AddDataCheckTaskResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public AddDataCheckTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddDataCheckTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
