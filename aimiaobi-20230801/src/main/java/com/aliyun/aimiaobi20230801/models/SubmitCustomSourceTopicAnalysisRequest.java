// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitCustomSourceTopicAnalysisRequest extends TeaModel {
    /**
     * <p>The types of analysis for hot topic selection. Multiple values are supported. If you omit this parameter, the service analyzes all types by default. If you pass an empty array, the service performs only clustering and skips the analysis of hot topics for selection.
     * <code>HotViewPoints</code>: Analyzes perspectives on hot topics.
     * <code>WebReviewPoints</code>: Analyzes user viewpoints. This requires comments.
     * <code>TimedViewPoints</code>: Analyzes perspectives on timeliness.
     * <code>FreshViewPoints</code>: Analyzes novel perspectives.
     * <code>TopicSummary</code>: Summarizes news content.</p>
     */
    @NameInMap("AnalysisTypes")
    public java.util.List<String> analysisTypes;

    /**
     * <p>The file type. Valid values: <code>json</code> (JSON array) and <code>jsonLine</code> (JSON Lines).</p>
     * 
     * <strong>example:</strong>
     * <p>json</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <p>The file URL. You must specify either <code>FileUrl</code> or <code>News</code>. For details on the file structure, see the description of the <code>News</code> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/xxx.json">http://www.example.com/xxx.json</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <p>The maximum number of topics to analyze. By default, the service sorts clustered news by count in descending order and analyzes the top 50 topics. The maximum value is 200.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxTopicSize")
    public Integer maxTopicSize;

    /**
     * <p>A list of news articles. You must specify either <code>News</code> or <code>FileUrl</code>.</p>
     */
    @NameInMap("News")
    public java.util.List<SubmitCustomSourceTopicAnalysisRequestNews> news;

    /**
     * <p>A list of topics.</p>
     */
    @NameInMap("Topics")
    public java.util.List<SubmitCustomSourceTopicAnalysisRequestTopics> topics;

    /**
     * <p>The URL of the file that contains the topic list. The file must be in JSON Lines format, with each line representing a single JSON object.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/xxx.jsonline">http://www.example.com/xxx.jsonline</a></p>
     */
    @NameInMap("TopicsFileUrl")
    public String topicsFileUrl;

    /**
     * <p><a href="https://help.aliyun.com/document_detail/2782167.html">The Model Studio workspace ID.</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-xx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitCustomSourceTopicAnalysisRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomSourceTopicAnalysisRequest self = new SubmitCustomSourceTopicAnalysisRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCustomSourceTopicAnalysisRequest setAnalysisTypes(java.util.List<String> analysisTypes) {
        this.analysisTypes = analysisTypes;
        return this;
    }
    public java.util.List<String> getAnalysisTypes() {
        return this.analysisTypes;
    }

    public SubmitCustomSourceTopicAnalysisRequest setFileType(String fileType) {
        this.fileType = fileType;
        return this;
    }
    public String getFileType() {
        return this.fileType;
    }

    public SubmitCustomSourceTopicAnalysisRequest setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
        return this;
    }
    public String getFileUrl() {
        return this.fileUrl;
    }

    public SubmitCustomSourceTopicAnalysisRequest setMaxTopicSize(Integer maxTopicSize) {
        this.maxTopicSize = maxTopicSize;
        return this;
    }
    public Integer getMaxTopicSize() {
        return this.maxTopicSize;
    }

    public SubmitCustomSourceTopicAnalysisRequest setNews(java.util.List<SubmitCustomSourceTopicAnalysisRequestNews> news) {
        this.news = news;
        return this;
    }
    public java.util.List<SubmitCustomSourceTopicAnalysisRequestNews> getNews() {
        return this.news;
    }

    public SubmitCustomSourceTopicAnalysisRequest setTopics(java.util.List<SubmitCustomSourceTopicAnalysisRequestTopics> topics) {
        this.topics = topics;
        return this;
    }
    public java.util.List<SubmitCustomSourceTopicAnalysisRequestTopics> getTopics() {
        return this.topics;
    }

    public SubmitCustomSourceTopicAnalysisRequest setTopicsFileUrl(String topicsFileUrl) {
        this.topicsFileUrl = topicsFileUrl;
        return this;
    }
    public String getTopicsFileUrl() {
        return this.topicsFileUrl;
    }

    public SubmitCustomSourceTopicAnalysisRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SubmitCustomSourceTopicAnalysisRequestNewsComments extends TeaModel {
        /**
         * <p>The comment text.</p>
         * 
         * <strong>example:</strong>
         * <p>评论内容</p>
         */
        @NameInMap("Text")
        public String text;

        public static SubmitCustomSourceTopicAnalysisRequestNewsComments build(java.util.Map<String, ?> map) throws Exception {
            SubmitCustomSourceTopicAnalysisRequestNewsComments self = new SubmitCustomSourceTopicAnalysisRequestNewsComments();
            return TeaModel.build(map, self);
        }

        public SubmitCustomSourceTopicAnalysisRequestNewsComments setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class SubmitCustomSourceTopicAnalysisRequestNews extends TeaModel {
        /**
         * <p>A list of comments.</p>
         */
        @NameInMap("Comments")
        public java.util.List<SubmitCustomSourceTopicAnalysisRequestNewsComments> comments;

        /**
         * <p>The content of the news article.</p>
         * 
         * <strong>example:</strong>
         * <p>新闻正文</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The publication time. The format must be <code>YYYY-MM-dd HH:mm:ss</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-22 10:29:00</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        /**
         * <p>The source of the news article.</p>
         * 
         * <strong>example:</strong>
         * <p>百度</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The title of the news article.</p>
         * 
         * <strong>example:</strong>
         * <p>新闻标题</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The URL of the news article.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/xxx.html">http://www.example.com/xxx.html</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static SubmitCustomSourceTopicAnalysisRequestNews build(java.util.Map<String, ?> map) throws Exception {
            SubmitCustomSourceTopicAnalysisRequestNews self = new SubmitCustomSourceTopicAnalysisRequestNews();
            return TeaModel.build(map, self);
        }

        public SubmitCustomSourceTopicAnalysisRequestNews setComments(java.util.List<SubmitCustomSourceTopicAnalysisRequestNewsComments> comments) {
            this.comments = comments;
            return this;
        }
        public java.util.List<SubmitCustomSourceTopicAnalysisRequestNewsComments> getComments() {
            return this.comments;
        }

        public SubmitCustomSourceTopicAnalysisRequestNews setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SubmitCustomSourceTopicAnalysisRequestNews setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public SubmitCustomSourceTopicAnalysisRequestNews setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public SubmitCustomSourceTopicAnalysisRequestNews setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SubmitCustomSourceTopicAnalysisRequestNews setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class SubmitCustomSourceTopicAnalysisRequestTopics extends TeaModel {
        /**
         * <p>A custom field. You can use this field to filter results when you call the <code>ListHotTopics</code> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CustomField")
        public String customField;

        /**
         * <p>A list of news articles.</p>
         */
        @NameInMap("News")
        public java.util.List<HottopicNews> news;

        /**
         * <p>The topic name.</p>
         * 
         * <strong>example:</strong>
         * <p>话题名称</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The URL of the topic. This value is passed through to the <code>ListHotTopics</code> response without being processed.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.example.com/topic/123">https://www.example.com/topic/123</a></p>
         */
        @NameInMap("TopicUrl")
        public String topicUrl;

        public static SubmitCustomSourceTopicAnalysisRequestTopics build(java.util.Map<String, ?> map) throws Exception {
            SubmitCustomSourceTopicAnalysisRequestTopics self = new SubmitCustomSourceTopicAnalysisRequestTopics();
            return TeaModel.build(map, self);
        }

        public SubmitCustomSourceTopicAnalysisRequestTopics setCustomField(String customField) {
            this.customField = customField;
            return this;
        }
        public String getCustomField() {
            return this.customField;
        }

        public SubmitCustomSourceTopicAnalysisRequestTopics setNews(java.util.List<HottopicNews> news) {
            this.news = news;
            return this;
        }
        public java.util.List<HottopicNews> getNews() {
            return this.news;
        }

        public SubmitCustomSourceTopicAnalysisRequestTopics setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public SubmitCustomSourceTopicAnalysisRequestTopics setTopicUrl(String topicUrl) {
            this.topicUrl = topicUrl;
            return this;
        }
        public String getTopicUrl() {
            return this.topicUrl;
        }

    }

}
