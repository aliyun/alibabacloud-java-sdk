// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class QueryFaceImageTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryFaceImageTemplateResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryFaceImageTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceImageTemplateResponseBody self = new QueryFaceImageTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceImageTemplateResponseBody setData(QueryFaceImageTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryFaceImageTemplateResponseBodyData getData() {
        return this.data;
    }

    public QueryFaceImageTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryFaceImageTemplateResponseBodyDataElementsFaceInfosFaceRect extends TeaModel {
        @NameInMap("Height")
        public String height;

        @NameInMap("Width")
        public String width;

        @NameInMap("X")
        public String x;

        @NameInMap("Y")
        public String y;

        public static QueryFaceImageTemplateResponseBodyDataElementsFaceInfosFaceRect build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceImageTemplateResponseBodyDataElementsFaceInfosFaceRect self = new QueryFaceImageTemplateResponseBodyDataElementsFaceInfosFaceRect();
            return TeaModel.build(map, self);
        }

        public QueryFaceImageTemplateResponseBodyDataElementsFaceInfosFaceRect setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryFaceImageTemplateResponseBodyDataElementsFaceInfosFaceRect setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryFaceImageTemplateResponseBodyDataElementsFaceInfosFaceRect setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public QueryFaceImageTemplateResponseBodyDataElementsFaceInfosFaceRect setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class QueryFaceImageTemplateResponseBodyDataElementsFaceInfos extends TeaModel {
        @NameInMap("FaceRect")
        public QueryFaceImageTemplateResponseBodyDataElementsFaceInfosFaceRect faceRect;

        @NameInMap("TemplateFaceID")
        public String templateFaceID;

        public static QueryFaceImageTemplateResponseBodyDataElementsFaceInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceImageTemplateResponseBodyDataElementsFaceInfos self = new QueryFaceImageTemplateResponseBodyDataElementsFaceInfos();
            return TeaModel.build(map, self);
        }

        public QueryFaceImageTemplateResponseBodyDataElementsFaceInfos setFaceRect(QueryFaceImageTemplateResponseBodyDataElementsFaceInfosFaceRect faceRect) {
            this.faceRect = faceRect;
            return this;
        }
        public QueryFaceImageTemplateResponseBodyDataElementsFaceInfosFaceRect getFaceRect() {
            return this.faceRect;
        }

        public QueryFaceImageTemplateResponseBodyDataElementsFaceInfos setTemplateFaceID(String templateFaceID) {
            this.templateFaceID = templateFaceID;
            return this;
        }
        public String getTemplateFaceID() {
            return this.templateFaceID;
        }

    }

    public static class QueryFaceImageTemplateResponseBodyDataElements extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FaceInfos")
        public java.util.List<QueryFaceImageTemplateResponseBodyDataElementsFaceInfos> faceInfos;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateURL")
        public String templateURL;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UserId")
        public String userId;

        public static QueryFaceImageTemplateResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceImageTemplateResponseBodyDataElements self = new QueryFaceImageTemplateResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public QueryFaceImageTemplateResponseBodyDataElements setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryFaceImageTemplateResponseBodyDataElements setFaceInfos(java.util.List<QueryFaceImageTemplateResponseBodyDataElementsFaceInfos> faceInfos) {
            this.faceInfos = faceInfos;
            return this;
        }
        public java.util.List<QueryFaceImageTemplateResponseBodyDataElementsFaceInfos> getFaceInfos() {
            return this.faceInfos;
        }

        public QueryFaceImageTemplateResponseBodyDataElements setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryFaceImageTemplateResponseBodyDataElements setTemplateURL(String templateURL) {
            this.templateURL = templateURL;
            return this;
        }
        public String getTemplateURL() {
            return this.templateURL;
        }

        public QueryFaceImageTemplateResponseBodyDataElements setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryFaceImageTemplateResponseBodyDataElements setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryFaceImageTemplateResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<QueryFaceImageTemplateResponseBodyDataElements> elements;

        @NameInMap("Total")
        public Long total;

        public static QueryFaceImageTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceImageTemplateResponseBodyData self = new QueryFaceImageTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFaceImageTemplateResponseBodyData setElements(java.util.List<QueryFaceImageTemplateResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<QueryFaceImageTemplateResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public QueryFaceImageTemplateResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
