// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class QueryStandarTemplateCollectionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    public static QueryStandarTemplateCollectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryStandarTemplateCollectionsResponseBody self = new QueryStandarTemplateCollectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryStandarTemplateCollectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryStandarTemplateCollectionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryStandarTemplateCollectionsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
