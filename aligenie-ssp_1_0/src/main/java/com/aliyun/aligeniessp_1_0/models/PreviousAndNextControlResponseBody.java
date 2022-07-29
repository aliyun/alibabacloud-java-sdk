// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class PreviousAndNextControlResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public PreviousAndNextControlResponseBodyResult result;

    @NameInMap("Success")
    public String success;

    public static PreviousAndNextControlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PreviousAndNextControlResponseBody self = new PreviousAndNextControlResponseBody();
        return TeaModel.build(map, self);
    }

    public PreviousAndNextControlResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PreviousAndNextControlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public PreviousAndNextControlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PreviousAndNextControlResponseBody setResult(PreviousAndNextControlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public PreviousAndNextControlResponseBodyResult getResult() {
        return this.result;
    }

    public PreviousAndNextControlResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class PreviousAndNextControlResponseBodyResultCover extends TeaModel {
        @NameInMap("CanResize")
        public Boolean canResize;

        @NameInMap("Img")
        public String img;

        @NameInMap("Large")
        public String large;

        @NameInMap("Mediam")
        public String mediam;

        @NameInMap("Medium")
        public String medium;

        @NameInMap("Small")
        public String small;

        public static PreviousAndNextControlResponseBodyResultCover build(java.util.Map<String, ?> map) throws Exception {
            PreviousAndNextControlResponseBodyResultCover self = new PreviousAndNextControlResponseBodyResultCover();
            return TeaModel.build(map, self);
        }

        public PreviousAndNextControlResponseBodyResultCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public PreviousAndNextControlResponseBodyResultCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public PreviousAndNextControlResponseBodyResultCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public PreviousAndNextControlResponseBodyResultCover setMediam(String mediam) {
            this.mediam = mediam;
            return this;
        }
        public String getMediam() {
            return this.mediam;
        }

        public PreviousAndNextControlResponseBodyResultCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public PreviousAndNextControlResponseBodyResultCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class PreviousAndNextControlResponseBodyResult extends TeaModel {
        @NameInMap("AlbumName")
        public String albumName;

        @NameInMap("AlbumRawId")
        public String albumRawId;

        @NameInMap("AudioLength")
        public Integer audioLength;

        @NameInMap("Copyright")
        public Integer copyright;

        @NameInMap("Cover")
        public PreviousAndNextControlResponseBodyResultCover cover;

        @NameInMap("DefaultPlayOrder")
        public Integer defaultPlayOrder;

        @NameInMap("ItemUrl")
        public String itemUrl;

        @NameInMap("Liked")
        public Boolean liked;

        @NameInMap("LyricUrl")
        public String lyricUrl;

        @NameInMap("PlayMode")
        public String playMode;

        @NameInMap("Pos")
        public Integer pos;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("RawId")
        public String rawId;

        @NameInMap("Singer")
        public String singer;

        @NameInMap("Source")
        public String source;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("Valid")
        public String valid;

        public static PreviousAndNextControlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            PreviousAndNextControlResponseBodyResult self = new PreviousAndNextControlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public PreviousAndNextControlResponseBodyResult setAlbumName(String albumName) {
            this.albumName = albumName;
            return this;
        }
        public String getAlbumName() {
            return this.albumName;
        }

        public PreviousAndNextControlResponseBodyResult setAlbumRawId(String albumRawId) {
            this.albumRawId = albumRawId;
            return this;
        }
        public String getAlbumRawId() {
            return this.albumRawId;
        }

        public PreviousAndNextControlResponseBodyResult setAudioLength(Integer audioLength) {
            this.audioLength = audioLength;
            return this;
        }
        public Integer getAudioLength() {
            return this.audioLength;
        }

        public PreviousAndNextControlResponseBodyResult setCopyright(Integer copyright) {
            this.copyright = copyright;
            return this;
        }
        public Integer getCopyright() {
            return this.copyright;
        }

        public PreviousAndNextControlResponseBodyResult setCover(PreviousAndNextControlResponseBodyResultCover cover) {
            this.cover = cover;
            return this;
        }
        public PreviousAndNextControlResponseBodyResultCover getCover() {
            return this.cover;
        }

        public PreviousAndNextControlResponseBodyResult setDefaultPlayOrder(Integer defaultPlayOrder) {
            this.defaultPlayOrder = defaultPlayOrder;
            return this;
        }
        public Integer getDefaultPlayOrder() {
            return this.defaultPlayOrder;
        }

        public PreviousAndNextControlResponseBodyResult setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public PreviousAndNextControlResponseBodyResult setLiked(Boolean liked) {
            this.liked = liked;
            return this;
        }
        public Boolean getLiked() {
            return this.liked;
        }

        public PreviousAndNextControlResponseBodyResult setLyricUrl(String lyricUrl) {
            this.lyricUrl = lyricUrl;
            return this;
        }
        public String getLyricUrl() {
            return this.lyricUrl;
        }

        public PreviousAndNextControlResponseBodyResult setPlayMode(String playMode) {
            this.playMode = playMode;
            return this;
        }
        public String getPlayMode() {
            return this.playMode;
        }

        public PreviousAndNextControlResponseBodyResult setPos(Integer pos) {
            this.pos = pos;
            return this;
        }
        public Integer getPos() {
            return this.pos;
        }

        public PreviousAndNextControlResponseBodyResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public PreviousAndNextControlResponseBodyResult setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public PreviousAndNextControlResponseBodyResult setSinger(String singer) {
            this.singer = singer;
            return this;
        }
        public String getSinger() {
            return this.singer;
        }

        public PreviousAndNextControlResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public PreviousAndNextControlResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public PreviousAndNextControlResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public PreviousAndNextControlResponseBodyResult setValid(String valid) {
            this.valid = valid;
            return this;
        }
        public String getValid() {
            return this.valid;
        }

    }

}
