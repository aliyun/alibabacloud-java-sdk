// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListFaceEntitiesResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListFaceEntitiesResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListFaceEntitiesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFaceEntitiesResponseBody self = new ListFaceEntitiesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFaceEntitiesResponseBody setData(ListFaceEntitiesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListFaceEntitiesResponseBodyData getData() {
        return this.data;
    }

    public ListFaceEntitiesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListFaceEntitiesResponseBodyDataEntities extends TeaModel {
        @NameInMap("CreatedAt")
        public Long createdAt;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("FaceCount")
        public Integer faceCount;

        @NameInMap("Labels")
        public String labels;

        @NameInMap("UpdatedAt")
        public Long updatedAt;

        public static ListFaceEntitiesResponseBodyDataEntities build(java.util.Map<String, ?> map) throws Exception {
            ListFaceEntitiesResponseBodyDataEntities self = new ListFaceEntitiesResponseBodyDataEntities();
            return TeaModel.build(map, self);
        }

        public ListFaceEntitiesResponseBodyDataEntities setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListFaceEntitiesResponseBodyDataEntities setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ListFaceEntitiesResponseBodyDataEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListFaceEntitiesResponseBodyDataEntities setFaceCount(Integer faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public Integer getFaceCount() {
            return this.faceCount;
        }

        public ListFaceEntitiesResponseBodyDataEntities setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListFaceEntitiesResponseBodyDataEntities setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class ListFaceEntitiesResponseBodyData extends TeaModel {
        @NameInMap("Entities")
        public java.util.List<ListFaceEntitiesResponseBodyDataEntities> entities;

        @NameInMap("Token")
        public String token;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListFaceEntitiesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListFaceEntitiesResponseBodyData self = new ListFaceEntitiesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListFaceEntitiesResponseBodyData setEntities(java.util.List<ListFaceEntitiesResponseBodyDataEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<ListFaceEntitiesResponseBodyDataEntities> getEntities() {
            return this.entities;
        }

        public ListFaceEntitiesResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public ListFaceEntitiesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
