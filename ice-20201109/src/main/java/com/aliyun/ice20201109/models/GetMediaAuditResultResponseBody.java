// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaAuditResultResponseBody extends TeaModel {
    @NameInMap("AudioResult")
    public GetMediaAuditResultResponseBodyAudioResult audioResult;

    @NameInMap("CoverResult")
    public GetMediaAuditResultResponseBodyCoverResult coverResult;

    @NameInMap("DescResult")
    public GetMediaAuditResultResponseBodyDescResult descResult;

    @NameInMap("MediaAuditResult")
    public GetMediaAuditResultResponseBodyMediaAuditResult mediaAuditResult;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TitleResult")
    public GetMediaAuditResultResponseBodyTitleResult titleResult;

    @NameInMap("VideoResult")
    public GetMediaAuditResultResponseBodyVideoResult videoResult;

    public static GetMediaAuditResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaAuditResultResponseBody self = new GetMediaAuditResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaAuditResultResponseBody setAudioResult(GetMediaAuditResultResponseBodyAudioResult audioResult) {
        this.audioResult = audioResult;
        return this;
    }
    public GetMediaAuditResultResponseBodyAudioResult getAudioResult() {
        return this.audioResult;
    }

    public GetMediaAuditResultResponseBody setCoverResult(GetMediaAuditResultResponseBodyCoverResult coverResult) {
        this.coverResult = coverResult;
        return this;
    }
    public GetMediaAuditResultResponseBodyCoverResult getCoverResult() {
        return this.coverResult;
    }

    public GetMediaAuditResultResponseBody setDescResult(GetMediaAuditResultResponseBodyDescResult descResult) {
        this.descResult = descResult;
        return this;
    }
    public GetMediaAuditResultResponseBodyDescResult getDescResult() {
        return this.descResult;
    }

    public GetMediaAuditResultResponseBody setMediaAuditResult(GetMediaAuditResultResponseBodyMediaAuditResult mediaAuditResult) {
        this.mediaAuditResult = mediaAuditResult;
        return this;
    }
    public GetMediaAuditResultResponseBodyMediaAuditResult getMediaAuditResult() {
        return this.mediaAuditResult;
    }

    public GetMediaAuditResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaAuditResultResponseBody setTitleResult(GetMediaAuditResultResponseBodyTitleResult titleResult) {
        this.titleResult = titleResult;
        return this;
    }
    public GetMediaAuditResultResponseBodyTitleResult getTitleResult() {
        return this.titleResult;
    }

    public GetMediaAuditResultResponseBody setVideoResult(GetMediaAuditResultResponseBodyVideoResult videoResult) {
        this.videoResult = videoResult;
        return this;
    }
    public GetMediaAuditResultResponseBodyVideoResult getVideoResult() {
        return this.videoResult;
    }

    public static class GetMediaAuditResultResponseBodyAudioResult extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        public static GetMediaAuditResultResponseBodyAudioResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyAudioResult self = new GetMediaAuditResultResponseBodyAudioResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyAudioResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyAudioResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetMediaAuditResultResponseBodyAudioResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyAudioResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class GetMediaAuditResultResponseBodyCoverResult extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        public static GetMediaAuditResultResponseBodyCoverResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyCoverResult self = new GetMediaAuditResultResponseBodyCoverResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyCoverResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyCoverResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetMediaAuditResultResponseBodyCoverResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyCoverResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class GetMediaAuditResultResponseBodyDescResult extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        public static GetMediaAuditResultResponseBodyDescResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyDescResult self = new GetMediaAuditResultResponseBodyDescResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyDescResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyDescResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetMediaAuditResultResponseBodyDescResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyDescResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class GetMediaAuditResultResponseBodyMediaAuditResult extends TeaModel {
        @NameInMap("AbnormalModules")
        public String abnormalModules;

        @NameInMap("Label")
        public String label;

        @NameInMap("Suggestion")
        public String suggestion;

        public static GetMediaAuditResultResponseBodyMediaAuditResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyMediaAuditResult self = new GetMediaAuditResultResponseBodyMediaAuditResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setAbnormalModules(String abnormalModules) {
            this.abnormalModules = abnormalModules;
            return this;
        }
        public String getAbnormalModules() {
            return this.abnormalModules;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyMediaAuditResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class GetMediaAuditResultResponseBodyTitleResult extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        public static GetMediaAuditResultResponseBodyTitleResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyTitleResult self = new GetMediaAuditResultResponseBodyTitleResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyTitleResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyTitleResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetMediaAuditResultResponseBodyTitleResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyTitleResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class GetMediaAuditResultResponseBodyVideoResult extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        public static GetMediaAuditResultResponseBodyVideoResult build(java.util.Map<String, ?> map) throws Exception {
            GetMediaAuditResultResponseBodyVideoResult self = new GetMediaAuditResultResponseBodyVideoResult();
            return TeaModel.build(map, self);
        }

        public GetMediaAuditResultResponseBodyVideoResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public GetMediaAuditResultResponseBodyVideoResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetMediaAuditResultResponseBodyVideoResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public GetMediaAuditResultResponseBodyVideoResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

}
