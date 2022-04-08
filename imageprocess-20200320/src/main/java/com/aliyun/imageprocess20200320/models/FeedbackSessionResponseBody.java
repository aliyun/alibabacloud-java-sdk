// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class FeedbackSessionResponseBody extends TeaModel {
    @NameInMap("Data")
    public FeedbackSessionResponseBodyData data;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static FeedbackSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FeedbackSessionResponseBody self = new FeedbackSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public FeedbackSessionResponseBody setData(FeedbackSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FeedbackSessionResponseBodyData getData() {
        return this.data;
    }

    public FeedbackSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class FeedbackSessionResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public String data;

        public static FeedbackSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FeedbackSessionResponseBodyData self = new FeedbackSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FeedbackSessionResponseBodyData setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

    }

}
