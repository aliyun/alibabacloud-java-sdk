// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentVehicleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentVehicleResponseData data;

    public static SegmentVehicleResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentVehicleResponse self = new SegmentVehicleResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentVehicleResponseDataElements extends TeaModel {
        @NameInMap("OriginImageURL")
        @Validation(required = true)
        public String originImageURL;

        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentVehicleResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            SegmentVehicleResponseDataElements self = new SegmentVehicleResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class SegmentVehicleResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<SegmentVehicleResponseDataElements> elements;

        public static SegmentVehicleResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentVehicleResponseData self = new SegmentVehicleResponseData();
            return TeaModel.build(map, self);
        }

    }

}
