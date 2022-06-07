// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kubenest20220525.models;

import com.aliyun.tea.*;

public class ResultDO extends TeaModel {
    // code
    @NameInMap("code")
    public Integer code;

    // data
    @NameInMap("data")
    public java.util.Map<String, ?> data;

    // msg
    @NameInMap("msg")
    public String msg;

    // requestId
    @NameInMap("requestId")
    public String requestId;

    public static ResultDO build(java.util.Map<String, ?> map) throws Exception {
        ResultDO self = new ResultDO();
        return TeaModel.build(map, self);
    }

    public ResultDO setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ResultDO setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public ResultDO setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ResultDO setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
