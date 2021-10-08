// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetBusinessGroupInfoResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    public static GetBusinessGroupInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessGroupInfoResponseBody self = new GetBusinessGroupInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBusinessGroupInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBusinessGroupInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetBusinessGroupInfoResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetBusinessGroupInfoResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public GetBusinessGroupInfoResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

}
