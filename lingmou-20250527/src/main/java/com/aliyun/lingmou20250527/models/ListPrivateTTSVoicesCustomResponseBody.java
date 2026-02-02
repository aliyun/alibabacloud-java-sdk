// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class ListPrivateTTSVoicesCustomResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListPrivateTTSVoicesCustomResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>qht-fc2-test</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>7239F9E5-A4DB-55BA-B701-0CE47DBDB0A8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListPrivateTTSVoicesCustomResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivateTTSVoicesCustomResponseBody self = new ListPrivateTTSVoicesCustomResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivateTTSVoicesCustomResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPrivateTTSVoicesCustomResponseBody setData(ListPrivateTTSVoicesCustomResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPrivateTTSVoicesCustomResponseBodyData getData() {
        return this.data;
    }

    public ListPrivateTTSVoicesCustomResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPrivateTTSVoicesCustomResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListPrivateTTSVoicesCustomResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPrivateTTSVoicesCustomResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListPrivateTTSVoicesCustomResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrivateTTSVoicesCustomResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPrivateTTSVoicesCustomResponseBodyDataData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx-aliyuncs.com/material/INPUT_TRAIN_AUDIO/Mt.CQEG75L4FWIU2/TestTTSVoiceName.mp3?Expires=1764262805&OSSAccessKeyId=LTAI5tK3WcKwKtAyaT******&Signature=D%2Fld6gp9Zh6TsGRU9cd6GD2pFY0%3D">https://xxx-aliyuncs.com/material/INPUT_TRAIN_AUDIO/Mt.CQEG75L4FWIU2/TestTTSVoiceName.mp3?Expires=1764262805&amp;OSSAccessKeyId=LTAI5tK3WcKwKtAyaT******&amp;Signature=D%2Fld6gp9Zh6TsGRU9cd6GD2pFY0%3D</a></p>
         */
        @NameInMap("audioURL")
        public String audioURL;

        /**
         * <strong>example:</strong>
         * <p>PASS</p>
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
         * <p>2024-04-15T09:42:15Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>Optional for WH managernif no issue will be cancel</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>错误码。</p>
         * 
         * <strong>example:</strong>
         * <p>Audio.AudioShortError</p>
         */
        @NameInMap("errorCode")
        public String errorCode;

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
         * <p>ZH_CN</p>
         */
        @NameInMap("language")
        public String language;

        /**
         * <strong>example:</strong>
         * <p>2024-04-15T09:42:15Z</p>
         */
        @NameInMap("modifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p>TestTTSVoice</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("remainSeconds")
        public Long remainSeconds;

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
         * <p>TestTTSVoice</p>
         */
        @NameInMap("voiceKey")
        public String voiceKey;

        public static ListPrivateTTSVoicesCustomResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateTTSVoicesCustomResponseBodyDataData self = new ListPrivateTTSVoicesCustomResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setAudioURL(String audioURL) {
            this.audioURL = audioURL;
            return this;
        }
        public String getAudioURL() {
            return this.audioURL;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setCensorStatus(String censorStatus) {
            this.censorStatus = censorStatus;
            return this;
        }
        public String getCensorStatus() {
            return this.censorStatus;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setCommon(Boolean common) {
            this.common = common;
            return this;
        }
        public Boolean getCommon() {
            return this.common;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setErrorDetail(String errorDetail) {
            this.errorDetail = errorDetail;
            return this;
        }
        public String getErrorDetail() {
            return this.errorDetail;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setRemainSeconds(Long remainSeconds) {
            this.remainSeconds = remainSeconds;
            return this;
        }
        public Long getRemainSeconds() {
            return this.remainSeconds;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public ListPrivateTTSVoicesCustomResponseBodyDataData setVoiceKey(String voiceKey) {
            this.voiceKey = voiceKey;
            return this;
        }
        public String getVoiceKey() {
            return this.voiceKey;
        }

    }

    public static class ListPrivateTTSVoicesCustomResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<ListPrivateTTSVoicesCustomResponseBodyDataData> data;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("pages")
        public Integer pages;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("size")
        public Integer size;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("total")
        public Long total;

        public static ListPrivateTTSVoicesCustomResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPrivateTTSVoicesCustomResponseBodyData self = new ListPrivateTTSVoicesCustomResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPrivateTTSVoicesCustomResponseBodyData setData(java.util.List<ListPrivateTTSVoicesCustomResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListPrivateTTSVoicesCustomResponseBodyDataData> getData() {
            return this.data;
        }

        public ListPrivateTTSVoicesCustomResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListPrivateTTSVoicesCustomResponseBodyData setPages(Integer pages) {
            this.pages = pages;
            return this;
        }
        public Integer getPages() {
            return this.pages;
        }

        public ListPrivateTTSVoicesCustomResponseBodyData setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListPrivateTTSVoicesCustomResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
