// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class SegmentLymphNodeResponseBody extends TeaModel {
    @NameInMap("Data")
    public SegmentLymphNodeResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SegmentLymphNodeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SegmentLymphNodeResponseBody self = new SegmentLymphNodeResponseBody();
        return TeaModel.build(map, self);
    }

    public SegmentLymphNodeResponseBody setData(SegmentLymphNodeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SegmentLymphNodeResponseBodyData getData() {
        return this.data;
    }

    public SegmentLymphNodeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SegmentLymphNodeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SegmentLymphNodeResponseBodyData extends TeaModel {
        @NameInMap("ResultURL")
        public String resultURL;

        public static SegmentLymphNodeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SegmentLymphNodeResponseBodyData self = new SegmentLymphNodeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SegmentLymphNodeResponseBodyData setResultURL(String resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public String getResultURL() {
            return this.resultURL;
        }

    }

}
