// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GetFaceEntityResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetFaceEntityResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetFaceEntityResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetFaceEntityResponseBody self = new GetFaceEntityResponseBody();
        return TeaModel.build(map, self);
    }

    public GetFaceEntityResponseBody setData(GetFaceEntityResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetFaceEntityResponseBodyData getData() {
        return this.data;
    }

    public GetFaceEntityResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetFaceEntityResponseBodyDataFaces extends TeaModel {
        @NameInMap("FaceId")
        public String faceId;

        public static GetFaceEntityResponseBodyDataFaces build(java.util.Map<String, ?> map) throws Exception {
            GetFaceEntityResponseBodyDataFaces self = new GetFaceEntityResponseBodyDataFaces();
            return TeaModel.build(map, self);
        }

        public GetFaceEntityResponseBodyDataFaces setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

    }

    public static class GetFaceEntityResponseBodyData extends TeaModel {
        @NameInMap("DbName")
        public String dbName;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("Faces")
        public java.util.List<GetFaceEntityResponseBodyDataFaces> faces;

        @NameInMap("Labels")
        public String labels;

        public static GetFaceEntityResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetFaceEntityResponseBodyData self = new GetFaceEntityResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetFaceEntityResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetFaceEntityResponseBodyData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public GetFaceEntityResponseBodyData setFaces(java.util.List<GetFaceEntityResponseBodyDataFaces> faces) {
            this.faces = faces;
            return this;
        }
        public java.util.List<GetFaceEntityResponseBodyDataFaces> getFaces() {
            return this.faces;
        }

        public GetFaceEntityResponseBodyData setLabels(String labels) {
            this.labels = labels;
            return this;
        }
        public String getLabels() {
            return this.labels;
        }

    }

}
