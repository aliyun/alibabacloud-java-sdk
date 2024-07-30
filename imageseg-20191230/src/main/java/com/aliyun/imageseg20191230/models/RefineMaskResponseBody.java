// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class RefineMaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public RefineMaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>E948F80B-86D9-54E0-9FF9-ACF3B1DA83C4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RefineMaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefineMaskResponseBody self = new RefineMaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RefineMaskResponseBody setData(RefineMaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefineMaskResponseBodyData getData() {
        return this.data;
    }

    public RefineMaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RefineMaskResponseBodyDataElements extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-taobao-mm-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/pixelai-portrait-beauty%2F2020_03_04%2F61f544a1a5004c88a2bf29452db494e9.jpeg?OSSAccessKeyId=LTAI4Fmdm1gQonFLrghJ****&Expires=1583406122&Signature=Heet1ivG0xFP3YlO6usvd0pmrH">http://algo-app-taobao-mm-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/pixelai-portrait-beauty%2F2020_03_04%2F61f544a1a5004c88a2bf29452db494e9.jpeg?OSSAccessKeyId=LTAI4Fmdm1gQonFLrghJ****&amp;Expires=1583406122&amp;Signature=Heet1ivG0xFP3YlO6usvd0pmrH</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static RefineMaskResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            RefineMaskResponseBodyDataElements self = new RefineMaskResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public RefineMaskResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

    public static class RefineMaskResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<RefineMaskResponseBodyDataElements> elements;

        public static RefineMaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RefineMaskResponseBodyData self = new RefineMaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RefineMaskResponseBodyData setElements(java.util.List<RefineMaskResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RefineMaskResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
