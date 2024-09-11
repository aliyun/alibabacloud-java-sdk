// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("Documents")
    public java.util.List<SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments> documents;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>自定义观点的输入Prompt</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>待分析的主题名（documents与topic二者至少传一个）</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest self = new SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest setDocuments(java.util.List<SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments> documents) {
        this.documents = documents;
        return this;
    }
    public java.util.List<SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments> getDocuments() {
        return this.documents;
    }

    public SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

    public static class SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>作者</p>
         */
        @NameInMap("Author")
        public String author;

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

        public static SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments build(java.util.Map<String, ?> map) throws Exception {
            SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments self = new SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments();
            return TeaModel.build(map, self);
        }

        public SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments setAuthor(String author) {
            this.author = author;
            return this;
        }
        public String getAuthor() {
            return this.author;
        }

        public SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SubmitCustomTopicSelectionPerspectiveAnalysisTaskRequestDocuments setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
