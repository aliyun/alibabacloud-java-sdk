// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryVoiceNumberStockCountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryVoiceNumberStockCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVoiceNumberStockCountResponseBody self = new QueryVoiceNumberStockCountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVoiceNumberStockCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryVoiceNumberStockCountResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryVoiceNumberStockCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
