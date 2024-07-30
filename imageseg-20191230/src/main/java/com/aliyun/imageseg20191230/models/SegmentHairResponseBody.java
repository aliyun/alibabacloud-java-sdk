// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHairResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentHairResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>D6C24839-91A7-41DA-B31F-98F08EF80CC0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SegmentHairResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentHairResponseBody self = new SegmentHairResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentHairResponseBody setData(SegmentHairResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentHairResponseBodyData getData() {
        return this.data;
    }

    public SegmentHairResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentHairResponseBodyDataElements extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_HeadSegmenter/2021-12-31/invi_HeadSegmenter_016409228383064285967296_iPLUXA.png?Expires=1640924638&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=wpKOqSar1bYvGmlTMryfEH2Q9I">http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_HeadSegmenter/2021-12-31/invi_HeadSegmenter_016409228383064285967296_iPLUXA.png?Expires=1640924638&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=wpKOqSar1bYvGmlTMryfEH2Q9I</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        /**
         * <strong>example:</strong>
         * <p>113</p>
         */
        @NameInMap("Width")
        public Integer width;

        /**
         * <strong>example:</strong>
         * <p>446</p>
         */
        @NameInMap("X")
        public Integer x;

        /**
         * <strong>example:</strong>
         * <p>102</p>
         */
        @NameInMap("Y")
        public Integer y;

        public static SegmentHairResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentHairResponseBodyDataElements self = new SegmentHairResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public SegmentHairResponseBodyDataElements setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public SegmentHairResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public SegmentHairResponseBodyDataElements setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public SegmentHairResponseBodyDataElements setX(Integer x) {
            this.x = x;
            return this;
        }
        public Integer getX() {
            return this.x;
        }

        public SegmentHairResponseBodyDataElements setY(Integer y) {
            this.y = y;
            return this;
        }
        public Integer getY() {
            return this.y;
        }

    }

    public static class SegmentHairResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<SegmentHairResponseBodyDataElements> elements;

        public static SegmentHairResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHairResponseBodyData self = new SegmentHairResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentHairResponseBodyData setElements(java.util.List<SegmentHairResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<SegmentHairResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
