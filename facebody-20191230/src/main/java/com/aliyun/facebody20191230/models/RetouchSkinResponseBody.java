// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RetouchSkinResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RetouchSkinResponseBodyData data;

    public static RetouchSkinResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetouchSkinResponseBody self = new RetouchSkinResponseBody();
        return TeaModel.build(map, self);
    }

    public RetouchSkinResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetouchSkinResponseBody setData(RetouchSkinResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetouchSkinResponseBodyData getData() {
        return this.data;
    }

    public static class RetouchSkinResponseBodyData extends TeaModel {
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
