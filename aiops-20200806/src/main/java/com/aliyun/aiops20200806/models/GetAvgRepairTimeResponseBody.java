// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAvgRepairTimeResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("Data")
    public java.util.Map<String, ?> data;

    public static GetAvgRepairTimeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAvgRepairTimeResponseBody self = new GetAvgRepairTimeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAvgRepairTimeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAvgRepairTimeResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAvgRepairTimeResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public GetAvgRepairTimeResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetAvgRepairTimeResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

}
