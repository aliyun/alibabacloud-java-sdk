// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteWneSceenCutServiceSendScreenCutToGroupResponseBody extends TeaModel {
    // errMsg
    @NameInMap("ErrMsg")
    public String errMsg;

    // model
    @NameInMap("Model")
    public String model;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static RemoteWneSceenCutServiceSendScreenCutToGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoteWneSceenCutServiceSendScreenCutToGroupResponseBody self = new RemoteWneSceenCutServiceSendScreenCutToGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoteWneSceenCutServiceSendScreenCutToGroupResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public RemoteWneSceenCutServiceSendScreenCutToGroupResponseBody setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public RemoteWneSceenCutServiceSendScreenCutToGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
