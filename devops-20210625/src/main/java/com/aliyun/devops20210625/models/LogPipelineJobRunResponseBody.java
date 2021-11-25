// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class LogPipelineJobRunResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("log")
    public LogPipelineJobRunResponseBodyLog log;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static LogPipelineJobRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LogPipelineJobRunResponseBody self = new LogPipelineJobRunResponseBody();
        return TeaModel.build(map, self);
    }

    public LogPipelineJobRunResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public LogPipelineJobRunResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public LogPipelineJobRunResponseBody setLog(LogPipelineJobRunResponseBodyLog log) {
        this.log = log;
        return this;
    }
    public LogPipelineJobRunResponseBodyLog getLog() {
        return this.log;
    }

    public LogPipelineJobRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LogPipelineJobRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class LogPipelineJobRunResponseBodyLog extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("more")
        public Boolean more;

        public static LogPipelineJobRunResponseBodyLog build(java.util.Map<String, ?> map) throws Exception {
            LogPipelineJobRunResponseBodyLog self = new LogPipelineJobRunResponseBodyLog();
            return TeaModel.build(map, self);
        }

        public LogPipelineJobRunResponseBodyLog setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public LogPipelineJobRunResponseBodyLog setMore(Boolean more) {
            this.more = more;
            return this;
        }
        public Boolean getMore() {
            return this.more;
        }

    }

}
