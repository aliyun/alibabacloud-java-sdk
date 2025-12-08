// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class BlurFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public BlurFaceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>4C6080B0-64C4-488E-BBA6-245749CA11AD</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_FaceBlur/2020-8-5/invi_FaceBlur_015966077063461060948_IBdDsq.jpg?Expires=1596609506&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=x8n3jq1X91Sq7BKWE4vRHSu6g9">http://viapi-cn-shanghai-dha-segmenter.oss-cn-shanghai.aliyuncs.com/upload/result_FaceBlur/2020-8-5/invi_FaceBlur_015966077063461060948_IBdDsq.jpg?Expires=1596609506&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=x8n3jq1X91Sq7BKWE4vRHSu6g9</a>****</p>
         */
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
