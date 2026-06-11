// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetPromptVersionResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetPromptVersionResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static GetPromptVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPromptVersionResponseBody self = new GetPromptVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPromptVersionResponseBody setData(GetPromptVersionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetPromptVersionResponseBodyData getData() {
        return this.data;
    }

    public GetPromptVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetPromptVersionResponseBodyDataVariables extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        public static GetPromptVersionResponseBodyDataVariables build(java.util.Map<String, ?> map) throws Exception {
            GetPromptVersionResponseBodyDataVariables self = new GetPromptVersionResponseBodyDataVariables();
            return TeaModel.build(map, self);
        }

        public GetPromptVersionResponseBodyDataVariables setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetPromptVersionResponseBodyDataVariables setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetPromptVersionResponseBodyDataVariables setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetPromptVersionResponseBodyData extends TeaModel {
        @NameInMap("CommitMsg")
        public String commitMsg;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("PromptKey")
        public String promptKey;

        @NameInMap("SrcUser")
        public String srcUser;

        @NameInMap("Status")
        public String status;

        @NameInMap("Template")
        public String template;

        @NameInMap("Variables")
        public java.util.List<GetPromptVersionResponseBodyDataVariables> variables;

        @NameInMap("Version")
        public String version;

        public static GetPromptVersionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetPromptVersionResponseBodyData self = new GetPromptVersionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetPromptVersionResponseBodyData setCommitMsg(String commitMsg) {
            this.commitMsg = commitMsg;
            return this;
        }
        public String getCommitMsg() {
            return this.commitMsg;
        }

        public GetPromptVersionResponseBodyData setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public GetPromptVersionResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetPromptVersionResponseBodyData setPromptKey(String promptKey) {
            this.promptKey = promptKey;
            return this;
        }
        public String getPromptKey() {
            return this.promptKey;
        }

        public GetPromptVersionResponseBodyData setSrcUser(String srcUser) {
            this.srcUser = srcUser;
            return this;
        }
        public String getSrcUser() {
            return this.srcUser;
        }

        public GetPromptVersionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetPromptVersionResponseBodyData setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public GetPromptVersionResponseBodyData setVariables(java.util.List<GetPromptVersionResponseBodyDataVariables> variables) {
            this.variables = variables;
            return this;
        }
        public java.util.List<GetPromptVersionResponseBodyDataVariables> getVariables() {
            return this.variables;
        }

        public GetPromptVersionResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
