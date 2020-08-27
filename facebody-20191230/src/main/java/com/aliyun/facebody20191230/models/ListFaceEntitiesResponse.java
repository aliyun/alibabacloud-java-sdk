// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ListFaceEntitiesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ListFaceEntitiesResponseData data;

    public static ListFaceEntitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFaceEntitiesResponse self = new ListFaceEntitiesResponse();
        return TeaModel.build(map, self);
    }

    public ListFaceEntitiesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFaceEntitiesResponse setData(ListFaceEntitiesResponseData data) {
        this.data = data;
        return this;
    }
    public ListFaceEntitiesResponseData getData() {
        return this.data;
    }

    public static class ListFaceEntitiesResponseDataEntities extends TeaModel {
        @NameInMap("DbName")
        @Validation(required = true)
        public String dbName;

        @NameInMap("EntityId")
        @Validation(required = true)
        public String entityId;

        @NameInMap("FaceCount")
        @Validation(required = true)
        public Integer faceCount;

        @NameInMap("Labels")
        @Validation(required = true)
        public String labels;

        @NameInMap("CreatedAt")
        @Validation(required = true)
        public Long createdAt;

        @NameInMap("UpdatedAt")
        @Validation(required = true)
        public Long updatedAt;

        public static ListFaceEntitiesResponseDataEntities build(java.util.Map<String, ?> map) throws Exception {
            ListFaceEntitiesResponseDataEntities self = new ListFaceEntitiesResponseDataEntities();
            return TeaModel.build(map, self);
        }

        public ListFaceEntitiesResponseDataEntities setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ListFaceEntitiesResponseDataEntities setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public ListFaceEntitiesResponseDataEntities setFaceCount(Integer faceCount) {
            this.faceCount = faceCount;
            return this;
        }
        public Integer getFaceCount() {
            return this.faceCount;
        }

        public ListFaceEntitiesResponseDataEntities setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

        public ListFaceEntitiesResponseDataEntities setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public ListFaceEntitiesResponseDataEntities setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class ListFaceEntitiesResponseData extends TeaModel {
        @NameInMap("Token")
        @Validation(required = true)
        public String token;

        @NameInMap("TotalCount")
        @Validation(required = true)
        public Integer totalCount;

        @NameInMap("Entities")
        @Validation(required = true)
        public java.util.List<ListFaceEntitiesResponseDataEntities> entities;

        public static ListFaceEntitiesResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListFaceEntitiesResponseData self = new ListFaceEntitiesResponseData();
            return TeaModel.build(map, self);
        }

        public ListFaceEntitiesResponseData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public ListFaceEntitiesResponseData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListFaceEntitiesResponseData setEntities(java.util.List<ListFaceEntitiesResponseDataEntities> entities) {
            this.entities = entities;
            return this;
        }
        public java.util.List<ListFaceEntitiesResponseDataEntities> getEntities() {
            return this.entities;
        }

    }

}
