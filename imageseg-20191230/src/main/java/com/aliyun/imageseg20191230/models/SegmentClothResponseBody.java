// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentClothResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentClothResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>BCE049A3-FE69-41CF-A870-5970156388A7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentClothResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentClothResponseBody self = new SegmentClothResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentClothResponseBody setData(SegmentClothResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentClothResponseBodyData getData() {
        return this.data;
    }

    public SegmentClothResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentClothResponseBodyDataElements extends TeaModel {
        @NameInMap("ClassUrl")
        public java.util.Map<String, String> classUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/clothingsegmentation-2020-06-17-16-54-40-688c84cbbd-hnqfq/2020-6-18/invi__015924459307821000041_IIVHoM.png?Expires=1592447730&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=Hy8pn3IQj8nuKN0LEaC57cee9L">http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/clothingsegmentation-2020-06-17-16-54-40-688c84cbbd-hnqfq/2020-6-18/invi__015924459307821000041_IIVHoM.png?Expires=1592447730&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=Hy8pn3IQj8nuKN0LEaC57cee9L</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static SegmentClothResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentClothResponseBodyDataElements self = new SegmentClothResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public SegmentClothResponseBodyDataElements setClassUrl(java.util.Map<String, String> classUrl) {
            this.classUrl = classUrl;
            return this;
        }
        public java.util.Map<String, String> getClassUrl() {
            return this.classUrl;
        }

        public SegmentClothResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

    public static class SegmentClothResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<SegmentClothResponseBodyDataElements> elements;

        public static SegmentClothResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentClothResponseBodyData self = new SegmentClothResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentClothResponseBodyData setElements(java.util.List<SegmentClothResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<SegmentClothResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
