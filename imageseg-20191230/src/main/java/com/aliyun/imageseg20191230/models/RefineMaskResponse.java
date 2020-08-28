// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class RefineMaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RefineMaskResponseData data;

    public static RefineMaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RefineMaskResponse self = new RefineMaskResponse();
        return TeaModel.build(map, self);
    }

    public static class RefineMaskResponseDataElements extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static RefineMaskResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RefineMaskResponseDataElements self = new RefineMaskResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class RefineMaskResponseData extends TeaModel {
        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RefineMaskResponseDataElements> elements;

        public static RefineMaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            RefineMaskResponseData self = new RefineMaskResponseData();
            return TeaModel.build(map, self);
        }

    }

}
