// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListAvailableTtsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Access Denied</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListAvailableTtsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>5EBAEBE6-0E77-5E1F-99E4-7B20512F22222</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListAvailableTtsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAvailableTtsResponseBody self = new ListAvailableTtsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAvailableTtsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListAvailableTtsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAvailableTtsResponseBody setData(java.util.List<ListAvailableTtsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAvailableTtsResponseBodyData> getData() {
        return this.data;
    }

    public ListAvailableTtsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAvailableTtsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAvailableTtsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAvailableTtsResponseBodyData extends TeaModel {
        /**
         * <p>音色试听文件</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("TtsAuditionFileUrl")
        public String ttsAuditionFileUrl;

        /**
         * <p>音色平台CosyVoice/Volcano</p>
         * 
         * <strong>example:</strong>
         * <p>CosyVoice/Volcano</p>
         */
        @NameInMap("TtsEngine")
        public String ttsEngine;

        /**
         * <p>音色cosy类型 cosyvoice-v2-XXXX-XXXX</p>
         * 
         * <strong>example:</strong>
         * <p>5EBAEBE6-0E77-5E1F-99E4-7B20512FCB3C</p>
         */
        @NameInMap("TtsStyle")
        public String ttsStyle;

        /**
         * <p>音色编码</p>
         * 
         * <strong>example:</strong>
         * <p>V123456789</p>
         */
        @NameInMap("TtsVoiceCode")
        public String ttsVoiceCode;

        /**
         * <p>音色名称</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("TtsVoiceName")
        public String ttsVoiceName;

        public static ListAvailableTtsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAvailableTtsResponseBodyData self = new ListAvailableTtsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAvailableTtsResponseBodyData setTtsAuditionFileUrl(String ttsAuditionFileUrl) {
            this.ttsAuditionFileUrl = ttsAuditionFileUrl;
            return this;
        }
        public String getTtsAuditionFileUrl() {
            return this.ttsAuditionFileUrl;
        }

        public ListAvailableTtsResponseBodyData setTtsEngine(String ttsEngine) {
            this.ttsEngine = ttsEngine;
            return this;
        }
        public String getTtsEngine() {
            return this.ttsEngine;
        }

        public ListAvailableTtsResponseBodyData setTtsStyle(String ttsStyle) {
            this.ttsStyle = ttsStyle;
            return this;
        }
        public String getTtsStyle() {
            return this.ttsStyle;
        }

        public ListAvailableTtsResponseBodyData setTtsVoiceCode(String ttsVoiceCode) {
            this.ttsVoiceCode = ttsVoiceCode;
            return this;
        }
        public String getTtsVoiceCode() {
            return this.ttsVoiceCode;
        }

        public ListAvailableTtsResponseBodyData setTtsVoiceName(String ttsVoiceName) {
            this.ttsVoiceName = ttsVoiceName;
            return this;
        }
        public String getTtsVoiceName() {
            return this.ttsVoiceName;
        }

    }

}
