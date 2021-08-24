// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class RetouchBodyResponseBody extends TeaModel {
    @NameInMap("Data")
    public RetouchBodyResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static RetouchBodyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetouchBodyResponseBody self = new RetouchBodyResponseBody();
        return TeaModel.build(map, self);
    }

    public RetouchBodyResponseBody setData(RetouchBodyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RetouchBodyResponseBodyData getData() {
        return this.data;
    }

    public RetouchBodyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RetouchBodyResponseBodyData extends TeaModel {
        @NameInMap("ImageURL")
        public String imageURL;

        public static RetouchBodyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RetouchBodyResponseBodyData self = new RetouchBodyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RetouchBodyResponseBodyData setImageURL(String imageURL) {
            this.imageURL = imageURL;
            return this;
        }
        public String getImageURL() {
            return this.imageURL;
        }

    }

}
