// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SwapFacialFeaturesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public SwapFacialFeaturesResponseData data;

    public static SwapFacialFeaturesResponse build(java.util.Map<String, ?> map) throws Exception {
        SwapFacialFeaturesResponse self = new SwapFacialFeaturesResponse();
        return TeaModel.build(map, self);
    }

    public SwapFacialFeaturesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwapFacialFeaturesResponse setData(SwapFacialFeaturesResponseData data) {
        this.data = data;
        return this;
    }
    public SwapFacialFeaturesResponseData getData() {
        return this.data;
    }

    public static class SwapFacialFeaturesResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static SwapFacialFeaturesResponseData build(java.util.Map<String, ?> map) throws Exception {
            SwapFacialFeaturesResponseData self = new SwapFacialFeaturesResponseData();
            return TeaModel.build(map, self);
        }

        public SwapFacialFeaturesResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
