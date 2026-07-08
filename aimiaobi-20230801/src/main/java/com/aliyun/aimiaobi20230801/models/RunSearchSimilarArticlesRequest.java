// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSearchSimilarArticlesRequest extends TeaModel {
    /**
     * <p>Communication configuration parameters.</p>
     */
    @NameInMap("ChatConfig")
    public RunSearchSimilarArticlesRequestChatConfig chatConfig;

    /**
     * <p>Document type.</p>
     * 
     * <strong>example:</strong>
     * <p>html</p>
     */
    @NameInMap("DocType")
    public String docType;

    /**
     * <p>Article title.</p>
     * 
     * <strong>example:</strong>
     * <p>标题</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>Article URL.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx/xxx">https://xxx/xxx</a></p>
     */
    @NameInMap("Url")
    public String url;

    /**
     * <p>Unique identifier of the Alibaba Cloud Model Studio workspace. To get this ID, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get the workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunSearchSimilarArticlesRequest build(java.util.Map<String, ?> map) throws Exception {
        RunSearchSimilarArticlesRequest self = new RunSearchSimilarArticlesRequest();
        return TeaModel.build(map, self);
    }

    public RunSearchSimilarArticlesRequest setChatConfig(RunSearchSimilarArticlesRequestChatConfig chatConfig) {
        this.chatConfig = chatConfig;
        return this;
    }
    public RunSearchSimilarArticlesRequestChatConfig getChatConfig() {
        return this.chatConfig;
    }

    public RunSearchSimilarArticlesRequest setDocType(String docType) {
        this.docType = docType;
        return this;
    }
    public String getDocType() {
        return this.docType;
    }

    public RunSearchSimilarArticlesRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public RunSearchSimilarArticlesRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RunSearchSimilarArticlesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources extends TeaModel {
        /**
         * <p>Search source type:</p>
         * <ul>
         * <li><p>SystemSearch: Built-in system search.</p>
         * </li>
         * <li><p>CustomSemanticSearch: Custom semantic index search.</p>
         * </li>
         * <li><p>ThirdSearch: Third-party API search.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Unique identifier of the search source.</p>
         * 
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        /**
         * <p>Search source name (optional).</p>
         * 
         * <strong>example:</strong>
         * <p>互联网搜索</p>
         */
        @NameInMap("Name")
        public String name;

        public static RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources build(java.util.Map<String, ?> map) throws Exception {
            RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources self = new RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources();
            return TeaModel.build(map, self);
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class RunSearchSimilarArticlesRequestChatConfigSearchParam extends TeaModel {
        /**
         * <p>Category UUID</p>
         */
        @NameInMap("CategoryUuids")
        public java.util.List<String> categoryUuids;

        /**
         * <p>Creation Time cutoff, in UNIX timestamp format.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("CreateTimeEnd")
        public Long createTimeEnd;

        /**
         * <p>Start Creation Time.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("CreateTimeStart")
        public Long createTimeStart;

        /**
         * <p>Document ID</p>
         */
        @NameInMap("DocIds")
        public java.util.List<String> docIds;

        /**
         * <p>Document types: text, image, video, audio, pdf, word, ppt, etc.</p>
         */
        @NameInMap("DocTypes")
        public java.util.List<String> docTypes;

        /**
         * <p>Document UUID</p>
         */
        @NameInMap("DocUuids")
        public java.util.List<String> docUuids;

        /**
         * <p>End Time</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Extension Field 1</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend1")
        public String extend1;

        /**
         * <p>Extension Field 2</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend2")
        public String extend2;

        /**
         * <p>Extension Field 3</p>
         * 
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("Extend3")
        public String extend3;

        /**
         * <p>Search sources.</p>
         */
        @NameInMap("SearchSources")
        public java.util.List<RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources> searchSources;

        /**
         * <p>Start Time</p>
         * 
         * <strong>example:</strong>
         * <p>1725983999999</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>Tag Name</p>
         */
        @NameInMap("Tags")
        public java.util.List<String> tags;

        public static RunSearchSimilarArticlesRequestChatConfigSearchParam build(java.util.Map<String, ?> map) throws Exception {
            RunSearchSimilarArticlesRequestChatConfigSearchParam self = new RunSearchSimilarArticlesRequestChatConfigSearchParam();
            return TeaModel.build(map, self);
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setCategoryUuids(java.util.List<String> categoryUuids) {
            this.categoryUuids = categoryUuids;
            return this;
        }
        public java.util.List<String> getCategoryUuids() {
            return this.categoryUuids;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setCreateTimeEnd(Long createTimeEnd) {
            this.createTimeEnd = createTimeEnd;
            return this;
        }
        public Long getCreateTimeEnd() {
            return this.createTimeEnd;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setCreateTimeStart(Long createTimeStart) {
            this.createTimeStart = createTimeStart;
            return this;
        }
        public Long getCreateTimeStart() {
            return this.createTimeStart;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setDocIds(java.util.List<String> docIds) {
            this.docIds = docIds;
            return this;
        }
        public java.util.List<String> getDocIds() {
            return this.docIds;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setDocTypes(java.util.List<String> docTypes) {
            this.docTypes = docTypes;
            return this;
        }
        public java.util.List<String> getDocTypes() {
            return this.docTypes;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setDocUuids(java.util.List<String> docUuids) {
            this.docUuids = docUuids;
            return this;
        }
        public java.util.List<String> getDocUuids() {
            return this.docUuids;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setExtend1(String extend1) {
            this.extend1 = extend1;
            return this;
        }
        public String getExtend1() {
            return this.extend1;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setExtend2(String extend2) {
            this.extend2 = extend2;
            return this;
        }
        public String getExtend2() {
            return this.extend2;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setExtend3(String extend3) {
            this.extend3 = extend3;
            return this;
        }
        public String getExtend3() {
            return this.extend3;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setSearchSources(java.util.List<RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources> searchSources) {
            this.searchSources = searchSources;
            return this;
        }
        public java.util.List<RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources> getSearchSources() {
            return this.searchSources;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public RunSearchSimilarArticlesRequestChatConfigSearchParam setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

    }

    public static class RunSearchSimilarArticlesRequestChatConfig extends TeaModel {
        /**
         * <p>Search configuration parameters.</p>
         */
        @NameInMap("SearchParam")
        public RunSearchSimilarArticlesRequestChatConfigSearchParam searchParam;

        public static RunSearchSimilarArticlesRequestChatConfig build(java.util.Map<String, ?> map) throws Exception {
            RunSearchSimilarArticlesRequestChatConfig self = new RunSearchSimilarArticlesRequestChatConfig();
            return TeaModel.build(map, self);
        }

        public RunSearchSimilarArticlesRequestChatConfig setSearchParam(RunSearchSimilarArticlesRequestChatConfigSearchParam searchParam) {
            this.searchParam = searchParam;
            return this;
        }
        public RunSearchSimilarArticlesRequestChatConfigSearchParam getSearchParam() {
            return this.searchParam;
        }

    }

}
