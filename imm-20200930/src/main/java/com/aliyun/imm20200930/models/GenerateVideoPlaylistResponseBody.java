// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateVideoPlaylistResponseBody extends TeaModel {
    /**
     * <p>The audio media playlist files.</p>
     */
    @NameInMap("AudioPlaylist")
    public java.util.List<GenerateVideoPlaylistResponseBodyAudioPlaylist> audioPlaylist;

    /**
     * <p>The total duration of the generated video.</p>
     * 
     * <strong>example:</strong>
     * <p>1082</p>
     */
    @NameInMap("Duration")
    public Float duration;

    /**
     * <p>The OSS path of the master playlist.</p>
     * 
     * <strong>example:</strong>
     * <p>oss://test-bucket/test-object/master.m3u8</p>
     */
    @NameInMap("MasterURI")
    public String masterURI;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CA995EFD-083D-4F40-BE8A-BDF75FFF*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The subtitle media playlist files.</p>
     */
    @NameInMap("SubtitlePlaylist")
    public java.util.List<GenerateVideoPlaylistResponseBodySubtitlePlaylist> subtitlePlaylist;

    /**
     * <p>The token of the master playlist.</p>
     * 
     * <strong>example:</strong>
     * <p>92376fbb-171f-4259-913f-705f7ee0****</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The video media playlist files.</p>
     */
    @NameInMap("VideoPlaylist")
    public java.util.List<GenerateVideoPlaylistResponseBodyVideoPlaylist> videoPlaylist;

    public static GenerateVideoPlaylistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoPlaylistResponseBody self = new GenerateVideoPlaylistResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateVideoPlaylistResponseBody setAudioPlaylist(java.util.List<GenerateVideoPlaylistResponseBodyAudioPlaylist> audioPlaylist) {
        this.audioPlaylist = audioPlaylist;
        return this;
    }
    public java.util.List<GenerateVideoPlaylistResponseBodyAudioPlaylist> getAudioPlaylist() {
        return this.audioPlaylist;
    }

    public GenerateVideoPlaylistResponseBody setDuration(Float duration) {
        this.duration = duration;
        return this;
    }
    public Float getDuration() {
        return this.duration;
    }

    public GenerateVideoPlaylistResponseBody setMasterURI(String masterURI) {
        this.masterURI = masterURI;
        return this;
    }
    public String getMasterURI() {
        return this.masterURI;
    }

    public GenerateVideoPlaylistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateVideoPlaylistResponseBody setSubtitlePlaylist(java.util.List<GenerateVideoPlaylistResponseBodySubtitlePlaylist> subtitlePlaylist) {
        this.subtitlePlaylist = subtitlePlaylist;
        return this;
    }
    public java.util.List<GenerateVideoPlaylistResponseBodySubtitlePlaylist> getSubtitlePlaylist() {
        return this.subtitlePlaylist;
    }

    public GenerateVideoPlaylistResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public GenerateVideoPlaylistResponseBody setVideoPlaylist(java.util.List<GenerateVideoPlaylistResponseBodyVideoPlaylist> videoPlaylist) {
        this.videoPlaylist = videoPlaylist;
        return this;
    }
    public java.util.List<GenerateVideoPlaylistResponseBodyVideoPlaylist> getVideoPlaylist() {
        return this.videoPlaylist;
    }

    public static class GenerateVideoPlaylistResponseBodyAudioPlaylist extends TeaModel {
        /**
         * <p>The number of audio channels.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Channels")
        public Integer channels;

        /**
         * <p>The token of the audio media playlist. You can use this parameter to generate the path of a TS file.</p>
         * 
         * <strong>example:</strong>
         * <p>affe0c6042f09722fec95a21b8b******</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>The OSS path of the audio media playlist.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://imm-test/testcases/video.m3u8</p>
         */
        @NameInMap("URI")
        public String URI;

        public static GenerateVideoPlaylistResponseBodyAudioPlaylist build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistResponseBodyAudioPlaylist self = new GenerateVideoPlaylistResponseBodyAudioPlaylist();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistResponseBodyAudioPlaylist setChannels(Integer channels) {
            this.channels = channels;
            return this;
        }
        public Integer getChannels() {
            return this.channels;
        }

        public GenerateVideoPlaylistResponseBodyAudioPlaylist setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GenerateVideoPlaylistResponseBodyAudioPlaylist setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class GenerateVideoPlaylistResponseBodySubtitlePlaylist extends TeaModel {
        /**
         * <p>The serial number of the subtitle stream. The value starts from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The language of the subtitle stream.</p>
         * <blockquote>
         * <p> The language is derived from the subtitle stream information in the OSS path specified by the SourceURI parameter for a source video. If no language information exists in the source video, null is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The token of the subtitle media playlist. You can use this parameter to generate the path of a subtitle file.</p>
         * <blockquote>
         * <p> You can generate the path of a transcoded subtitle file based on the returned token value. The path must be in the oss://${Bucket}/${Object}-${Token}_${Index}.ts format. oss://${Bucket}/${Object} specifies the URI specified by input parameters for output files. ${Token} specifies the returned token value, and ${Index} specifies the serial number of a subtitle file.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>affe0c6042f09722fec95a21b8b******</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>The OSS path of the subtitle media playlist.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://imm-test/testcases/vide_0.m3u8</p>
         */
        @NameInMap("URI")
        public String URI;

        public static GenerateVideoPlaylistResponseBodySubtitlePlaylist build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistResponseBodySubtitlePlaylist self = new GenerateVideoPlaylistResponseBodySubtitlePlaylist();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistResponseBodySubtitlePlaylist setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public GenerateVideoPlaylistResponseBodySubtitlePlaylist setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GenerateVideoPlaylistResponseBodySubtitlePlaylist setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GenerateVideoPlaylistResponseBodySubtitlePlaylist setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class GenerateVideoPlaylistResponseBodyVideoPlaylist extends TeaModel {
        /**
         * <p>The video frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>25/1</p>
         */
        @NameInMap("FrameRate")
        public String frameRate;

        /**
         * <p>The video resolution.</p>
         * 
         * <strong>example:</strong>
         * <p>640x480</p>
         */
        @NameInMap("Resolution")
        public String resolution;

        /**
         * <p>The token of the video media playlist. You can use this parameter to generate the path of a TS file.</p>
         * <blockquote>
         * <p> You can generate the path of a transcoded TS file based on the value of this parameter. The path must be in the oss://${Bucket}/${Object}-${Token}-${Index}.ts format. oss://${Bucket}/${Object} specifies the URI specified by input parameters for output files. ${Token} specifies the returned token, and ${Index} specifies the serial number of a TS file.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>affe0c6042f09722fec95a21b8b******</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>The OSS path of the video media playlist.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://imm-test/testcases/video.m3u8</p>
         */
        @NameInMap("URI")
        public String URI;

        public static GenerateVideoPlaylistResponseBodyVideoPlaylist build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistResponseBodyVideoPlaylist self = new GenerateVideoPlaylistResponseBodyVideoPlaylist();
            return TeaModel.build(map, self);
        }

        public GenerateVideoPlaylistResponseBodyVideoPlaylist setFrameRate(String frameRate) {
            this.frameRate = frameRate;
            return this;
        }
        public String getFrameRate() {
            return this.frameRate;
        }

        public GenerateVideoPlaylistResponseBodyVideoPlaylist setResolution(String resolution) {
            this.resolution = resolution;
            return this;
        }
        public String getResolution() {
            return this.resolution;
        }

        public GenerateVideoPlaylistResponseBodyVideoPlaylist setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GenerateVideoPlaylistResponseBodyVideoPlaylist setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

}
