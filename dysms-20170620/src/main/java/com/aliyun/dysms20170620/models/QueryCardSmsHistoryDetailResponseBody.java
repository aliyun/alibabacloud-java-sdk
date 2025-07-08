// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryCardSmsHistoryDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Model")
    public String model;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCardSmsHistoryDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCardSmsHistoryDetailResponseBody self = new QueryCardSmsHistoryDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCardSmsHistoryDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCardSmsHistoryDetailResponseBody setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public QueryCardSmsHistoryDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCardSmsHistoryDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
