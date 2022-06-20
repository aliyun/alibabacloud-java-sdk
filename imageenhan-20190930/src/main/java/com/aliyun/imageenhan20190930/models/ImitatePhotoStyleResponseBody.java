// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImitatePhotoStyleResponseBody extends TeaModel {
    @NameInMap("Data")
    public ImitatePhotoStyleResponseBodyData data;

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
