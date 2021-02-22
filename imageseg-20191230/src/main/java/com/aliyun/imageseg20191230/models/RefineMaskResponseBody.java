// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class RefineMaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RefineMaskResponseBodyData data;

    public static RefineMaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefineMaskResponseBody self = new RefineMaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RefineMaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefineMaskResponseBody setData(RefineMaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RefineMaskResponseBodyData getData() {
        return this.data;
    }

    public static class RefineMaskResponseBodyDataElements extends TeaModel {
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
