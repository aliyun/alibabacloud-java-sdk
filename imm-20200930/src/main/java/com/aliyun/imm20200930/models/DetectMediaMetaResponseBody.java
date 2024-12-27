// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectMediaMetaResponseBody extends TeaModel {
    /**
     * <p>The addresses.</p>
     * <p>This parameter is returned only when address information is detected.</p>
     */
    @NameInMap("Addresses")
    public java.util.List<Address> addresses;

    /**
     * <p>The album.</p>
     * 
     * <strong>example:</strong>
     * <p>unable</p>
     */
    @NameInMap("Album")
    public String album;

    /**
     * <p>The album artist.</p>
     * 
     * <strong>example:</strong>
     * <p>unable</p>
     */
    @NameInMap("AlbumArtist")
    public String albumArtist;

    /**
     * <p>The artist.</p>
     * 
     * <strong>example:</strong>
     * <p>unable</p>
     */
    @NameInMap("Artist")
    public String artist;

    /**
     * <p>The audio streams.</p>
     */
    @NameInMap("AudioStreams")
    public java.util.List<AudioStream> audioStreams;

    /**
     * <p>The bitrate. Unit: bit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>13164131</p>
     */
    @NameInMap("Bitrate")
    public Long bitrate;

    /**
     * <p>The composer.</p>
     * 
     * <strong>example:</strong>
     * <p>unable</p>
     */
    @NameInMap("Composer")
    public String composer;

    /**
     * <p>The total duration of the video. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>15.263000</p>
     */
    @NameInMap("Duration")
    public Double duration;

    /**
     * <p>The full format name.</p>
     * 
     * <strong>example:</strong>
     * <p>QuickTime / MOV</p>
     */
    @NameInMap("FormatLongName")
    public String formatLongName;

    /**
     * <p>The abbreviated format name.</p>
     * 
     * <strong>example:</strong>
     * <p>mov,mp4,m4a,3gp,3g2,mj2</p>
     */
    @NameInMap("FormatName")
    public String formatName;

    /**
     * <p>The language of the content. For more information, see the ISO 639-2 Alpha-3 codes for the representation of names of languages.</p>
     * 
     * <strong>example:</strong>
     * <p>eng</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The coordinate pair of the central point. The coordinate pair consists of latitude and longitude values. This parameter value must be in the &quot;latitude,longitude&quot; format. Valid values of the latitude: [-90,+90]. Valid values of the longitude: [-180,+180].</p>
     * 
     * <strong>example:</strong>
     * <p>+120.029003,+30.283095</p>
     */
    @NameInMap("LatLong")
    public String latLong;

    /**
     * <p>The performer.</p>
     * 
     * <strong>example:</strong>
     * <p>unable</p>
     */
    @NameInMap("Performer")
    public String performer;

    /**
     * <p>The time of recording. For more information about the time formats, see the RFC3339 Nano standard.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-04-24T02:39:57Z</p>
     */
    @NameInMap("ProduceTime")
    public String produceTime;

    /**
     * <p>The number of programs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("ProgramCount")
    public Long programCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2213B1A9-EB3D-4666-84E0-24980BC*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The size of the media object. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>25115517</p>
     */
    @NameInMap("Size")
    public Long size;

    /**
     * <p>The initial playback time.</p>
     * 
     * <strong>example:</strong>
     * <p>0.000000</p>
     */
    @NameInMap("StartTime")
    public Double startTime;

    /**
     * <p>The number of media streams.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("StreamCount")
    public Long streamCount;

    /**
     * <p>The subtitle streams.</p>
     */
    @NameInMap("Subtitles")
    public java.util.List<SubtitleStream> subtitles;

    /**
     * <p>The title of the media object.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>The video height in pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("VideoHeight")
    public Long videoHeight;

    /**
     * <p>The video streams.</p>
     */
    @NameInMap("VideoStreams")
    public java.util.List<VideoStream> videoStreams;

    /**
     * <p>The video width in pixels.</p>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("VideoWidth")
    public Long videoWidth;

    public static DetectMediaMetaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectMediaMetaResponseBody self = new DetectMediaMetaResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectMediaMetaResponseBody setAddresses(java.util.List<Address> addresses) {
        this.addresses = addresses;
        return this;
    }
    public java.util.List<Address> getAddresses() {
        return this.addresses;
    }

    public DetectMediaMetaResponseBody setAlbum(String album) {
        this.album = album;
        return this;
    }
    public String getAlbum() {
        return this.album;
    }

    public DetectMediaMetaResponseBody setAlbumArtist(String albumArtist) {
        this.albumArtist = albumArtist;
        return this;
    }
    public String getAlbumArtist() {
        return this.albumArtist;
    }

    public DetectMediaMetaResponseBody setArtist(String artist) {
        this.artist = artist;
        return this;
    }
    public String getArtist() {
        return this.artist;
    }

    public DetectMediaMetaResponseBody setAudioStreams(java.util.List<AudioStream> audioStreams) {
        this.audioStreams = audioStreams;
        return this;
    }
    public java.util.List<AudioStream> getAudioStreams() {
        return this.audioStreams;
    }

    public DetectMediaMetaResponseBody setBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }
    public Long getBitrate() {
        return this.bitrate;
    }

    public DetectMediaMetaResponseBody setComposer(String composer) {
        this.composer = composer;
        return this;
    }
    public String getComposer() {
        return this.composer;
    }

    public DetectMediaMetaResponseBody setDuration(Double duration) {
        this.duration = duration;
        return this;
    }
    public Double getDuration() {
        return this.duration;
    }

    public DetectMediaMetaResponseBody setFormatLongName(String formatLongName) {
        this.formatLongName = formatLongName;
        return this;
    }
    public String getFormatLongName() {
        return this.formatLongName;
    }

    public DetectMediaMetaResponseBody setFormatName(String formatName) {
        this.formatName = formatName;
        return this;
    }
    public String getFormatName() {
        return this.formatName;
    }

    public DetectMediaMetaResponseBody setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DetectMediaMetaResponseBody setLatLong(String latLong) {
        this.latLong = latLong;
        return this;
    }
    public String getLatLong() {
        return this.latLong;
    }

    public DetectMediaMetaResponseBody setPerformer(String performer) {
        this.performer = performer;
        return this;
    }
    public String getPerformer() {
        return this.performer;
    }

    public DetectMediaMetaResponseBody setProduceTime(String produceTime) {
        this.produceTime = produceTime;
        return this;
    }
    public String getProduceTime() {
        return this.produceTime;
    }

    public DetectMediaMetaResponseBody setProgramCount(Long programCount) {
        this.programCount = programCount;
        return this;
    }
    public Long getProgramCount() {
        return this.programCount;
    }

    public DetectMediaMetaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectMediaMetaResponseBody setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public DetectMediaMetaResponseBody setStartTime(Double startTime) {
        this.startTime = startTime;
        return this;
    }
    public Double getStartTime() {
        return this.startTime;
    }

    public DetectMediaMetaResponseBody setStreamCount(Long streamCount) {
        this.streamCount = streamCount;
        return this;
    }
    public Long getStreamCount() {
        return this.streamCount;
    }

    public DetectMediaMetaResponseBody setSubtitles(java.util.List<SubtitleStream> subtitles) {
        this.subtitles = subtitles;
        return this;
    }
    public java.util.List<SubtitleStream> getSubtitles() {
        return this.subtitles;
    }

    public DetectMediaMetaResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public DetectMediaMetaResponseBody setVideoHeight(Long videoHeight) {
        this.videoHeight = videoHeight;
        return this;
    }
    public Long getVideoHeight() {
        return this.videoHeight;
    }

    public DetectMediaMetaResponseBody setVideoStreams(java.util.List<VideoStream> videoStreams) {
        this.videoStreams = videoStreams;
        return this;
    }
    public java.util.List<VideoStream> getVideoStreams() {
        return this.videoStreams;
    }

    public DetectMediaMetaResponseBody setVideoWidth(Long videoWidth) {
        this.videoWidth = videoWidth;
        return this;
    }
    public Long getVideoWidth() {
        return this.videoWidth;
    }

}
