// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class TargetVolumeSegmentResponseBody extends TeaModel {
    @NameInMap("Data")
    public TargetVolumeSegmentResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static TargetVolumeSegmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TargetVolumeSegmentResponseBody self = new TargetVolumeSegmentResponseBody();
        return TeaModel.build(map, self);
    }

    public TargetVolumeSegmentResponseBody setData(TargetVolumeSegmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TargetVolumeSegmentResponseBodyData getData() {
        return this.data;
    }

    public TargetVolumeSegmentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public TargetVolumeSegmentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class TargetVolumeSegmentResponseBodyData extends TeaModel {
        @NameInMap("ResultURL")
        public String resultURL;

        public static TargetVolumeSegmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TargetVolumeSegmentResponseBodyData self = new TargetVolumeSegmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TargetVolumeSegmentResponseBodyData setResultURL(String resultURL) {
            this.resultURL = resultURL;
            return this;
        }
        public String getResultURL() {
            return this.resultURL;
        }

    }

}
