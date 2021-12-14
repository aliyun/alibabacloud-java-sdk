// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class QueryCorpNameListFor400ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryCorpNameListFor400ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCorpNameListFor400ResponseBody self = new QueryCorpNameListFor400ResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCorpNameListFor400ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCorpNameListFor400ResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryCorpNameListFor400ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
