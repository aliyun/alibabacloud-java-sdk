// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DeploySGLangModelAsyncOutput extends TeaModel {
    @NameInMap("data")
    public String data;

    @NameInMap("errCode")
    public String errCode;

    @NameInMap("errMsg")
    public String errMsg;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static DeploySGLangModelAsyncOutput build(java.util.Map<String, ?> map) throws Exception {
        DeploySGLangModelAsyncOutput self = new DeploySGLangModelAsyncOutput();
        return TeaModel.build(map, self);
    }

    public DeploySGLangModelAsyncOutput setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DeploySGLangModelAsyncOutput setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DeploySGLangModelAsyncOutput setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public DeploySGLangModelAsyncOutput setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeploySGLangModelAsyncOutput setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
