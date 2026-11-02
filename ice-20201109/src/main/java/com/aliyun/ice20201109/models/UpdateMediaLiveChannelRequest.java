// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class UpdateMediaLiveChannelRequest extends TeaModel {
    /**
     * <p>The audio settings.</p>
     */
    @NameInMap("AudioSettings")
    public java.util.List<UpdateMediaLiveChannelRequestAudioSettings> audioSettings;

    /**
     * <p>The channel ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SEGK5KA6KYKAWQQH</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The input attachment settings.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputAttachments")
    public java.util.List<UpdateMediaLiveChannelRequestInputAttachments> inputAttachments;

    /**
     * <p>The channel name. The name can contain letters, digits, hyphens (-), and underscores (_). The name can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mych</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output group configuration.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OutputGroups")
    public java.util.List<UpdateMediaLiveChannelRequestOutputGroups> outputGroups;

    /**
     * <p>The video settings.</p>
     */
    @NameInMap("VideoSettings")
    public java.util.List<UpdateMediaLiveChannelRequestVideoSettings> videoSettings;

    public static UpdateMediaLiveChannelRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMediaLiveChannelRequest self = new UpdateMediaLiveChannelRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMediaLiveChannelRequest setAudioSettings(java.util.List<UpdateMediaLiveChannelRequestAudioSettings> audioSettings) {
        this.audioSettings = audioSettings;
        return this;
    }
    public java.util.List<UpdateMediaLiveChannelRequestAudioSettings> getAudioSettings() {
        return this.audioSettings;
    }

    public UpdateMediaLiveChannelRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public UpdateMediaLiveChannelRequest setInputAttachments(java.util.List<UpdateMediaLiveChannelRequestInputAttachments> inputAttachments) {
        this.inputAttachments = inputAttachments;
        return this;
    }
    public java.util.List<UpdateMediaLiveChannelRequestInputAttachments> getInputAttachments() {
        return this.inputAttachments;
    }

    public UpdateMediaLiveChannelRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateMediaLiveChannelRequest setOutputGroups(java.util.List<UpdateMediaLiveChannelRequestOutputGroups> outputGroups) {
        this.outputGroups = outputGroups;
        return this;
    }
    public java.util.List<UpdateMediaLiveChannelRequestOutputGroups> getOutputGroups() {
        return this.outputGroups;
    }

    public UpdateMediaLiveChannelRequest setVideoSettings(java.util.List<UpdateMediaLiveChannelRequestVideoSettings> videoSettings) {
        this.videoSettings = videoSettings;
        return this;
    }
    public java.util.List<UpdateMediaLiveChannelRequestVideoSettings> getVideoSettings() {
        return this.videoSettings;
    }

    public static class UpdateMediaLiveChannelRequestAudioSettingsAudioCodecSetting extends TeaModel {
        /**
         * <p>The audio bitrate. Unit: bit/s. Valid values: 8000 to 1000000. The value must be divisible by 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>200000</p>
         */
        @NameInMap("Bitrate")
        public Integer bitrate;

        /**
         * <p>The audio codec profile.
         * When the codec is aac, valid values are AAC-LOW and AAC-MAIN.
         * When the codec is libfdk_aac, valid values are AAC-LOW, AAC-HE, and AAC-HEV2.</p>
         * 
         * <strong>example:</strong>
         * <p>AAC-LOW</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The audio sample rate. Unit: Hz. Valid values: 22050, 32000, 44100, 48000, and 96000.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("SampleRate")
        public Integer sampleRate;

        public static UpdateMediaLiveChannelRequestAudioSettingsAudioCodecSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestAudioSettingsAudioCodecSetting self = new UpdateMediaLiveChannelRequestAudioSettingsAudioCodecSetting();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestAudioSettingsAudioCodecSetting setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public UpdateMediaLiveChannelRequestAudioSettingsAudioCodecSetting setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public UpdateMediaLiveChannelRequestAudioSettingsAudioCodecSetting setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Integer getSampleRate() {
            return this.sampleRate;
        }

    }

    public static class UpdateMediaLiveChannelRequestAudioSettings extends TeaModel {
        /**
         * <p>The audio codec type. If this parameter is left empty, the value is copy, which means the source codec is used.
         * Valid values: aac and libfdk_aac.</p>
         * 
         * <strong>example:</strong>
         * <p>libfdk_aac</p>
         */
        @NameInMap("AudioCodec")
        public String audioCodec;

        /**
         * <p>The audio codec settings.</p>
         */
        @NameInMap("AudioCodecSetting")
        public UpdateMediaLiveChannelRequestAudioSettingsAudioCodecSetting audioCodecSetting;

        /**
         * <p>The audio selector name.</p>
         * 
         * <strong>example:</strong>
         * <p>a1</p>
         */
        @NameInMap("AudioSelectorName")
        public String audioSelectorName;

        /**
         * <p>The ISO 639-2 language code. The code is 3 characters in length.
         * If the output corresponding to the audio track selected by the selector has a language code, the language code of the selector takes precedence. If the audio track selected by the selector does not have a language code or no audio track matches the selector, this language code is used.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("LanguageCode")
        public String languageCode;

        /**
         * <p>The language name. This parameter is valid only for RTMP inputs and specifies the Name tag used by the output.
         * The value can be up to 32 characters in length and supports the following character types:</p>
         * <ul>
         * <li>Unicode letters of various languages: including Latin letters (such as English and French), Chinese, Arabic, and letters of other languages.</li>
         * <li>Digits: 0 to 9. </li>
         * <li>Underscores (_) </li>
         * <li>Hyphens (-)</li>
         * <li>Spaces: spaces can appear in the middle of the value, but not at the beginning or end.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>English</p>
         */
        @NameInMap("LanguageName")
        public String languageName;

        /**
         * <p>The audio setting name. The name can contain letters, digits, hyphens (-), and underscores (_). The name can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>audio1</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateMediaLiveChannelRequestAudioSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestAudioSettings self = new UpdateMediaLiveChannelRequestAudioSettings();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestAudioSettings setAudioCodec(String audioCodec) {
            this.audioCodec = audioCodec;
            return this;
        }
        public String getAudioCodec() {
            return this.audioCodec;
        }

        public UpdateMediaLiveChannelRequestAudioSettings setAudioCodecSetting(UpdateMediaLiveChannelRequestAudioSettingsAudioCodecSetting audioCodecSetting) {
            this.audioCodecSetting = audioCodecSetting;
            return this;
        }
        public UpdateMediaLiveChannelRequestAudioSettingsAudioCodecSetting getAudioCodecSetting() {
            return this.audioCodecSetting;
        }

        public UpdateMediaLiveChannelRequestAudioSettings setAudioSelectorName(String audioSelectorName) {
            this.audioSelectorName = audioSelectorName;
            return this;
        }
        public String getAudioSelectorName() {
            return this.audioSelectorName;
        }

        public UpdateMediaLiveChannelRequestAudioSettings setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

        public UpdateMediaLiveChannelRequestAudioSettings setLanguageName(String languageName) {
            this.languageName = languageName;
            return this;
        }
        public String getLanguageName() {
            return this.languageName;
        }

        public UpdateMediaLiveChannelRequestAudioSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioLanguageSelection extends TeaModel {
        /**
         * <p>The ISO 639-2 language code. The code is 3 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("LanguageCode")
        public String languageCode;

        public static UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioLanguageSelection build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioLanguageSelection self = new UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioLanguageSelection();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioLanguageSelection setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

    }

    public static class UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioPidSelection extends TeaModel {
        /**
         * <p>The PID of the input source stream.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Pid")
        public Long pid;

        public static UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioPidSelection build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioPidSelection self = new UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioPidSelection();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioPidSelection setPid(Long pid) {
            this.pid = pid;
            return this;
        }
        public Long getPid() {
            return this.pid;
        }

    }

    public static class UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioTrackSelection extends TeaModel {
        /**
         * <p>The track ID of the input source stream. The value starts from 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TrackId")
        public Long trackId;

        public static UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioTrackSelection build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioTrackSelection self = new UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioTrackSelection();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioTrackSelection setTrackId(Long trackId) {
            this.trackId = trackId;
            return this;
        }
        public Long getTrackId() {
            return this.trackId;
        }

    }

    public static class UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectors extends TeaModel {
        /**
         * <p>The language selector.</p>
         */
        @NameInMap("AudioLanguageSelection")
        public UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioLanguageSelection audioLanguageSelection;

        /**
         * <p>The PID selector.</p>
         */
        @NameInMap("AudioPidSelection")
        public UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioPidSelection audioPidSelection;

        /**
         * <p>The track selector.</p>
         */
        @NameInMap("AudioTrackSelection")
        public java.util.List<UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioTrackSelection> audioTrackSelection;

        /**
         * <p>The audio selector name. The name can contain letters, digits, hyphens (-), and underscores (_). The name can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myselector</p>
         */
        @NameInMap("Name")
        public String name;

        public static UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectors build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectors self = new UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectors();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectors setAudioLanguageSelection(UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioLanguageSelection audioLanguageSelection) {
            this.audioLanguageSelection = audioLanguageSelection;
            return this;
        }
        public UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioLanguageSelection getAudioLanguageSelection() {
            return this.audioLanguageSelection;
        }

        public UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectors setAudioPidSelection(UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioPidSelection audioPidSelection) {
            this.audioPidSelection = audioPidSelection;
            return this;
        }
        public UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioPidSelection getAudioPidSelection() {
            return this.audioPidSelection;
        }

        public UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectors setAudioTrackSelection(java.util.List<UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioTrackSelection> audioTrackSelection) {
            this.audioTrackSelection = audioTrackSelection;
            return this;
        }
        public java.util.List<UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioTrackSelection> getAudioTrackSelection() {
            return this.audioTrackSelection;
        }

        public UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class UpdateMediaLiveChannelRequestInputAttachments extends TeaModel {
        /**
         * <p>The audio selector list.</p>
         */
        @NameInMap("AudioSelectors")
        public java.util.List<UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectors> audioSelectors;

        /**
         * <p>The ID of the attached input.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myinput</p>
         */
        @NameInMap("InputId")
        public String inputId;

        /**
         * <p>The language name. This parameter is valid only for RTMP inputs and specifies the Name tag used by the output.
         * The value can be up to 32 characters in length and supports the following character types:</p>
         * <ul>
         * <li>Unicode letters of various languages: including Latin letters (such as English and French), Chinese, Arabic, and letters of other languages.</li>
         * <li>Digits: 0 to 9. </li>
         * <li>Underscores (_) </li>
         * <li>Hyphens (-)</li>
         * <li>Spaces: spaces can appear in the middle of the value, but not at the beginning or end.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>English</p>
         */
        @NameInMap("LanguageName")
        public String languageName;

        public static UpdateMediaLiveChannelRequestInputAttachments build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestInputAttachments self = new UpdateMediaLiveChannelRequestInputAttachments();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestInputAttachments setAudioSelectors(java.util.List<UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectors> audioSelectors) {
            this.audioSelectors = audioSelectors;
            return this;
        }
        public java.util.List<UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectors> getAudioSelectors() {
            return this.audioSelectors;
        }

        public UpdateMediaLiveChannelRequestInputAttachments setInputId(String inputId) {
            this.inputId = inputId;
            return this;
        }
        public String getInputId() {
            return this.inputId;
        }

        public UpdateMediaLiveChannelRequestInputAttachments setLanguageName(String languageName) {
            this.languageName = languageName;
            return this;
        }
        public String getLanguageName() {
            return this.languageName;
        }

    }

    public static class UpdateMediaLiveChannelRequestOutputGroupsMediaPackageGroupSetting extends TeaModel {
        /**
         * <p>The ChannelName of the referenced MediaPackage.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myPackageChannel</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>The GroupName of the referenced MediaPackage.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myPackageGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static UpdateMediaLiveChannelRequestOutputGroupsMediaPackageGroupSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestOutputGroupsMediaPackageGroupSetting self = new UpdateMediaLiveChannelRequestOutputGroupsMediaPackageGroupSetting();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestOutputGroupsMediaPackageGroupSetting setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public UpdateMediaLiveChannelRequestOutputGroupsMediaPackageGroupSetting setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class UpdateMediaLiveChannelRequestOutputGroupsOutputsMediaPackageOutputSetting extends TeaModel {
        /**
         * <p>The manifest audio group ID settings. By specifying AudioGroupId, you can group multiple audio tracks into the same group to facilitate track selection during playback. The ID can contain letters, digits, hyphens (-), and underscores (_). The ID can be up to 40 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>audiogroup</p>
         */
        @NameInMap("AudioGroupId")
        public String audioGroupId;

        /**
         * <p>The manifest suffix, which is generally used for naming child m3u8 files. The suffix can contain letters, digits, hyphens (-), and underscores (_). The suffix can be up to 40 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>480p</p>
         */
        @NameInMap("NameModifier")
        public String nameModifier;

        public static UpdateMediaLiveChannelRequestOutputGroupsOutputsMediaPackageOutputSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestOutputGroupsOutputsMediaPackageOutputSetting self = new UpdateMediaLiveChannelRequestOutputGroupsOutputsMediaPackageOutputSetting();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestOutputGroupsOutputsMediaPackageOutputSetting setAudioGroupId(String audioGroupId) {
            this.audioGroupId = audioGroupId;
            return this;
        }
        public String getAudioGroupId() {
            return this.audioGroupId;
        }

        public UpdateMediaLiveChannelRequestOutputGroupsOutputsMediaPackageOutputSetting setNameModifier(String nameModifier) {
            this.nameModifier = nameModifier;
            return this;
        }
        public String getNameModifier() {
            return this.nameModifier;
        }

    }

    public static class UpdateMediaLiveChannelRequestOutputGroupsOutputs extends TeaModel {
        /**
         * <p>The list of referenced audio setting names.</p>
         */
        @NameInMap("AudioSettingNames")
        public java.util.List<String> audioSettingNames;

        /**
         * <p>The output settings when the output group type is MediaPackage.</p>
         */
        @NameInMap("MediaPackageOutputSetting")
        public UpdateMediaLiveChannelRequestOutputGroupsOutputsMediaPackageOutputSetting mediaPackageOutputSetting;

        /**
         * <p>The media type of the output. Valid values:</p>
         * <ul>
         * <li>0: audio and video.</li>
         * <li>1: audio only. If this value is set, you cannot reference video settings.</li>
         * <li>2: video only. If this value is set, you cannot reference audio settings.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MediaType")
        public Integer mediaType;

        /**
         * <p>The output name. The name can contain letters, digits, hyphens (-), and underscores (_). The name can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>output1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the referenced video setting.</p>
         * 
         * <strong>example:</strong>
         * <p>myVideo1</p>
         */
        @NameInMap("VideoSettingName")
        public String videoSettingName;

        public static UpdateMediaLiveChannelRequestOutputGroupsOutputs build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestOutputGroupsOutputs self = new UpdateMediaLiveChannelRequestOutputGroupsOutputs();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestOutputGroupsOutputs setAudioSettingNames(java.util.List<String> audioSettingNames) {
            this.audioSettingNames = audioSettingNames;
            return this;
        }
        public java.util.List<String> getAudioSettingNames() {
            return this.audioSettingNames;
        }

        public UpdateMediaLiveChannelRequestOutputGroupsOutputs setMediaPackageOutputSetting(UpdateMediaLiveChannelRequestOutputGroupsOutputsMediaPackageOutputSetting mediaPackageOutputSetting) {
            this.mediaPackageOutputSetting = mediaPackageOutputSetting;
            return this;
        }
        public UpdateMediaLiveChannelRequestOutputGroupsOutputsMediaPackageOutputSetting getMediaPackageOutputSetting() {
            return this.mediaPackageOutputSetting;
        }

        public UpdateMediaLiveChannelRequestOutputGroupsOutputs setMediaType(Integer mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public Integer getMediaType() {
            return this.mediaType;
        }

        public UpdateMediaLiveChannelRequestOutputGroupsOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMediaLiveChannelRequestOutputGroupsOutputs setVideoSettingName(String videoSettingName) {
            this.videoSettingName = videoSettingName;
            return this;
        }
        public String getVideoSettingName() {
            return this.videoSettingName;
        }

    }

    public static class UpdateMediaLiveChannelRequestOutputGroups extends TeaModel {
        /**
         * <p>The output group settings when the output group type is MediaPackage.</p>
         */
        @NameInMap("MediaPackageGroupSetting")
        public UpdateMediaLiveChannelRequestOutputGroupsMediaPackageGroupSetting mediaPackageGroupSetting;

        /**
         * <p>The output group name. The name can contain letters, digits, hyphens (-), and underscores (_). The name can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output list settings.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Outputs")
        public java.util.List<UpdateMediaLiveChannelRequestOutputGroupsOutputs> outputs;

        /**
         * <p>The output group type. Currently, only MediaPackage is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MediaPackage</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateMediaLiveChannelRequestOutputGroups build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestOutputGroups self = new UpdateMediaLiveChannelRequestOutputGroups();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestOutputGroups setMediaPackageGroupSetting(UpdateMediaLiveChannelRequestOutputGroupsMediaPackageGroupSetting mediaPackageGroupSetting) {
            this.mediaPackageGroupSetting = mediaPackageGroupSetting;
            return this;
        }
        public UpdateMediaLiveChannelRequestOutputGroupsMediaPackageGroupSetting getMediaPackageGroupSetting() {
            return this.mediaPackageGroupSetting;
        }

        public UpdateMediaLiveChannelRequestOutputGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMediaLiveChannelRequestOutputGroups setOutputs(java.util.List<UpdateMediaLiveChannelRequestOutputGroupsOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<UpdateMediaLiveChannelRequestOutputGroupsOutputs> getOutputs() {
            return this.outputs;
        }

        public UpdateMediaLiveChannelRequestOutputGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingCodecDetail extends TeaModel {
        /**
         * <p>The video encoding level. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>H264_LEVEL_AUTO</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The H.264 encoding profile. Valid values: BASELINE, HIGH, and MAIN. Default value: MAIN. This parameter takes effect only when the H.264 encoder is used.</p>
         * 
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
        @NameInMap("Profile")
        public String profile;

        public static UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingCodecDetail build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingCodecDetail self = new UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingCodecDetail();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingCodecDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingCodecDetail setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

    }

    public static class UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingFramerate extends TeaModel {
        /**
         * <p>The frame rate setting mode. Valid values: SPECIFIED (fixed frame rate) and FROM_SOURCE (same as the source video).</p>
         * 
         * <strong>example:</strong>
         * <p>SPECIFIED</p>
         */
        @NameInMap("FramerateControl")
        public String framerateControl;

        /**
         * <p>The denominator of the fixed frame rate. This parameter is required when the frame rate setting mode is set to SPECIFIED. Valid values: 1 to 60. The value must be divisible by the numerator.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FramerateDenominator")
        public Integer framerateDenominator;

        /**
         * <p>The numerator of the fixed frame rate. This parameter is required when the frame rate setting mode is set to SPECIFIED. Valid values: 1 to 60. The denominator must be divisible by the numerator.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("FramerateNumerator")
        public Integer framerateNumerator;

        public static UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingFramerate build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingFramerate self = new UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingFramerate();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingFramerate setFramerateControl(String framerateControl) {
            this.framerateControl = framerateControl;
            return this;
        }
        public String getFramerateControl() {
            return this.framerateControl;
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingFramerate setFramerateDenominator(Integer framerateDenominator) {
            this.framerateDenominator = framerateDenominator;
            return this;
        }
        public Integer getFramerateDenominator() {
            return this.framerateDenominator;
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingFramerate setFramerateNumerator(Integer framerateNumerator) {
            this.framerateNumerator = framerateNumerator;
            return this;
        }
        public Integer getFramerateNumerator() {
            return this.framerateNumerator;
        }

    }

    public static class UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingGop extends TeaModel {
        /**
         * <p>The number of B-frames. Valid values: 1 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BframesNum")
        public Integer bframesNum;

        /**
         * <p>The size of the video GOP. If the length unit is SECONDS, valid values are 1 to 20. If the length unit is FRAMES, valid values are 1 to 3000.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("GopSize")
        public Integer gopSize;

        /**
         * <p>The unit of the video GOP length. Valid values: FRAMES (frames) and SECONDS (seconds).</p>
         * 
         * <strong>example:</strong>
         * <p>FRAMES</p>
         */
        @NameInMap("GopSizeUnits")
        public String gopSizeUnits;

        public static UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingGop build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingGop self = new UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingGop();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingGop setBframesNum(Integer bframesNum) {
            this.bframesNum = bframesNum;
            return this;
        }
        public Integer getBframesNum() {
            return this.bframesNum;
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingGop setGopSize(Integer gopSize) {
            this.gopSize = gopSize;
            return this;
        }
        public Integer getGopSize() {
            return this.gopSize;
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingGop setGopSizeUnits(String gopSizeUnits) {
            this.gopSizeUnits = gopSizeUnits;
            return this;
        }
        public String getGopSizeUnits() {
            return this.gopSizeUnits;
        }

    }

    public static class UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingRate extends TeaModel {
        /**
         * <p>The video bitrate. Unit: bit/s. If you do not specify this parameter or set it to 0, the bitrate of the source video is used. Valid values: 50000 to 6000000. The value must be a multiple of 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>2500000</p>
         */
        @NameInMap("Bitrate")
        public Integer bitrate;

        /**
         * <p>The buffer size for video encoding. Unit: bit/s. Valid values: 100000 to 6000000. The value must be a multiple of 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>6000000</p>
         */
        @NameInMap("BufferSize")
        public Integer bufferSize;

        /**
         * <p>The maximum bitrate for video encoding. Unit: bit/s. Valid values: 100000 to 6000000. The value must be a multiple of 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>6000000</p>
         */
        @NameInMap("MaxBitrate")
        public Integer maxBitrate;

        /**
         * <p>The rate control mode for video encoding. Valid values: CBR, ABR, and VBR.</p>
         * 
         * <strong>example:</strong>
         * <p>ABR</p>
         */
        @NameInMap("RateControlMode")
        public String rateControlMode;

        public static UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingRate build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingRate self = new UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingRate();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingRate setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingRate setBufferSize(Integer bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        public Integer getBufferSize() {
            return this.bufferSize;
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingRate setMaxBitrate(Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }
        public Integer getMaxBitrate() {
            return this.maxBitrate;
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingRate setRateControlMode(String rateControlMode) {
            this.rateControlMode = rateControlMode;
            return this;
        }
        public String getRateControlMode() {
            return this.rateControlMode;
        }

    }

    public static class UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSetting extends TeaModel {
        /**
         * <p>The video codec detail settings.</p>
         */
        @NameInMap("CodecDetail")
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingCodecDetail codecDetail;

        /**
         * <p>The video frame rate settings. If you do not specify this parameter, the frame rate settings of the source video are used.</p>
         */
        @NameInMap("Framerate")
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingFramerate framerate;

        /**
         * <p>The video group of pictures (GOP) settings. If you do not specify this parameter, the GOP settings of the source video are used.</p>
         */
        @NameInMap("Gop")
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingGop gop;

        /**
         * <p>The video encoding rate settings. If you do not specify this parameter, the rate settings of the source video are used.</p>
         */
        @NameInMap("Rate")
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingRate rate;

        public static UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSetting self = new UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSetting();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSetting setCodecDetail(UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingCodecDetail codecDetail) {
            this.codecDetail = codecDetail;
            return this;
        }
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingCodecDetail getCodecDetail() {
            return this.codecDetail;
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSetting setFramerate(UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingFramerate framerate) {
            this.framerate = framerate;
            return this;
        }
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingFramerate getFramerate() {
            return this.framerate;
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSetting setGop(UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingGop gop) {
            this.gop = gop;
            return this;
        }
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingGop getGop() {
            return this.gop;
        }

        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSetting setRate(UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingRate rate) {
            this.rate = rate;
            return this;
        }
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingRate getRate() {
            return this.rate;
        }

    }

    public static class UpdateMediaLiveChannelRequestVideoSettings extends TeaModel {
        /**
         * <p>The height of the video resolution. If you do not specify this parameter or set it to 0, the height is automatically scaled based on the width.
         * Valid values:</p>
         * <ul>
         * <li>For standard transcoding: max(Width, Height) &lt; 3840 and min(Width, Height) &lt; 2160.</li>
         * <li>For Narrowband HD transcoding: max(Width, Height) &lt; 1920 and min(Width, Height) &lt; 1080.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The name of the video setting. The name can contain letters, digits, hyphens (-), and underscores (_). It can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>video1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The video codec. Valid values: H264 and H265.</p>
         * 
         * <strong>example:</strong>
         * <p>H264</p>
         */
        @NameInMap("VideoCodec")
        public String videoCodec;

        /**
         * <p>The video codec settings.</p>
         */
        @NameInMap("VideoCodecSetting")
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSetting videoCodecSetting;

        /**
         * <p>The video transcoding method. Valid values:</p>
         * <ul>
         * <li>NORMAL: standard transcoding.</li>
         * <li>NBHD: Narrowband HD transcoding.
         * Default value: NORMAL.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("VideoCodecType")
        public String videoCodecType;

        /**
         * <p>The width of the video resolution. If you do not specify this parameter or set it to 0, the width is automatically scaled based on the height.
         * Valid values:</p>
         * <ul>
         * <li>For standard transcoding: max(Width, Height) &lt; 3840 and min(Width, Height) &lt; 2160.</li>
         * <li>For Narrowband HD transcoding: max(Width, Height) &lt; 1920 and min(Width, Height) &lt; 1080.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static UpdateMediaLiveChannelRequestVideoSettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateMediaLiveChannelRequestVideoSettings self = new UpdateMediaLiveChannelRequestVideoSettings();
            return TeaModel.build(map, self);
        }

        public UpdateMediaLiveChannelRequestVideoSettings setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public UpdateMediaLiveChannelRequestVideoSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateMediaLiveChannelRequestVideoSettings setVideoCodec(String videoCodec) {
            this.videoCodec = videoCodec;
            return this;
        }
        public String getVideoCodec() {
            return this.videoCodec;
        }

        public UpdateMediaLiveChannelRequestVideoSettings setVideoCodecSetting(UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSetting videoCodecSetting) {
            this.videoCodecSetting = videoCodecSetting;
            return this;
        }
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSetting getVideoCodecSetting() {
            return this.videoCodecSetting;
        }

        public UpdateMediaLiveChannelRequestVideoSettings setVideoCodecType(String videoCodecType) {
            this.videoCodecType = videoCodecType;
            return this;
        }
        public String getVideoCodecType() {
            return this.videoCodecType;
        }

        public UpdateMediaLiveChannelRequestVideoSettings setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
