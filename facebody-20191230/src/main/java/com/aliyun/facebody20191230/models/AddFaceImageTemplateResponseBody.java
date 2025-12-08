// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class AddFaceImageTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public AddFaceImageTemplateResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>798A721D-7C7F-4D87-A125-1D04B3055C2C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddFaceImageTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddFaceImageTemplateResponseBody self = new AddFaceImageTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddFaceImageTemplateResponseBody setData(AddFaceImageTemplateResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddFaceImageTemplateResponseBodyData getData() {
        return this.data;
    }

    public AddFaceImageTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class AddFaceImageTemplateResponseBodyDataFaceInfosFaceRect extends TeaModel {
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

        public static AddFaceImageTemplateResponseBodyDataFaceInfosFaceRect build(java.util.Map<String, ?> map) throws Exception {
            AddFaceImageTemplateResponseBodyDataFaceInfosFaceRect self = new AddFaceImageTemplateResponseBodyDataFaceInfosFaceRect();
            return TeaModel.build(map, self);
        }

        public AddFaceImageTemplateResponseBodyDataFaceInfosFaceRect setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public AddFaceImageTemplateResponseBodyDataFaceInfosFaceRect setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public AddFaceImageTemplateResponseBodyDataFaceInfosFaceRect setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public AddFaceImageTemplateResponseBodyDataFaceInfosFaceRect setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class AddFaceImageTemplateResponseBodyDataFaceInfos extends TeaModel {
        @NameInMap("FaceRect")
        public AddFaceImageTemplateResponseBodyDataFaceInfosFaceRect faceRect;

        /**
         * <strong>example:</strong>
         * <p>string 6cd509ea-54fa-4730-8e9d-c94cadcda048_0</p>
         */
        @NameInMap("TemplateFaceID")
        public String templateFaceID;

        public static AddFaceImageTemplateResponseBodyDataFaceInfos build(java.util.Map<String, ?> map) throws Exception {
            AddFaceImageTemplateResponseBodyDataFaceInfos self = new AddFaceImageTemplateResponseBodyDataFaceInfos();
            return TeaModel.build(map, self);
        }

        public AddFaceImageTemplateResponseBodyDataFaceInfos setFaceRect(AddFaceImageTemplateResponseBodyDataFaceInfosFaceRect faceRect) {
            this.faceRect = faceRect;
            return this;
        }
        public AddFaceImageTemplateResponseBodyDataFaceInfosFaceRect getFaceRect() {
            return this.faceRect;
        }

        public AddFaceImageTemplateResponseBodyDataFaceInfos setTemplateFaceID(String templateFaceID) {
            this.templateFaceID = templateFaceID;
            return this;
        }
        public String getTemplateFaceID() {
            return this.templateFaceID;
        }

    }

    public static class AddFaceImageTemplateResponseBodyData extends TeaModel {
        @NameInMap("FaceInfos")
        public java.util.List<AddFaceImageTemplateResponseBodyDataFaceInfos> faceInfos;

        /**
         * <strong>example:</strong>
         * <p>6cd509ea-54fa-4730-8e9d-c94cadcda048</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static AddFaceImageTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddFaceImageTemplateResponseBodyData self = new AddFaceImageTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddFaceImageTemplateResponseBodyData setFaceInfos(java.util.List<AddFaceImageTemplateResponseBodyDataFaceInfos> faceInfos) {
            this.faceInfos = faceInfos;
            return this;
        }
        public java.util.List<AddFaceImageTemplateResponseBodyDataFaceInfos> getFaceInfos() {
            return this.faceInfos;
        }

        public AddFaceImageTemplateResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
