// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateImageTaskRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("ArticleTaskId")
    public String articleTaskId;

    @NameInMap("ParagraphList")
    public java.util.List<GenerateImageTaskRequestParagraphList> paragraphList;

    @NameInMap("Size")
    public String size;

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
        @NameInMap("Content")
        public String content;

        @NameInMap("Id")
        public Long id;

        @NameInMap("TaskId")
        public String taskId;

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
