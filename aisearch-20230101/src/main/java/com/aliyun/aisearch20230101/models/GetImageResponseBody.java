// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class GetImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetImageResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetImageResponseBody self = new GetImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GetImageResponseBody setData(GetImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetImageResponseBodyData getData() {
        return this.data;
    }

    public GetImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetImageResponseBodyDataBoxes extends TeaModel {
        @NameInMap("Bbox")
        public java.util.List<Integer> bbox;

        @NameInMap("Confidence")
        public Float confidence;

        public static GetImageResponseBodyDataBoxes build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyDataBoxes self = new GetImageResponseBodyDataBoxes();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyDataBoxes setBbox(java.util.List<Integer> bbox) {
            this.bbox = bbox;
            return this;
        }
        public java.util.List<Integer> getBbox() {
            return this.bbox;
        }

        public GetImageResponseBodyDataBoxes setConfidence(Float confidence) {
            this.confidence = confidence;
            return this;
        }
        public Float getConfidence() {
            return this.confidence;
        }

    }

    public static class GetImageResponseBodyData extends TeaModel {
        @NameInMap("Boxes")
        public java.util.List<GetImageResponseBodyDataBoxes> boxes;

        @NameInMap("CustomContent")
        public String customContent;

        @NameInMap("IntAttr")
        public Integer intAttr;

        @NameInMap("PicName")
        public String picName;

        @NameInMap("ProductId")
        public String productId;

        @NameInMap("StrAttr")
        public String strAttr;

        public static GetImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetImageResponseBodyData self = new GetImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetImageResponseBodyData setBoxes(java.util.List<GetImageResponseBodyDataBoxes> boxes) {
            this.boxes = boxes;
            return this;
        }
        public java.util.List<GetImageResponseBodyDataBoxes> getBoxes() {
            return this.boxes;
        }

        public GetImageResponseBodyData setCustomContent(String customContent) {
            this.customContent = customContent;
            return this;
        }
        public String getCustomContent() {
            return this.customContent;
        }

        public GetImageResponseBodyData setIntAttr(Integer intAttr) {
            this.intAttr = intAttr;
            return this;
        }
        public Integer getIntAttr() {
            return this.intAttr;
        }

        public GetImageResponseBodyData setPicName(String picName) {
            this.picName = picName;
            return this;
        }
        public String getPicName() {
            return this.picName;
        }

        public GetImageResponseBodyData setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public GetImageResponseBodyData setStrAttr(String strAttr) {
            this.strAttr = strAttr;
            return this;
        }
        public String getStrAttr() {
            return this.strAttr;
        }

    }

}
