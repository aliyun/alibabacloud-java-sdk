// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataanalysisgbi20240823.models;

import com.aliyun.tea.*;

public class UpdateBusinessLogicResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoAuth</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <strong>example:</strong>
     * <p>NoAuth</p>
     */
    @NameInMap("errorMsg")
    public String errorMsg;

    /**
     * <strong>example:</strong>
     * <p>FB11F719-9AC8-5C99-AB0A-4709D437FCFC</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateBusinessLogicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateBusinessLogicResponseBody self = new UpdateBusinessLogicResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateBusinessLogicResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateBusinessLogicResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public UpdateBusinessLogicResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public UpdateBusinessLogicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateBusinessLogicResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
