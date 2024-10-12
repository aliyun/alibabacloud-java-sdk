// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitTopicSelectionPerspectiveAnalysisTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Documents")
    public java.util.List<SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocuments> documents;

    /**
     * <strong>example:</strong>
     * <p>TimedViewPoints</p>
     */
    @NameInMap("PerspectiveTypes")
    public java.util.List<String> perspectiveTypes;

    /**
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
        @NameInMap("Text")
        public String text;

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
         * <strong>example:</strong>
         * <p>作者</p>
         */
        @NameInMap("Author")
        public String author;

        @NameInMap("Comments")
        public java.util.List<SubmitTopicSelectionPerspectiveAnalysisTaskRequestDocumentsComments> comments;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>文章内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2024-01-22 10:29:00</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <strong>example:</strong>
         * <p>新浪</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>文章摘要</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <strong>example:</strong>
         * <p>文章标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
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
