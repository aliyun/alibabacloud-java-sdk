// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListGeneratedContentsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<ListGeneratedContentsResponseBodyData> data;

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
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
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

    public static class ListGeneratedContentsResponseBodyDataFileAttr extends TeaModel {
        @NameInMap("FileName")
        public String fileName;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("TmpUrl")
        public String tmpUrl;

        @NameInMap("Width")
        public Integer width;

        public static ListGeneratedContentsResponseBodyDataFileAttr build(java.util.Map<String, ?> map) throws Exception {
            ListGeneratedContentsResponseBodyDataFileAttr self = new ListGeneratedContentsResponseBodyDataFileAttr();
            return TeaModel.build(map, self);
        }

        public ListGeneratedContentsResponseBodyDataFileAttr setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListGeneratedContentsResponseBodyDataFileAttr setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ListGeneratedContentsResponseBodyDataFileAttr setTmpUrl(String tmpUrl) {
            this.tmpUrl = tmpUrl;
            return this;
        }
        public String getTmpUrl() {
            return this.tmpUrl;
        }

        public ListGeneratedContentsResponseBodyDataFileAttr setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ListGeneratedContentsResponseBodyData extends TeaModel {
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
         * <p>123</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        @NameInMap("FileAttr")
        public ListGeneratedContentsResponseBodyDataFileAttr fileAttr;

        @NameInMap("FileKey")
        public String fileKey;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Id")
        public Long id;

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
         * <p>1111</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
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

        public ListGeneratedContentsResponseBodyData setFileAttr(ListGeneratedContentsResponseBodyDataFileAttr fileAttr) {
            this.fileAttr = fileAttr;
            return this;
        }
        public ListGeneratedContentsResponseBodyDataFileAttr getFileAttr() {
            return this.fileAttr;
        }

        public ListGeneratedContentsResponseBodyData setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
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
