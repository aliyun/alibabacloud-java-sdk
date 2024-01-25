// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSceneByIdResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public java.util.Map<String, Integer> data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static GetSceneByIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSceneByIdResponseBody self = new GetSceneByIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSceneByIdResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetSceneByIdResponseBody setData(java.util.Map<String, Integer> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, Integer> getData() {
        return this.data;
    }

    public GetSceneByIdResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetSceneByIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSceneByIdResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
