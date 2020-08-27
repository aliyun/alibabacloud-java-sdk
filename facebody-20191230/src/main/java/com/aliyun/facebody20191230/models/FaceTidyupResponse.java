// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceTidyupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public FaceTidyupResponseData data;

    public static FaceTidyupResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceTidyupResponse self = new FaceTidyupResponse();
        return TeaModel.build(map, self);
    }

    public FaceTidyupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceTidyupResponse setData(FaceTidyupResponseData data) {
        this.data = data;
        return this;
    }
    public FaceTidyupResponseData getData() {
        return this.data;
    }

    public static class FaceTidyupResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static FaceTidyupResponseData build(java.util.Map<String, ?> map) throws Exception {
            FaceTidyupResponseData self = new FaceTidyupResponseData();
            return TeaModel.build(map, self);
        }

        public FaceTidyupResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
