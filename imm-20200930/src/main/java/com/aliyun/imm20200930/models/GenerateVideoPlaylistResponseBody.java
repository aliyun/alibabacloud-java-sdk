// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateVideoPlaylistResponseBody extends TeaModel {
    /**
     * <p>转码文件列表。</p>
     */
    @NameInMap("AudioPlaylist")
    public java.util.List<GenerateVideoPlaylistResponseBodyAudioPlaylist> audioPlaylist;

    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>转码文件列表。</p>
     */
    @NameInMap("SubtitlePlaylist")
    public java.util.List<GenerateVideoPlaylistResponseBodySubtitlePlaylist> subtitlePlaylist;

    @NameInMap("Token")
    public String token;

    @NameInMap("URI")
    public String URI;

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

    public GenerateVideoPlaylistResponseBody setURI(String URI) {
        this.URI = URI;
        return this;
    }
    public String getURI() {
        return this.URI;
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
         * <p>转码生成的Token。用于LiveTranscoding访问的参数。</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>输出m3u8的OSS地址。地址规则为 Target.URI + ".m3u8“， 其中Target.URI为输入参数中视频转码输出地址前缀。</p>
         */
        @NameInMap("URI")
        public String URI;

        public static GenerateVideoPlaylistResponseBodyAudioPlaylist build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistResponseBodyAudioPlaylist self = new GenerateVideoPlaylistResponseBodyAudioPlaylist();
            return TeaModel.build(map, self);
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
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>视频源中字幕流的语言。</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>转码生成的Token。用于LiveTranscoding访问的参数。</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>输出m3u8的OSS地址。地址规则为 Target.URI + “_” + Index + ".m3u8“， 其中Target.URI为输入参数中视频转码输出地址前缀。</p>
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
         * <p>转码生成的Token。用于LiveTranscoding访问的参数。</p>
         */
        @NameInMap("Token")
        public String token;

        /**
         * <p>输出m3u8的OSS地址。地址规则为 Target.URI + ".m3u8“， 其中Target.URI为输入参数中视频转码输出地址前缀。</p>
         */
        @NameInMap("URI")
        public String URI;

        public static GenerateVideoPlaylistResponseBodyVideoPlaylist build(java.util.Map<String, ?> map) throws Exception {
            GenerateVideoPlaylistResponseBodyVideoPlaylist self = new GenerateVideoPlaylistResponseBodyVideoPlaylist();
            return TeaModel.build(map, self);
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
