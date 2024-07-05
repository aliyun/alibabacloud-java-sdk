// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateVideoPlaylistResponseBody extends TeaModel {
    /**
     * <p>转码文件列表。</p>
     */
    @NameInMap("AudioPlaylist")
    public java.util.List<GenerateVideoPlaylistResponseBodyAudioPlaylist> audioPlaylist;

    @NameInMap("Duration")
    public Float duration;

    @NameInMap("MasterURI")
    public String masterURI;

    /**
     * <strong>example:</strong>
     * <p>CA995EFD-083D-4F40-BE8A-BDF75FFF*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>转码文件列表。</p>
     */
    @NameInMap("SubtitlePlaylist")
    public java.util.List<GenerateVideoPlaylistResponseBodySubtitlePlaylist> subtitlePlaylist;

    /**
     * <strong>example:</strong>
     * <p>92376fbb-171f-4259-913f-705f7ee0****</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>转码文件列表。</p>
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
        @NameInMap("Channels")
        public Integer channels;

        /**
         * <p>转码生成的Token。用于LiveTranscoding访问的参数。</p>
         * 
         * <strong>example:</strong>
         * <p>affe0c6042f09722fec95a21b8b******</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>输出m3u8的OSS地址。地址规则为 Target.URI + &quot;.m3u8“， 其中Target.URI为输入参数中视频转码输出地址前缀。</p>
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
         * <p>字幕流编号，从0开始。</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>视频源中字幕流的语言。</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>转码生成的Token。用于LiveTranscoding访问的参数。</p>
         * 
         * <strong>example:</strong>
         * <p>affe0c6042f09722fec95a21b8b******</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>输出m3u8的OSS地址。地址规则为 Target.URI + “_” + Index + &quot;.m3u8“， 其中Target.URI为输入参数中视频转码输出地址前缀。</p>
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
        @NameInMap("FrameRate")
        public String frameRate;

        @NameInMap("Resolution")
        public String resolution;

        /**
         * <p>转码生成的Token。用于LiveTranscoding访问的参数。</p>
         * 
         * <strong>example:</strong>
         * <p>affe0c6042f09722fec95a21b8b******</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>输出m3u8的OSS地址。地址规则为 Target.URI + &quot;.m3u8“， 其中Target.URI为输入参数中视频转码输出地址前缀。</p>
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
