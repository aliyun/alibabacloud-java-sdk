// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class LiquifyFaceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public LiquifyFaceResponseBodyData data;

    public static LiquifyFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LiquifyFaceResponseBody self = new LiquifyFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public LiquifyFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LiquifyFaceResponseBody setData(LiquifyFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LiquifyFaceResponseBodyData getData() {
        return this.data;
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
