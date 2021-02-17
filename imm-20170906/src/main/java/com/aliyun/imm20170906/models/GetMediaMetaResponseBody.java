// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20170906.models;

import com.aliyun.tea.*;

public class GetMediaMetaResponseBody extends TeaModel {
    @NameInMap("MediaUri")
    public String mediaUri;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MediaMeta")
    public GetMediaMetaResponseBodyMediaMeta mediaMeta;

    public static GetMediaMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaMetaResponseBody self = new GetMediaMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaMetaResponseBody setMediaUri(String mediaUri) {
        this.mediaUri = mediaUri;
        return this;
    }
    public String getMediaUri() {
        return this.mediaUri;
    }

    public GetMediaMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaMetaResponseBody setMediaMeta(GetMediaMetaResponseBodyMediaMeta mediaMeta) {
        this.mediaMeta = mediaMeta;
        return this;
    }
    public GetMediaMetaResponseBodyMediaMeta getMediaMeta() {
        return this.mediaMeta;
    }

    public static class GetMediaMetaResponseBodyMediaMetaMediaFormatTag extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Album")
        public String album;

        @NameInMap("AlbumArtist")
        public String albumArtist;

        @NameInMap("Performer")
        public String performer;

        @NameInMap("Composer")
        public String composer;

        @NameInMap("Artist")
        public String artist;

        @NameInMap("Title")
        public String title;

        @NameInMap("Language")
        public String language;

