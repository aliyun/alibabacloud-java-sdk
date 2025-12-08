// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class QueryFaceImageTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public QueryFaceImageTemplateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>7C29675C-751F-4D2F-86FB-2BD8D69AC860</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>94</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <strong>example:</strong>
         * <p>89</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <strong>example:</strong>
         * <p>254</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <strong>example:</strong>
         * <p>318</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>6cd509ea-54fa-4730-8e9d-c94cadcda048</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>2021-01-29 10:19:05</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("FaceInfos")
        public java.util.List<QueryFaceImageTemplateResponseBodyDataElementsFaceInfos> faceInfos;

        /**
         * <strong>example:</strong>
         * <p>6cd509ea-54fa-4730-8e9d-c94cadcda048</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/MergeImageFace/MergeImageFace-1.png">http://viapi-test.oss-cn-shanghai.aliyuncs.com/viapi-3.0domepic/facebody/MergeImageFace/MergeImageFace-1.png</a></p>
         */
        @NameInMap("TemplateURL")
        public String templateURL;

        /**
         * <strong>example:</strong>
         * <p>2021-01-29 10:19:05</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>zhangsan</p>
         */
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
