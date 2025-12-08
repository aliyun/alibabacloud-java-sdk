// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class MergeImageFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public MergeImageFaceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>8473A5E5-488E-4612-800E-F95B42381570</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MergeImageFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MergeImageFaceResponseBody self = new MergeImageFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public MergeImageFaceResponseBody setData(MergeImageFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MergeImageFaceResponseBodyData getData() {
        return this.data;
    }

    public MergeImageFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MergeImageFaceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/image-face-fusion/09dedc78-c355-442a-9312-7ab074d6de49_54dc_20210129-025407.jpg?Expires=1611890647&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=2mk2OgIrwMqrvA%2FvDdp0MNaoVU">http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/image-face-fusion/09dedc78-c355-442a-9312-7ab074d6de49_54dc_20210129-025407.jpg?Expires=1611890647&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=2mk2OgIrwMqrvA%2FvDdp0MNaoVU</a>****</p>
         */
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
