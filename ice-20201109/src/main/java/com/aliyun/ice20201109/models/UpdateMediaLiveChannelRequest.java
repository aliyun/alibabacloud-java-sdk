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
     * <p>The ID of the channel.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SEGK5KA6KYKAWQQH</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>The inputs associated with the channel.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InputAttachments")
    public java.util.List<UpdateMediaLiveChannelRequestInputAttachments> inputAttachments;

    /**
     * <p>The name of the channel. Letters, digits, hyphens (-), and underscores (_) are supported. It can be up to 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mych</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The output groups.</p>
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
         * <p>The audio codec profile. When AudioCodec is set to aac, AAC-LOW and AAC-MAIN are supported. When AudioCodec is set to libfdk_aac, AAC-LOW, AAC-HE, and AAC-HEV2 are supported.</p>
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
         * <p>The audio codec. If it is not specified, the source specification is used. Valid values: aac and libfdk_aac.</p>
         * 
         * <strong>example:</strong>
         * <p>libfdk_aac</p>
         */
        @NameInMap("AudioCodec")
        public String audioCodec;

        /**
         * <p>The audio encoding settings.</p>
         */
        @NameInMap("AudioCodecSetting")
        public UpdateMediaLiveChannelRequestAudioSettingsAudioCodecSetting audioCodecSetting;

        /**
         * <p>The name of the audio selector.</p>
         * 
         * <strong>example:</strong>
         * <p>a1</p>
         */
        @NameInMap("AudioSelectorName")
        public String audioSelectorName;

        /**
         * <p>Enter a three-letter ISO 639-2 language code. If the audio track selected by the audio selector has a language code, the language code specified in the audio selector is used. If the selected audio track does not have a language code, or if the audio selector cannot find a track that matches its criteria, this language code is used.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("LanguageCode")
        public String languageCode;

        /**
         * <p>The tag that identifies the language of the RTMP input. It can be referenced by the output. The maximum length is 32 characters. Supported characters:</p>
         * <ul>
         * <li>Unicode letters</li>
         * <li>Digits (0-9)</li>
         * <li>Underscore (_)</li>
         * <li>Hyphen (-)</li>
         * <li>Space (a space cannot be at the beginning or end)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>English</p>
         */
        @NameInMap("LanguageName")
        public String languageName;

        /**
         * <p>The name of the audio settings. Letters, digits, hyphens (-), and underscores (_) are supported. It can be up to 64 characters in length.</p>
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
         * <p>Enter a three-letter ISO 639-2 language code from within an audio source.</p>
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
         * <p>Enter a specific PID from within a source.</p>
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
         * <p>Specify one or more audio tracks from within a source using Track ID.</p>
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
         * <p>The audio language selection.</p>
         */
        @NameInMap("AudioLanguageSelection")
        public UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioLanguageSelection audioLanguageSelection;

        /**
         * <p>The audio PID selection.</p>
         */
        @NameInMap("AudioPidSelection")
        public UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioPidSelection audioPidSelection;

        /**
         * <p>The audio track selection.</p>
         */
        @NameInMap("AudioTrackSelection")
        public java.util.List<UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectorsAudioTrackSelection> audioTrackSelection;

        /**
         * <p>The name of the audio selector. Letters, digits, hyphens (-), and underscores (_) are supported. It can be up to 64 characters in length.</p>
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
         * <p>The audio selectors.</p>
         */
        @NameInMap("AudioSelectors")
        public java.util.List<UpdateMediaLiveChannelRequestInputAttachmentsAudioSelectors> audioSelectors;

        /**
         * <p>The ID of the associated input.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myinput</p>
         */
        @NameInMap("InputId")
        public String inputId;

        /**
         * <p>The tag that identifies the language of the RTMP input. It can be referenced by the output. The maximum length is 32 characters. Supported characters:</p>
         * <ul>
         * <li>Unicode letters</li>
         * <li>Digits (0-9)</li>
         * <li>Underscore (_)</li>
         * <li>Hyphen (-)</li>
         * <li>Space (a space cannot be at the beginning or end)</li>
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
         * <p>ChannelName in MediaPackage.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myPackageChannel</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>GroupName in MediaPackage.</p>
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
         * <p>The manifest audio group ID. To associate several audio tracks into one group, assign the same audio group ID. Viewers can select a track as needed. Letters, digits, hyphens (-), and underscores (_) are supported. It can be up to 40 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>audiogroup</p>
         */
        @NameInMap("AudioGroupId")
        public String audioGroupId;

        /**
         * <p>The manifest name modifier. The child manifests include this modifier in their M3U8 file names. Letters, digits, hyphens (-), and underscores (_) are supported. The maximum length is 40 characters.</p>
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
         * <p>The referenced AudioSettings.</p>
         */
        @NameInMap("AudioSettingNames")
        public java.util.List<String> audioSettingNames;

        /**
         * <p>The settings of the output delivered to MediaPackage.</p>
         */
        @NameInMap("MediaPackageOutputSetting")
        public UpdateMediaLiveChannelRequestOutputGroupsOutputsMediaPackageOutputSetting mediaPackageOutputSetting;

        /**
         * <p>The media type of the output. Valid values:</p>
         * <ul>
         * <li>0: Audio and Video</li>
         * <li>1: Audio If you set the value to 1, you cannot reference VideoSettings.</li>
         * <li>2: Video. If you set the value to 2, you cannot reference AudioSettings.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MediaType")
        public Integer mediaType;

        /**
         * <p>The name of the output. Letters, digits, hyphens (-), and underscores (_) are supported. It can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>output1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name of the referenced VideoSettings.</p>
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
         * <p>The MediaPackage destination.</p>
         */
        @NameInMap("MediaPackageGroupSetting")
        public UpdateMediaLiveChannelRequestOutputGroupsMediaPackageGroupSetting mediaPackageGroupSetting;

        /**
         * <p>The name of the output group. Letters, digits, hyphens (-), and underscores (_) are supported. It can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The outputs in the output group.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Outputs")
        public java.util.List<UpdateMediaLiveChannelRequestOutputGroupsOutputs> outputs;

        /**
         * <p>The output group type. Only MediaPackage is supported.</p>
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
         * <p>The video encoding level. It is not supported yet.</p>
         * 
         * <strong>example:</strong>
         * <p>H264_LEVEL_AUTO</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The H.264 profile. Valid values: BASELINE, HIGH, and MAIN. Default value: MAIN. The parameter takes effect only when the codec is H.264.</p>
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
         * <p>The frame rate mode. Valid values: SPECIFIED (fixed frame rate) and FROM_SOURCE (use source specification).</p>
         * 
         * <strong>example:</strong>
         * <p>SPECIFIED</p>
         */
        @NameInMap("FramerateControl")
        public String framerateControl;

        /**
         * <p>The denominator of the fixed frame rate. The parameter is required when FramerateControl is set to SPECIFIED. Valid values: 1 to 60. The numerator must be divisible by the denominator.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FramerateDenominator")
        public Integer framerateDenominator;

        /**
         * <p>The numerator of the fixed frame rate. The parameter is required when FramerateControl is set to SPECIFIED. Valid values: 1 to 60. The numerator must be divisible by the denominator.</p>
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
         * <p>The number of B frames. Valid values: 1 to 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BframesNum")
        public Integer bframesNum;

        /**
         * <p>The GOP size. When GopSizeUnits is set to SECONDS, the value range is from 1 to 20. When GopSizeUnits is set to FRAMES, the value range is from 1 to 3000.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("GopSize")
        public Integer gopSize;

        /**
         * <p>The GOP size unit. Valid values: FRAMES and SECONDS.</p>
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
         * <p>The video bitrate. Unit: bit/s. If you set it to 0 or leave it empty, the source specification is used. Valid values: 50000 to 6000000. The value must be divisible by 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>2500000</p>
         */
        @NameInMap("Bitrate")
        public Integer bitrate;

        /**
         * <p>The video buffer size. Unit: bit/s. Valid values: 100000 to 6000000. The value must be divisible by 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>6000000</p>
         */
        @NameInMap("BufferSize")
        public Integer bufferSize;

        /**
         * <p>The maximum bitrate. Unit: bit/s. Valid values: 100000 to 6000000. The value must be divisible by 1000.</p>
         * 
         * <strong>example:</strong>
         * <p>6000000</p>
         */
        @NameInMap("MaxBitrate")
        public Integer maxBitrate;

        /**
         * <p>The bitrate control mode. Valid values: CBR, ABR, and VBR.</p>
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
         * <p>The video encoding settings.</p>
         */
        @NameInMap("CodecDetail")
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingCodecDetail codecDetail;

        /**
         * <p>The frame rate. If it is not specified, the source specification is used.</p>
         */
        @NameInMap("Framerate")
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingFramerate framerate;

        /**
         * <p>The GOP setting. If it is not specified, the source specification is used.</p>
         */
        @NameInMap("Gop")
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSettingGop gop;

        /**
         * <p>The video encoding rate. If it is not specified, the source specification is used.</p>
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
         * <p>The height of the output. Valid values: 0 to 2000. If you set it to 0 or leave it empty, the height automatically adapts to the specified width to maintain the original aspect ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The name of the video settings. Letters, digits, hyphens (-), and underscores (_) are supported. It can be up to 64 characters in length.</p>
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
         * <p>The video encoding settings.</p>
         */
        @NameInMap("VideoCodecSetting")
        public UpdateMediaLiveChannelRequestVideoSettingsVideoCodecSetting videoCodecSetting;

        /**
         * <p>The width of the output. Valid values: 0 to 2000. If you set it to 0 or leave it empty, the width automatically adapts to the specified height to maintain the original aspect ratio.</p>
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

        public UpdateMediaLiveChannelRequestVideoSettings setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

}
