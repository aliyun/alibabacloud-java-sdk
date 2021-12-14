// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryQualificaitonCandinateResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryQualificaitonCandinateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryQualificaitonCandinateResponseBody self = new QueryQualificaitonCandinateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryQualificaitonCandinateResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryQualificaitonCandinateResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryQualificaitonCandinateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
