// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class ResetCustomizedResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SdkDemos")
    public ResetCustomizedResponseBodySdkDemos sdkDemos;

    public static ResetCustomizedResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResetCustomizedResponseBody self = new ResetCustomizedResponseBody();
        return TeaModel.build(map, self);
    }

    public ResetCustomizedResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ResetCustomizedResponseBody setSdkDemos(ResetCustomizedResponseBodySdkDemos sdkDemos) {
        this.sdkDemos = sdkDemos;
        return this;
    }
    public ResetCustomizedResponseBodySdkDemos getSdkDemos() {
        return this.sdkDemos;
    }

    public static class ResetCustomizedResponseBodySdkDemosSdkDemo extends TeaModel {
        @NameInMap("CallDemo")
        public String callDemo;

        @NameInMap("IdeKey")
        public String ideKey;

        public static ResetCustomizedResponseBodySdkDemosSdkDemo build(java.util.Map<String, ?> map) throws Exception {
            ResetCustomizedResponseBodySdkDemosSdkDemo self = new ResetCustomizedResponseBodySdkDemosSdkDemo();
            return TeaModel.build(map, self);
        }

        public ResetCustomizedResponseBodySdkDemosSdkDemo setCallDemo(String callDemo) {
            this.callDemo = callDemo;
            return this;
        }
        public String getCallDemo() {
            return this.callDemo;
        }

        public ResetCustomizedResponseBodySdkDemosSdkDemo setIdeKey(String ideKey) {
            this.ideKey = ideKey;
            return this;
        }
        public String getIdeKey() {
            return this.ideKey;
        }

    }

    public static class ResetCustomizedResponseBodySdkDemos extends TeaModel {
        @NameInMap("SdkDemo")
        public java.util.List<ResetCustomizedResponseBodySdkDemosSdkDemo> sdkDemo;

        public static ResetCustomizedResponseBodySdkDemos build(java.util.Map<String, ?> map) throws Exception {
            ResetCustomizedResponseBodySdkDemos self = new ResetCustomizedResponseBodySdkDemos();
            return TeaModel.build(map, self);
        }

        public ResetCustomizedResponseBodySdkDemos setSdkDemo(java.util.List<ResetCustomizedResponseBodySdkDemosSdkDemo> sdkDemo) {
            this.sdkDemo = sdkDemo;
            return this;
        }
        public java.util.List<ResetCustomizedResponseBodySdkDemosSdkDemo> getSdkDemo() {
            return this.sdkDemo;
        }

    }

}
