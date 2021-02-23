// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lvwangwatermark20210104.models;

import com.aliyun.tea.*;

public class GetAudioTraceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<GetAudioTraceResponseBodyData> data;

    public static GetAudioTraceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAudioTraceResponseBody self = new GetAudioTraceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAudioTraceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAudioTraceResponseBody setData(java.util.List<GetAudioTraceResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetAudioTraceResponseBodyData> getData() {
        return this.data;
    }

    public static class GetAudioTraceResponseBodyData extends TeaModel {
        @NameInMap("ResultUrl")
        public String resultUrl;

        @NameInMap("UserInfo")
        public String userInfo;

        public static GetAudioTraceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAudioTraceResponseBodyData self = new GetAudioTraceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAudioTraceResponseBodyData setResultUrl(String resultUrl) {
            this.resultUrl = resultUrl;
            return this;
        }
        public String getResultUrl() {
            return this.resultUrl;
        }

        public GetAudioTraceResponseBodyData setUserInfo(String userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public String getUserInfo() {
            return this.userInfo;
        }

    }

}
