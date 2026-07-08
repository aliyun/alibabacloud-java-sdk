// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class RunWritingRequest extends TeaModel {
    /**
     * <p>The ID of the original conversation to use for regeneration.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("OriginSessionId")
    public String originSessionId;

    /**
     * <p>The prompt.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>提示词</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The reference article data for writing.</p>
     */
    @NameInMap("ReferenceData")
    public RunWritingRequestReferenceData referenceData;

    /**
     * <p>The ID of a single-turn conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The ID of the task. You can reuse the same task ID in a multi-turn conversation.</p>
     * <blockquote>
     * <p>You do not need to specify TaskId. The system generates one automatically. If you use the same TaskId for multiple tasks, they are grouped into a single conversation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The unique ID of the Alibaba Cloud Model Studio workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2782167.html">Get a Workspace ID</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <p>The writing configuration.</p>
     */
    @NameInMap("WritingConfig")
    public RunWritingRequestWritingConfig writingConfig;

    public static RunWritingRequest build(java.util.Map<String, ?> map) throws Exception {
        RunWritingRequest self = new RunWritingRequest();
        return TeaModel.build(map, self);
    }

    public RunWritingRequest setOriginSessionId(String originSessionId) {
        this.originSessionId = originSessionId;
        return this;
    }
    public String getOriginSessionId() {
        return this.originSessionId;
    }

    public RunWritingRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public RunWritingRequest setReferenceData(RunWritingRequestReferenceData referenceData) {
        this.referenceData = referenceData;
        return this;
    }
    public RunWritingRequestReferenceData getReferenceData() {
        return this.referenceData;
    }

    public RunWritingRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public RunWritingRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public RunWritingRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public RunWritingRequest setWritingConfig(RunWritingRequestWritingConfig writingConfig) {
        this.writingConfig = writingConfig;
        return this;
    }
    public RunWritingRequestWritingConfig getWritingConfig() {
        return this.writingConfig;
    }

    public static class RunWritingRequestReferenceDataArticles extends TeaModel {
        /**
         * <p>The author.</p>
         * 
         * <strong>example:</strong>
         * <p>作者</p>
         */
        @NameInMap("Author")
        public String author;

        /**
         * <p>The content.</p>
         * 
         * <strong>example:</strong>
         * <p>文章内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The custom unique ID of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>文档-自定义的唯一ID</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <p>The internal unique ID of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>2124ca4d48a542d788aa86151e1a8c8b</p>
         */
        @NameInMap("DocUuid")
        public String docUuid;

        /**
         * <p>The publication time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-28 11:38:28</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>The source.</p>
         * 
         * <strong>example:</strong>
         * <p>央视网</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The article summary.</p>
         * 
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The tag.</p>
         * 
         * <strong>example:</strong>
         * <p>文章标签</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL of the article.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/aaa.docx">https://www.example.com/aaa.docx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static RunWritingRequestReferenceDataArticles build(java.util.Map<String, ?> map) throws Exception {
            RunWritingRequestReferenceDataArticles self = new RunWritingRequestReferenceDataArticles();
            return TeaModel.build(map, self);
        }

        public RunWritingRequestReferenceDataArticles setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public RunWritingRequestReferenceDataArticles setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public RunWritingRequestReferenceDataArticles setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public RunWritingRequestReferenceDataArticles setDocUuid(String docUuid) {
            this.docUuid = docUuid;
            return this;
        }
        public String getDocUuid() {
            return this.docUuid;
        }

        public RunWritingRequestReferenceDataArticles setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public RunWritingRequestReferenceDataArticles setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public RunWritingRequestReferenceDataArticles setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public RunWritingRequestReferenceDataArticles setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public RunWritingRequestReferenceDataArticles setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public RunWritingRequestReferenceDataArticles setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class RunWritingRequestReferenceData extends TeaModel {
        /**
         * <p>The reference article data for writing.</p>
         */
        @NameInMap("Articles")
        public java.util.List<RunWritingRequestReferenceDataArticles> articles;

        public static RunWritingRequestReferenceData build(java.util.Map<String, ?> map) throws Exception {
            RunWritingRequestReferenceData self = new RunWritingRequestReferenceData();
            return TeaModel.build(map, self);
        }

        public RunWritingRequestReferenceData setArticles(java.util.List<RunWritingRequestReferenceDataArticles> articles) {
            this.articles = articles;
            return this;
        }
        public java.util.List<RunWritingRequestReferenceDataArticles> getArticles() {
            return this.articles;
        }

    }

    public static class RunWritingRequestWritingConfigPromptTag extends TeaModel {
        /**
         * <p>Necessary tips.</p>
         * 
         * <strong>example:</strong>
         * <p>必要提示</p>
         */
        @NameInMap("NecessaryTips")
        public String necessaryTips;

        /**
         * <p>The stance.</p>
         * 
         * <strong>example:</strong>
         * <p>立场</p>
         */
        @NameInMap("Position")
        public String position;

        /**
         * <p>Negative keywords.</p>
         * 
         * <strong>example:</strong>
         * <p>反向词</p>
         */
        @NameInMap("ReverseWords")
        public String reverseWords;

        /**
         * <p>The theme.</p>
         * 
         * <strong>example:</strong>
         * <p>主题</p>
         */
        @NameInMap("Theme")
        public String theme;

        public static RunWritingRequestWritingConfigPromptTag build(java.util.Map<String, ?> map) throws Exception {
            RunWritingRequestWritingConfigPromptTag self = new RunWritingRequestWritingConfigPromptTag();
            return TeaModel.build(map, self);
        }

        public RunWritingRequestWritingConfigPromptTag setNecessaryTips(String necessaryTips) {
            this.necessaryTips = necessaryTips;
            return this;
        }
        public String getNecessaryTips() {
            return this.necessaryTips;
        }

        public RunWritingRequestWritingConfigPromptTag setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

        public RunWritingRequestWritingConfigPromptTag setReverseWords(String reverseWords) {
            this.reverseWords = reverseWords;
            return this;
        }
        public String getReverseWords() {
            return this.reverseWords;
        }

        public RunWritingRequestWritingConfigPromptTag setTheme(String theme) {
            this.theme = theme;
            return this;
        }
        public String getTheme() {
            return this.theme;
        }

    }

    public static class RunWritingRequestWritingConfigTags extends TeaModel {
        /**
         * <p>The value of the option.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The tag of the option. Example: gcNumberSizeTag=10.</p>
         * 
         * <strong>example:</strong>
         * <p>gcNumberSizeTag</p>
         */
        @NameInMap("Tag")
        public String tag;

        public static RunWritingRequestWritingConfigTags build(java.util.Map<String, ?> map) throws Exception {
            RunWritingRequestWritingConfigTags self = new RunWritingRequestWritingConfigTags();
            return TeaModel.build(map, self);
        }

        public RunWritingRequestWritingConfigTags setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public RunWritingRequestWritingConfigTags setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class RunWritingRequestWritingConfig extends TeaModel {
        /**
         * <p>The writing domain.</p>
         * <ul>
         * <li><p>media: Media</p>
         * </li>
         * <li><p>government: Government</p>
         * </li>
         * <li><p>market: Marketing</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>media</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The prompt assistant.</p>
         */
        @NameInMap("PromptTag")
        public RunWritingRequestWritingConfigPromptTag promptTag;

        /**
         * <p>Control parameters for writing, such as the style, length, and output language.</p>
         */
        @NameInMap("Tags")
        public java.util.List<RunWritingRequestWritingConfigTags> tags;

        /**
         * <p>Specifies whether to automatically add reference materials.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("UseSearch")
        public Boolean useSearch;

        public static RunWritingRequestWritingConfig build(java.util.Map<String, ?> map) throws Exception {
            RunWritingRequestWritingConfig self = new RunWritingRequestWritingConfig();
            return TeaModel.build(map, self);
        }

        public RunWritingRequestWritingConfig setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public RunWritingRequestWritingConfig setPromptTag(RunWritingRequestWritingConfigPromptTag promptTag) {
            this.promptTag = promptTag;
            return this;
        }
        public RunWritingRequestWritingConfigPromptTag getPromptTag() {
            return this.promptTag;
        }

        public RunWritingRequestWritingConfig setTags(java.util.List<RunWritingRequestWritingConfigTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<RunWritingRequestWritingConfigTags> getTags() {
            return this.tags;
        }

        public RunWritingRequestWritingConfig setUseSearch(Boolean useSearch) {
            this.useSearch = useSearch;
            return this;
        }
        public Boolean getUseSearch() {
            return this.useSearch;
        }

    }

}
