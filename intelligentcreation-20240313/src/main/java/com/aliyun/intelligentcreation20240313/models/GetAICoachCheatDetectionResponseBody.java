// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachCheatDetectionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("cheatId")
    public String cheatId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <strong>example:</strong>
     * <p>2025-02-24 12:00:00</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    @NameInMap("imageCheat")
    public GetAICoachCheatDetectionResponseBodyImageCheat imageCheat;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>0E8B1746-AE35-5C4B-A3A8-345B274AE32C</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("status")
    public Integer status;

    /**
     * <p>true</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    @NameInMap("voiceCheat")
    public GetAICoachCheatDetectionResponseBodyVoiceCheat voiceCheat;

    public static GetAICoachCheatDetectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachCheatDetectionResponseBody self = new GetAICoachCheatDetectionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAICoachCheatDetectionResponseBody setCheatId(String cheatId) {
        this.cheatId = cheatId;
        return this;
    }
    public String getCheatId() {
        return this.cheatId;
    }

    public GetAICoachCheatDetectionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAICoachCheatDetectionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAICoachCheatDetectionResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetAICoachCheatDetectionResponseBody setImageCheat(GetAICoachCheatDetectionResponseBodyImageCheat imageCheat) {
        this.imageCheat = imageCheat;
        return this;
    }
    public GetAICoachCheatDetectionResponseBodyImageCheat getImageCheat() {
        return this.imageCheat;
    }

    public GetAICoachCheatDetectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAICoachCheatDetectionResponseBody setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public GetAICoachCheatDetectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetAICoachCheatDetectionResponseBody setVoiceCheat(GetAICoachCheatDetectionResponseBodyVoiceCheat voiceCheat) {
        this.voiceCheat = voiceCheat;
        return this;
    }
    public GetAICoachCheatDetectionResponseBodyVoiceCheat getVoiceCheat() {
        return this.voiceCheat;
    }

    public static class GetAICoachCheatDetectionResponseBodyImageCheatList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-03-22 10:05:07</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p><a href="https://demo.com">https://demo.com</a></p>
         */
        @NameInMap("url")
        public String url;

        public static GetAICoachCheatDetectionResponseBodyImageCheatList build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachCheatDetectionResponseBodyImageCheatList self = new GetAICoachCheatDetectionResponseBodyImageCheatList();
            return TeaModel.build(map, self);
        }

        public GetAICoachCheatDetectionResponseBodyImageCheatList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public GetAICoachCheatDetectionResponseBodyImageCheatList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAICoachCheatDetectionResponseBodyImageCheat extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("desc")
        public String desc;

        @NameInMap("list")
        public java.util.List<GetAICoachCheatDetectionResponseBodyImageCheatList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        public static GetAICoachCheatDetectionResponseBodyImageCheat build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachCheatDetectionResponseBodyImageCheat self = new GetAICoachCheatDetectionResponseBodyImageCheat();
            return TeaModel.build(map, self);
        }

        public GetAICoachCheatDetectionResponseBodyImageCheat setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetAICoachCheatDetectionResponseBodyImageCheat setList(java.util.List<GetAICoachCheatDetectionResponseBodyImageCheatList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<GetAICoachCheatDetectionResponseBodyImageCheatList> getList() {
            return this.list;
        }

        public GetAICoachCheatDetectionResponseBodyImageCheat setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

    public static class GetAICoachCheatDetectionResponseBodyVoiceCheatComparisonList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-12-11 10:07:23</p>
         */
        @NameInMap("time")
        public String time;

        /**
         * <strong>example:</strong>
         * <p><a href="https://demo.com">https://demo.com</a></p>
         */
        @NameInMap("url")
        public String url;

        public static GetAICoachCheatDetectionResponseBodyVoiceCheatComparisonList build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachCheatDetectionResponseBodyVoiceCheatComparisonList self = new GetAICoachCheatDetectionResponseBodyVoiceCheatComparisonList();
            return TeaModel.build(map, self);
        }

        public GetAICoachCheatDetectionResponseBodyVoiceCheatComparisonList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public GetAICoachCheatDetectionResponseBodyVoiceCheatComparisonList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAICoachCheatDetectionResponseBodyVoiceCheatOriginalList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://demo.com">https://demo.com</a></p>
         */
        @NameInMap("url")
        public String url;

        public static GetAICoachCheatDetectionResponseBodyVoiceCheatOriginalList build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachCheatDetectionResponseBodyVoiceCheatOriginalList self = new GetAICoachCheatDetectionResponseBodyVoiceCheatOriginalList();
            return TeaModel.build(map, self);
        }

        public GetAICoachCheatDetectionResponseBodyVoiceCheatOriginalList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class GetAICoachCheatDetectionResponseBodyVoiceCheat extends TeaModel {
        @NameInMap("comparisonList")
        public java.util.List<GetAICoachCheatDetectionResponseBodyVoiceCheatComparisonList> comparisonList;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("desc")
        public String desc;

        @NameInMap("originalList")
        public java.util.List<GetAICoachCheatDetectionResponseBodyVoiceCheatOriginalList> originalList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("status")
        public Integer status;

        public static GetAICoachCheatDetectionResponseBodyVoiceCheat build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachCheatDetectionResponseBodyVoiceCheat self = new GetAICoachCheatDetectionResponseBodyVoiceCheat();
            return TeaModel.build(map, self);
        }

        public GetAICoachCheatDetectionResponseBodyVoiceCheat setComparisonList(java.util.List<GetAICoachCheatDetectionResponseBodyVoiceCheatComparisonList> comparisonList) {
            this.comparisonList = comparisonList;
            return this;
        }
        public java.util.List<GetAICoachCheatDetectionResponseBodyVoiceCheatComparisonList> getComparisonList() {
            return this.comparisonList;
        }

        public GetAICoachCheatDetectionResponseBodyVoiceCheat setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetAICoachCheatDetectionResponseBodyVoiceCheat setOriginalList(java.util.List<GetAICoachCheatDetectionResponseBodyVoiceCheatOriginalList> originalList) {
            this.originalList = originalList;
            return this;
        }
        public java.util.List<GetAICoachCheatDetectionResponseBodyVoiceCheatOriginalList> getOriginalList() {
            return this.originalList;
        }

        public GetAICoachCheatDetectionResponseBodyVoiceCheat setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
