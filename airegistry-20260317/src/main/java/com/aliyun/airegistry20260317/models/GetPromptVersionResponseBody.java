// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetPromptVersionResponseBody extends TeaModel {
    /**
     * <p>Query result</p>
     */
    @NameInMap("Data")
    public GetPromptVersionResponseBodyData data;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>D9E87E66-9EF0-5C10-A5E6-924020A0C9B7</p>
     */
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
        /**
         * <p>Default value</p>
         * 
         * <strong>example:</strong>
         * <p>code</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        /**
         * <p>Variable description</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Variable name</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
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
        /**
         * <p>Commit message of this version</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test version</p>
         */
        @NameInMap("CommitMsg")
        public String commitMsg;

        /**
         * <p>Last modified time of the prompt</p>
         * 
         * <strong>example:</strong>
         * <p>1605345828000</p>
         */
        @NameInMap("GmtModified")
        public Long gmtModified;

        /**
         * <p>MD5 hash of the prompt content for this version</p>
         * 
         * <strong>example:</strong>
         * <p>93EF3AC0C56DDACB5A9E528BB1C825C8</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>Unique identifier of the prompt</p>
         * 
         * <strong>example:</strong>
         * <p>customer-service-qa</p>
         */
        @NameInMap("PromptKey")
        public String promptKey;

        /**
         * <p>Creator of this version</p>
         * 
         * <strong>example:</strong>
         * <p>admin</p>
         */
        @NameInMap("SrcUser")
        public String srcUser;

        /**
         * <p>Version status. Draft: draft / Published: online</p>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Template content of the prompt version</p>
         * 
         * <strong>example:</strong>
         * <p>You are a {{domain}} expert.</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>List of variables for this version</p>
         */
        @NameInMap("Variables")
        public java.util.List<GetPromptVersionResponseBodyDataVariables> variables;

        /**
         * <p>Version number</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
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
