// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteComputeApiResponseBody extends TeaModel {
    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("Fail")
    public Boolean fail;

    @NameInMap("Model")
    public java.util.Map<String, ?> model;

    @NameInMap("Success")
    public Boolean success;

    public static RemoteComputeApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoteComputeApiResponseBody self = new RemoteComputeApiResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoteComputeApiResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public RemoteComputeApiResponseBody setFail(Boolean fail) {
        this.fail = fail;
        return this;
    }
    public Boolean getFail() {
        return this.fail;
    }

    public RemoteComputeApiResponseBody setModel(java.util.Map<String, ?> model) {
        this.model = model;
        return this;
    }
    public java.util.Map<String, ?> getModel() {
        return this.model;
    }

    public RemoteComputeApiResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
