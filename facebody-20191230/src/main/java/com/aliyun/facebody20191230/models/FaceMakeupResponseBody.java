// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceMakeupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public FaceMakeupResponseBodyData data;

    public static FaceMakeupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceMakeupResponseBody self = new FaceMakeupResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceMakeupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceMakeupResponseBody setData(FaceMakeupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FaceMakeupResponseBodyData getData() {
        return this.data;
    }

    public static class FaceMakeupResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static FaceMakeupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FaceMakeupResponseBodyData self = new FaceMakeupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FaceMakeupResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
