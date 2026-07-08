// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateImageTaskRequest extends TeaModel {
    /**
     * <p>The unique identifier of the workspace. For more information, see <a href="https://help.aliyun.com/document_detail/2587494.html">AgentKey</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e1be065b-adc3-435e-bd01-1c18c5ed75d3</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The task ID of the article. If you do not have one, you can assign a universally unique identifier (UUID).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e1be065b-adc3-435e-bd01-1c18c5ed75d3</p>
     */
    @NameInMap("ArticleTaskId")
    public String articleTaskId;

    /**
     * <p>The content of the paragraphs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ParagraphList")
    public java.util.List<GenerateImageTaskRequestParagraphList> paragraphList;

    /**
     * <p>The size of the image to generate.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1024*1024</p>
     */
    @NameInMap("Size")
    public String size;

    /**
     * <p>The style.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>\&quot;<auto>\&quot;</p>
     */
    @NameInMap("Style")
    public String style;

    public static GenerateImageTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateImageTaskRequest self = new GenerateImageTaskRequest();
        return TeaModel.build(map, self);
    }

    public GenerateImageTaskRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public GenerateImageTaskRequest setArticleTaskId(String articleTaskId) {
        this.articleTaskId = articleTaskId;
        return this;
    }
    public String getArticleTaskId() {
        return this.articleTaskId;
    }

    public GenerateImageTaskRequest setParagraphList(java.util.List<GenerateImageTaskRequestParagraphList> paragraphList) {
        this.paragraphList = paragraphList;
        return this;
    }
    public java.util.List<GenerateImageTaskRequestParagraphList> getParagraphList() {
        return this.paragraphList;
    }

    public GenerateImageTaskRequest setSize(String size) {
        this.size = size;
        return this;
    }
    public String getSize() {
        return this.size;
    }

    public GenerateImageTaskRequest setStyle(String style) {
        this.style = style;
        return this;
    }
    public String getStyle() {
        return this.style;
    }

    public static class GenerateImageTaskRequestParagraphList extends TeaModel {
        /**
         * <p>The content of the paragraph.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>一直忧伤的猫</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The paragraph ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The unique ID of the task.</p>
         * <blockquote>
         * <p>By default, you do not need to specify this parameter. The system automatically generates a task ID. If you specify the same TaskId for subsequent tasks, these tasks are considered part of the same conversation group.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>e1be065b-adc3-435e-bd01-1c18c5ed75d3</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The current status of the task.</p>
         * <ul>
         * <li><p>PENDING: The task is in the queue.</p>
         * </li>
         * <li><p>RUNNING: The task is in progress.</p>
         * </li>
         * <li><p>SUSPENDED: The task is suspended.</p>
         * </li>
         * <li><p>SUCCEEDED: The task was successful.</p>
         * </li>
         * <li><p>FAILED: The task failed.</p>
         * </li>
         * <li><p>UNKNOWN: The task does not exist or its status is unknown.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSED</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GenerateImageTaskRequestParagraphList build(java.util.Map<String, ?> map) throws Exception {
            GenerateImageTaskRequestParagraphList self = new GenerateImageTaskRequestParagraphList();
            return TeaModel.build(map, self);
        }

        public GenerateImageTaskRequestParagraphList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GenerateImageTaskRequestParagraphList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GenerateImageTaskRequestParagraphList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GenerateImageTaskRequestParagraphList setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
