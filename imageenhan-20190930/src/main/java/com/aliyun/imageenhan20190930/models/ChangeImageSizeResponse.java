// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ChangeImageSizeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ChangeImageSizeResponseData data;

    public static ChangeImageSizeResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeImageSizeResponse self = new ChangeImageSizeResponse();
        return TeaModel.build(map, self);
    }

    public static class ChangeImageSizeResponseDataRetainLocation extends TeaModel {
        @NameInMap("X")
        @Validation(required = true)
        public Integer x;

        @NameInMap("Y")
        @Validation(required = true)
        public Integer y;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        public static ChangeImageSizeResponseDataRetainLocation build(java.util.Map<String, ?> map) throws Exception {
            ChangeImageSizeResponseDataRetainLocation self = new ChangeImageSizeResponseDataRetainLocation();
            return TeaModel.build(map, self);
        }

    }

    public static class ChangeImageSizeResponseData extends TeaModel {
        @NameInMap("Url")
        @Validation(required = true)
        public String url;

        @NameInMap("RetainLocation")
        @Validation(required = true)
        public ChangeImageSizeResponseDataRetainLocation retainLocation;

        public static ChangeImageSizeResponseData build(java.util.Map<String, ?> map) throws Exception {
            ChangeImageSizeResponseData self = new ChangeImageSizeResponseData();
            return TeaModel.build(map, self);
        }

    }

}
