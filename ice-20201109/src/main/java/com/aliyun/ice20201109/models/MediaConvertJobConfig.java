// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertJobConfig extends TeaModel {
    @NameInMap("Inputs")
    public java.util.List<MediaConvertJobConfigInputs> inputs;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("OutputGroups")
    public java.util.List<MediaConvertJobConfigOutputGroups> outputGroups;

    public static MediaConvertJobConfig build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertJobConfig self = new MediaConvertJobConfig();
        return TeaModel.build(map, self);
    }

    public MediaConvertJobConfig setInputs(java.util.List<MediaConvertJobConfigInputs> inputs) {
        this.inputs = inputs;
        return this;
    }
    public java.util.List<MediaConvertJobConfigInputs> getInputs() {
        return this.inputs;
    }

    public MediaConvertJobConfig setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public MediaConvertJobConfig setOutputGroups(java.util.List<MediaConvertJobConfigOutputGroups> outputGroups) {
        this.outputGroups = outputGroups;
        return this;
    }
    public java.util.List<MediaConvertJobConfigOutputGroups> getOutputGroups() {
        return this.outputGroups;
    }

    public static class MediaConvertJobConfigInputsInputFile extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static MediaConvertJobConfigInputsInputFile build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigInputsInputFile self = new MediaConvertJobConfigInputsInputFile();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigInputsInputFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public MediaConvertJobConfigInputsInputFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MediaConvertJobConfigInputs extends TeaModel {
        @NameInMap("InputFile")
        public MediaConvertJobConfigInputsInputFile inputFile;

        @NameInMap("Name")
        public String name;

        public static MediaConvertJobConfigInputs build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigInputs self = new MediaConvertJobConfigInputs();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigInputs setInputFile(MediaConvertJobConfigInputsInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public MediaConvertJobConfigInputsInputFile getInputFile() {
            return this.inputFile;
        }

        public MediaConvertJobConfigInputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes extends TeaModel {
        @NameInMap("Language")
        public String language;

        @NameInMap("Name")
        public String name;

        @NameInMap("Type")
        public String type;

        public static MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes self = new MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend extends TeaModel {
        @NameInMap("Excludes")
        public java.util.List<MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes> excludes;

        @NameInMap("InputRef")
        public String inputRef;

        public static MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend self = new MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend setExcludes(java.util.List<MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes> excludes) {
            this.excludes = excludes;
            return this;
        }
        public java.util.List<MediaConvertJobConfigOutputGroupsGroupConfigManifestExtendExcludes> getExcludes() {
            return this.excludes;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend setInputRef(String inputRef) {
            this.inputRef = inputRef;
            return this;
        }
        public String getInputRef() {
            return this.inputRef;
        }

    }

    public static class MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase extends TeaModel {
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

        public static MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase self = new MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MediaConvertJobConfigOutputGroupsGroupConfig extends TeaModel {
        @NameInMap("ManifestExtend")
        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend manifestExtend;

        @NameInMap("ManifestName")
        public String manifestName;

        @NameInMap("OutputFileBase")
        public MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase outputFileBase;

        @NameInMap("Type")
        public String type;

        public static MediaConvertJobConfigOutputGroupsGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroupsGroupConfig self = new MediaConvertJobConfigOutputGroupsGroupConfig();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroupsGroupConfig setManifestExtend(MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend manifestExtend) {
            this.manifestExtend = manifestExtend;
            return this;
        }
        public MediaConvertJobConfigOutputGroupsGroupConfigManifestExtend getManifestExtend() {
            return this.manifestExtend;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfig setManifestName(String manifestName) {
            this.manifestName = manifestName;
            return this;
        }
        public String getManifestName() {
            return this.manifestName;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfig setOutputFileBase(MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase outputFileBase) {
            this.outputFileBase = outputFileBase;
            return this;
        }
        public MediaConvertJobConfigOutputGroupsGroupConfigOutputFileBase getOutputFileBase() {
            return this.outputFileBase;
        }

        public MediaConvertJobConfigOutputGroupsGroupConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig extends TeaModel {
        @NameInMap("AudioGroup")
        public String audioGroup;

        @NameInMap("AutoSelect")
        public String autoSelect;

        @NameInMap("Forced")
        public String forced;

        @NameInMap("Group")
        public String group;

        @NameInMap("IsDefault")
        public String isDefault;

        @NameInMap("Language")
        public String language;

        @NameInMap("Name")
        public String name;

        @NameInMap("SubtitleGroup")
        public String subtitleGroup;

        @NameInMap("Type")
        public String type;

        public static MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig self = new MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setAudioGroup(String audioGroup) {
            this.audioGroup = audioGroup;
            return this;
        }
        public String getAudioGroup() {
            return this.audioGroup;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setAutoSelect(String autoSelect) {
            this.autoSelect = autoSelect;
            return this;
        }
        public String getAutoSelect() {
            return this.autoSelect;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setForced(String forced) {
            this.forced = forced;
            return this;
        }
        public String getForced() {
            return this.forced;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setSubtitleGroup(String subtitleGroup) {
            this.subtitleGroup = subtitleGroup;
            return this;
        }
        public String getSubtitleGroup() {
            return this.subtitleGroup;
        }

        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class MediaConvertJobConfigOutputGroupsOutputs extends TeaModel {
        @NameInMap("Features")
        public String features;

        @NameInMap("HlsGroupConfig")
        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig hlsGroupConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("OutputFileName")
        public String outputFileName;

        @NameInMap("OverrideParams")
        public String overrideParams;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("TemplateId")
        public String templateId;

        public static MediaConvertJobConfigOutputGroupsOutputs build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroupsOutputs self = new MediaConvertJobConfigOutputGroupsOutputs();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroupsOutputs setFeatures(String features) {
            this.features = features;
            return this;
        }
        public String getFeatures() {
            return this.features;
        }

        public MediaConvertJobConfigOutputGroupsOutputs setHlsGroupConfig(MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig hlsGroupConfig) {
            this.hlsGroupConfig = hlsGroupConfig;
            return this;
        }
        public MediaConvertJobConfigOutputGroupsOutputsHlsGroupConfig getHlsGroupConfig() {
            return this.hlsGroupConfig;
        }

        public MediaConvertJobConfigOutputGroupsOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MediaConvertJobConfigOutputGroupsOutputs setOutputFileName(String outputFileName) {
            this.outputFileName = outputFileName;
            return this;
        }
        public String getOutputFileName() {
            return this.outputFileName;
        }

        public MediaConvertJobConfigOutputGroupsOutputs setOverrideParams(String overrideParams) {
            this.overrideParams = overrideParams;
            return this;
        }
        public String getOverrideParams() {
            return this.overrideParams;
        }

        public MediaConvertJobConfigOutputGroupsOutputs setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public MediaConvertJobConfigOutputGroupsOutputs setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

    public static class MediaConvertJobConfigOutputGroups extends TeaModel {
        @NameInMap("GroupConfig")
        public MediaConvertJobConfigOutputGroupsGroupConfig groupConfig;

        @NameInMap("Name")
        public String name;

        @NameInMap("Outputs")
        public java.util.List<MediaConvertJobConfigOutputGroupsOutputs> outputs;

        public static MediaConvertJobConfigOutputGroups build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobConfigOutputGroups self = new MediaConvertJobConfigOutputGroups();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobConfigOutputGroups setGroupConfig(MediaConvertJobConfigOutputGroupsGroupConfig groupConfig) {
            this.groupConfig = groupConfig;
            return this;
        }
        public MediaConvertJobConfigOutputGroupsGroupConfig getGroupConfig() {
            return this.groupConfig;
        }

        public MediaConvertJobConfigOutputGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public MediaConvertJobConfigOutputGroups setOutputs(java.util.List<MediaConvertJobConfigOutputGroupsOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<MediaConvertJobConfigOutputGroupsOutputs> getOutputs() {
            return this.outputs;
        }

    }

}
