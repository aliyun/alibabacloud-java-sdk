// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class QuerySystemEntitiesResponseBody extends TeaModel {
    @NameInMap("SystemEntities")
    public java.util.List<QuerySystemEntitiesResponseBodySystemEntities> systemEntities;

    @NameInMap("RequestId")
    public String requestId;

    public static QuerySystemEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySystemEntitiesResponseBody self = new QuerySystemEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySystemEntitiesResponseBody setSystemEntities(java.util.List<QuerySystemEntitiesResponseBodySystemEntities> systemEntities) {
        this.systemEntities = systemEntities;
        return this;
    }
    public java.util.List<QuerySystemEntitiesResponseBodySystemEntities> getSystemEntities() {
        return this.systemEntities;
    }

    public QuerySystemEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QuerySystemEntitiesResponseBodySystemEntities extends TeaModel {
        @NameInMap("DefaultQuestion")
        public String defaultQuestion;

        @NameInMap("EntityCode")
        public String entityCode;

        @NameInMap("EntityName")
        public String entityName;

        public static QuerySystemEntitiesResponseBodySystemEntities build(java.util.Map<String, ?> map) throws Exception {
            QuerySystemEntitiesResponseBodySystemEntities self = new QuerySystemEntitiesResponseBodySystemEntities();
            return TeaModel.build(map, self);
        }

        public QuerySystemEntitiesResponseBodySystemEntities setDefaultQuestion(String defaultQuestion) {
            this.defaultQuestion = defaultQuestion;
            return this;
        }
        public String getDefaultQuestion() {
            return this.defaultQuestion;
        }

        public QuerySystemEntitiesResponseBodySystemEntities setEntityCode(String entityCode) {
            this.entityCode = entityCode;
            return this;
        }
        public String getEntityCode() {
            return this.entityCode;
        }

        public QuerySystemEntitiesResponseBodySystemEntities setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

    }

}
