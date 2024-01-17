// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class GetProjectPoliciesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetProjectPoliciesResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetProjectPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectPoliciesResponseBody self = new GetProjectPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectPoliciesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetProjectPoliciesResponseBody setData(GetProjectPoliciesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetProjectPoliciesResponseBodyData getData() {
        return this.data;
    }

    public GetProjectPoliciesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetProjectPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectPoliciesResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetProjectPoliciesResponseBodyData extends TeaModel {
        @NameInMap("Clipboard")
        public Integer clipboard;

        @NameInMap("FileTransfer")
        public Integer fileTransfer;

        @NameInMap("FrameRate")
        public String frameRate;

        @NameInMap("KeepAliveDuration")
        public Integer keepAliveDuration;

        @NameInMap("MaxHours")
        public Integer maxHours;

        @NameInMap("MaxSessions")
        public Integer maxSessions;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("SessionResolutionHeight")
        public Integer sessionResolutionHeight;

        @NameInMap("SessionResolutionWidth")
        public Integer sessionResolutionWidth;

        @NameInMap("SessionSpec")
        public String sessionSpec;

        @NameInMap("StreamingMode")
        public String streamingMode;

        @NameInMap("TerminalResolutionAdaptation")
        public Boolean terminalResolutionAdaptation;

        public static GetProjectPoliciesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetProjectPoliciesResponseBodyData self = new GetProjectPoliciesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetProjectPoliciesResponseBodyData setClipboard(Integer clipboard) {
            this.clipboard = clipboard;
            return this;
        }
        public Integer getClipboard() {
            return this.clipboard;
        }

        public GetProjectPoliciesResponseBodyData setFileTransfer(Integer fileTransfer) {
            this.fileTransfer = fileTransfer;
            return this;
        }
        public Integer getFileTransfer() {
            return this.fileTransfer;
        }

        public GetProjectPoliciesResponseBodyData setFrameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public String getFrameRate() {
            return this.frameRate;
        }

        public GetProjectPoliciesResponseBodyData setKeepAliveDuration(Integer keepAliveDuration) {
            this.keepAliveDuration = keepAliveDuration;
            return this;
        }
        public Integer getKeepAliveDuration() {
            return this.keepAliveDuration;
        }

        public GetProjectPoliciesResponseBodyData setMaxHours(Integer maxHours) {
            this.maxHours = maxHours;
            return this;
        }
        public Integer getMaxHours() {
            return this.maxHours;
        }

        public GetProjectPoliciesResponseBodyData setMaxSessions(Integer maxSessions) {
            this.maxSessions = maxSessions;
            return this;
        }
        public Integer getMaxSessions() {
            return this.maxSessions;
        }

        public GetProjectPoliciesResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetProjectPoliciesResponseBodyData setSessionResolutionHeight(Integer sessionResolutionHeight) {
            this.sessionResolutionHeight = sessionResolutionHeight;
            return this;
        }
        public Integer getSessionResolutionHeight() {
            return this.sessionResolutionHeight;
        }

        public GetProjectPoliciesResponseBodyData setSessionResolutionWidth(Integer sessionResolutionWidth) {
            this.sessionResolutionWidth = sessionResolutionWidth;
            return this;
        }
        public Integer getSessionResolutionWidth() {
            return this.sessionResolutionWidth;
        }

        public GetProjectPoliciesResponseBodyData setSessionSpec(String sessionSpec) {
            this.sessionSpec = sessionSpec;
            return this;
        }
        public String getSessionSpec() {
            return this.sessionSpec;
        }

        public GetProjectPoliciesResponseBodyData setStreamingMode(String streamingMode) {
            this.streamingMode = streamingMode;
            return this;
        }
        public String getStreamingMode() {
            return this.streamingMode;
        }

        public GetProjectPoliciesResponseBodyData setTerminalResolutionAdaptation(Boolean terminalResolutionAdaptation) {
            this.terminalResolutionAdaptation = terminalResolutionAdaptation;
            return this;
        }
        public Boolean getTerminalResolutionAdaptation() {
            return this.terminalResolutionAdaptation;
        }

    }

}
