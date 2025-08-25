// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class GenerateDynamicImageResponseBody extends TeaModel {
    @NameInMap("Data")
    public GenerateDynamicImageResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>3C047FB7-AE01-42CF-948F-D57F224620ED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GenerateDynamicImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDynamicImageResponseBody self = new GenerateDynamicImageResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDynamicImageResponseBody setData(GenerateDynamicImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateDynamicImageResponseBodyData getData() {
        return this.data;
    }

    public GenerateDynamicImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GenerateDynamicImageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/photo-style-imitation/dynamicPhotoResult/dySkyHair_0d0465eb-b1c9-472a-a7dc-cdff1333f794.avi?Expires=1601196370&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=QejSaTZOR2MB2lVHOUH%2Fj8l3P4">http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/photo-style-imitation/dynamicPhotoResult/dySkyHair_0d0465eb-b1c9-472a-a7dc-cdff1333f794.avi?Expires=1601196370&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=QejSaTZOR2MB2lVHOUH%2Fj8l3P4</a>****</p>
         */
        @NameInMap("Url")
        public String url;

        public static GenerateDynamicImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateDynamicImageResponseBodyData self = new GenerateDynamicImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateDynamicImageResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
