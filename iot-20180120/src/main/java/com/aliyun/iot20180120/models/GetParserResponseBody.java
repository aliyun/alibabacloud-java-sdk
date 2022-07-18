// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetParserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetParserResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetParserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParserResponseBody self = new GetParserResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetParserResponseBody setData(GetParserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetParserResponseBodyData getData() {
        return this.data;
    }

    public GetParserResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetParserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetParserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetParserResponseBodyData extends TeaModel {
        @NameInMap("DataSourceId")
        public Long dataSourceId;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("ParserId")
        public Long parserId;

        @NameInMap("Script")
        public String script;

        @NameInMap("ScriptDraft")
        public String scriptDraft;

        @NameInMap("Status")
        public String status;

        @NameInMap("UtcCreated")
        public String utcCreated;

        @NameInMap("UtcModified")
        public String utcModified;

        public static GetParserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetParserResponseBodyData self = new GetParserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetParserResponseBodyData setDataSourceId(Long dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Long getDataSourceId() {
            return this.dataSourceId;
        }

        public GetParserResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetParserResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetParserResponseBodyData setParserId(Long parserId) {
            this.parserId = parserId;
            return this;
        }
        public Long getParserId() {
            return this.parserId;
        }

        public GetParserResponseBodyData setScript(String script) {
            this.script = script;
            return this;
        }
        public String getScript() {
            return this.script;
        }

        public GetParserResponseBodyData setScriptDraft(String scriptDraft) {
            this.scriptDraft = scriptDraft;
            return this;
        }
        public String getScriptDraft() {
            return this.scriptDraft;
        }

        public GetParserResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetParserResponseBodyData setUtcCreated(String utcCreated) {
            this.utcCreated = utcCreated;
            return this;
        }
        public String getUtcCreated() {
            return this.utcCreated;
        }

        public GetParserResponseBodyData setUtcModified(String utcModified) {
            this.utcModified = utcModified;
            return this;
        }
        public String getUtcModified() {
            return this.utcModified;
        }

    }

}
