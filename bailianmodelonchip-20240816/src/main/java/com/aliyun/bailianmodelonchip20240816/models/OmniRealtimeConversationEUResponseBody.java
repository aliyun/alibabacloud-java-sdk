// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class OmniRealtimeConversationEUResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public OmniRealtimeConversationEUResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>89946BAA-E4E1-5114-8A5E-A542FEDC9B16</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static OmniRealtimeConversationEUResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OmniRealtimeConversationEUResponseBody self = new OmniRealtimeConversationEUResponseBody();
        return TeaModel.build(map, self);
    }

    public OmniRealtimeConversationEUResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OmniRealtimeConversationEUResponseBody setData(OmniRealtimeConversationEUResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OmniRealtimeConversationEUResponseBodyData getData() {
        return this.data;
    }

    public OmniRealtimeConversationEUResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public OmniRealtimeConversationEUResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OmniRealtimeConversationEUResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OmniRealtimeConversationEUResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OmniRealtimeConversationEUResponseBodyData extends TeaModel {
        @NameInMap("audioResult")
        public String audioResult;

        public static OmniRealtimeConversationEUResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OmniRealtimeConversationEUResponseBodyData self = new OmniRealtimeConversationEUResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OmniRealtimeConversationEUResponseBodyData setAudioResult(String audioResult) {
            this.audioResult = audioResult;
            return this;
        }
        public String getAudioResult() {
            return this.audioResult;
        }

    }

}
