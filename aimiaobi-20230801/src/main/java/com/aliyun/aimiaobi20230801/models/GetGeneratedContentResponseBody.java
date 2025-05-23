// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GetGeneratedContentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetGeneratedContentResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetGeneratedContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGeneratedContentResponseBody self = new GetGeneratedContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGeneratedContentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetGeneratedContentResponseBody setData(GetGeneratedContentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGeneratedContentResponseBodyData getData() {
        return this.data;
    }

    public GetGeneratedContentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGeneratedContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGeneratedContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGeneratedContentResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGeneratedContentResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>media</p>
         */
        @NameInMap("ContentDomain")
        public String contentDomain;

        @NameInMap("ContentText")
        public String contentText;

        /**
         * <strong>example:</strong>
         * <p>2024-01-04 11:46:07</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("IgnoreContentAuditWords")
        public String ignoreContentAuditWords;

        @NameInMap("KeywordList")
        public java.util.List<String> keywordList;

        @NameInMap("Keywords")
        public String keywords;

        @NameInMap("Prompt")
        public String prompt;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>2024-01-04 11:46:07</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        /**
         * <strong>example:</strong>
         * <p>0961a514-2e26-4aa6-b22b-f592d145fe47</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static GetGeneratedContentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGeneratedContentResponseBodyData self = new GetGeneratedContentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGeneratedContentResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetGeneratedContentResponseBodyData setContentDomain(String contentDomain) {
            this.contentDomain = contentDomain;
            return this;
        }
        public String getContentDomain() {
            return this.contentDomain;
        }

        public GetGeneratedContentResponseBodyData setContentText(String contentText) {
            this.contentText = contentText;
            return this;
        }
        public String getContentText() {
            return this.contentText;
        }

        public GetGeneratedContentResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetGeneratedContentResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetGeneratedContentResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public GetGeneratedContentResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGeneratedContentResponseBodyData setIgnoreContentAuditWords(String ignoreContentAuditWords) {
            this.ignoreContentAuditWords = ignoreContentAuditWords;
            return this;
        }
        public String getIgnoreContentAuditWords() {
            return this.ignoreContentAuditWords;
        }

        public GetGeneratedContentResponseBodyData setKeywordList(java.util.List<String> keywordList) {
            this.keywordList = keywordList;
            return this;
        }
        public java.util.List<String> getKeywordList() {
            return this.keywordList;
        }

        public GetGeneratedContentResponseBodyData setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }
        public String getKeywords() {
            return this.keywords;
        }

        public GetGeneratedContentResponseBodyData setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public GetGeneratedContentResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetGeneratedContentResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetGeneratedContentResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetGeneratedContentResponseBodyData setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

        public GetGeneratedContentResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
