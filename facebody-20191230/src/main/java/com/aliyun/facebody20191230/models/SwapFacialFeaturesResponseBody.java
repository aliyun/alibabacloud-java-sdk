// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SwapFacialFeaturesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public SwapFacialFeaturesResponseBodyData data;

    public static SwapFacialFeaturesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SwapFacialFeaturesResponseBody self = new SwapFacialFeaturesResponseBody();
        return TeaModel.build(map, self);
    }

    public SwapFacialFeaturesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SwapFacialFeaturesResponseBody setData(SwapFacialFeaturesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SwapFacialFeaturesResponseBodyData getData() {
        return this.data;
    }

    public static class SwapFacialFeaturesResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static SwapFacialFeaturesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SwapFacialFeaturesResponseBodyData self = new SwapFacialFeaturesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SwapFacialFeaturesResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
