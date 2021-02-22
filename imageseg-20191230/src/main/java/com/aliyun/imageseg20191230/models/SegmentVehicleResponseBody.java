// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentVehicleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SegmentVehicleResponseBodyData data;

    public static SegmentVehicleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentVehicleResponseBody self = new SegmentVehicleResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentVehicleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SegmentVehicleResponseBody setData(SegmentVehicleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentVehicleResponseBodyData getData() {
        return this.data;
    }

    public static class SegmentVehicleResponseBodyDataElements extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("OriginImageURL")
        public String originImageURL;

        public static SegmentVehicleResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentVehicleResponseBodyDataElements self = new SegmentVehicleResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public SegmentVehicleResponseBodyDataElements setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public SegmentVehicleResponseBodyDataElements setOriginImageURL(String originImageURL) {
            this.originImageURL = originImageURL;
            return this;
        }
        public String getOriginImageURL() {
            return this.originImageURL;
        }

    }

    public static class SegmentVehicleResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<SegmentVehicleResponseBodyDataElements> elements;

        public static SegmentVehicleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentVehicleResponseBodyData self = new SegmentVehicleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentVehicleResponseBodyData setElements(java.util.List<SegmentVehicleResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<SegmentVehicleResponseBodyDataElements> getElements() {
            return this.elements;
        }

    }

}
