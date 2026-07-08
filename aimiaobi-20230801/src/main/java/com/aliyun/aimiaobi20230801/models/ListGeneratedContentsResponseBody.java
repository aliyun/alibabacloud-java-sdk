// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListGeneratedContentsResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <p>Document list</p>
     */
    @NameInMap("Data")
    public java.util.List<ListGeneratedContentsResponseBodyData> data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Number of items per page</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <p>Operation status: true means success. false means failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total number of items</p>
     * 
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
        /**
         * <p>File name</p>
         * 
         * <strong>example:</strong>
         * <p>homedepothp.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>Video height</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>Temporary URL for video file access. Expires in one hour.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/xxx.mp4">http://www.example.com/xxx.mp4</a></p>
         */
        @NameInMap("TmpUrl")
        public String tmpUrl;

        /**
         * <p>Video width</p>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
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
        /**
         * <p>Content: rich text</p>
         * 
         * <strong>example:</strong>
         * <p>杭州亚运会</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Content domain (content category)</p>
         * <ul>
         * <li><p>media: Media writing</p>
         * </li>
         * <li><p>government: Government document writing</p>
         * </li>
         * <li><p>office: Office writing</p>
         * </li>
         * <li><p>market: Marketing writing</p>
         * </li>
         * <li><p>custom: Custom writing</p>
         * </li>
         * <li><p>commentGenerate: Opinion generation</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>media</p>
         */
        @NameInMap("ContentDomain")
        public String contentDomain;

        /**
         * <p>Content: plain text</p>
         * 
         * <strong>example:</strong>
         * <p>杭州亚运会</p>
         */
        @NameInMap("ContentText")
        public String contentText;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-04 11:46:07</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Creator</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;123&quot;</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>Device ID</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("DeviceId")
        public String deviceId;

        /**
         * <p>File attributes</p>
         */
        @NameInMap("FileAttr")
        public ListGeneratedContentsResponseBodyDataFileAttr fileAttr;

        /**
         * <p>File ID</p>
         * 
         * <strong>example:</strong>
         * <p>oss://default/oss-bucket-name/aimiaobi/2021/07/01/1625126400000/1.docx</p>
         */
        @NameInMap("FileKey")
        public String fileKey;

        /**
         * <p>Document ID</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Keywords</p>
         */
        @NameInMap("KeywordList")
        public java.util.List<String> keywordList;

        /**
         * <p>Keywords (string)</p>
         * 
         * <strong>example:</strong>
         * <p>观点</p>
         */
        @NameInMap("Keywords")
        public String keywords;

        /**
         * <p>Last prompt used to generate this document</p>
         * 
         * <strong>example:</strong>
         * <p>创作xxx文章</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <p>Conversation task ID</p>
         * 
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>杭州亚运会</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-04 11:46:07</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>Updater</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;1111&quot;</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        /**
         * <p>UUID traceability ID</p>
         * 
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
