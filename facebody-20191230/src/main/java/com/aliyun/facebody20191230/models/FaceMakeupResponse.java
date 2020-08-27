// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceMakeupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public FaceMakeupResponseData data;

    public static FaceMakeupResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceMakeupResponse self = new FaceMakeupResponse();
        return TeaModel.build(map, self);
    }

    public FaceMakeupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceMakeupResponse setData(FaceMakeupResponseData data) {
        this.data = data;
        return this;
    }
    public FaceMakeupResponseData getData() {
        return this.data;
    }

    public static class FaceMakeupResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static FaceMakeupResponseData build(java.util.Map<String, ?> map) throws Exception {
            FaceMakeupResponseData self = new FaceMakeupResponseData();
            return TeaModel.build(map, self);
        }

        public FaceMakeupResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
