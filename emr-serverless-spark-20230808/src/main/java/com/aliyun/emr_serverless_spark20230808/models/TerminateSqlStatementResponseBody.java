// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class TerminateSqlStatementResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    public static TerminateSqlStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TerminateSqlStatementResponseBody self = new TerminateSqlStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public TerminateSqlStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
