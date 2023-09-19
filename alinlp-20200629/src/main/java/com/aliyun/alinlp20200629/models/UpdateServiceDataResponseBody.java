// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class UpdateServiceDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public Object data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateServiceDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceDataResponseBody self = new UpdateServiceDataResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateServiceDataResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public UpdateServiceDataResponseBody setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public UpdateServiceDataResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public UpdateServiceDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateServiceDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
