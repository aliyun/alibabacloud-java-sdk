// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aigen20240111.models;

import com.aliyun.tea.*;

public class InteractiveScribbleSegmentationResponseBody extends TeaModel {
    @NameInMap("Data")
    public InteractiveScribbleSegmentationResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static InteractiveScribbleSegmentationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InteractiveScribbleSegmentationResponseBody self = new InteractiveScribbleSegmentationResponseBody();
        return TeaModel.build(map, self);
    }

    public InteractiveScribbleSegmentationResponseBody setData(InteractiveScribbleSegmentationResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InteractiveScribbleSegmentationResponseBodyData getData() {
        return this.data;
    }

    public InteractiveScribbleSegmentationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InteractiveScribbleSegmentationResponseBodyData extends TeaModel {
        @NameInMap("ResultUrl")
        public String resultUrl;

        public static InteractiveScribbleSegmentationResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InteractiveScribbleSegmentationResponseBodyData self = new InteractiveScribbleSegmentationResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InteractiveScribbleSegmentationResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

    }

}
