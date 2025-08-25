// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImitatePhotoStyleResponseBody extends TeaModel {
    @NameInMap("Data")
    public ImitatePhotoStyleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>A880432B-6D9A-4EF4-B7B7-863F38A930D9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImitatePhotoStyleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImitatePhotoStyleResponseBody self = new ImitatePhotoStyleResponseBody();
        return TeaModel.build(map, self);
    }

    public ImitatePhotoStyleResponseBody setData(ImitatePhotoStyleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImitatePhotoStyleResponseBodyData getData() {
        return this.data;
    }

    public ImitatePhotoStyleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ImitatePhotoStyleResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/photo-style-imitation/7c4c0809-5e15-4ca7-84b3-ba16711e3255__5cb220200622-075203.jpg?Expires=1592814125&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=DNhhRFPbMBwpHCEhrLdL%2BBF%2BXs">http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/photo-style-imitation/7c4c0809-5e15-4ca7-84b3-ba16711e3255__5cb220200622-075203.jpg?Expires=1592814125&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=DNhhRFPbMBwpHCEhrLdL%2BBF%2BXs</a>****</p>
         */
        @NameInMap("ImageURL")
        public String imageURL;

        public static ImitatePhotoStyleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImitatePhotoStyleResponseBodyData self = new ImitatePhotoStyleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImitatePhotoStyleResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
