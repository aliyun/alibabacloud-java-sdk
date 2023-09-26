// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160701.models;

import com.aliyun.tea.*;

public class GetCustomizedInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SdkDemos")
    public GetCustomizedInfoResponseBodySdkDemos sdkDemos;

    public static GetCustomizedInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizedInfoResponseBody self = new GetCustomizedInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCustomizedInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCustomizedInfoResponseBody setSdkDemos(GetCustomizedInfoResponseBodySdkDemos sdkDemos) {
        this.sdkDemos = sdkDemos;
        return this;
    }
    public GetCustomizedInfoResponseBodySdkDemos getSdkDemos() {
        return this.sdkDemos;
    }

    public static class GetCustomizedInfoResponseBodySdkDemosSdkDemo extends TeaModel {
        @NameInMap("CallDemo")
        public String callDemo;

        @NameInMap("IdeKey")
        public String ideKey;

        public static GetCustomizedInfoResponseBodySdkDemosSdkDemo build(java.util.Map<String, ?> map) throws Exception {
            GetCustomizedInfoResponseBodySdkDemosSdkDemo self = new GetCustomizedInfoResponseBodySdkDemosSdkDemo();
            return TeaModel.build(map, self);
        }

        public GetCustomizedInfoResponseBodySdkDemosSdkDemo setCallDemo(String callDemo) {
            this.callDemo = callDemo;
            return this;
        }
        public String getCallDemo() {
            return this.callDemo;
        }

        public GetCustomizedInfoResponseBodySdkDemosSdkDemo setIdeKey(String ideKey) {
            this.ideKey = ideKey;
            return this;
        }
        public String getIdeKey() {
            return this.ideKey;
        }

    }

    public static class GetCustomizedInfoResponseBodySdkDemos extends TeaModel {
        @NameInMap("SdkDemo")
        public java.util.List<GetCustomizedInfoResponseBodySdkDemosSdkDemo> sdkDemo;

        public static GetCustomizedInfoResponseBodySdkDemos build(java.util.Map<String, ?> map) throws Exception {
            GetCustomizedInfoResponseBodySdkDemos self = new GetCustomizedInfoResponseBodySdkDemos();
            return TeaModel.build(map, self);
        }

        public GetCustomizedInfoResponseBodySdkDemos setSdkDemo(java.util.List<GetCustomizedInfoResponseBodySdkDemosSdkDemo> sdkDemo) {
            this.sdkDemo = sdkDemo;
            return this;
        }
        public java.util.List<GetCustomizedInfoResponseBodySdkDemosSdkDemo> getSdkDemo() {
            return this.sdkDemo;
        }

    }

}
