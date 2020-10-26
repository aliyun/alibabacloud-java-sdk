// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class QueryListResponseBody extends TeaModel {
    // 响应状态码
    @NameInMap("code")
    public String code;

    // 结果数据
    @NameInMap("data")
    public java.util.List<java.util.Map<String, ?>> data;

    // 机器id地址
    @NameInMap("hostIp")
    public String hostIp;

    // 响应状态信息
    @NameInMap("message")
    public String message;

    // 链路id
    @NameInMap("traceId")
    public String traceId;

    public static QueryListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryListResponseBody self = new QueryListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryListResponseBody setData(java.util.List<java.util.Map<String, ?>> data) {
        this.data = data;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getData() {
        return this.data;
    }

    public QueryListResponseBody setHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }
    public String getHostIp() {
        return this.hostIp;
    }

    public QueryListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryListResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
