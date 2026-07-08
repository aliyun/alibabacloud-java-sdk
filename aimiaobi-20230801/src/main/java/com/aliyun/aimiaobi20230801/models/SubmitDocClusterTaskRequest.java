// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitDocClusterTaskRequest extends TeaModel {
    /**
     * <p>The unique ID of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx_p_efm</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>A list of documents.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Documents")
    public java.util.List<SubmitDocClusterTaskRequestDocuments> documents;

    /**
     * <p>The character limit for the generated cluster summary.</p>
     * 
     * <strong>example:</strong>
     * <p>49</p>
     */
    @NameInMap("SummaryLength")
    public Integer summaryLength;

    /**
     * <p>The character limit for the generated cluster title.</p>
     * 
     * <strong>example:</strong>
     * <p>69</p>
     */
    @NameInMap("TitleLength")
    public Integer titleLength;

    /**
     * <p>The maximum number of clusters.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("TopicCount")
    public Integer topicCount;

    public static SubmitDocClusterTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitDocClusterTaskRequest self = new SubmitDocClusterTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitDocClusterTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public SubmitDocClusterTaskRequest setDocuments(java.util.List<SubmitDocClusterTaskRequestDocuments> documents) {
        this.documents = documents;
        return this;
    }
    public java.util.List<SubmitDocClusterTaskRequestDocuments> getDocuments() {
        return this.documents;
    }

    public SubmitDocClusterTaskRequest setSummaryLength(Integer summaryLength) {
        this.summaryLength = summaryLength;
        return this;
    }
    public Integer getSummaryLength() {
        return this.summaryLength;
    }

    public SubmitDocClusterTaskRequest setTitleLength(Integer titleLength) {
        this.titleLength = titleLength;
        return this;
    }
    public Integer getTitleLength() {
        return this.titleLength;
    }

    public SubmitDocClusterTaskRequest setTopicCount(Integer topicCount) {
        this.topicCount = topicCount;
        return this;
    }
    public Integer getTopicCount() {
        return this.topicCount;
    }

    public static class SubmitDocClusterTaskRequestDocuments extends TeaModel {
        /**
         * <p>The content of the document.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>文档内容</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The document ID. It is used to identify the document in the returned cluster results. If you do not provide an ID for any document, the array index is used instead. An error is reported if you provide IDs for only some of the documents.</p>
         * 
         * <strong>example:</strong>
         * <p>文档ID。用于在返回聚类文章时标识文章。如果文章列表中都不传则使用数组索引作为ID。如果部分传则会报错</p>
         */
        @NameInMap("DocId")
        public String docId;

        /**
         * <p>The title of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>文档标题</p>
         */
        @NameInMap("Title")
        public String title;

        public static SubmitDocClusterTaskRequestDocuments build(java.util.Map<String, ?> map) throws Exception {
            SubmitDocClusterTaskRequestDocuments self = new SubmitDocClusterTaskRequestDocuments();
            return TeaModel.build(map, self);
        }

        public SubmitDocClusterTaskRequestDocuments setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SubmitDocClusterTaskRequestDocuments setDocId(String docId) {
            this.docId = docId;
            return this;
        }
        public String getDocId() {
            return this.docId;
        }

        public SubmitDocClusterTaskRequestDocuments setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
