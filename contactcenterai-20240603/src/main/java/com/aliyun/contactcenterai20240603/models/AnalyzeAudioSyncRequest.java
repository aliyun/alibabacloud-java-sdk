// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.contactcenterai20240603.models;

import com.aliyun.tea.*;

public class AnalyzeAudioSyncRequest extends TeaModel {
    @NameInMap("categoryTags")
    public java.util.List<AnalyzeAudioSyncRequestCategoryTags> categoryTags;

    @NameInMap("customPrompt")
    public String customPrompt;

    @NameInMap("fields")
    public java.util.List<AnalyzeAudioSyncRequestFields> fields;

    /**
     * <strong>example:</strong>
     * <p>tyxmTurbo</p>
     */
    @NameInMap("modelCode")
    public String modelCode;

    /**
     * <strong>example:</strong>
     * <p>jsonObject</p>
     */
    @NameInMap("responseFormatType")
    public String responseFormatType;

    @NameInMap("resultTypes")
    public java.util.List<String> resultTypes;

    @NameInMap("serviceInspection")
    public AnalyzeAudioSyncRequestServiceInspection serviceInspection;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("stream")
    public Boolean stream;

    @NameInMap("templateIds")
    public java.util.List<String> templateIds;

    @NameInMap("transcription")
    public AnalyzeAudioSyncRequestTranscription transcription;

    @NameInMap("variables")
    public java.util.List<AnalyzeAudioSyncRequestVariables> variables;

