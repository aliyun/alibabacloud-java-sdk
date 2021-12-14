// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class Query400NumberManagerIdentifyDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static Query400NumberManagerIdentifyDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        Query400NumberManagerIdentifyDetailResponseBody self = new Query400NumberManagerIdentifyDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public Query400NumberManagerIdentifyDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public Query400NumberManagerIdentifyDetailResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public Query400NumberManagerIdentifyDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
