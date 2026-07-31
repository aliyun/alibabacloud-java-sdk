// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GenerateSqlBySemanticSqlResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GenerateSqlBySemanticSqlResponseBodyData data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateSqlBySemanticSqlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateSqlBySemanticSqlResponseBody self = new GenerateSqlBySemanticSqlResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateSqlBySemanticSqlResponseBody setData(GenerateSqlBySemanticSqlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateSqlBySemanticSqlResponseBodyData getData() {
        return this.data;
    }

    public GenerateSqlBySemanticSqlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateSqlBySemanticSqlResponseBodyData extends TeaModel {
        /**
         * <p>The error message returned when the task fails to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to rewrite semantic SQL: Ambiguous path from \&quot;lineitem\&quot; to \&quot;nation\&quot;. Multiple paths found</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The generated executable SQL statement.</p>
         * 
         * <strong>example:</strong>
         * <p>select sum(amount) from orders</p>
         */
        @NameInMap("GeneratedSql")
        public String generatedSql;

        /**
         * <p>Indicates whether the generation request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Successful.</li>
         * <li><strong>false</strong>: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static GenerateSqlBySemanticSqlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateSqlBySemanticSqlResponseBodyData self = new GenerateSqlBySemanticSqlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateSqlBySemanticSqlResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GenerateSqlBySemanticSqlResponseBodyData setGeneratedSql(String generatedSql) {
            this.generatedSql = generatedSql;
            return this;
        }
        public String getGeneratedSql() {
            return this.generatedSql;
        }

        public GenerateSqlBySemanticSqlResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
