// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageseg20191230.models;

import com.aliyun.tea.*;

public class ChangeSkyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ChangeSkyResponseBodyData data;

    public static ChangeSkyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChangeSkyResponseBody self = new ChangeSkyResponseBody();
        return TeaModel.build(map, self);
    }

    public ChangeSkyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ChangeSkyResponseBody setData(ChangeSkyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ChangeSkyResponseBodyData getData() {
        return this.data;
    }

    public static class ChangeSkyResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static ChangeSkyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ChangeSkyResponseBodyData self = new ChangeSkyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ChangeSkyResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
