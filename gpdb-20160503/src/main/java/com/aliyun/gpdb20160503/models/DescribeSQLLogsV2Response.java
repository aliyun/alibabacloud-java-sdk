// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeSQLLogsV2Response extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSQLLogsV2ResponseBody body;

    public static DescribeSQLLogsV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogsV2Response self = new DescribeSQLLogsV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSQLLogsV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSQLLogsV2Response setBody(DescribeSQLLogsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSQLLogsV2ResponseBody getBody() {
        return this.body;
    }

}
