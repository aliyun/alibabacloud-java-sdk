// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class EnhanceImageColorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public EnhanceImageColorResponseBodyData data;

    public static EnhanceImageColorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnhanceImageColorResponseBody self = new EnhanceImageColorResponseBody();
        return TeaModel.build(map, self);
    }

    public EnhanceImageColorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EnhanceImageColorResponseBody setData(EnhanceImageColorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnhanceImageColorResponseBodyData getData() {
        return this.data;
    }

    public static class EnhanceImageColorResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static EnhanceImageColorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnhanceImageColorResponseBodyData self = new EnhanceImageColorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnhanceImageColorResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
