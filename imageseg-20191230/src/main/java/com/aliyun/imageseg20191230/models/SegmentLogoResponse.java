// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentLogoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentLogoResponseData data;

    public static SegmentLogoResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentLogoResponse self = new SegmentLogoResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentLogoResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentLogoResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentLogoResponseData self = new SegmentLogoResponseData();
            return TeaModel.build(map, self);
        }

    }

}
