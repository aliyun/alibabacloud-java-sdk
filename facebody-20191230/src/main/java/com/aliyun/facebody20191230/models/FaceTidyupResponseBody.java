// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class FaceTidyupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public FaceTidyupResponseBodyData data;

    public static FaceTidyupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FaceTidyupResponseBody self = new FaceTidyupResponseBody();
        return TeaModel.build(map, self);
    }

    public FaceTidyupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FaceTidyupResponseBody setData(FaceTidyupResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FaceTidyupResponseBodyData getData() {
        return this.data;
    }

    public static class FaceTidyupResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static FaceTidyupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FaceTidyupResponseBodyData self = new FaceTidyupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FaceTidyupResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
