// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class CreateSqlStatementResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateSqlStatementResponseBodyData data;

    @NameInMap("requestId")
    public String requestId;

    public static CreateSqlStatementResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlStatementResponseBody self = new CreateSqlStatementResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSqlStatementResponseBody setData(CreateSqlStatementResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSqlStatementResponseBodyData getData() {
        return this.data;
    }

    public CreateSqlStatementResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateSqlStatementResponseBodyData extends TeaModel {
        @NameInMap("statementId")
        public String statementId;

        public static CreateSqlStatementResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSqlStatementResponseBodyData self = new CreateSqlStatementResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSqlStatementResponseBodyData setStatementId(String statementId) {
            this.statementId = statementId;
            return this;
        }
        public String getStatementId() {
            return this.statementId;
        }

    }

}
