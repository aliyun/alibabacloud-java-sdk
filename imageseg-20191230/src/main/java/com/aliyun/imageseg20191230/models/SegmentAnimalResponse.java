// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentAnimalResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentAnimalResponseData data;

    public static SegmentAnimalResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentAnimalResponse self = new SegmentAnimalResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentAnimalResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentAnimalResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentAnimalResponseData self = new SegmentAnimalResponseData();
            return TeaModel.build(map, self);
        }

    }

}
