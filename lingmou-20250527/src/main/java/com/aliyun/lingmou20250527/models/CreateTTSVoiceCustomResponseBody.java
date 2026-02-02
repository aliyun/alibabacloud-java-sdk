// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateTTSVoiceCustomResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public CreateTTSVoiceCustomResponseBodyData data;

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
     * <p>A7174E51-3523-5AEB-AE18-1D877FF22497</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateTTSVoiceCustomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTTSVoiceCustomResponseBody self = new CreateTTSVoiceCustomResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTTSVoiceCustomResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateTTSVoiceCustomResponseBody setData(CreateTTSVoiceCustomResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTTSVoiceCustomResponseBodyData getData() {
        return this.data;
    }

    public CreateTTSVoiceCustomResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateTTSVoiceCustomResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTTSVoiceCustomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTTSVoiceCustomResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTTSVoiceCustomResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx-aliyuncs.com/material/INPUT_TRAIN_AUDIO/Mt.CQEG75L4FWIU2/TestTTSVoiceName.mp3?Expires=1764262805&OSSAccessKeyId=LTAI5tK3WcKwKtAyaT******&Signature=D%2Fld6gp9Zh6TsGRU9cd6GD2pFY0%3D">https://xxx-aliyuncs.com/material/INPUT_TRAIN_AUDIO/Mt.CQEG75L4FWIU2/TestTTSVoiceName.mp3?Expires=1764262805&amp;OSSAccessKeyId=LTAI5tK3WcKwKtAyaT******&amp;Signature=D%2Fld6gp9Zh6TsGRU9cd6GD2pFY0%3D</a></p>
         */
        @NameInMap("audioURL")
        public String audioURL;

        /**
         * <strong>example:</strong>
         * <p>CHECKING</p>
         */
        @NameInMap("censorStatus")
        public String censorStatus;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("common")
        public Boolean common;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10T07:48:31Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>This is a testTTSVoice。</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>Error</p>
         */
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
         * <p>M1lhKArheOyYdeYybDFqS1-Q</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>zh</p>
         */
        @NameInMap("language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>2024-10-10T07:48:31Z</p>
         */
        @NameInMap("modifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>TestTTSVoiceName</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("pitchRate")
        public Float pitchRate;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("remainSeconds")
        public Long remainSeconds;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("speechRate")
        public Float speechRate;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("status")
        public String status;

        @NameInMap("text")
        public String text;

        /**
         * <strong>example:</strong>
         * <p>testTTSVoice</p>
         */
        @NameInMap("voiceKey")
        public String voiceKey;

        public static CreateTTSVoiceCustomResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTTSVoiceCustomResponseBodyData self = new CreateTTSVoiceCustomResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTTSVoiceCustomResponseBodyData setAudioURL(String audioURL) {
            this.audioURL = audioURL;
            return this;
        }
        public String getAudioURL() {
            return this.audioURL;
        }

        public CreateTTSVoiceCustomResponseBodyData setCensorStatus(String censorStatus) {
            this.censorStatus = censorStatus;
            return this;
        }
        public String getCensorStatus() {
            return this.censorStatus;
        }

        public CreateTTSVoiceCustomResponseBodyData setCommon(Boolean common) {
            this.common = common;
            return this;
        }
        public Boolean getCommon() {
            return this.common;
        }

        public CreateTTSVoiceCustomResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateTTSVoiceCustomResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateTTSVoiceCustomResponseBodyData setErrorDetail(String errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public String getErrorDetail() {
            return this.errorDetail;
        }

        public CreateTTSVoiceCustomResponseBodyData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public CreateTTSVoiceCustomResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateTTSVoiceCustomResponseBodyData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public CreateTTSVoiceCustomResponseBodyData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateTTSVoiceCustomResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTTSVoiceCustomResponseBodyData setPitchRate(Float pitchRate) {
            this.pitchRate = pitchRate;
            return this;
        }
        public Float getPitchRate() {
            return this.pitchRate;
        }

        public CreateTTSVoiceCustomResponseBodyData setRemainSeconds(Long remainSeconds) {
            this.remainSeconds = remainSeconds;
            return this;
        }
        public Long getRemainSeconds() {
            return this.remainSeconds;
        }

        public CreateTTSVoiceCustomResponseBodyData setSpeechRate(Float speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Float getSpeechRate() {
            return this.speechRate;
        }

        public CreateTTSVoiceCustomResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateTTSVoiceCustomResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public CreateTTSVoiceCustomResponseBodyData setVoiceKey(String voiceKey) {
            this.voiceKey = voiceKey;
            return this;
        }
        public String getVoiceKey() {
            return this.voiceKey;
        }

    }

}
