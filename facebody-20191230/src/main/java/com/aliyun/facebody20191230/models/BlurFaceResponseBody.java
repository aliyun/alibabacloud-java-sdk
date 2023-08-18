// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BlurFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public BlurFaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static BlurFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BlurFaceResponseBody self = new BlurFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public BlurFaceResponseBody setData(BlurFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public BlurFaceResponseBodyData getData() {
        return this.data;
    }

    public BlurFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BlurFaceResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        @NameInMap("MaskURL")
        public String maskURL;

        public static BlurFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            BlurFaceResponseBodyData self = new BlurFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public BlurFaceResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

        public BlurFaceResponseBodyData setMaskURL(String maskURL) {
            this.maskURL = maskURL;
            return this;
        }
        public String getMaskURL() {
            return this.maskURL;
        }

    }

}
