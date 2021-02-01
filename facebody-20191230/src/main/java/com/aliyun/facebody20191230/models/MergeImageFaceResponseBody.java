// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MergeImageFaceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public MergeImageFaceResponseBodyData data;

    public static MergeImageFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MergeImageFaceResponseBody self = new MergeImageFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public MergeImageFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MergeImageFaceResponseBody setData(MergeImageFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MergeImageFaceResponseBodyData getData() {
        return this.data;
    }

    public static class MergeImageFaceResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static MergeImageFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MergeImageFaceResponseBodyData self = new MergeImageFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MergeImageFaceResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
