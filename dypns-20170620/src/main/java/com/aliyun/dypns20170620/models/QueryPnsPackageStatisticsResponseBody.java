// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class QueryPnsPackageStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    public static QueryPnsPackageStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPnsPackageStatisticsResponseBody self = new QueryPnsPackageStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPnsPackageStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPnsPackageStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPnsPackageStatisticsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
