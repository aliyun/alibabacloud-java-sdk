// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GenerateSqlFromNLResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateSqlFromNLResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52E931</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GenerateSqlFromNLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateSqlFromNLResponseBody self = new GenerateSqlFromNLResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateSqlFromNLResponseBody setData(GenerateSqlFromNLResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateSqlFromNLResponseBodyData getData() {
        return this.data;
    }

    public GenerateSqlFromNLResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GenerateSqlFromNLResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GenerateSqlFromNLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateSqlFromNLResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateSqlFromNLResponseBodyDataKnowledgeReferences extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>{\&quot;Status\&quot;: \&quot;OK\&quot;}</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>verified</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>sample_tbl</p>
         */
        @NameInMap("Name")
        public String name;

        public static GenerateSqlFromNLResponseBodyDataKnowledgeReferences build(java.util.Map<String, ?> map) throws Exception {
            GenerateSqlFromNLResponseBodyDataKnowledgeReferences self = new GenerateSqlFromNLResponseBodyDataKnowledgeReferences();
            return TeaModel.build(map, self);
        }

        public GenerateSqlFromNLResponseBodyDataKnowledgeReferences setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GenerateSqlFromNLResponseBodyDataKnowledgeReferences setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GenerateSqlFromNLResponseBodyDataKnowledgeReferences setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GenerateSqlFromNLResponseBodyDataSimilarSql extends TeaModel {
        @NameInMap("Question")
        public String question;

        /**
         * <strong>example:</strong>
         * <p>0.52</p>
         */
        @NameInMap("Score")
        public String score;

        /**
         * <strong>example:</strong>
         * <p>SELECT * WHERE ResourceType = \&quot;ACS::ECS::Instance\&quot; AND ResourceGroupId != \&quot;rg-xxx\&quot;</p>
         */
        @NameInMap("Sql")
        public String sql;

        @NameInMap("Thought")
        public String thought;

        public static GenerateSqlFromNLResponseBodyDataSimilarSql build(java.util.Map<String, ?> map) throws Exception {
            GenerateSqlFromNLResponseBodyDataSimilarSql self = new GenerateSqlFromNLResponseBodyDataSimilarSql();
            return TeaModel.build(map, self);
        }

        public GenerateSqlFromNLResponseBodyDataSimilarSql setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public GenerateSqlFromNLResponseBodyDataSimilarSql setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GenerateSqlFromNLResponseBodyDataSimilarSql setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public GenerateSqlFromNLResponseBodyDataSimilarSql setThought(String thought) {
            this.thought = thought;
            return this;
        }
        public String getThought() {
            return this.thought;
        }

    }

    public static class GenerateSqlFromNLResponseBodyDataTables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ins_1.db1.table1</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GenerateSqlFromNLResponseBodyDataTables build(java.util.Map<String, ?> map) throws Exception {
            GenerateSqlFromNLResponseBodyDataTables self = new GenerateSqlFromNLResponseBodyDataTables();
            return TeaModel.build(map, self);
        }

        public GenerateSqlFromNLResponseBodyDataTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GenerateSqlFromNLResponseBodyData extends TeaModel {
        @NameInMap("KnowledgeReferences")
        public java.util.List<GenerateSqlFromNLResponseBodyDataKnowledgeReferences> knowledgeReferences;

        @NameInMap("Question")
        public String question;

        @NameInMap("SimilarSql")
        public java.util.List<GenerateSqlFromNLResponseBodyDataSimilarSql> similarSql;

        /**
         * <strong>example:</strong>
         * <p>SELECT * FROM table WHERE condition;</p>
         */
        @NameInMap("Sql")
        public String sql;

        @NameInMap("Tables")
        public java.util.List<GenerateSqlFromNLResponseBodyDataTables> tables;

        /**
         * <strong>example:</strong>
         * <p>通过分析用户的问题和提供的知识，生成了相应的SQL语句。</p>
         */
        @NameInMap("Thought")
        public String thought;

        public static GenerateSqlFromNLResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateSqlFromNLResponseBodyData self = new GenerateSqlFromNLResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateSqlFromNLResponseBodyData setKnowledgeReferences(java.util.List<GenerateSqlFromNLResponseBodyDataKnowledgeReferences> knowledgeReferences) {
            this.knowledgeReferences = knowledgeReferences;
            return this;
        }
        public java.util.List<GenerateSqlFromNLResponseBodyDataKnowledgeReferences> getKnowledgeReferences() {
            return this.knowledgeReferences;
        }

        public GenerateSqlFromNLResponseBodyData setQuestion(String question) {
            this.question = question;
            return this;
        }
        public String getQuestion() {
            return this.question;
        }

        public GenerateSqlFromNLResponseBodyData setSimilarSql(java.util.List<GenerateSqlFromNLResponseBodyDataSimilarSql> similarSql) {
            this.similarSql = similarSql;
            return this;
        }
        public java.util.List<GenerateSqlFromNLResponseBodyDataSimilarSql> getSimilarSql() {
            return this.similarSql;
        }

        public GenerateSqlFromNLResponseBodyData setSql(String sql) {
            this.sql = sql;
            return this;
        }
        public String getSql() {
            return this.sql;
        }

        public GenerateSqlFromNLResponseBodyData setTables(java.util.List<GenerateSqlFromNLResponseBodyDataTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<GenerateSqlFromNLResponseBodyDataTables> getTables() {
            return this.tables;
        }

        public GenerateSqlFromNLResponseBodyData setThought(String thought) {
            this.thought = thought;
            return this;
        }
        public String getThought() {
            return this.thought;
        }

    }

}
