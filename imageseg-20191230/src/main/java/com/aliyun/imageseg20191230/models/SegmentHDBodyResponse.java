// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class SegmentHDBodyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SegmentHDBodyResponseData data;

    public static SegmentHDBodyResponse build(java.util.Map<String, ?> map) throws Exception {
        SegmentHDBodyResponse self = new SegmentHDBodyResponse();
        return TeaModel.build(map, self);
    }

    public static class SegmentHDBodyResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SegmentHDBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            SegmentHDBodyResponseData self = new SegmentHDBodyResponseData();
            return TeaModel.build(map, self);
        }

    }

}
