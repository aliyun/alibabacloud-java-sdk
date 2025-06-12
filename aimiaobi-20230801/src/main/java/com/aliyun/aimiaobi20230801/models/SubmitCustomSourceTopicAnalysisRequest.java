// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitCustomSourceTopicAnalysisRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>json</p>
     */
    @NameInMap("FileType")
    public String fileType;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/xxx.json">http://www.example.com/xxx.json</a></p>
     */
    @NameInMap("FileUrl")
    public String fileUrl;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxTopicSize")
    public Integer maxTopicSize;

    @NameInMap("News")
    public java.util.List<SubmitCustomSourceTopicAnalysisRequestNews> news;

    /**
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

    public SubmitCustomSourceTopicAnalysisRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SubmitCustomSourceTopicAnalysisRequestNewsComments extends TeaModel {
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
        @NameInMap("Comments")
        public java.util.List<SubmitCustomSourceTopicAnalysisRequestNewsComments> comments;

        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>2024-01-22 10:29:00</p>
         */
        @NameInMap("PubTime")
        public String pubTime;

        @NameInMap("Title")
        public String title;

        /**
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

}
