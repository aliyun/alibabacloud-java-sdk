// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetRtcTokenResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRtcTokenResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetRtcTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRtcTokenResponseBody self = new GetRtcTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRtcTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRtcTokenResponseBody setData(GetRtcTokenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRtcTokenResponseBodyData getData() {
        return this.data;
    }

    public GetRtcTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRtcTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRtcTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRtcTokenResponseBodyData extends TeaModel {
        @NameInMap("AccountName")
        public String accountName;

        @NameInMap("RtcId")
        public String rtcId;

        @NameInMap("Token")
        public String token;

        public static GetRtcTokenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRtcTokenResponseBodyData self = new GetRtcTokenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRtcTokenResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public GetRtcTokenResponseBodyData setRtcId(String rtcId) {
            this.rtcId = rtcId;
            return this;
        }
        public String getRtcId() {
            return this.rtcId;
        }

        public GetRtcTokenResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

}
