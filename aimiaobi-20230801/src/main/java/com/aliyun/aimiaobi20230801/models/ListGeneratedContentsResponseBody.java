// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListGeneratedContentsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<ListGeneratedContentsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Size")
    public Integer size;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Integer total;

    public static ListGeneratedContentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGeneratedContentsResponseBody self = new ListGeneratedContentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGeneratedContentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListGeneratedContentsResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListGeneratedContentsResponseBody setData(java.util.List<ListGeneratedContentsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListGeneratedContentsResponseBodyData> getData() {
        return this.data;
    }

    public ListGeneratedContentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListGeneratedContentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListGeneratedContentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGeneratedContentsResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListGeneratedContentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListGeneratedContentsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListGeneratedContentsResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("ContentDomain")
        public String contentDomain;

        @NameInMap("ContentText")
        public String contentText;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUser")
        public String createUser;

        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("Id")
        public Long id;

        @NameInMap("KeywordList")
        public java.util.List<String> keywordList;

        @NameInMap("Keywords")
        public String keywords;

        @NameInMap("Prompt")
        public String prompt;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Title")
        public String title;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UpdateUser")
        public String updateUser;

        @NameInMap("Uuid")
        public String uuid;

        public static ListGeneratedContentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListGeneratedContentsResponseBodyData self = new ListGeneratedContentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListGeneratedContentsResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListGeneratedContentsResponseBodyData setContentDomain(String contentDomain) {
            this.contentDomain = contentDomain;
            return this;
        }
        public String getContentDomain() {
            return this.contentDomain;
        }

        public ListGeneratedContentsResponseBodyData setContentText(String contentText) {
            this.contentText = contentText;
            return this;
        }
        public String getContentText() {
            return this.contentText;
        }

        public ListGeneratedContentsResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListGeneratedContentsResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListGeneratedContentsResponseBodyData setDeviceId(String deviceId) {
            this.deviceId = deviceId;
            return this;
        }
        public String getDeviceId() {
            return this.deviceId;
        }

        public ListGeneratedContentsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListGeneratedContentsResponseBodyData setKeywordList(java.util.List<String> keywordList) {
            this.keywordList = keywordList;
            return this;
        }
        public java.util.List<String> getKeywordList() {
            return this.keywordList;
        }

        public ListGeneratedContentsResponseBodyData setKeywords(String keywords) {
            this.keywords = keywords;
            return this;
        }
        public String getKeywords() {
            return this.keywords;
        }

        public ListGeneratedContentsResponseBodyData setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public ListGeneratedContentsResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListGeneratedContentsResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListGeneratedContentsResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListGeneratedContentsResponseBodyData setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

        public ListGeneratedContentsResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
