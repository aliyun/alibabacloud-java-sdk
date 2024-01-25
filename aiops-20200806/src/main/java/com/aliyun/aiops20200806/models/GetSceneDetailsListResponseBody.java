// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetSceneDetailsListResponseBody extends TeaModel {
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

    public static GetSceneDetailsListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSceneDetailsListResponseBody self = new GetSceneDetailsListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSceneDetailsListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetSceneDetailsListResponseBody setData(java.util.Map<String, Integer> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, Integer> getData() {
        return this.data;
    }

    public GetSceneDetailsListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetSceneDetailsListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSceneDetailsListResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
