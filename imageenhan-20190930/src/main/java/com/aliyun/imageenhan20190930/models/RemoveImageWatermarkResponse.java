// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageWatermarkResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RemoveImageWatermarkResponseData data;

    public static RemoveImageWatermarkResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageWatermarkResponse self = new RemoveImageWatermarkResponse();
        return TeaModel.build(map, self);
    }

    public static class RemoveImageWatermarkResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static RemoveImageWatermarkResponseData build(java.util.Map<String, ?> map) throws Exception {
            RemoveImageWatermarkResponseData self = new RemoveImageWatermarkResponseData();
            return TeaModel.build(map, self);
        }

    }

}