        public static GetMediaMetaResponseBodyMediaMetaMediaFormatTag build(java.util.Map<String, ?> map) throws Exception {
            GetMediaMetaResponseBodyMediaMetaMediaFormatTag self = new GetMediaMetaResponseBodyMediaMetaMediaFormatTag();
            return TeaModel.build(map, self);
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatTag setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatTag setAlbum(String album) {
            this.album = album;
            return this;
        }
        public String getAlbum() {
            return this.album;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatTag setAlbumArtist(String albumArtist) {
            this.albumArtist = albumArtist;
            return this;
        }
        public String getAlbumArtist() {
            return this.albumArtist;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatTag setPerformer(String performer) {
            this.performer = performer;
            return this;
        }
        public String getPerformer() {
            return this.performer;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatTag setComposer(String composer) {
            this.composer = composer;
            return this;
        }
        public String getComposer() {
            return this.composer;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatTag setArtist(String artist) {
            this.artist = artist;
            return this;
        }
        public String getArtist() {
            return this.artist;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatTag setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatTag setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class GetMediaMetaResponseBodyMediaMetaMediaFormatAddress extends TeaModel {
        @NameInMap("Township")
        public String township;

        @NameInMap("District")
        public String district;

        @NameInMap("AddressLine")
        public String addressLine;

        @NameInMap("Country")
        public String country;

        @NameInMap("City")
        public String city;

        @NameInMap("Province")
        public String province;

        public static GetMediaMetaResponseBodyMediaMetaMediaFormatAddress build(java.util.Map<String, ?> map) throws Exception {
            GetMediaMetaResponseBodyMediaMetaMediaFormatAddress self = new GetMediaMetaResponseBodyMediaMetaMediaFormatAddress();
            return TeaModel.build(map, self);
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatAddress setTownship(String township) {
            this.township = township;
            return this;
        }
        public String getTownship() {
            return this.township;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatAddress setDistrict(String district) {
            this.district = district;
            return this;
        }
        public String getDistrict() {
            return this.district;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatAddress setAddressLine(String addressLine) {
            this.addressLine = addressLine;
            return this;
        }
        public String getAddressLine() {
            return this.addressLine;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatAddress setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatAddress setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormatAddress setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

    }

    public static class GetMediaMetaResponseBodyMediaMetaMediaFormat extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("NumberPrograms")
        public Integer numberPrograms;

        @NameInMap("NumberStreams")
        public Integer numberStreams;

        @NameInMap("Tag")
        public GetMediaMetaResponseBodyMediaMetaMediaFormatTag tag;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Size")
        public String size;

        @NameInMap("Address")
        public GetMediaMetaResponseBodyMediaMetaMediaFormatAddress address;

        @NameInMap("FormatLongName")
        public String formatLongName;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FormatName")
        public String formatName;

        @NameInMap("Location")
        public String location;

        public static GetMediaMetaResponseBodyMediaMetaMediaFormat build(java.util.Map<String, ?> map) throws Exception {
            GetMediaMetaResponseBodyMediaMetaMediaFormat self = new GetMediaMetaResponseBodyMediaMetaMediaFormat();
            return TeaModel.build(map, self);
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormat setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormat setNumberPrograms(Integer numberPrograms) {
            this.numberPrograms = numberPrograms;
            return this;
        }
        public Integer getNumberPrograms() {
            return this.numberPrograms;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormat setNumberStreams(Integer numberStreams) {
            this.numberStreams = numberStreams;
            return this;
        }
        public Integer getNumberStreams() {
            return this.numberStreams;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormat setTag(GetMediaMetaResponseBodyMediaMetaMediaFormatTag tag) {
            this.tag = tag;
            return this;
        }
        public GetMediaMetaResponseBodyMediaMetaMediaFormatTag getTag() {
            return this.tag;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormat setAddress(GetMediaMetaResponseBodyMediaMetaMediaFormatAddress address) {
            this.address = address;
            return this;
        }
        public GetMediaMetaResponseBodyMediaMetaMediaFormatAddress getAddress() {
            return this.address;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaFormat setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

    }

    public static class GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("SampleAspectRatio")
        public String sampleAspectRatio;

        @NameInMap("AverageFrameRate")
        public String averageFrameRate;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("Language")
        public String language;

        @NameInMap("HasBFrames")
        public Integer hasBFrames;

        @NameInMap("FrameRrate")
        public String frameRrate;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Frames")
        public String frames;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("Width")
        public Integer width;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("DisplayAspectRatio")
        public String displayAspectRatio;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("TimeBase")
        public String timeBase;

        @NameInMap("Level")
        public Integer level;

        @NameInMap("PixelFormat")
        public String pixelFormat;

        public static GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams build(java.util.Map<String, ?> map) throws Exception {
            GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams self = new GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams();
            return TeaModel.build(map, self);
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setSampleAspectRatio(String sampleAspectRatio) {
            this.sampleAspectRatio = sampleAspectRatio;
            return this;
        }
        public String getSampleAspectRatio() {
            return this.sampleAspectRatio;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setAverageFrameRate(String averageFrameRate) {
            this.averageFrameRate = averageFrameRate;
            return this;
        }
        public String getAverageFrameRate() {
            return this.averageFrameRate;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setHasBFrames(Integer hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public Integer getHasBFrames() {
            return this.hasBFrames;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setFrameRrate(String frameRrate) {
            this.frameRrate = frameRrate;
            return this;
        }
        public String getFrameRrate() {
            return this.frameRrate;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setFrames(String frames) {
            this.frames = frames;
            return this;
        }
        public String getFrames() {
            return this.frames;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setDisplayAspectRatio(String displayAspectRatio) {
            this.displayAspectRatio = displayAspectRatio;
            return this;
        }
        public String getDisplayAspectRatio() {
            return this.displayAspectRatio;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setTimeBase(String timeBase) {
            this.timeBase = timeBase;
            return this;
        }
        public String getTimeBase() {
            return this.timeBase;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setLevel(Integer level) {
            this.level = level;
            return this;
        }
        public Integer getLevel() {
            return this.level;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams setPixelFormat(String pixelFormat) {
            this.pixelFormat = pixelFormat;
            return this;
        }
        public String getPixelFormat() {
            return this.pixelFormat;
        }

    }

    public static class GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("SampleRate")
        public String sampleRate;

        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("Channels")
        public Integer channels;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("Language")
        public String language;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("SampleFormat")
        public String sampleFormat;

        @NameInMap("Frames")
        public String frames;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("TimeBase")
        public String timeBase;

        public static GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams build(java.util.Map<String, ?> map) throws Exception {
            GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams self = new GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams();
            return TeaModel.build(map, self);
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setChannels(Integer channels) {
            this.channels = channels;
            return this;
        }
        public Integer getChannels() {
            return this.channels;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setSampleFormat(String sampleFormat) {
            this.sampleFormat = sampleFormat;
            return this;
        }
        public String getSampleFormat() {
            return this.sampleFormat;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setFrames(String frames) {
            this.frames = frames;
            return this;
        }
        public String getFrames() {
            return this.frames;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams setTimeBase(String timeBase) {
            this.timeBase = timeBase;
            return this;
        }
        public String getTimeBase() {
            return this.timeBase;
        }

    }

    public static class GetMediaMetaResponseBodyMediaMetaMediaStreamsSubtitleStreams extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("Language")
        public String language;

        public static GetMediaMetaResponseBodyMediaMetaMediaStreamsSubtitleStreams build(java.util.Map<String, ?> map) throws Exception {
            GetMediaMetaResponseBodyMediaMetaMediaStreamsSubtitleStreams self = new GetMediaMetaResponseBodyMediaMetaMediaStreamsSubtitleStreams();
            return TeaModel.build(map, self);
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsSubtitleStreams setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreamsSubtitleStreams setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

    }

    public static class GetMediaMetaResponseBodyMediaMetaMediaStreams extends TeaModel {
        @NameInMap("VideoStreams")
        public java.util.List<GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams> videoStreams;

        @NameInMap("AudioStreams")
        public java.util.List<GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams> audioStreams;

        @NameInMap("SubtitleStreams")
        public java.util.List<GetMediaMetaResponseBodyMediaMetaMediaStreamsSubtitleStreams> subtitleStreams;

        public static GetMediaMetaResponseBodyMediaMetaMediaStreams build(java.util.Map<String, ?> map) throws Exception {
            GetMediaMetaResponseBodyMediaMetaMediaStreams self = new GetMediaMetaResponseBodyMediaMetaMediaStreams();
            return TeaModel.build(map, self);
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreams setVideoStreams(java.util.List<GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams> videoStreams) {
            this.videoStreams = videoStreams;
            return this;
        }
        public java.util.List<GetMediaMetaResponseBodyMediaMetaMediaStreamsVideoStreams> getVideoStreams() {
            return this.videoStreams;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreams setAudioStreams(java.util.List<GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams> audioStreams) {
            this.audioStreams = audioStreams;
            return this;
        }
        public java.util.List<GetMediaMetaResponseBodyMediaMetaMediaStreamsAudioStreams> getAudioStreams() {
            return this.audioStreams;
        }

        public GetMediaMetaResponseBodyMediaMetaMediaStreams setSubtitleStreams(java.util.List<GetMediaMetaResponseBodyMediaMetaMediaStreamsSubtitleStreams> subtitleStreams) {
            this.subtitleStreams = subtitleStreams;
            return this;
        }
        public java.util.List<GetMediaMetaResponseBodyMediaMetaMediaStreamsSubtitleStreams> getSubtitleStreams() {
            return this.subtitleStreams;
        }

    }

    public static class GetMediaMetaResponseBodyMediaMeta extends TeaModel {
        @NameInMap("MediaFormat")
        public GetMediaMetaResponseBodyMediaMetaMediaFormat mediaFormat;

        @NameInMap("MediaStreams")
        public GetMediaMetaResponseBodyMediaMetaMediaStreams mediaStreams;

        public static GetMediaMetaResponseBodyMediaMeta build(java.util.Map<String, ?> map) throws Exception {
            GetMediaMetaResponseBodyMediaMeta self = new GetMediaMetaResponseBodyMediaMeta();
            return TeaModel.build(map, self);
        }

        public GetMediaMetaResponseBodyMediaMeta setMediaFormat(GetMediaMetaResponseBodyMediaMetaMediaFormat mediaFormat) {
            this.mediaFormat = mediaFormat;
            return this;
        }
        public GetMediaMetaResponseBodyMediaMetaMediaFormat getMediaFormat() {
            return this.mediaFormat;
        }

        public GetMediaMetaResponseBodyMediaMeta setMediaStreams(GetMediaMetaResponseBodyMediaMetaMediaStreams mediaStreams) {
            this.mediaStreams = mediaStreams;
            return this;
        }
        public GetMediaMetaResponseBodyMediaMetaMediaStreams getMediaStreams() {
            return this.mediaStreams;
        }

    }

}
