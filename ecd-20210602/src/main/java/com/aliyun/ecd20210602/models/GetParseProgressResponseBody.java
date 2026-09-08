// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetParseProgressResponseBody extends TeaModel {
    /**
     * <p>The response data object for parsing the skill package.</p>
     */
    @NameInMap("Data")
    public GetParseProgressResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetParseProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetParseProgressResponseBody self = new GetParseProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetParseProgressResponseBody setData(GetParseProgressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetParseProgressResponseBodyData getData() {
        return this.data;
    }

    public GetParseProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetParseProgressResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        /**
         * <p>The error code returned when an execution exception occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>Package.ReadFailed</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when an execution exception occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>Failed to read skill package</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("RequiredEnvVars")
        public java.util.List<String> requiredEnvVars;

        @NameInMap("RequiresApiKey")
        public Boolean requiresApiKey;

        /**
         * <p>The name in the SKILL.md file.</p>
         * 
         * <strong>example:</strong>
         * <p>name****</p>
         */
        @NameInMap("SkillName")
        public String skillName;

        /**
         * <p>The skill slug identifier. This is user-defined and unique within the tenant dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>admapix******</p>
         */
        @NameInMap("Slug")
        public String slug;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>PARSING_METADATA: parsing in progress.</li>
         * <li>COMPLETED: completed.</li>
         * <li>FAILED: failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task key for parsing the skill package.</p>
         * 
         * <strong>example:</strong>
         * <p>2E7D8B71-2677-1B4C-9E25-A88B9C5******</p>
         */
        @NameInMap("TaskKey")
        public String taskKey;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static GetParseProgressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetParseProgressResponseBodyData self = new GetParseProgressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetParseProgressResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetParseProgressResponseBodyData setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public GetParseProgressResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public GetParseProgressResponseBodyData setRequiredEnvVars(java.util.List<String> requiredEnvVars) {
            this.requiredEnvVars = requiredEnvVars;
            return this;
        }
        public java.util.List<String> getRequiredEnvVars() {
            return this.requiredEnvVars;
        }

        public GetParseProgressResponseBodyData setRequiresApiKey(Boolean requiresApiKey) {
            this.requiresApiKey = requiresApiKey;
            return this;
        }
        public Boolean getRequiresApiKey() {
            return this.requiresApiKey;
        }

        public GetParseProgressResponseBodyData setSkillName(String skillName) {
            this.skillName = skillName;
            return this;
        }
        public String getSkillName() {
            return this.skillName;
        }

        public GetParseProgressResponseBodyData setSlug(String slug) {
            this.slug = slug;
            return this;
        }
        public String getSlug() {
            return this.slug;
        }

        public GetParseProgressResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetParseProgressResponseBodyData setTaskKey(String taskKey) {
            this.taskKey = taskKey;
            return this;
        }
        public String getTaskKey() {
            return this.taskKey;
        }

        public GetParseProgressResponseBodyData setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
