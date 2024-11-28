// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class SubmitEnterpriseVocAnalysisTaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ContentTags")
    public java.util.List<SubmitEnterpriseVocAnalysisTaskRequestContentTags> contentTags;

    @NameInMap("Contents")
    public java.util.List<SubmitEnterpriseVocAnalysisTaskRequestContents> contents;

    /**
     * <strong>example:</strong>
     * <p>oss://default/bucket-name/materialDocument/tenant_agent/fileName</p>
     */
    @NameInMap("FileKey")
    public String fileKey;

    @NameInMap("FilterTags")
    public java.util.List<SubmitEnterpriseVocAnalysisTaskRequestFilterTags> filterTags;

    /**
     * <strong>example:</strong>
     * <p>shortContent</p>
     */
    @NameInMap("MaterialType")
    public String materialType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qwen-max</p>
     */
    @NameInMap("ModelId")
    public String modelId;

    @NameInMap("PositiveSample")
    public String positiveSample;

    /**
     * <strong>example:</strong>
     * <p>oss://default/bucket-name/path/xxx.xlsx</p>
     */
    @NameInMap("PositiveSampleFileKey")
    public String positiveSampleFileKey;

    /**
     * <strong>example:</strong>
     * <p>lightAppSass</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static SubmitEnterpriseVocAnalysisTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitEnterpriseVocAnalysisTaskRequest self = new SubmitEnterpriseVocAnalysisTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setContentTags(java.util.List<SubmitEnterpriseVocAnalysisTaskRequestContentTags> contentTags) {
        this.contentTags = contentTags;
        return this;
    }
    public java.util.List<SubmitEnterpriseVocAnalysisTaskRequestContentTags> getContentTags() {
        return this.contentTags;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setContents(java.util.List<SubmitEnterpriseVocAnalysisTaskRequestContents> contents) {
        this.contents = contents;
        return this;
    }
    public java.util.List<SubmitEnterpriseVocAnalysisTaskRequestContents> getContents() {
        return this.contents;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setFileKey(String fileKey) {
        this.fileKey = fileKey;
        return this;
    }
    public String getFileKey() {
        return this.fileKey;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setFilterTags(java.util.List<SubmitEnterpriseVocAnalysisTaskRequestFilterTags> filterTags) {
        this.filterTags = filterTags;
        return this;
    }
    public java.util.List<SubmitEnterpriseVocAnalysisTaskRequestFilterTags> getFilterTags() {
        return this.filterTags;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setMaterialType(String materialType) {
        this.materialType = materialType;
        return this;
    }
    public String getMaterialType() {
        return this.materialType;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setPositiveSample(String positiveSample) {
        this.positiveSample = positiveSample;
        return this;
    }
    public String getPositiveSample() {
        return this.positiveSample;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setPositiveSampleFileKey(String positiveSampleFileKey) {
        this.positiveSampleFileKey = positiveSampleFileKey;
        return this;
    }
    public String getPositiveSampleFileKey() {
        return this.positiveSampleFileKey;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public SubmitEnterpriseVocAnalysisTaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class SubmitEnterpriseVocAnalysisTaskRequestContentTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>一级标签-二级标签</p>
         */
        @NameInMap("TagDefinePrompt")
        public String tagDefinePrompt;

        /**
         * <strong>example:</strong>
         * <p>一级标签-二级标签</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <strong>example:</strong>
         * <p>singleTagValue</p>
         */
        @NameInMap("TagTaskType")
        public String tagTaskType;

        @NameInMap("TagValueDefinePrompt")
        public String tagValueDefinePrompt;

        public static SubmitEnterpriseVocAnalysisTaskRequestContentTags build(java.util.Map<String, ?> map) throws Exception {
            SubmitEnterpriseVocAnalysisTaskRequestContentTags self = new SubmitEnterpriseVocAnalysisTaskRequestContentTags();
            return TeaModel.build(map, self);
        }

        public SubmitEnterpriseVocAnalysisTaskRequestContentTags setTagDefinePrompt(String tagDefinePrompt) {
            this.tagDefinePrompt = tagDefinePrompt;
            return this;
        }
        public String getTagDefinePrompt() {
            return this.tagDefinePrompt;
        }

        public SubmitEnterpriseVocAnalysisTaskRequestContentTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public SubmitEnterpriseVocAnalysisTaskRequestContentTags setTagTaskType(String tagTaskType) {
            this.tagTaskType = tagTaskType;
            return this;
        }
        public String getTagTaskType() {
            return this.tagTaskType;
        }

        public SubmitEnterpriseVocAnalysisTaskRequestContentTags setTagValueDefinePrompt(String tagValueDefinePrompt) {
            this.tagValueDefinePrompt = tagValueDefinePrompt;
            return this;
        }
        public String getTagValueDefinePrompt() {
            return this.tagValueDefinePrompt;
        }

    }

    public static class SubmitEnterpriseVocAnalysisTaskRequestContents extends TeaModel {
        @NameInMap("ExtraInfo")
        public String extraInfo;

        @NameInMap("Text")
        public String text;

        public static SubmitEnterpriseVocAnalysisTaskRequestContents build(java.util.Map<String, ?> map) throws Exception {
            SubmitEnterpriseVocAnalysisTaskRequestContents self = new SubmitEnterpriseVocAnalysisTaskRequestContents();
            return TeaModel.build(map, self);
        }

        public SubmitEnterpriseVocAnalysisTaskRequestContents setExtraInfo(String extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public String getExtraInfo() {
            return this.extraInfo;
        }

        public SubmitEnterpriseVocAnalysisTaskRequestContents setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class SubmitEnterpriseVocAnalysisTaskRequestFilterTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>一级标签-二级标签</p>
         */
        @NameInMap("TagDefinePrompt")
        public String tagDefinePrompt;

        /**
         * <strong>example:</strong>
         * <p>一级标签-二级标签</p>
         */
        @NameInMap("TagName")
        public String tagName;

        /**
         * <strong>example:</strong>
         * <p>singleTagValue</p>
         */
        @NameInMap("TagType")
        public String tagType;

        @NameInMap("TagValueDefinePrompt")
        public String tagValueDefinePrompt;

        public static SubmitEnterpriseVocAnalysisTaskRequestFilterTags build(java.util.Map<String, ?> map) throws Exception {
            SubmitEnterpriseVocAnalysisTaskRequestFilterTags self = new SubmitEnterpriseVocAnalysisTaskRequestFilterTags();
            return TeaModel.build(map, self);
        }

        public SubmitEnterpriseVocAnalysisTaskRequestFilterTags setTagDefinePrompt(String tagDefinePrompt) {
            this.tagDefinePrompt = tagDefinePrompt;
            return this;
        }
        public String getTagDefinePrompt() {
            return this.tagDefinePrompt;
        }

        public SubmitEnterpriseVocAnalysisTaskRequestFilterTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public SubmitEnterpriseVocAnalysisTaskRequestFilterTags setTagType(String tagType) {
            this.tagType = tagType;
            return this;
        }
        public String getTagType() {
            return this.tagType;
        }

        public SubmitEnterpriseVocAnalysisTaskRequestFilterTags setTagValueDefinePrompt(String tagValueDefinePrompt) {
            this.tagValueDefinePrompt = tagValueDefinePrompt;
            return this;
        }
        public String getTagValueDefinePrompt() {
            return this.tagValueDefinePrompt;
        }

    }

}
