// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kubenest20220525.models;

import com.aliyun.tea.*;

public class ListAppInfoResponseBody extends TeaModel {
    @NameInMap("code")
    public Integer code;

    @NameInMap("data")
    public java.util.Map<String, ?> data;

    @NameInMap("msg")
    public String msg;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static ListAppInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAppInfoResponseBody self = new ListAppInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAppInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAppInfoResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public ListAppInfoResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public ListAppInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
