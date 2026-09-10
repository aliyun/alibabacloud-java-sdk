// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetCronExecTimeResponseBody extends TeaModel {
    /**
     * <p>The data list returned by the operation. For the structure of each element, see the child field descriptions.</p>
     */
    @NameInMap("data")
    public java.util.List<String> data;

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
     * <p>The request ID. Use this ID to locate and troubleshoot issues related to this call.</p>
     * 
     * <strong>example:</strong>
     * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the call is successful. Valid values: true and false. If false is returned, use errCode and errMessage to troubleshoot.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetCronExecTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCronExecTimeResponseBody self = new GetCronExecTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCronExecTimeResponseBody setData(java.util.List<String> data) {
        this.data = data;
        return this;
    }
    public java.util.List<String> getData() {
        return this.data;
    }

    public GetCronExecTimeResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GetCronExecTimeResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public GetCronExecTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCronExecTimeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
