// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class InteractiveFullSegmentationResponseBody extends TeaModel {
    @NameInMap("Data")
    public InteractiveFullSegmentationResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static InteractiveFullSegmentationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InteractiveFullSegmentationResponseBody self = new InteractiveFullSegmentationResponseBody();
        return TeaModel.build(map, self);
    }

    public InteractiveFullSegmentationResponseBody setData(InteractiveFullSegmentationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InteractiveFullSegmentationResponseBodyData getData() {
        return this.data;
    }

    public InteractiveFullSegmentationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InteractiveFullSegmentationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InteractiveFullSegmentationResponseBodyData extends TeaModel {
        @NameInMap("ResultUrl")
        public String resultUrl;

        public static InteractiveFullSegmentationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InteractiveFullSegmentationResponseBodyData self = new InteractiveFullSegmentationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InteractiveFullSegmentationResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

    }

}
