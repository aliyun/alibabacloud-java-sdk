// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListSearchTaskDialoguesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NoData</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListSearchTaskDialoguesResponseBodyData> data;

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
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListSearchTaskDialoguesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSearchTaskDialoguesResponseBody self = new ListSearchTaskDialoguesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSearchTaskDialoguesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSearchTaskDialoguesResponseBody setData(java.util.List<ListSearchTaskDialoguesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListSearchTaskDialoguesResponseBodyData> getData() {
        return this.data;
    }

    public ListSearchTaskDialoguesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSearchTaskDialoguesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSearchTaskDialoguesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListSearchTaskDialoguesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSearchTaskDialoguesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSearchTaskDialoguesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListSearchTaskDialoguesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParamSearchSources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>x\&quot;x</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <strong>example:</strong>
         * <p>x</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParamSearchSources build(java.util.Map<String, ?> map) throws Exception {
            ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParamSearchSources self = new ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParamSearchSources();
            return TeaModel.build(map, self);
        }

        public ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParamSearchSources setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParamSearchSources setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParamSearchSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParam extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("MultimodalSearchTypes")
        public java.util.List<String> multimodalSearchTypes;

        @NameInMap("SearchSources")
        public java.util.List<ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParamSearchSources> searchSources;

        @NameInMap("StartTime")
        public String startTime;

        public static ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParam build(java.util.Map<String, ?> map) throws Exception {
            ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParam self = new ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParam();
            return TeaModel.build(map, self);
        }

        public ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParam setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParam setMultimodalSearchTypes(java.util.List<String> multimodalSearchTypes) {
            this.multimodalSearchTypes = multimodalSearchTypes;
            return this;
        }
        public java.util.List<String> getMultimodalSearchTypes() {
            return this.multimodalSearchTypes;
        }

        public ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParam setSearchSources(java.util.List<ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParamSearchSources> searchSources) {
            this.searchSources = searchSources;
            return this;
        }
        public java.util.List<ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParamSearchSources> getSearchSources() {
            return this.searchSources;
        }

        public ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParam setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListSearchTaskDialoguesResponseBodyDataChatConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("DialogueType")
        public Integer dialogueType;

        @NameInMap("EndToEnd")
        public Boolean endToEnd;

        /**
         * <strong>example:</strong>
         * <p>concise</p>
         */
        @NameInMap("GenerateLevel")
        public String generateLevel;

        /**
         * <strong>example:</strong>
         * <p>copilotReference</p>
         */
        @NameInMap("GenerateTechnology")
        public String generateTechnology;

        @NameInMap("SearchModels")
        public java.util.List<String> searchModels;

        @NameInMap("SearchParam")
        public ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParam searchParam;

        public static ListSearchTaskDialoguesResponseBodyDataChatConfig build(java.util.Map<String, ?> map) throws Exception {
            ListSearchTaskDialoguesResponseBodyDataChatConfig self = new ListSearchTaskDialoguesResponseBodyDataChatConfig();
            return TeaModel.build(map, self);
        }

        public ListSearchTaskDialoguesResponseBodyDataChatConfig setDialogueType(Integer dialogueType) {
            this.dialogueType = dialogueType;
            return this;
        }
        public Integer getDialogueType() {
            return this.dialogueType;
        }

        public ListSearchTaskDialoguesResponseBodyDataChatConfig setEndToEnd(Boolean endToEnd) {
            this.endToEnd = endToEnd;
            return this;
        }
        public Boolean getEndToEnd() {
            return this.endToEnd;
        }

        public ListSearchTaskDialoguesResponseBodyDataChatConfig setGenerateLevel(String generateLevel) {
            this.generateLevel = generateLevel;
            return this;
        }
        public String getGenerateLevel() {
            return this.generateLevel;
        }

        public ListSearchTaskDialoguesResponseBodyDataChatConfig setGenerateTechnology(String generateTechnology) {
            this.generateTechnology = generateTechnology;
            return this;
        }
        public String getGenerateTechnology() {
            return this.generateTechnology;
        }

        public ListSearchTaskDialoguesResponseBodyDataChatConfig setSearchModels(java.util.List<String> searchModels) {
            this.searchModels = searchModels;
            return this;
        }
        public java.util.List<String> getSearchModels() {
            return this.searchModels;
        }

        public ListSearchTaskDialoguesResponseBodyDataChatConfig setSearchParam(ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParam searchParam) {
            this.searchParam = searchParam;
            return this;
        }
        public ListSearchTaskDialoguesResponseBodyDataChatConfigSearchParam getSearchParam() {
            return this.searchParam;
        }

    }

    public static class ListSearchTaskDialoguesResponseBodyData extends TeaModel {
        @NameInMap("ChatConfig")
        public ListSearchTaskDialoguesResponseBodyDataChatConfig chatConfig;

        /**
         * <strong>example:</strong>
         * <p>2024-11-25 13:33:01</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>24</p>
         */
        @NameInMap("DialogueType")
        public Integer dialogueType;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("GoodText")
        public String goodText;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("OriginSessionId")
        public String originSessionId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Prompt")
        public String prompt;

        /**
         * <strong>example:</strong>
         * <p>thumbsUp</p>
         */
        @NameInMap("Rating")
        public String rating;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("ResponseBodyStr")
        public String responseBodyStr;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        @NameInMap("Tags")
        public java.util.List<String> tags;

        /**
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Text")
        public String text;

        public static ListSearchTaskDialoguesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSearchTaskDialoguesResponseBodyData self = new ListSearchTaskDialoguesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSearchTaskDialoguesResponseBodyData setChatConfig(ListSearchTaskDialoguesResponseBodyDataChatConfig chatConfig) {
            this.chatConfig = chatConfig;
            return this;
        }
        public ListSearchTaskDialoguesResponseBodyDataChatConfig getChatConfig() {
            return this.chatConfig;
        }

        public ListSearchTaskDialoguesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSearchTaskDialoguesResponseBodyData setDialogueType(Integer dialogueType) {
            this.dialogueType = dialogueType;
            return this;
        }
        public Integer getDialogueType() {
            return this.dialogueType;
        }

        public ListSearchTaskDialoguesResponseBodyData setGoodText(String goodText) {
            this.goodText = goodText;
            return this;
        }
        public String getGoodText() {
            return this.goodText;
        }

        public ListSearchTaskDialoguesResponseBodyData setOriginSessionId(String originSessionId) {
            this.originSessionId = originSessionId;
            return this;
        }
        public String getOriginSessionId() {
            return this.originSessionId;
        }

        public ListSearchTaskDialoguesResponseBodyData setPrompt(String prompt) {
            this.prompt = prompt;
            return this;
        }
        public String getPrompt() {
            return this.prompt;
        }

        public ListSearchTaskDialoguesResponseBodyData setRating(String rating) {
            this.rating = rating;
            return this;
        }
        public String getRating() {
            return this.rating;
        }

        public ListSearchTaskDialoguesResponseBodyData setResponseBodyStr(String responseBodyStr) {
            this.responseBodyStr = responseBodyStr;
            return this;
        }
        public String getResponseBodyStr() {
            return this.responseBodyStr;
        }

        public ListSearchTaskDialoguesResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListSearchTaskDialoguesResponseBodyData setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListSearchTaskDialoguesResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListSearchTaskDialoguesResponseBodyData setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

}
