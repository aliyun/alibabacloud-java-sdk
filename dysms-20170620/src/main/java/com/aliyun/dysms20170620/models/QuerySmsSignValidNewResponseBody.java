// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QuerySmsSignValidNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySmsSignValidNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySmsSignValidNewResponseBody self = new QuerySmsSignValidNewResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySmsSignValidNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySmsSignValidNewResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public QuerySmsSignValidNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
