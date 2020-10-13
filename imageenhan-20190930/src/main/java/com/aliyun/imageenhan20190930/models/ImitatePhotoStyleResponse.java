// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class ImitatePhotoStyleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ImitatePhotoStyleResponseData data;

    public static ImitatePhotoStyleResponse build(java.util.Map<String, ?> map) throws Exception {
        ImitatePhotoStyleResponse self = new ImitatePhotoStyleResponse();
        return TeaModel.build(map, self);
    }

    public ImitatePhotoStyleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImitatePhotoStyleResponse setData(ImitatePhotoStyleResponseData data) {
        this.data = data;
        return this;
    }
    public ImitatePhotoStyleResponseData getData() {
        return this.data;
    }

    public static class ImitatePhotoStyleResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static ImitatePhotoStyleResponseData build(java.util.Map<String, ?> map) throws Exception {
            ImitatePhotoStyleResponseData self = new ImitatePhotoStyleResponseData();
            return TeaModel.build(map, self);
        }

        public ImitatePhotoStyleResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
