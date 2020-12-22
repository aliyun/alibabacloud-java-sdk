// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceBeautyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public FaceBeautyResponseBodyData data;

    public static FaceBeautyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceBeautyResponseBody self = new FaceBeautyResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceBeautyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceBeautyResponseBody setData(FaceBeautyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FaceBeautyResponseBodyData getData() {
        return this.data;
    }

    public static class FaceBeautyResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static FaceBeautyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FaceBeautyResponseBodyData self = new FaceBeautyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FaceBeautyResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
