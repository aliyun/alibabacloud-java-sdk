// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceFilterResponseBody extends TeaModel {
    @NameInMap("Data")
    public FaceFilterResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static FaceFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceFilterResponseBody self = new FaceFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceFilterResponseBody setData(FaceFilterResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FaceFilterResponseBodyData getData() {
        return this.data;
    }

    public FaceFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FaceFilterResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static FaceFilterResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FaceFilterResponseBodyData self = new FaceFilterResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FaceFilterResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
