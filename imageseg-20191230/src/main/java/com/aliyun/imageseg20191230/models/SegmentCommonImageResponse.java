// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentCommonImageResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentCommonImageResponseData data;

    public static SegmentCommonImageResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentCommonImageResponse self = new SegmentCommonImageResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentCommonImageResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentCommonImageResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentCommonImageResponseData self = new SegmentCommonImageResponseData();
            return TeaModel.build(map, self);
        }

    }

}
