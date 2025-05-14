// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaLiveChannelResponseBody extends TeaModel {
    /**
     * <p>The channel information.</p>
     */
    @NameInMap("Channel")
    public GetMediaLiveChannelResponseBodyChannel channel;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaLiveChannelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaLiveChannelResponseBody self = new GetMediaLiveChannelResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaLiveChannelResponseBody setChannel(GetMediaLiveChannelResponseBodyChannel channel) {
        this.channel = channel;
        return this;
    }
    public GetMediaLiveChannelResponseBodyChannel getChannel() {
        return this.channel;
    }

    public GetMediaLiveChannelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaLiveChannelResponseBodyChannelAudioSettingsAudioCodecSetting extends TeaModel {
        /**
         * <p>The audio bitrate. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>200000</p>
         */
        @NameInMap("Bitrate")
        public Integer bitrate;

        /**
         * <p>The audio codec profile.</p>
         * 
         * <strong>example:</strong>
         * <p>AAC-LOW</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The audio sample rate. Unit: Hz.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("SampleRate")
        public Integer sampleRate;

        public static GetMediaLiveChannelResponseBodyChannelAudioSettingsAudioCodecSetting build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelAudioSettingsAudioCodecSetting self = new GetMediaLiveChannelResponseBodyChannelAudioSettingsAudioCodecSetting();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelAudioSettingsAudioCodecSetting setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public GetMediaLiveChannelResponseBodyChannelAudioSettingsAudioCodecSetting setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetMediaLiveChannelResponseBodyChannelAudioSettingsAudioCodecSetting setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Integer getSampleRate() {
            return this.sampleRate;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelAudioSettings extends TeaModel {
        /**
         * <p>The audio codec.</p>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
         */
        @NameInMap("AudioCodec")
        public String audioCodec;

        /**
         * <p>The audio encoding settings.</p>
         */
        @NameInMap("AudioCodecSetting")
        public GetMediaLiveChannelResponseBodyChannelAudioSettingsAudioCodecSetting audioCodecSetting;

        /**
         * <p>The name of the audio selector.</p>
         * 
         * <strong>example:</strong>
         * <p>myselector</p>
         */
        @NameInMap("AudioSelectorName")
        public String audioSelectorName;

        /**
         * <p>A three-letter ISO 639-2 language code.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("LanguageCode")
        public String languageCode;

        /**
         * <p>The name of the language.</p>
         * 
         * <strong>example:</strong>
         * <p>English</p>
         */
        @NameInMap("LanguageName")
        public String languageName;

        /**
         * <p>The name of the audio settings.</p>
         * 
         * <strong>example:</strong>
         * <p>zhuanfengzhuang</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetMediaLiveChannelResponseBodyChannelAudioSettings build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelAudioSettings self = new GetMediaLiveChannelResponseBodyChannelAudioSettings();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelAudioSettings setAudioCodec(String audioCodec) {
            this.audioCodec = audioCodec;
            return this;
        }
        public String getAudioCodec() {
            return this.audioCodec;
        }

        public GetMediaLiveChannelResponseBodyChannelAudioSettings setAudioCodecSetting(GetMediaLiveChannelResponseBodyChannelAudioSettingsAudioCodecSetting audioCodecSetting) {
            this.audioCodecSetting = audioCodecSetting;
            return this;
        }
        public GetMediaLiveChannelResponseBodyChannelAudioSettingsAudioCodecSetting getAudioCodecSetting() {
            return this.audioCodecSetting;
        }

        public GetMediaLiveChannelResponseBodyChannelAudioSettings setAudioSelectorName(String audioSelectorName) {
            this.audioSelectorName = audioSelectorName;
            return this;
        }
        public String getAudioSelectorName() {
            return this.audioSelectorName;
        }

        public GetMediaLiveChannelResponseBodyChannelAudioSettings setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

        public GetMediaLiveChannelResponseBodyChannelAudioSettings setLanguageName(String languageName) {
            this.languageName = languageName;
            return this;
        }
        public String getLanguageName() {
            return this.languageName;
        }

        public GetMediaLiveChannelResponseBodyChannelAudioSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioLanguageSelection extends TeaModel {
        /**
         * <p>A three-letter ISO 639-2 language code from within an audio source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("LanguageCode")
        public String languageCode;

        public static GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioLanguageSelection build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioLanguageSelection self = new GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioLanguageSelection();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioLanguageSelection setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioPidSelection extends TeaModel {
        /**
         * <p>A PID from within a source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Pid")
        public Long pid;

        public static GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioPidSelection build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioPidSelection self = new GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioPidSelection();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioPidSelection setPid(Long pid) {
            this.pid = pid;
            return this;
        }
        public Long getPid() {
            return this.pid;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioTrackSelection extends TeaModel {
        /**
         * <p>The track ID from within a source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TrackId")
        public Long trackId;

        public static GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioTrackSelection build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioTrackSelection self = new GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioTrackSelection();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioTrackSelection setTrackId(Long trackId) {
            this.trackId = trackId;
            return this;
        }
        public Long getTrackId() {
            return this.trackId;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectors extends TeaModel {
        /**
         * <p>The audio language selection.</p>
         */
        @NameInMap("AudioLanguageSelection")
        public GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioLanguageSelection audioLanguageSelection;

        /**
         * <p>The audio PID selection.</p>
         */
        @NameInMap("AudioPidSelection")
        public GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioPidSelection audioPidSelection;

        /**
         * <p>The audio track selection.</p>
         */
        @NameInMap("AudioTrackSelection")
        public java.util.List<GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioTrackSelection> audioTrackSelection;

        /**
         * <p>The name of the audio selector.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myselector</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectors build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectors self = new GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectors();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectors setAudioLanguageSelection(GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioLanguageSelection audioLanguageSelection) {
            this.audioLanguageSelection = audioLanguageSelection;
            return this;
        }
        public GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioLanguageSelection getAudioLanguageSelection() {
            return this.audioLanguageSelection;
        }

        public GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectors setAudioPidSelection(GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioPidSelection audioPidSelection) {
            this.audioPidSelection = audioPidSelection;
            return this;
        }
        public GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioPidSelection getAudioPidSelection() {
            return this.audioPidSelection;
        }

        public GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectors setAudioTrackSelection(java.util.List<GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioTrackSelection> audioTrackSelection) {
            this.audioTrackSelection = audioTrackSelection;
            return this;
        }
        public java.util.List<GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectorsAudioTrackSelection> getAudioTrackSelection() {
            return this.audioTrackSelection;
        }

        public GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelInputAttachments extends TeaModel {
        /**
         * <p>The audio selectors.</p>
         */
        @NameInMap("AudioSelectors")
        public java.util.List<GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectors> audioSelectors;

        /**
         * <p>The ID of the associated input.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SEGK5KA6KYKAWQQH</p>
         */
        @NameInMap("InputId")
        public String inputId;

        /**
         * <p>The name of the input.</p>
         * 
         * <strong>example:</strong>
         * <p>myinput</p>
         */
        @NameInMap("InputName")
        public String inputName;

        /**
         * <p>The language name.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("LanguageName")
        public String languageName;

        public static GetMediaLiveChannelResponseBodyChannelInputAttachments build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelInputAttachments self = new GetMediaLiveChannelResponseBodyChannelInputAttachments();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelInputAttachments setAudioSelectors(java.util.List<GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectors> audioSelectors) {
            this.audioSelectors = audioSelectors;
            return this;
        }
        public java.util.List<GetMediaLiveChannelResponseBodyChannelInputAttachmentsAudioSelectors> getAudioSelectors() {
            return this.audioSelectors;
        }

        public GetMediaLiveChannelResponseBodyChannelInputAttachments setInputId(String inputId) {
            this.inputId = inputId;
            return this;
        }
        public String getInputId() {
            return this.inputId;
        }

        public GetMediaLiveChannelResponseBodyChannelInputAttachments setInputName(String inputName) {
            this.inputName = inputName;
            return this;
        }
        public String getInputName() {
            return this.inputName;
        }

        public GetMediaLiveChannelResponseBodyChannelInputAttachments setLanguageName(String languageName) {
            this.languageName = languageName;
            return this;
        }
        public String getLanguageName() {
            return this.languageName;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelOutputGroupsMediaPackageGroupSetting extends TeaModel {
        /**
         * <p>ChannelName in MediaPackage.</p>
         * 
         * <strong>example:</strong>
         * <p>myPackageChannel</p>
         */
        @NameInMap("ChannelName")
        public String channelName;

        /**
         * <p>GroupName in MediaPackage.</p>
         * 
         * <strong>example:</strong>
         * <p>myPackageGroup</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        public static GetMediaLiveChannelResponseBodyChannelOutputGroupsMediaPackageGroupSetting build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelOutputGroupsMediaPackageGroupSetting self = new GetMediaLiveChannelResponseBodyChannelOutputGroupsMediaPackageGroupSetting();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroupsMediaPackageGroupSetting setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroupsMediaPackageGroupSetting setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputsMediaPackageOutputSetting extends TeaModel {
        /**
         * <p>The manifest audio group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>audiogroup</p>
         */
        @NameInMap("AudioGroupId")
        public String audioGroupId;

        /**
         * <p>The manifest name modifier. The child manifests include this modifier in their M3U8 file names.</p>
         * 
         * <strong>example:</strong>
         * <p>480p</p>
         */
        @NameInMap("NameModifier")
        public String nameModifier;

        public static GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputsMediaPackageOutputSetting build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputsMediaPackageOutputSetting self = new GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputsMediaPackageOutputSetting();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputsMediaPackageOutputSetting setAudioGroupId(String audioGroupId) {
            this.audioGroupId = audioGroupId;
            return this;
        }
        public String getAudioGroupId() {
            return this.audioGroupId;
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputsMediaPackageOutputSetting setNameModifier(String nameModifier) {
            this.nameModifier = nameModifier;
            return this;
        }
        public String getNameModifier() {
            return this.nameModifier;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputs extends TeaModel {
        /**
         * <p>The referenced AudioSettings.</p>
         */
        @NameInMap("AudioSettingNames")
        public java.util.List<String> audioSettingNames;

        /**
         * <p>The settings of the output delivered to MediaPackage.</p>
         */
        @NameInMap("MediaPackageOutputSetting")
        public GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputsMediaPackageOutputSetting mediaPackageOutputSetting;

        /**
         * <p>The media type of the output.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MediaType")
        public Integer mediaType;

        /**
         * <p>The name of the output.</p>
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

        public static GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputs build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputs self = new GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputs();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputs setAudioSettingNames(java.util.List<String> audioSettingNames) {
            this.audioSettingNames = audioSettingNames;
            return this;
        }
        public java.util.List<String> getAudioSettingNames() {
            return this.audioSettingNames;
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputs setMediaPackageOutputSetting(GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputsMediaPackageOutputSetting mediaPackageOutputSetting) {
            this.mediaPackageOutputSetting = mediaPackageOutputSetting;
            return this;
        }
        public GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputsMediaPackageOutputSetting getMediaPackageOutputSetting() {
            return this.mediaPackageOutputSetting;
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputs setMediaType(Integer mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public Integer getMediaType() {
            return this.mediaType;
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputs setVideoSettingName(String videoSettingName) {
            this.videoSettingName = videoSettingName;
            return this;
        }
        public String getVideoSettingName() {
            return this.videoSettingName;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelOutputGroups extends TeaModel {
        /**
         * <p>The MediaPackage destination.</p>
         */
        @NameInMap("MediaPackageGroupSetting")
        public GetMediaLiveChannelResponseBodyChannelOutputGroupsMediaPackageGroupSetting mediaPackageGroupSetting;

        /**
         * <p>The URL for monitoring the output group. The parameter is returned only when the output gourp type is MediaPackage.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://xxx</p>
         */
        @NameInMap("MonitorUrl")
        public String monitorUrl;

        /**
         * <p>The name of the output group.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The outputs in the output group.</p>
         */
        @NameInMap("Outputs")
        public java.util.List<GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputs> outputs;

        /**
         * <p>The output group type.</p>
         * 
         * <strong>example:</strong>
         * <p>MediaPackage</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetMediaLiveChannelResponseBodyChannelOutputGroups build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelOutputGroups self = new GetMediaLiveChannelResponseBodyChannelOutputGroups();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroups setMediaPackageGroupSetting(GetMediaLiveChannelResponseBodyChannelOutputGroupsMediaPackageGroupSetting mediaPackageGroupSetting) {
            this.mediaPackageGroupSetting = mediaPackageGroupSetting;
            return this;
        }
        public GetMediaLiveChannelResponseBodyChannelOutputGroupsMediaPackageGroupSetting getMediaPackageGroupSetting() {
            return this.mediaPackageGroupSetting;
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroups setMonitorUrl(String monitorUrl) {
            this.monitorUrl = monitorUrl;
            return this;
        }
        public String getMonitorUrl() {
            return this.monitorUrl;
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroups setOutputs(java.util.List<GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<GetMediaLiveChannelResponseBodyChannelOutputGroupsOutputs> getOutputs() {
            return this.outputs;
        }

        public GetMediaLiveChannelResponseBodyChannelOutputGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingCodecDetail extends TeaModel {
        /**
         * <p>The video encoding level. It is not supported yet.</p>
         * 
         * <strong>example:</strong>
         * <p>H264_LEVEL_AUTO</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The H.264 profile.</p>
         * 
         * <strong>example:</strong>
         * <p>MAIN</p>
         */
        @NameInMap("Profile")
        public String profile;

        public static GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingCodecDetail build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingCodecDetail self = new GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingCodecDetail();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingCodecDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingCodecDetail setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingFramerate extends TeaModel {
        /**
         * <p>The frame rate mode.</p>
         * 
         * <strong>example:</strong>
         * <p>SPECIFIED</p>
         */
        @NameInMap("FramerateControl")
        public String framerateControl;

        /**
         * <p>The denominator of the fixed frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FramerateDenominator")
        public Integer framerateDenominator;

        /**
         * <p>The numerator of the fixed frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("FramerateNumerator")
        public Integer framerateNumerator;

        public static GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingFramerate build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingFramerate self = new GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingFramerate();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingFramerate setFramerateControl(String framerateControl) {
            this.framerateControl = framerateControl;
            return this;
        }
        public String getFramerateControl() {
            return this.framerateControl;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingFramerate setFramerateDenominator(Integer framerateDenominator) {
            this.framerateDenominator = framerateDenominator;
            return this;
        }
        public Integer getFramerateDenominator() {
            return this.framerateDenominator;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingFramerate setFramerateNumerator(Integer framerateNumerator) {
            this.framerateNumerator = framerateNumerator;
            return this;
        }
        public Integer getFramerateNumerator() {
            return this.framerateNumerator;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingGop extends TeaModel {
        /**
         * <p>The number of B frames.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BframesNum")
        public Integer bframesNum;

        /**
         * <p>The GOP size.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("GopSize")
        public Integer gopSize;

        /**
         * <p>The GOP size unit.</p>
         * 
         * <strong>example:</strong>
         * <p>FRAMES</p>
         */
        @NameInMap("GopSizeUnits")
        public String gopSizeUnits;

        public static GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingGop build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingGop self = new GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingGop();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingGop setBframesNum(Integer bframesNum) {
            this.bframesNum = bframesNum;
            return this;
        }
        public Integer getBframesNum() {
            return this.bframesNum;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingGop setGopSize(Integer gopSize) {
            this.gopSize = gopSize;
            return this;
        }
        public Integer getGopSize() {
            return this.gopSize;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingGop setGopSizeUnits(String gopSizeUnits) {
            this.gopSizeUnits = gopSizeUnits;
            return this;
        }
        public String getGopSizeUnits() {
            return this.gopSizeUnits;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingRate extends TeaModel {
        /**
         * <p>The video bitrate. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>2500000</p>
         */
        @NameInMap("Bitrate")
        public Integer bitrate;

        /**
         * <p>The video buffer size. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>6000000</p>
         */
        @NameInMap("BufferSize")
        public Integer bufferSize;

        /**
         * <p>The maximum bitrate. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>6000000</p>
         */
        @NameInMap("MaxBitrate")
        public Integer maxBitrate;

        /**
         * <p>The bitrate control mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ABR</p>
         */
        @NameInMap("RateControlMode")
        public String rateControlMode;

        public static GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingRate build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingRate self = new GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingRate();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingRate setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingRate setBufferSize(Integer bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        public Integer getBufferSize() {
            return this.bufferSize;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingRate setMaxBitrate(Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }
        public Integer getMaxBitrate() {
            return this.maxBitrate;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingRate setRateControlMode(String rateControlMode) {
            this.rateControlMode = rateControlMode;
            return this;
        }
        public String getRateControlMode() {
            return this.rateControlMode;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSetting extends TeaModel {
        /**
         * <p>The video encoding settings.</p>
         */
        @NameInMap("CodecDetail")
        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingCodecDetail codecDetail;

        /**
         * <p>The frame rate.</p>
         */
        @NameInMap("Framerate")
        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingFramerate framerate;

        /**
         * <p>The GOP setting.</p>
         */
        @NameInMap("Gop")
        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingGop gop;

        /**
         * <p>The video encoding rate.</p>
         */
        @NameInMap("Rate")
        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingRate rate;

        public static GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSetting build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSetting self = new GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSetting();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSetting setCodecDetail(GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingCodecDetail codecDetail) {
            this.codecDetail = codecDetail;
            return this;
        }
        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingCodecDetail getCodecDetail() {
            return this.codecDetail;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSetting setFramerate(GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingFramerate framerate) {
            this.framerate = framerate;
            return this;
        }
        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingFramerate getFramerate() {
            return this.framerate;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSetting setGop(GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingGop gop) {
            this.gop = gop;
            return this;
        }
        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingGop getGop() {
            return this.gop;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSetting setRate(GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingRate rate) {
            this.rate = rate;
            return this;
        }
        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSettingRate getRate() {
            return this.rate;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannelVideoSettings extends TeaModel {
        /**
         * <p>The height of the video in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The name of the video settings.</p>
         * 
         * <strong>example:</strong>
         * <p>video1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The video codec.</p>
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
        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSetting videoCodecSetting;

        /**
         * <p>视频转码方式（普通转码、窄带高清转码等）</p>
         */
        @NameInMap("VideoCodecType")
        public String videoCodecType;

        /**
         * <p>The width of the video in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static GetMediaLiveChannelResponseBodyChannelVideoSettings build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannelVideoSettings self = new GetMediaLiveChannelResponseBodyChannelVideoSettings();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettings setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettings setVideoCodec(String videoCodec) {
            this.videoCodec = videoCodec;
            return this;
        }
        public String getVideoCodec() {
            return this.videoCodec;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettings setVideoCodecSetting(GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSetting videoCodecSetting) {
            this.videoCodecSetting = videoCodecSetting;
            return this;
        }
        public GetMediaLiveChannelResponseBodyChannelVideoSettingsVideoCodecSetting getVideoCodecSetting() {
            return this.videoCodecSetting;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettings setVideoCodecType(String videoCodecType) {
            this.videoCodecType = videoCodecType;
            return this;
        }
        public String getVideoCodecType() {
            return this.videoCodecType;
        }

        public GetMediaLiveChannelResponseBodyChannelVideoSettings setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class GetMediaLiveChannelResponseBodyChannel extends TeaModel {
        /**
         * <p>The audio settings.</p>
         */
        @NameInMap("AudioSettings")
        public java.util.List<GetMediaLiveChannelResponseBodyChannelAudioSettings> audioSettings;

        /**
         * <p>The ID of the channel.</p>
         * 
         * <strong>example:</strong>
         * <p>SEGK5KA6KYKAWQQH</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The time when the channel was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-03T06:56:42Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The inputs associated with the channel.</p>
         */
        @NameInMap("InputAttachments")
        public java.util.List<GetMediaLiveChannelResponseBodyChannelInputAttachments> inputAttachments;

        /**
         * <p>The time when the channel was last started. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. If the channel has never been started since it was created, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-03T06:56:42Z</p>
         */
        @NameInMap("LastStartTime")
        public String lastStartTime;

        /**
         * <p>The time when the channel was last stopped. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC. If the channel has never stopped since it was created, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-03T06:56:42Z</p>
         */
        @NameInMap("LastStopTime")
        public String lastStopTime;

        /**
         * <p>The channel name.</p>
         * 
         * <strong>example:</strong>
         * <p>mych</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The output groups.</p>
         */
        @NameInMap("OutputGroups")
        public java.util.List<GetMediaLiveChannelResponseBodyChannelOutputGroups> outputGroups;

        /**
         * <p>The state of the channel. Valid values: IDLE, STARTING, RUNNING, RECOVERING, and STOPPING.</p>
         * 
         * <strong>example:</strong>
         * <p>IDLE</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The video settings.</p>
         */
        @NameInMap("VideoSettings")
        public java.util.List<GetMediaLiveChannelResponseBodyChannelVideoSettings> videoSettings;

        public static GetMediaLiveChannelResponseBodyChannel build(java.util.Map<String, ?> map) throws Exception {
            GetMediaLiveChannelResponseBodyChannel self = new GetMediaLiveChannelResponseBodyChannel();
            return TeaModel.build(map, self);
        }

        public GetMediaLiveChannelResponseBodyChannel setAudioSettings(java.util.List<GetMediaLiveChannelResponseBodyChannelAudioSettings> audioSettings) {
            this.audioSettings = audioSettings;
            return this;
        }
        public java.util.List<GetMediaLiveChannelResponseBodyChannelAudioSettings> getAudioSettings() {
            return this.audioSettings;
        }

        public GetMediaLiveChannelResponseBodyChannel setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public GetMediaLiveChannelResponseBodyChannel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaLiveChannelResponseBodyChannel setInputAttachments(java.util.List<GetMediaLiveChannelResponseBodyChannelInputAttachments> inputAttachments) {
            this.inputAttachments = inputAttachments;
            return this;
        }
        public java.util.List<GetMediaLiveChannelResponseBodyChannelInputAttachments> getInputAttachments() {
            return this.inputAttachments;
        }

        public GetMediaLiveChannelResponseBodyChannel setLastStartTime(String lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        public GetMediaLiveChannelResponseBodyChannel setLastStopTime(String lastStopTime) {
            this.lastStopTime = lastStopTime;
            return this;
        }
        public String getLastStopTime() {
            return this.lastStopTime;
        }

        public GetMediaLiveChannelResponseBodyChannel setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMediaLiveChannelResponseBodyChannel setOutputGroups(java.util.List<GetMediaLiveChannelResponseBodyChannelOutputGroups> outputGroups) {
            this.outputGroups = outputGroups;
            return this;
        }
        public java.util.List<GetMediaLiveChannelResponseBodyChannelOutputGroups> getOutputGroups() {
            return this.outputGroups;
        }

        public GetMediaLiveChannelResponseBodyChannel setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetMediaLiveChannelResponseBodyChannel setVideoSettings(java.util.List<GetMediaLiveChannelResponseBodyChannelVideoSettings> videoSettings) {
            this.videoSettings = videoSettings;
            return this;
        }
        public java.util.List<GetMediaLiveChannelResponseBodyChannelVideoSettings> getVideoSettings() {
            return this.videoSettings;
        }

    }

}
