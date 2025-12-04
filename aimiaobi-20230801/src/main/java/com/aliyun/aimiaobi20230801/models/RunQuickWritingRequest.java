// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunQuickWritingRequest extends TeaModel {
    @NameInMap("Articles")
    public java.util.List<RunQuickWritingRequestArticles> articles;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("SearchSources")
    public java.util.List<RunQuickWritingRequestSearchSources> searchSources;

    /**
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static RunQuickWritingRequest build(java.util.Map<String, ?> map) throws Exception {
        RunQuickWritingRequest self = new RunQuickWritingRequest();
        return TeaModel.build(map, self);
    }

    public RunQuickWritingRequest setArticles(java.util.List<RunQuickWritingRequestArticles> articles) {
        this.articles = articles;
        return this;
    }
    public java.util.List<RunQuickWritingRequestArticles> getArticles() {
        return this.articles;
    }

    public RunQuickWritingRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunQuickWritingRequest setSearchSources(java.util.List<RunQuickWritingRequestSearchSources> searchSources) {
        this.searchSources = searchSources;
        return this;
    }
    public java.util.List<RunQuickWritingRequestSearchSources> getSearchSources() {
        return this.searchSources;
    }

    public RunQuickWritingRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunQuickWritingRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class RunQuickWritingRequestArticles extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/aaa.docx">https://www.example.com/aaa.docx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static RunQuickWritingRequestArticles build(java.util.Map<String, ?> map) throws Exception {
            RunQuickWritingRequestArticles self = new RunQuickWritingRequestArticles();
            return TeaModel.build(map, self);
        }

        public RunQuickWritingRequestArticles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunQuickWritingRequestArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunQuickWritingRequestArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunQuickWritingRequestSearchSources extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SystemSearch</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>QuarkCommonNews</p>
         */
        @NameInMap("DatasetName")
        public String datasetName;

        public static RunQuickWritingRequestSearchSources build(java.util.Map<String, ?> map) throws Exception {
            RunQuickWritingRequestSearchSources self = new RunQuickWritingRequestSearchSources();
            return TeaModel.build(map, self);
        }

        public RunQuickWritingRequestSearchSources setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RunQuickWritingRequestSearchSources setDatasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }
        public String getDatasetName() {
            return this.datasetName;
        }

    }

}
