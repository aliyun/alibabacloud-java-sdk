// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class LiquifyFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public LiquifyFaceResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static LiquifyFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LiquifyFaceResponseBody self = new LiquifyFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public LiquifyFaceResponseBody setData(LiquifyFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LiquifyFaceResponseBodyData getData() {
        return this.data;
    }

    public LiquifyFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class LiquifyFaceResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static LiquifyFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LiquifyFaceResponseBodyData self = new LiquifyFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LiquifyFaceResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
