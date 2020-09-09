// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ChangeSkyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public ChangeSkyResponseData data;

    public static ChangeSkyResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeSkyResponse self = new ChangeSkyResponse();
        return TeaModel.build(map, self);
    }

    public ChangeSkyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeSkyResponse setData(ChangeSkyResponseData data) {
        this.data = data;
        return this;
    }
    public ChangeSkyResponseData getData() {
        return this.data;
    }

    public static class ChangeSkyResponseData extends TeaModel {
        @NameInMap("ImageURL")
        @Validation(required = true)
        public String imageURL;

        public static ChangeSkyResponseData build(java.util.Map<String, ?> map) throws Exception {
            ChangeSkyResponseData self = new ChangeSkyResponseData();
            return TeaModel.build(map, self);
        }

        public ChangeSkyResponseData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