    public static AnalyzeAudioSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        AnalyzeAudioSyncRequest self = new AnalyzeAudioSyncRequest();
        return TeaModel.build(map, self);
    }

    public AnalyzeAudioSyncRequest setCategoryTags(java.util.List<AnalyzeAudioSyncRequestCategoryTags> categoryTags) {
        this.categoryTags = categoryTags;
        return this;
    }
    public java.util.List<AnalyzeAudioSyncRequestCategoryTags> getCategoryTags() {
        return this.categoryTags;
    }

    public AnalyzeAudioSyncRequest setCustomPrompt(String customPrompt) {
        this.customPrompt = customPrompt;
        return this;
    }
    public String getCustomPrompt() {
        return this.customPrompt;
    }

    public AnalyzeAudioSyncRequest setFields(java.util.List<AnalyzeAudioSyncRequestFields> fields) {
        this.fields = fields;
        return this;
    }
    public java.util.List<AnalyzeAudioSyncRequestFields> getFields() {
        return this.fields;
    }

    public AnalyzeAudioSyncRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public AnalyzeAudioSyncRequest setResponseFormatType(String responseFormatType) {
        this.responseFormatType = responseFormatType;
        return this;
    }
    public String getResponseFormatType() {
        return this.responseFormatType;
    }

    public AnalyzeAudioSyncRequest setResultTypes(java.util.List<String> resultTypes) {
        this.resultTypes = resultTypes;
        return this;
    }
    public java.util.List<String> getResultTypes() {
        return this.resultTypes;
    }

    public AnalyzeAudioSyncRequest setServiceInspection(AnalyzeAudioSyncRequestServiceInspection serviceInspection) {
        this.serviceInspection = serviceInspection;
        return this;
    }
    public AnalyzeAudioSyncRequestServiceInspection getServiceInspection() {
        return this.serviceInspection;
    }

    public AnalyzeAudioSyncRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public AnalyzeAudioSyncRequest setTemplateIds(java.util.List<String> templateIds) {
        this.templateIds = templateIds;
        return this;
    }
    public java.util.List<String> getTemplateIds() {
        return this.templateIds;
    }

    public AnalyzeAudioSyncRequest setTranscription(AnalyzeAudioSyncRequestTranscription transcription) {
        this.transcription = transcription;
        return this;
    }
    public AnalyzeAudioSyncRequestTranscription getTranscription() {
        return this.transcription;
    }

    public AnalyzeAudioSyncRequest setVariables(java.util.List<AnalyzeAudioSyncRequestVariables> variables) {
        this.variables = variables;
        return this;
    }
    public java.util.List<AnalyzeAudioSyncRequestVariables> getVariables() {
        return this.variables;
    }

    public static class AnalyzeAudioSyncRequestCategoryTags extends TeaModel {
        @NameInMap("tagDesc")
        public String tagDesc;

        @NameInMap("tagName")
        public String tagName;

        public static AnalyzeAudioSyncRequestCategoryTags build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeAudioSyncRequestCategoryTags self = new AnalyzeAudioSyncRequestCategoryTags();
            return TeaModel.build(map, self);
        }

        public AnalyzeAudioSyncRequestCategoryTags setTagDesc(String tagDesc) {
            this.tagDesc = tagDesc;
            return this;
        }
        public String getTagDesc() {
            return this.tagDesc;
        }

        public AnalyzeAudioSyncRequestCategoryTags setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

    }

    public static class AnalyzeAudioSyncRequestFieldsEnumValues extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("enumValue")
        public String enumValue;

        public static AnalyzeAudioSyncRequestFieldsEnumValues build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeAudioSyncRequestFieldsEnumValues self = new AnalyzeAudioSyncRequestFieldsEnumValues();
            return TeaModel.build(map, self);
        }

        public AnalyzeAudioSyncRequestFieldsEnumValues setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public AnalyzeAudioSyncRequestFieldsEnumValues setEnumValue(String enumValue) {
            this.enumValue = enumValue;
            return this;
        }
        public String getEnumValue() {
            return this.enumValue;
        }

    }

    public static class AnalyzeAudioSyncRequestFields extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>phoneNumber</p>
         */
        @NameInMap("code")
        public String code;

        @NameInMap("desc")
        public String desc;

        @NameInMap("enumValues")
        public java.util.List<AnalyzeAudioSyncRequestFieldsEnumValues> enumValues;

        @NameInMap("name")
        public String name;

        public static AnalyzeAudioSyncRequestFields build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeAudioSyncRequestFields self = new AnalyzeAudioSyncRequestFields();
            return TeaModel.build(map, self);
        }

        public AnalyzeAudioSyncRequestFields setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AnalyzeAudioSyncRequestFields setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public AnalyzeAudioSyncRequestFields setEnumValues(java.util.List<AnalyzeAudioSyncRequestFieldsEnumValues> enumValues) {
            this.enumValues = enumValues;
            return this;
        }
        public java.util.List<AnalyzeAudioSyncRequestFieldsEnumValues> getEnumValues() {
            return this.enumValues;
        }

        public AnalyzeAudioSyncRequestFields setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class AnalyzeAudioSyncRequestServiceInspectionInspectionContents extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("title")
        public String title;

        public static AnalyzeAudioSyncRequestServiceInspectionInspectionContents build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeAudioSyncRequestServiceInspectionInspectionContents self = new AnalyzeAudioSyncRequestServiceInspectionInspectionContents();
            return TeaModel.build(map, self);
        }

        public AnalyzeAudioSyncRequestServiceInspectionInspectionContents setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public AnalyzeAudioSyncRequestServiceInspectionInspectionContents setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class AnalyzeAudioSyncRequestServiceInspection extends TeaModel {
        @NameInMap("inspectionContents")
        public java.util.List<AnalyzeAudioSyncRequestServiceInspectionInspectionContents> inspectionContents;

        @NameInMap("inspectionIntroduction")
        public String inspectionIntroduction;

        @NameInMap("sceneIntroduction")
        public String sceneIntroduction;

        public static AnalyzeAudioSyncRequestServiceInspection build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeAudioSyncRequestServiceInspection self = new AnalyzeAudioSyncRequestServiceInspection();
            return TeaModel.build(map, self);
        }

        public AnalyzeAudioSyncRequestServiceInspection setInspectionContents(java.util.List<AnalyzeAudioSyncRequestServiceInspectionInspectionContents> inspectionContents) {
            this.inspectionContents = inspectionContents;
            return this;
        }
        public java.util.List<AnalyzeAudioSyncRequestServiceInspectionInspectionContents> getInspectionContents() {
            return this.inspectionContents;
        }

        public AnalyzeAudioSyncRequestServiceInspection setInspectionIntroduction(String inspectionIntroduction) {
            this.inspectionIntroduction = inspectionIntroduction;
            return this;
        }
        public String getInspectionIntroduction() {
            return this.inspectionIntroduction;
        }

        public AnalyzeAudioSyncRequestServiceInspection setSceneIntroduction(String sceneIntroduction) {
            this.sceneIntroduction = sceneIntroduction;
            return this;
        }
        public String getSceneIntroduction() {
            return this.sceneIntroduction;
        }

    }

    public static class AnalyzeAudioSyncRequestTranscription extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>nls</p>
         */
        @NameInMap("asrModelCode")
        public String asrModelCode;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("autoSplit")
        public Integer autoSplit;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("clientChannel")
        public Integer clientChannel;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sss.mp3</p>
         */
        @NameInMap("fileName")
        public String fileName;

        /**
         * <strong>example:</strong>
         * <p>low</p>
         */
        @NameInMap("level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("serviceChannel")
        public Integer serviceChannel;

        @NameInMap("serviceChannelKeywords")
        public java.util.List<String> serviceChannelKeywords;

        /**
         * <strong>example:</strong>
         * <p>esnvknv*****skdnvjksd</p>
         */
        @NameInMap("vocabularyId")
        public String vocabularyId;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://1111.com/sss.mp3">http://1111.com/sss.mp3</a></p>
         */
        @NameInMap("voiceFileUrl")
        public String voiceFileUrl;

        public static AnalyzeAudioSyncRequestTranscription build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeAudioSyncRequestTranscription self = new AnalyzeAudioSyncRequestTranscription();
            return TeaModel.build(map, self);
        }

        public AnalyzeAudioSyncRequestTranscription setAsrModelCode(String asrModelCode) {
            this.asrModelCode = asrModelCode;
            return this;
        }
        public String getAsrModelCode() {
            return this.asrModelCode;
        }

        public AnalyzeAudioSyncRequestTranscription setAutoSplit(Integer autoSplit) {
            this.autoSplit = autoSplit;
            return this;
        }
        public Integer getAutoSplit() {
            return this.autoSplit;
        }

        public AnalyzeAudioSyncRequestTranscription setClientChannel(Integer clientChannel) {
            this.clientChannel = clientChannel;
            return this;
        }
        public Integer getClientChannel() {
            return this.clientChannel;
        }

        public AnalyzeAudioSyncRequestTranscription setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public AnalyzeAudioSyncRequestTranscription setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public AnalyzeAudioSyncRequestTranscription setServiceChannel(Integer serviceChannel) {
            this.serviceChannel = serviceChannel;
            return this;
        }
        public Integer getServiceChannel() {
            return this.serviceChannel;
        }

        public AnalyzeAudioSyncRequestTranscription setServiceChannelKeywords(java.util.List<String> serviceChannelKeywords) {
            this.serviceChannelKeywords = serviceChannelKeywords;
            return this;
        }
        public java.util.List<String> getServiceChannelKeywords() {
            return this.serviceChannelKeywords;
        }

        public AnalyzeAudioSyncRequestTranscription setVocabularyId(String vocabularyId) {
            this.vocabularyId = vocabularyId;
            return this;
        }
        public String getVocabularyId() {
            return this.vocabularyId;
        }

        public AnalyzeAudioSyncRequestTranscription setVoiceFileUrl(String voiceFileUrl) {
            this.voiceFileUrl = voiceFileUrl;
            return this;
        }
        public String getVoiceFileUrl() {
            return this.voiceFileUrl;
        }

    }

    public static class AnalyzeAudioSyncRequestVariables extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>name</p>
         */
        @NameInMap("variableCode")
        public String variableCode;

        @NameInMap("variableValue")
        public String variableValue;

        public static AnalyzeAudioSyncRequestVariables build(java.util.Map<String, ?> map) throws Exception {
            AnalyzeAudioSyncRequestVariables self = new AnalyzeAudioSyncRequestVariables();
            return TeaModel.build(map, self);
        }

        public AnalyzeAudioSyncRequestVariables setVariableCode(String variableCode) {
            this.variableCode = variableCode;
            return this;
        }
        public String getVariableCode() {
            return this.variableCode;
        }

        public AnalyzeAudioSyncRequestVariables setVariableValue(String variableValue) {
            this.variableValue = variableValue;
            return this;
        }
        public String getVariableValue() {
            return this.variableValue;
        }

    }

}
