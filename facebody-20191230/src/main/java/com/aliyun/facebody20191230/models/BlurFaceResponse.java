// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BlurFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public BlurFaceResponseData data;

    public static BlurFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        BlurFaceResponse self = new BlurFaceResponse();
        return TeaModel.build(map, self);
    }

    public BlurFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BlurFaceResponse setData(BlurFaceResponseData data) {
        this.data = data;
        return this;
    }
    public BlurFaceResponseData getData() {
        return this.data;
    }

    public static class BlurFaceResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static BlurFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            BlurFaceResponseData self = new BlurFaceResponseData();
            return TeaModel.build(map, self);
        }

        public BlurFaceResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
