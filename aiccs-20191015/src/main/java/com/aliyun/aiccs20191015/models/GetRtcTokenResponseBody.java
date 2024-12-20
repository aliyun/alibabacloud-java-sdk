// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetRtcTokenResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>{&quot;cleansession&quot;:true,&quot;clientId&quot;:&quot;GID_VOIP@@@ClientId_2000000001271771_100685295007&quot;,&quot;conferenceTopic&quot;:&quot;cs_alicom_voip_conference_pre&quot;,&quot;dataTopic&quot;:&quot;alicom_voip_data_pre&quot;,&quot;host&quot;:&quot;mqtt-cn-4590mdhb901.mqtt.aliyuncs.com&quot;,&quot;meetingEventKeepAliveInterval&quot;:0,&quot;phoneTopic&quot;:&quot;alicom_voip_phone&quot;,&quot;port&quot;:0,&quot;reconnectTimeout&quot;:2000,&quot;registerTime&quot;:0,&quot;sdkClientPort&quot;:8883,&quot;serverId&quot;:&quot;GID_VOIP@@@MTEuMjIuMTQ1Ljgy&quot;,&quot;sgwServerTopic&quot;:&quot;alicom_voip_server_pre&quot;,&quot;tlsport&quot;:443,&quot;tokenData&quot;:&quot;LzMT+XLFl5s/YWJ/MlDz4t/Lq5HC1iGU1P28HAMaxYzmBSHQsWXgdISJ1ZJ+2cxaU0jwYsoyG8Q8cCIbLZTwwaFHf7gc7pPXbJGYgJWUr5ooKsoHaVvvG34cww7W8woWE1OsmZGFDODvooOIjF1CZSorVrR8OwRdprW99yqhMhkJKh7r5f3HfiQgoJWL8b3A85RrRGCSP057skgQ5rIqVAlx7jDFrOTdLtz+krken8qYvpaVBO9wRfFyWQLvxAgNJNx3Oql/hpzc2o3+xbKGTA/P2siLn6Nee1FYk5ClpXcnvfSTM4BAauuWR+oES10VblKEKTU5R/pfjXj3UKOlZ1+OdGO93WA16BR/l1uRb3cOLqya5pjWM+oSmo0sOR7B0ATLz6K1xA0Pc+p6Mu8hZl+OdGO93WA1kj1L0h9Z6CAZG4ol/BNdIg9z6noy7yFmX450Y73dYDWSPUvSH1noIBkbiiX8E10iT0a6ypXxupQdyyrhh8j1yw6otqnw5AT5Tj5VsVWVfflXeZ8nPt1ydXC9nWeHX7K80O6vtOU9M8Qn5VrhkP0F1umbOoYs3NfM+WYZIQx4pkViQo6qqkxgbEg1l6oHJbmOVzrxYRrDTIxqgE/pb0YVJQ==&quot;,&quot;useTLS&quot;:false,&quot;username&quot;:&quot;LTAI27GqAW1VrcQA&quot;}</p>
     */
    @NameInMap("Data")
    public GetRtcTokenResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>139000000</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>200000000*******</p>
         */
        @NameInMap("RtcId")
        public String rtcId;

        /**
         * <strong>example:</strong>
         * <p>{“cleansession”:true,”clientId”:”GID_VOIP@@@ClientId_****”,”conferenceTopic”:”cs_alicom_voip_conference”,”host”:”mqtt-cn-4590mdhb901.mqtt.aliyuncs.com”,”meetingEventKeepAliveInterval”:0,”phoneTopic”:”alicom_voip_phone”,”port”:0,”reconnectTimeout”:2000,”registerTime”:0,”sdkClientPort”:8883,”serverId”:”GID_VOIP@@@MTEuMTMuMTM2LjExOA==”,”sgwServerTopic”:”alicom_voip_server_pre”,”tlsport”:443,”tokenData”:”abcdef”,”useTLS”:false}</p>
         */
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
