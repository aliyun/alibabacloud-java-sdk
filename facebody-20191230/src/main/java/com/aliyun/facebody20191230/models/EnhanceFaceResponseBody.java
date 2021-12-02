// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class EnhanceFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public EnhanceFaceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static EnhanceFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EnhanceFaceResponseBody self = new EnhanceFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public EnhanceFaceResponseBody setData(EnhanceFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EnhanceFaceResponseBodyData getData() {
        return this.data;
    }

    public EnhanceFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class EnhanceFaceResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static EnhanceFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EnhanceFaceResponseBodyData self = new EnhanceFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EnhanceFaceResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
