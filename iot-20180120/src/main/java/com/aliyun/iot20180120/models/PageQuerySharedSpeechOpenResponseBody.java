// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class PageQuerySharedSpeechOpenResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails. For more information, see [Error codes](~~87387~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result returned if the request was successful.</p>
     */
    @NameInMap("Data")
    public PageQuerySharedSpeechOpenResponseBodyData data;

    /**
     * <p>The error message returned if the request fails.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PageQuerySharedSpeechOpenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PageQuerySharedSpeechOpenResponseBody self = new PageQuerySharedSpeechOpenResponseBody();
        return TeaModel.build(map, self);
    }

    public PageQuerySharedSpeechOpenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PageQuerySharedSpeechOpenResponseBody setData(PageQuerySharedSpeechOpenResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PageQuerySharedSpeechOpenResponseBodyData getData() {
        return this.data;
    }

    public PageQuerySharedSpeechOpenResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PageQuerySharedSpeechOpenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PageQuerySharedSpeechOpenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PageQuerySharedSpeechOpenResponseBodyDataResultDataData extends TeaModel {
        /**
         * <p>The audio format. Valid values: **wav**, **mp3**, and **amr**.</p>
         */
        @NameInMap("AudioFormat")
        public String audioFormat;

        /**
         * <p>The unique identifier of the speech in the project.</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The unique identifier of the template.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The broadcasting speed. Valid values: -500 to 500.</p>
         */
        @NameInMap("SpeechRate")
        public Integer speechRate;

        /**
         * <p>The status of the speeches. Valid values:</p>
         * <br>
         * <p>*   **1**: The speeches are pending approval.</p>
         * <p>*   **2**: The speeches are approved.</p>
         * <p>*   **3**: The speeches are rejected.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The content of the speech.</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>The sound effect that is used to broadcast speeches.</p>
         */
        @NameInMap("Voice")
        public String voice;

        /**
         * <p>The volume. Valid values: 0 to 100.</p>
         */
        @NameInMap("Volume")
        public Integer volume;

        public static PageQuerySharedSpeechOpenResponseBodyDataResultDataData build(java.util.Map<String, ?> map) throws Exception {
            PageQuerySharedSpeechOpenResponseBodyDataResultDataData self = new PageQuerySharedSpeechOpenResponseBodyDataResultDataData();
            return TeaModel.build(map, self);
        }

        public PageQuerySharedSpeechOpenResponseBodyDataResultDataData setAudioFormat(String audioFormat) {
            this.audioFormat = audioFormat;
            return this;
        }
        public String getAudioFormat() {
            return this.audioFormat;
        }

        public PageQuerySharedSpeechOpenResponseBodyDataResultDataData setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public PageQuerySharedSpeechOpenResponseBodyDataResultDataData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public PageQuerySharedSpeechOpenResponseBodyDataResultDataData setSpeechRate(Integer speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        public PageQuerySharedSpeechOpenResponseBodyDataResultDataData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public PageQuerySharedSpeechOpenResponseBodyDataResultDataData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public PageQuerySharedSpeechOpenResponseBodyDataResultDataData setVoice(String voice) {
            this.voice = voice;
            return this;
        }
        public String getVoice() {
            return this.voice;
        }

        public PageQuerySharedSpeechOpenResponseBodyDataResultDataData setVolume(Integer volume) {
            this.volume = volume;
            return this;
        }
        public Integer getVolume() {
            return this.volume;
        }

    }

    public static class PageQuerySharedSpeechOpenResponseBodyDataResultData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<PageQuerySharedSpeechOpenResponseBodyDataResultDataData> data;

        public static PageQuerySharedSpeechOpenResponseBodyDataResultData build(java.util.Map<String, ?> map) throws Exception {
            PageQuerySharedSpeechOpenResponseBodyDataResultData self = new PageQuerySharedSpeechOpenResponseBodyDataResultData();
            return TeaModel.build(map, self);
        }

        public PageQuerySharedSpeechOpenResponseBodyDataResultData setData(java.util.List<PageQuerySharedSpeechOpenResponseBodyDataResultDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<PageQuerySharedSpeechOpenResponseBodyDataResultDataData> getData() {
            return this.data;
        }

    }

    public static class PageQuerySharedSpeechOpenResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         */
        @NameInMap("PageId")
        public Integer pageId;

        /**
         * <p>The number of entries per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The information about shared speeches.</p>
         */
        @NameInMap("ResultData")
        public PageQuerySharedSpeechOpenResponseBodyDataResultData resultData;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("Total")
        public Integer total;

        public static PageQuerySharedSpeechOpenResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PageQuerySharedSpeechOpenResponseBodyData self = new PageQuerySharedSpeechOpenResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PageQuerySharedSpeechOpenResponseBodyData setPageId(Integer pageId) {
            this.pageId = pageId;
            return this;
        }
        public Integer getPageId() {
            return this.pageId;
        }

        public PageQuerySharedSpeechOpenResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public PageQuerySharedSpeechOpenResponseBodyData setResultData(PageQuerySharedSpeechOpenResponseBodyDataResultData resultData) {
            this.resultData = resultData;
            return this;
        }
        public PageQuerySharedSpeechOpenResponseBodyDataResultData getResultData() {
            return this.resultData;
        }

        public PageQuerySharedSpeechOpenResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
