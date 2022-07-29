// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetCurrentPlayingListResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<GetCurrentPlayingListResponseBodyResult> result;

    @NameInMap("Success")
    public String success;

    public static GetCurrentPlayingListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentPlayingListResponseBody self = new GetCurrentPlayingListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCurrentPlayingListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetCurrentPlayingListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCurrentPlayingListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCurrentPlayingListResponseBody setResult(java.util.List<GetCurrentPlayingListResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetCurrentPlayingListResponseBodyResult> getResult() {
        return this.result;
    }

    public GetCurrentPlayingListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetCurrentPlayingListResponseBodyResultCover extends TeaModel {
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

        public static GetCurrentPlayingListResponseBodyResultCover build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentPlayingListResponseBodyResultCover self = new GetCurrentPlayingListResponseBodyResultCover();
            return TeaModel.build(map, self);
        }

        public GetCurrentPlayingListResponseBodyResultCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public GetCurrentPlayingListResponseBodyResultCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public GetCurrentPlayingListResponseBodyResultCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public GetCurrentPlayingListResponseBodyResultCover setMediam(String mediam) {
            this.mediam = mediam;
            return this;
        }
        public String getMediam() {
            return this.mediam;
        }

        public GetCurrentPlayingListResponseBodyResultCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public GetCurrentPlayingListResponseBodyResultCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class GetCurrentPlayingListResponseBodyResult extends TeaModel {
        @NameInMap("AlbumName")
        public String albumName;

        @NameInMap("AlbumRawId")
        public String albumRawId;

        @NameInMap("AudioLength")
        public Integer audioLength;

        @NameInMap("Copyright")
        public Integer copyright;

        @NameInMap("Cover")
        public GetCurrentPlayingListResponseBodyResultCover cover;

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

        public static GetCurrentPlayingListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentPlayingListResponseBodyResult self = new GetCurrentPlayingListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetCurrentPlayingListResponseBodyResult setAlbumName(String albumName) {
            this.albumName = albumName;
            return this;
        }
        public String getAlbumName() {
            return this.albumName;
        }

        public GetCurrentPlayingListResponseBodyResult setAlbumRawId(String albumRawId) {
            this.albumRawId = albumRawId;
            return this;
        }
        public String getAlbumRawId() {
            return this.albumRawId;
        }

        public GetCurrentPlayingListResponseBodyResult setAudioLength(Integer audioLength) {
            this.audioLength = audioLength;
            return this;
        }
        public Integer getAudioLength() {
            return this.audioLength;
        }

        public GetCurrentPlayingListResponseBodyResult setCopyright(Integer copyright) {
            this.copyright = copyright;
            return this;
        }
        public Integer getCopyright() {
            return this.copyright;
        }

        public GetCurrentPlayingListResponseBodyResult setCover(GetCurrentPlayingListResponseBodyResultCover cover) {
            this.cover = cover;
            return this;
        }
        public GetCurrentPlayingListResponseBodyResultCover getCover() {
            return this.cover;
        }

        public GetCurrentPlayingListResponseBodyResult setDefaultPlayOrder(Integer defaultPlayOrder) {
            this.defaultPlayOrder = defaultPlayOrder;
            return this;
        }
        public Integer getDefaultPlayOrder() {
            return this.defaultPlayOrder;
        }

        public GetCurrentPlayingListResponseBodyResult setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public GetCurrentPlayingListResponseBodyResult setLiked(Boolean liked) {
            this.liked = liked;
            return this;
        }
        public Boolean getLiked() {
            return this.liked;
        }

        public GetCurrentPlayingListResponseBodyResult setLyricUrl(String lyricUrl) {
            this.lyricUrl = lyricUrl;
            return this;
        }
        public String getLyricUrl() {
            return this.lyricUrl;
        }

        public GetCurrentPlayingListResponseBodyResult setPlayMode(String playMode) {
            this.playMode = playMode;
            return this;
        }
        public String getPlayMode() {
            return this.playMode;
        }

        public GetCurrentPlayingListResponseBodyResult setPos(Integer pos) {
            this.pos = pos;
            return this;
        }
        public Integer getPos() {
            return this.pos;
        }

        public GetCurrentPlayingListResponseBodyResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetCurrentPlayingListResponseBodyResult setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public GetCurrentPlayingListResponseBodyResult setSinger(String singer) {
            this.singer = singer;
            return this;
        }
        public String getSinger() {
            return this.singer;
        }

        public GetCurrentPlayingListResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetCurrentPlayingListResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetCurrentPlayingListResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCurrentPlayingListResponseBodyResult setValid(String valid) {
            this.valid = valid;
            return this;
        }
        public String getValid() {
            return this.valid;
        }

    }

}
