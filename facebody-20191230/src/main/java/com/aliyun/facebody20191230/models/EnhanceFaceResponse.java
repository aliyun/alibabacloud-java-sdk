// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class EnhanceFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public EnhanceFaceResponseData data;

    public static EnhanceFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnhanceFaceResponse self = new EnhanceFaceResponse();
        return TeaModel.build(map, self);
    }

    public EnhanceFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnhanceFaceResponse setData(EnhanceFaceResponseData data) {
        this.data = data;
        return this;
    }
    public EnhanceFaceResponseData getData() {
        return this.data;
    }

    public static class EnhanceFaceResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static EnhanceFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            EnhanceFaceResponseData self = new EnhanceFaceResponseData();
            return TeaModel.build(map, self);
        }

        public EnhanceFaceResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
