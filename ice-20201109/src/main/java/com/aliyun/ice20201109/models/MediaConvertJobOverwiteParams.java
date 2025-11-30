// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertJobOverwiteParams extends TeaModel {
    @NameInMap("Subtitles")
    public java.util.List<MediaConvertJobOverwiteParamsSubtitles> subtitles;

    public static MediaConvertJobOverwiteParams build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertJobOverwiteParams self = new MediaConvertJobOverwiteParams();
        return TeaModel.build(map, self);
    }

    public MediaConvertJobOverwiteParams setSubtitles(java.util.List<MediaConvertJobOverwiteParamsSubtitles> subtitles) {
        this.subtitles = subtitles;
        return this;
    }
    public java.util.List<MediaConvertJobOverwiteParamsSubtitles> getSubtitles() {
        return this.subtitles;
    }

    public static class MediaConvertJobOverwiteParamsSubtitles extends TeaModel {
        @NameInMap("Codec")
        public String codec;

        public static MediaConvertJobOverwiteParamsSubtitles build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertJobOverwiteParamsSubtitles self = new MediaConvertJobOverwiteParamsSubtitles();
            return TeaModel.build(map, self);
        }

        public MediaConvertJobOverwiteParamsSubtitles setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

    }

}
