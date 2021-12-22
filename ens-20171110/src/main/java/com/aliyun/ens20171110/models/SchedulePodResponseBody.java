// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class SchedulePodResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("Msg")
    public String msg;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static SchedulePodResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SchedulePodResponseBody self = new SchedulePodResponseBody();
        return TeaModel.build(map, self);
    }

    public SchedulePodResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SchedulePodResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SchedulePodResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public SchedulePodResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public SchedulePodResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
