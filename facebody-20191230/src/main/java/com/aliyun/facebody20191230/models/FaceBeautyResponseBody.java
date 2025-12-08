// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceBeautyResponseBody extends TeaModel {
    @NameInMap("Data")
    public FaceBeautyResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>35C284E1-C5F5-4E5E-B7AD-97BBF485CDC8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static FaceBeautyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceBeautyResponseBody self = new FaceBeautyResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceBeautyResponseBody setData(FaceBeautyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FaceBeautyResponseBodyData getData() {
        return this.data;
    }

    public FaceBeautyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FaceBeautyResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-taobao-mm-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/pixelai-portrait-beauty/2020_03_24/2bbbdb7907901412_facebeauty.jpg?Expires=1585277923&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=myOPfNQcRyijgrWBU%2BZ4dPuV5Q">http://algo-app-taobao-mm-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/pixelai-portrait-beauty/2020_03_24/2bbbdb7907901412_facebeauty.jpg?Expires=1585277923&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=myOPfNQcRyijgrWBU%2BZ4dPuV5Q</a>****</p>
         */
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
