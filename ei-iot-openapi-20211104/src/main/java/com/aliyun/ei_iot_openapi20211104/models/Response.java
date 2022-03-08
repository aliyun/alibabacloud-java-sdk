// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class Response extends TeaModel {
    // Model
    @NameInMap("Model")
    public String model;

    // MsgCode
    @NameInMap("MsgCode")
    public String msgCode;

    // MsgInfo
    @NameInMap("MsgInfo")
    public String msgInfo;

    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    public static Response build(java.util.Map<String, ?> map) throws Exception {
        Response self = new Response();
        return TeaModel.build(map, self);
    }

    public Response setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public Response setMsgCode(String msgCode) {
        this.msgCode = msgCode;
        return this;
    }
    public String getMsgCode() {
        return this.msgCode;
    }

    public Response setMsgInfo(String msgInfo) {
        this.msgInfo = msgInfo;
        return this;
    }
    public String getMsgInfo() {
        return this.msgInfo;
    }

    public Response setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public Response setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
