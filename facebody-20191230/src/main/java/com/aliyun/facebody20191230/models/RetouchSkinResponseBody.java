// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RetouchSkinResponseBody extends TeaModel {
    @NameInMap("Data")
    public RetouchSkinResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>FD2BF3DF-3D98-1D5D-85BB-C8EC3A9FE347</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RetouchSkinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetouchSkinResponseBody self = new RetouchSkinResponseBody();
        return TeaModel.build(map, self);
    }

    public RetouchSkinResponseBody setData(RetouchSkinResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetouchSkinResponseBodyData getData() {
        return this.data;
    }

    public RetouchSkinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RetouchSkinResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/skin-retouch/FD2BF3DF-3D98-1D5D-85BB-C8EC3A9FE347_3467_20210923-094238.jpg?Expires=1632391959&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=jXJcFTv3no7Gx%2BLuPvANhRSnc2">http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/skin-retouch/FD2BF3DF-3D98-1D5D-85BB-C8EC3A9FE347_3467_20210923-094238.jpg?Expires=1632391959&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=jXJcFTv3no7Gx%2BLuPvANhRSnc2</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static RetouchSkinResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetouchSkinResponseBodyData self = new RetouchSkinResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetouchSkinResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
