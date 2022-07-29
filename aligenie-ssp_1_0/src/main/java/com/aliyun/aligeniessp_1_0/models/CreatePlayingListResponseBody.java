// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreatePlayingListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreatePlayingListResponseBodyResult result;

    @NameInMap("Success")
    public String success;

    public static CreatePlayingListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePlayingListResponseBody self = new CreatePlayingListResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePlayingListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreatePlayingListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePlayingListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePlayingListResponseBody setResult(CreatePlayingListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreatePlayingListResponseBodyResult getResult() {
        return this.result;
    }

    public CreatePlayingListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreatePlayingListResponseBodyResultCover extends TeaModel {
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

        public static CreatePlayingListResponseBodyResultCover build(java.util.Map<String, ?> map) throws Exception {
            CreatePlayingListResponseBodyResultCover self = new CreatePlayingListResponseBodyResultCover();
            return TeaModel.build(map, self);
        }

        public CreatePlayingListResponseBodyResultCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public CreatePlayingListResponseBodyResultCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public CreatePlayingListResponseBodyResultCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public CreatePlayingListResponseBodyResultCover setMediam(String mediam) {
            this.mediam = mediam;
            return this;
        }
        public String getMediam() {
            return this.mediam;
        }

        public CreatePlayingListResponseBodyResultCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public CreatePlayingListResponseBodyResultCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class CreatePlayingListResponseBodyResult extends TeaModel {
        @NameInMap("AlbumName")
        public String albumName;

        @NameInMap("AlbumRawId")
        public String albumRawId;

        @NameInMap("AudioLength")
        public Integer audioLength;

        @NameInMap("Copyright")
        public Integer copyright;

        @NameInMap("Cover")
        public CreatePlayingListResponseBodyResultCover cover;

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

        public static CreatePlayingListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreatePlayingListResponseBodyResult self = new CreatePlayingListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreatePlayingListResponseBodyResult setAlbumName(String albumName) {
            this.albumName = albumName;
            return this;
        }
        public String getAlbumName() {
            return this.albumName;
        }

        public CreatePlayingListResponseBodyResult setAlbumRawId(String albumRawId) {
            this.albumRawId = albumRawId;
            return this;
        }
        public String getAlbumRawId() {
            return this.albumRawId;
        }

        public CreatePlayingListResponseBodyResult setAudioLength(Integer audioLength) {
            this.audioLength = audioLength;
            return this;
        }
        public Integer getAudioLength() {
            return this.audioLength;
        }

        public CreatePlayingListResponseBodyResult setCopyright(Integer copyright) {
            this.copyright = copyright;
            return this;
        }
        public Integer getCopyright() {
            return this.copyright;
        }

        public CreatePlayingListResponseBodyResult setCover(CreatePlayingListResponseBodyResultCover cover) {
            this.cover = cover;
            return this;
        }
        public CreatePlayingListResponseBodyResultCover getCover() {
            return this.cover;
        }

        public CreatePlayingListResponseBodyResult setDefaultPlayOrder(Integer defaultPlayOrder) {
            this.defaultPlayOrder = defaultPlayOrder;
            return this;
        }
        public Integer getDefaultPlayOrder() {
            return this.defaultPlayOrder;
        }

        public CreatePlayingListResponseBodyResult setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public CreatePlayingListResponseBodyResult setLiked(Boolean liked) {
            this.liked = liked;
            return this;
        }
        public Boolean getLiked() {
            return this.liked;
        }

        public CreatePlayingListResponseBodyResult setLyricUrl(String lyricUrl) {
            this.lyricUrl = lyricUrl;
            return this;
        }
        public String getLyricUrl() {
            return this.lyricUrl;
        }

        public CreatePlayingListResponseBodyResult setPlayMode(String playMode) {
            this.playMode = playMode;
            return this;
        }
        public String getPlayMode() {
            return this.playMode;
        }

        public CreatePlayingListResponseBodyResult setPos(Integer pos) {
            this.pos = pos;
            return this;
        }
        public Integer getPos() {
            return this.pos;
        }

        public CreatePlayingListResponseBodyResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public CreatePlayingListResponseBodyResult setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public CreatePlayingListResponseBodyResult setSinger(String singer) {
            this.singer = singer;
            return this;
        }
        public String getSinger() {
            return this.singer;
        }

        public CreatePlayingListResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreatePlayingListResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreatePlayingListResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreatePlayingListResponseBodyResult setValid(String valid) {
            this.valid = valid;
            return this;
        }
        public String getValid() {
            return this.valid;
        }

    }

}
