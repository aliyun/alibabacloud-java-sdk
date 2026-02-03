// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunSearchSimilarArticlesRequest extends TeaModel {
    @NameInMap("ChatConfig")
    public RunSearchSimilarArticlesRequestChatConfig chatConfig;

    /**
     * <strong>example:</strong>
     * <p>html</p>
     */
    @NameInMap("DocType")
    public String docType;

    @NameInMap("Title")
    public String title;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx/xxx">https://xxx/xxx</a></p>
     */
    @NameInMap("Url")
    public String url;

    /**
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
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("DatasetName")
        public String datasetName;

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
        @NameInMap("CategoryUuids")
        public java.util.List<String> categoryUuids;

        @NameInMap("CreateTimeEnd")
        public Long createTimeEnd;

        @NameInMap("CreateTimeStart")
        public Long createTimeStart;

        @NameInMap("DocIds")
        public java.util.List<String> docIds;

        @NameInMap("DocTypes")
        public java.util.List<String> docTypes;

        @NameInMap("DocUuids")
        public java.util.List<String> docUuids;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Extend1")
        public String extend1;

        @NameInMap("Extend2")
        public String extend2;

        @NameInMap("Extend3")
        public String extend3;

        @NameInMap("SearchSources")
        public java.util.List<RunSearchSimilarArticlesRequestChatConfigSearchParamSearchSources> searchSources;

        @NameInMap("StartTime")
        public Long startTime;

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
