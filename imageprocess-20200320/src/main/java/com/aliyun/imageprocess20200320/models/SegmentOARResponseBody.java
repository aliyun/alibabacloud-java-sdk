// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class SegmentOARResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentOARResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SegmentOARResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentOARResponseBody self = new SegmentOARResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentOARResponseBody setData(SegmentOARResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentOARResponseBodyData getData() {
        return this.data;
    }

    public SegmentOARResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SegmentOARResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentOARResponseBodyData extends TeaModel {
        @NameInMap("ResultURL")
        public String resultURL;

        public static SegmentOARResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentOARResponseBodyData self = new SegmentOARResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentOARResponseBodyData setResultURL(String resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public String getResultURL() {
            return this.resultURL;
        }

    }

}
