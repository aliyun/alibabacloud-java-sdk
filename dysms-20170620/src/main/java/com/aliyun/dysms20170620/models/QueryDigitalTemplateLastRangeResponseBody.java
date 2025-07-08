// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryDigitalTemplateLastRangeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    public static QueryDigitalTemplateLastRangeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDigitalTemplateLastRangeResponseBody self = new QueryDigitalTemplateLastRangeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDigitalTemplateLastRangeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDigitalTemplateLastRangeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDigitalTemplateLastRangeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
