// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitTopicSelectionPerspectiveAnalysisTaskRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace: <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The list of documents to be analyzed. (Provide at least one of documents or topic)</p>
     */
    @NameInMap("Documents")
    public java.util.List<SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments> documents;

    /**
     * <p>The topic selection perspective tasks to be analyzed. By default, this parameter is empty, which means all tasks are analyzed. (TopicSummary: Topic event summary, HotViewPoints: Hot topic selection perspectives, TimedViewPoints: Timeliness topic selection perspectives, WebReviewPoints: Online review topic selection perspectives, FreshViewPoints: Novel topic selection perspectives)</p>
     * 
     * <strong>example:</strong>
     * <p>TimedViewPoints</p>
     */
    @NameInMap("PerspectiveTypes")
    public java.util.List<String> perspectiveTypes;

    /**
     * <p>The name of the topic to be analyzed. (Provide at least one of documents or topic)</p>
     * 
     * <strong>example:</strong>
     * <p>待分析的主题名（documents与topic二者至少传一个）</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static SubmitTopicSelectionPerspectiveAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTopicSelectionPerspectiveAnalysisTaskRequest self = new SubmitTopicSelectionPerspectiveAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskRequest setDocuments(java.util.List<SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments> documents) {
        this.documents = documents;
        return this;
    }
    public java.util.List<SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments> getDocuments() {
        return this.documents;
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskRequest setPerspectiveTypes(java.util.List<String> perspectiveTypes) {
        this.perspectiveTypes = perspectiveTypes;
        return this;
    }
    public java.util.List<String> getPerspectiveTypes() {
        return this.perspectiveTypes;
    }

    public SubmitTopicSelectionPerspectiveAnalysisTaskRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public static class SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocumentsComments extends TeaModel {
        /**
         * <p>Content</p>
         * 
         * <strong>example:</strong>
         * <p>内容</p>
         */
        @NameInMap("Text")
        public String text;

        /**
         * <p>Username</p>
         * 
         * <strong>example:</strong>
         * <p>用户名</p>
         */
        @NameInMap("Username")
        public String username;

        public static SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocumentsComments build(java.util.Map<String, ?> map) throws Exception {
            SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocumentsComments self = new SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocumentsComments();
            return TeaModel.build(map, self);
        }

        public SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocumentsComments setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocumentsComments setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments extends TeaModel {
        /**
         * <p>Author</p>
         * 
         * <strong>example:</strong>
         * <p>作者</p>
         */
        @NameInMap("Author")
        public String author;

        /**
         * <p>Content list</p>
         */
        @NameInMap("Comments")
        public java.util.List<SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocumentsComments> comments;

        /**
         * <p>Content</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>文章内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Publication time. Format: YYYY-MM-dd HH:mm:ss</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-22 10:29:00</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>Article source</p>
         * 
         * <strong>example:</strong>
         * <p>新浪</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Summary</p>
         * 
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Article URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/aaa.docx">https://www.example.com/aaa.docx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments build(java.util.Map<String, ?> map) throws Exception {
            SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments self = new SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments();
            return TeaModel.build(map, self);
        }

        public SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments setComments(java.util.List<SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocumentsComments> comments) {
            this.comments = comments;
            return this;
        }
        public java.util.List<SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocumentsComments> getComments() {
            return this.comments;
        }

        public SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
