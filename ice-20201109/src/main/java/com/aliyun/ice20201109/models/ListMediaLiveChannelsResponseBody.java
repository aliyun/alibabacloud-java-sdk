// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaLiveChannelsResponseBody extends TeaModel {
    /**
     * <p>The channels.</p>
     */
    @NameInMap("Channels")
    public java.util.List<ListMediaLiveChannelsResponseBodyChannels> channels;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListMediaLiveChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaLiveChannelsResponseBody self = new ListMediaLiveChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaLiveChannelsResponseBody setChannels(java.util.List<ListMediaLiveChannelsResponseBodyChannels> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<ListMediaLiveChannelsResponseBodyChannels> getChannels() {
        return this.channels;
    }

    public ListMediaLiveChannelsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListMediaLiveChannelsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMediaLiveChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMediaLiveChannelsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListMediaLiveChannelsResponseBodyChannelsAudioSettingsAudioCodecSetting extends TeaModel {
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

        public static ListMediaLiveChannelsResponseBodyChannelsAudioSettingsAudioCodecSetting build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsAudioSettingsAudioCodecSetting self = new ListMediaLiveChannelsResponseBodyChannelsAudioSettingsAudioCodecSetting();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsAudioSettingsAudioCodecSetting setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public ListMediaLiveChannelsResponseBodyChannelsAudioSettingsAudioCodecSetting setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public ListMediaLiveChannelsResponseBodyChannelsAudioSettingsAudioCodecSetting setSampleRate(Integer sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public Integer getSampleRate() {
            return this.sampleRate;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsAudioSettings extends TeaModel {
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
        public ListMediaLiveChannelsResponseBodyChannelsAudioSettingsAudioCodecSetting audioCodecSetting;

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

        public static ListMediaLiveChannelsResponseBodyChannelsAudioSettings build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsAudioSettings self = new ListMediaLiveChannelsResponseBodyChannelsAudioSettings();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsAudioSettings setAudioCodec(String audioCodec) {
            this.audioCodec = audioCodec;
            return this;
        }
        public String getAudioCodec() {
            return this.audioCodec;
        }

        public ListMediaLiveChannelsResponseBodyChannelsAudioSettings setAudioCodecSetting(ListMediaLiveChannelsResponseBodyChannelsAudioSettingsAudioCodecSetting audioCodecSetting) {
            this.audioCodecSetting = audioCodecSetting;
            return this;
        }
        public ListMediaLiveChannelsResponseBodyChannelsAudioSettingsAudioCodecSetting getAudioCodecSetting() {
            return this.audioCodecSetting;
        }

        public ListMediaLiveChannelsResponseBodyChannelsAudioSettings setAudioSelectorName(String audioSelectorName) {
            this.audioSelectorName = audioSelectorName;
            return this;
        }
        public String getAudioSelectorName() {
            return this.audioSelectorName;
        }

        public ListMediaLiveChannelsResponseBodyChannelsAudioSettings setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

        public ListMediaLiveChannelsResponseBodyChannelsAudioSettings setLanguageName(String languageName) {
            this.languageName = languageName;
            return this;
        }
        public String getLanguageName() {
            return this.languageName;
        }

        public ListMediaLiveChannelsResponseBodyChannelsAudioSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioLanguageSelection extends TeaModel {
        /**
         * <p>A three-letter ISO 639-2 language code from within an audio source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("LanguageCode")
        public String languageCode;

        public static ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioLanguageSelection build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioLanguageSelection self = new ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioLanguageSelection();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioLanguageSelection setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioPidSelection extends TeaModel {
        /**
         * <p>A PID from within a source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Pid")
        public Long pid;

        public static ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioPidSelection build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioPidSelection self = new ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioPidSelection();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioPidSelection setPid(Long pid) {
            this.pid = pid;
            return this;
        }
        public Long getPid() {
            return this.pid;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioTrackSelection extends TeaModel {
        /**
         * <p>The track ID from within a source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TrackId")
        public Long trackId;

        public static ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioTrackSelection build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioTrackSelection self = new ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioTrackSelection();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioTrackSelection setTrackId(Long trackId) {
            this.trackId = trackId;
            return this;
        }
        public Long getTrackId() {
            return this.trackId;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectors extends TeaModel {
        /**
         * <p>The audio language selection.</p>
         */
        @NameInMap("AudioLanguageSelection")
        public ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioLanguageSelection audioLanguageSelection;

        /**
         * <p>The audio PID selection.</p>
         */
        @NameInMap("AudioPidSelection")
        public ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioPidSelection audioPidSelection;

        /**
         * <p>The audio track selection.</p>
         */
        @NameInMap("AudioTrackSelection")
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioTrackSelection> audioTrackSelection;

        /**
         * <p>The name of the audio selector.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myselector</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectors build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectors self = new ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectors();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectors setAudioLanguageSelection(ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioLanguageSelection audioLanguageSelection) {
            this.audioLanguageSelection = audioLanguageSelection;
            return this;
        }
        public ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioLanguageSelection getAudioLanguageSelection() {
            return this.audioLanguageSelection;
        }

        public ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectors setAudioPidSelection(ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioPidSelection audioPidSelection) {
            this.audioPidSelection = audioPidSelection;
            return this;
        }
        public ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioPidSelection getAudioPidSelection() {
            return this.audioPidSelection;
        }

        public ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectors setAudioTrackSelection(java.util.List<ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioTrackSelection> audioTrackSelection) {
            this.audioTrackSelection = audioTrackSelection;
            return this;
        }
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectorsAudioTrackSelection> getAudioTrackSelection() {
            return this.audioTrackSelection;
        }

        public ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectors setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsInputAttachments extends TeaModel {
        /**
         * <p>The audio selectors.</p>
         */
        @NameInMap("AudioSelectors")
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectors> audioSelectors;

        /**
         * <p>The ID of the input.</p>
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
         * <p>The name of the language.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("LanguageName")
        public String languageName;

        public static ListMediaLiveChannelsResponseBodyChannelsInputAttachments build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsInputAttachments self = new ListMediaLiveChannelsResponseBodyChannelsInputAttachments();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsInputAttachments setAudioSelectors(java.util.List<ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectors> audioSelectors) {
            this.audioSelectors = audioSelectors;
            return this;
        }
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsInputAttachmentsAudioSelectors> getAudioSelectors() {
            return this.audioSelectors;
        }

        public ListMediaLiveChannelsResponseBodyChannelsInputAttachments setInputId(String inputId) {
            this.inputId = inputId;
            return this;
        }
        public String getInputId() {
            return this.inputId;
        }

        public ListMediaLiveChannelsResponseBodyChannelsInputAttachments setInputName(String inputName) {
            this.inputName = inputName;
            return this;
        }
        public String getInputName() {
            return this.inputName;
        }

        public ListMediaLiveChannelsResponseBodyChannelsInputAttachments setLanguageName(String languageName) {
            this.languageName = languageName;
            return this;
        }
        public String getLanguageName() {
            return this.languageName;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsOutputGroupsMediaPackageGroupSetting extends TeaModel {
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

        public static ListMediaLiveChannelsResponseBodyChannelsOutputGroupsMediaPackageGroupSetting build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsOutputGroupsMediaPackageGroupSetting self = new ListMediaLiveChannelsResponseBodyChannelsOutputGroupsMediaPackageGroupSetting();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroupsMediaPackageGroupSetting setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroupsMediaPackageGroupSetting setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputsMediaPackageOutputSetting extends TeaModel {
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

        public static ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputsMediaPackageOutputSetting build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputsMediaPackageOutputSetting self = new ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputsMediaPackageOutputSetting();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputsMediaPackageOutputSetting setAudioGroupId(String audioGroupId) {
            this.audioGroupId = audioGroupId;
            return this;
        }
        public String getAudioGroupId() {
            return this.audioGroupId;
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputsMediaPackageOutputSetting setNameModifier(String nameModifier) {
            this.nameModifier = nameModifier;
            return this;
        }
        public String getNameModifier() {
            return this.nameModifier;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputs extends TeaModel {
        /**
         * <p>The referenced AudioSettings.</p>
         */
        @NameInMap("AudioSettingNames")
        public java.util.List<String> audioSettingNames;

        /**
         * <p>The settings of the output delivered to MediaPackage.</p>
         */
        @NameInMap("MediaPackageOutputSetting")
        public ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputsMediaPackageOutputSetting mediaPackageOutputSetting;

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

        public static ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputs build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputs self = new ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputs();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputs setAudioSettingNames(java.util.List<String> audioSettingNames) {
            this.audioSettingNames = audioSettingNames;
            return this;
        }
        public java.util.List<String> getAudioSettingNames() {
            return this.audioSettingNames;
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputs setMediaPackageOutputSetting(ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputsMediaPackageOutputSetting mediaPackageOutputSetting) {
            this.mediaPackageOutputSetting = mediaPackageOutputSetting;
            return this;
        }
        public ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputsMediaPackageOutputSetting getMediaPackageOutputSetting() {
            return this.mediaPackageOutputSetting;
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputs setMediaType(Integer mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public Integer getMediaType() {
            return this.mediaType;
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputs setVideoSettingName(String videoSettingName) {
            this.videoSettingName = videoSettingName;
            return this;
        }
        public String getVideoSettingName() {
            return this.videoSettingName;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsOutputGroups extends TeaModel {
        /**
         * <p>The MediaPackage destination.</p>
         */
        @NameInMap("MediaPackageGroupSetting")
        public ListMediaLiveChannelsResponseBodyChannelsOutputGroupsMediaPackageGroupSetting mediaPackageGroupSetting;

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
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputs> outputs;

        /**
         * <p>The output group type.</p>
         * 
         * <strong>example:</strong>
         * <p>MediaPackage</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListMediaLiveChannelsResponseBodyChannelsOutputGroups build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsOutputGroups self = new ListMediaLiveChannelsResponseBodyChannelsOutputGroups();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroups setMediaPackageGroupSetting(ListMediaLiveChannelsResponseBodyChannelsOutputGroupsMediaPackageGroupSetting mediaPackageGroupSetting) {
            this.mediaPackageGroupSetting = mediaPackageGroupSetting;
            return this;
        }
        public ListMediaLiveChannelsResponseBodyChannelsOutputGroupsMediaPackageGroupSetting getMediaPackageGroupSetting() {
            return this.mediaPackageGroupSetting;
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroups setMonitorUrl(String monitorUrl) {
            this.monitorUrl = monitorUrl;
            return this;
        }
        public String getMonitorUrl() {
            return this.monitorUrl;
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroups setOutputs(java.util.List<ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputs> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsOutputGroupsOutputs> getOutputs() {
            return this.outputs;
        }

        public ListMediaLiveChannelsResponseBodyChannelsOutputGroups setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingCodecDetail extends TeaModel {
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

        public static ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingCodecDetail build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingCodecDetail self = new ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingCodecDetail();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingCodecDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingCodecDetail setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingFramerate extends TeaModel {
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

        public static ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingFramerate build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingFramerate self = new ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingFramerate();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingFramerate setFramerateControl(String framerateControl) {
            this.framerateControl = framerateControl;
            return this;
        }
        public String getFramerateControl() {
            return this.framerateControl;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingFramerate setFramerateDenominator(Integer framerateDenominator) {
            this.framerateDenominator = framerateDenominator;
            return this;
        }
        public Integer getFramerateDenominator() {
            return this.framerateDenominator;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingFramerate setFramerateNumerator(Integer framerateNumerator) {
            this.framerateNumerator = framerateNumerator;
            return this;
        }
        public Integer getFramerateNumerator() {
            return this.framerateNumerator;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingGop extends TeaModel {
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

        public static ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingGop build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingGop self = new ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingGop();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingGop setBframesNum(Integer bframesNum) {
            this.bframesNum = bframesNum;
            return this;
        }
        public Integer getBframesNum() {
            return this.bframesNum;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingGop setGopSize(Integer gopSize) {
            this.gopSize = gopSize;
            return this;
        }
        public Integer getGopSize() {
            return this.gopSize;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingGop setGopSizeUnits(String gopSizeUnits) {
            this.gopSizeUnits = gopSizeUnits;
            return this;
        }
        public String getGopSizeUnits() {
            return this.gopSizeUnits;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingRate extends TeaModel {
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

        public static ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingRate build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingRate self = new ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingRate();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingRate setBitrate(Integer bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public Integer getBitrate() {
            return this.bitrate;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingRate setBufferSize(Integer bufferSize) {
            this.bufferSize = bufferSize;
            return this;
        }
        public Integer getBufferSize() {
            return this.bufferSize;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingRate setMaxBitrate(Integer maxBitrate) {
            this.maxBitrate = maxBitrate;
            return this;
        }
        public Integer getMaxBitrate() {
            return this.maxBitrate;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingRate setRateControlMode(String rateControlMode) {
            this.rateControlMode = rateControlMode;
            return this;
        }
        public String getRateControlMode() {
            return this.rateControlMode;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSetting extends TeaModel {
        /**
         * <p>The video encoding settings.</p>
         */
        @NameInMap("CodecDetail")
        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingCodecDetail codecDetail;

        /**
         * <p>The frame rate.</p>
         */
        @NameInMap("Framerate")
        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingFramerate framerate;

        /**
         * <p>The GOP setting.</p>
         */
        @NameInMap("Gop")
        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingGop gop;

        /**
         * <p>The video encoding rate.</p>
         */
        @NameInMap("Rate")
        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingRate rate;

        public static ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSetting build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSetting self = new ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSetting();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSetting setCodecDetail(ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingCodecDetail codecDetail) {
            this.codecDetail = codecDetail;
            return this;
        }
        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingCodecDetail getCodecDetail() {
            return this.codecDetail;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSetting setFramerate(ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingFramerate framerate) {
            this.framerate = framerate;
            return this;
        }
        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingFramerate getFramerate() {
            return this.framerate;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSetting setGop(ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingGop gop) {
            this.gop = gop;
            return this;
        }
        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingGop getGop() {
            return this.gop;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSetting setRate(ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingRate rate) {
            this.rate = rate;
            return this;
        }
        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSettingRate getRate() {
            return this.rate;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannelsVideoSettings extends TeaModel {
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
        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSetting videoCodecSetting;

        /**
         * <p>The width of the video in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static ListMediaLiveChannelsResponseBodyChannelsVideoSettings build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannelsVideoSettings self = new ListMediaLiveChannelsResponseBodyChannelsVideoSettings();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettings setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettings setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettings setVideoCodec(String videoCodec) {
            this.videoCodec = videoCodec;
            return this;
        }
        public String getVideoCodec() {
            return this.videoCodec;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettings setVideoCodecSetting(ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSetting videoCodecSetting) {
            this.videoCodecSetting = videoCodecSetting;
            return this;
        }
        public ListMediaLiveChannelsResponseBodyChannelsVideoSettingsVideoCodecSetting getVideoCodecSetting() {
            return this.videoCodecSetting;
        }

        public ListMediaLiveChannelsResponseBodyChannelsVideoSettings setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class ListMediaLiveChannelsResponseBodyChannels extends TeaModel {
        /**
         * <p>The audio settings.</p>
         */
        @NameInMap("AudioSettings")
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsAudioSettings> audioSettings;

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
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsInputAttachments> inputAttachments;

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
         * <p>The name of the channel.</p>
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
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsOutputGroups> outputGroups;

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
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsVideoSettings> videoSettings;

        public static ListMediaLiveChannelsResponseBodyChannels build(java.util.Map<String, ?> map) throws Exception {
            ListMediaLiveChannelsResponseBodyChannels self = new ListMediaLiveChannelsResponseBodyChannels();
            return TeaModel.build(map, self);
        }

        public ListMediaLiveChannelsResponseBodyChannels setAudioSettings(java.util.List<ListMediaLiveChannelsResponseBodyChannelsAudioSettings> audioSettings) {
            this.audioSettings = audioSettings;
            return this;
        }
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsAudioSettings> getAudioSettings() {
            return this.audioSettings;
        }

        public ListMediaLiveChannelsResponseBodyChannels setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public ListMediaLiveChannelsResponseBodyChannels setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMediaLiveChannelsResponseBodyChannels setInputAttachments(java.util.List<ListMediaLiveChannelsResponseBodyChannelsInputAttachments> inputAttachments) {
            this.inputAttachments = inputAttachments;
            return this;
        }
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsInputAttachments> getInputAttachments() {
            return this.inputAttachments;
        }

        public ListMediaLiveChannelsResponseBodyChannels setLastStartTime(String lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public String getLastStartTime() {
            return this.lastStartTime;
        }

        public ListMediaLiveChannelsResponseBodyChannels setLastStopTime(String lastStopTime) {
            this.lastStopTime = lastStopTime;
            return this;
        }
        public String getLastStopTime() {
            return this.lastStopTime;
        }

        public ListMediaLiveChannelsResponseBodyChannels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMediaLiveChannelsResponseBodyChannels setOutputGroups(java.util.List<ListMediaLiveChannelsResponseBodyChannelsOutputGroups> outputGroups) {
            this.outputGroups = outputGroups;
            return this;
        }
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsOutputGroups> getOutputGroups() {
            return this.outputGroups;
        }

        public ListMediaLiveChannelsResponseBodyChannels setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListMediaLiveChannelsResponseBodyChannels setVideoSettings(java.util.List<ListMediaLiveChannelsResponseBodyChannelsVideoSettings> videoSettings) {
            this.videoSettings = videoSettings;
            return this;
        }
        public java.util.List<ListMediaLiveChannelsResponseBodyChannelsVideoSettings> getVideoSettings() {
            return this.videoSettings;
        }

    }

}
