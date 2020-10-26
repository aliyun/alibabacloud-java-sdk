// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class QueryObjectResponseBody extends TeaModel {
    // 状态码
    @NameInMap("code")
    public String code;

    // 结果数据
    @NameInMap("data")
    public java.util.Map<String, ?> data;

    // 机器ip
    @NameInMap("hostIp")
    public String hostIp;

    // 状态信息
    @NameInMap("message")
    public String message;

    // 链路Id
    @NameInMap("traceId")
    public String traceId;

    public static QueryObjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryObjectResponseBody self = new QueryObjectResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryObjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryObjectResponseBody setData(java.util.Map<String, ?> data) {
        this.data = data;
        return this;
    }
    public java.util.Map<String, ?> getData() {
        return this.data;
    }

    public QueryObjectResponseBody setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public QueryObjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryObjectResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
