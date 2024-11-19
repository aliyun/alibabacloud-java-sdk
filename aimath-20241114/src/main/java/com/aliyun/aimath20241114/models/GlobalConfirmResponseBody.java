// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class GlobalConfirmResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>40020503</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Parameter value validation failed</p>
     */
    @NameInMap("ErrMsg")
    public String errMsg;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>696acaa9-eb29-4c1f-b48a-1f901579acc5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GlobalConfirmResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GlobalConfirmResponseBody self = new GlobalConfirmResponseBody();
        return TeaModel.build(map, self);
    }

    public GlobalConfirmResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public GlobalConfirmResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GlobalConfirmResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GlobalConfirmResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
