// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ColorizeImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public ColorizeImageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>124A4B09-68EF-4178-B98D-319089D4268B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ColorizeImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ColorizeImageResponseBody self = new ColorizeImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ColorizeImageResponseBody setData(ColorizeImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ColorizeImageResponseBodyData getData() {
        return this.data;
    }

    public ColorizeImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ColorizeImageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-vc-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/face-enhancement/2020_11_26/20201126_182812286268_079260.jpg?Expires=1606388292&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=f71Bx37g%2BGhM%2B6FOXM0EbNL8W4">http://algo-app-aic-vc-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/face-enhancement/2020_11_26/20201126_182812286268_079260.jpg?Expires=1606388292&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=f71Bx37g%2BGhM%2B6FOXM0EbNL8W4</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static ColorizeImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ColorizeImageResponseBodyData self = new ColorizeImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ColorizeImageResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
