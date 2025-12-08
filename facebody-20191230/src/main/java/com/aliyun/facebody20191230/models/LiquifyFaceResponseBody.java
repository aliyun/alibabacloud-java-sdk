// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class LiquifyFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public LiquifyFaceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>CA1C8937-B30C-15E6-B804-41C357BA413B</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/face-liquify/CA1C8937-B30C-15E6-B804-41C357BA413B_5eca_20210923-093411.jpg?Expires=1632391451&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=46apJQVNBz%2FFzDLEYn2M1w9MKA">http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/face-liquify/CA1C8937-B30C-15E6-B804-41C357BA413B_5eca_20210923-093411.jpg?Expires=1632391451&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=46apJQVNBz%2FFzDLEYn2M1w9MKA</a>****</p>
         */
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
