// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class GetTTSVoiceByIdCustomResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetTTSVoiceByIdCustomResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7239F9E5-A4DB-55BA-B701-0CE47DBD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True。</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetTTSVoiceByIdCustomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTTSVoiceByIdCustomResponseBody self = new GetTTSVoiceByIdCustomResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTTSVoiceByIdCustomResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTTSVoiceByIdCustomResponseBody setData(GetTTSVoiceByIdCustomResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTTSVoiceByIdCustomResponseBodyData getData() {
        return this.data;
    }

    public GetTTSVoiceByIdCustomResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTTSVoiceByIdCustomResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTTSVoiceByIdCustomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTTSVoiceByIdCustomResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetTTSVoiceByIdCustomResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx-aliyuncs.com/material/INPUT_TTS_VOICE/Mt.CQEG75L4FWIU2/TestTTSVoiceName.mp3?Expires=1764262805&OSSAccessKeyId=LTAI5tK3WcKwKtAyaTSe*****&Signature=D%2Fld6gp9Zh6TsGRU9cd6GD2pFY0%3D">https://xxx-aliyuncs.com/material/INPUT_TTS_VOICE/Mt.CQEG75L4FWIU2/TestTTSVoiceName.mp3?Expires=1764262805&amp;OSSAccessKeyId=LTAI5tK3WcKwKtAyaTSe*****&amp;Signature=D%2Fld6gp9Zh6TsGRU9cd6GD2pFY0%3D</a></p>
         */
        @NameInMap("audioURL")
        public String audioURL;

        /**
         * <strong>example:</strong>
         * <p>CHECKING。</p>
         */
        @NameInMap("censorStatus")
        public String censorStatus;

        /**
         * <strong>example:</strong>
         * <p>false。</p>
         */
        @NameInMap("common")
        public Boolean common;

        /**
         * <strong>example:</strong>
         * <p>2025-11-28T10:11:28</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>This is a testTTSVoice。</p>
         */
        @NameInMap("description")
        public String description;

        @NameInMap("errorDetail")
        public String errorDetail;

        /**
         * <strong>example:</strong>
         * <p>FEMALE</p>
         */
        @NameInMap("gender")
        public String gender;

        /**
         * <strong>example:</strong>
         * <p>M1lhKArheOyYdeYyb*****</p>
         */
        @NameInMap("id")
        public String id;

        @NameInMap("language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>2025-11-28T13:41:31</p>
         */
        @NameInMap("modifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>TestTTSVoiceName。</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>100。</p>
         */
        @NameInMap("remainSeconds")
        public Long remainSeconds;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS。</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>avatar-2464b55a65794e75a20fe07dde2*****</p>
         */
        @NameInMap("voiceKey")
        public String voiceKey;

        public static GetTTSVoiceByIdCustomResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTTSVoiceByIdCustomResponseBodyData self = new GetTTSVoiceByIdCustomResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTTSVoiceByIdCustomResponseBodyData setAudioURL(String audioURL) {
            this.audioURL = audioURL;
            return this;
        }
        public String getAudioURL() {
            return this.audioURL;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setCensorStatus(String censorStatus) {
            this.censorStatus = censorStatus;
            return this;
        }
        public String getCensorStatus() {
            return this.censorStatus;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setCommon(Boolean common) {
            this.common = common;
            return this;
        }
        public Boolean getCommon() {
            return this.common;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setErrorDetail(String errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public String getErrorDetail() {
            return this.errorDetail;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setRemainSeconds(Long remainSeconds) {
            this.remainSeconds = remainSeconds;
            return this;
        }
        public Long getRemainSeconds() {
            return this.remainSeconds;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public GetTTSVoiceByIdCustomResponseBodyData setVoiceKey(String voiceKey) {
            this.voiceKey = voiceKey;
            return this;
        }
        public String getVoiceKey() {
            return this.voiceKey;
        }

    }

}
