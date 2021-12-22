// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class GetVmListResponseBody extends TeaModel {
    // 业务状态码
    @NameInMap("Code")
    public Integer code;

    // 业务数据
    @NameInMap("Data")
    public String data;

    @NameInMap("Desc")
    public String desc;

    // 返回信息
    @NameInMap("Msg")
    public String msg;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetVmListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVmListResponseBody self = new GetVmListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVmListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetVmListResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetVmListResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public GetVmListResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public GetVmListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
