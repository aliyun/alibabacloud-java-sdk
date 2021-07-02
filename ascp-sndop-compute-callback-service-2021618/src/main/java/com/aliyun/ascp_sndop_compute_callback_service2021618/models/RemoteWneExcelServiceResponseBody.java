// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteWneExcelServiceResponseBody extends TeaModel {
    // errMsg
    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("Model")
    public java.util.Map<String, ?> model;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static RemoteWneExcelServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoteWneExcelServiceResponseBody self = new RemoteWneExcelServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoteWneExcelServiceResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public RemoteWneExcelServiceResponseBody setModel(java.util.Map<String, ?> model) {
        this.model = model;
        return this;
    }
    public java.util.Map<String, ?> getModel() {
        return this.model;
    }

    public RemoteWneExcelServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
