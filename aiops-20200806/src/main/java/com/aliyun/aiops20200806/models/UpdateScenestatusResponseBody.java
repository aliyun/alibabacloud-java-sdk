// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateScenestatusResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static UpdateScenestatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateScenestatusResponseBody self = new UpdateScenestatusResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateScenestatusResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateScenestatusResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public UpdateScenestatusResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UpdateScenestatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateScenestatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
