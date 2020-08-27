// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceFilterResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public FaceFilterResponseData data;

    public static FaceFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceFilterResponse self = new FaceFilterResponse();
        return TeaModel.build(map, self);
    }

    public FaceFilterResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceFilterResponse setData(FaceFilterResponseData data) {
        this.data = data;
        return this;
    }
    public FaceFilterResponseData getData() {
        return this.data;
    }

    public static class FaceFilterResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static FaceFilterResponseData build(java.util.Map<String, ?> map) throws Exception {
            FaceFilterResponseData self = new FaceFilterResponseData();
            return TeaModel.build(map, self);
        }

        public FaceFilterResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
