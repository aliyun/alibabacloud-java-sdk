// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class EnhanceFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public EnhanceFaceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>8B031473-6773-4A4C-AF33-A233758E6E98</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EnhanceFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnhanceFaceResponseBody self = new EnhanceFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnhanceFaceResponseBody setData(EnhanceFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnhanceFaceResponseBodyData getData() {
        return this.data;
    }

    public EnhanceFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EnhanceFaceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/face-enhancement/2021-11-30/8e34b61c-abcf-4708-9d9d-6501968ee806/20211130_080644126523_47ct9w3pgh.jpg?Expires=1638261404&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=2wPdcuCmr%2F86WpBL3HQJw5uCFl">http://vibktprfx-prod-prod-aic-vd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/face-enhancement/2021-11-30/8e34b61c-abcf-4708-9d9d-6501968ee806/20211130_080644126523_47ct9w3pgh.jpg?Expires=1638261404&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=2wPdcuCmr%2F86WpBL3HQJw5uCFl</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static EnhanceFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnhanceFaceResponseBodyData self = new EnhanceFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnhanceFaceResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
