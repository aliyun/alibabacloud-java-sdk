// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimath20241114.models;

import com.aliyun.tea.*;

public class UpdateStepResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9901100002</p>
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
     * <p>15486286-243F-51E6-8DD3-B2D2365E5136</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static UpdateStepResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateStepResponseBody self = new UpdateStepResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateStepResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public UpdateStepResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public UpdateStepResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateStepResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
