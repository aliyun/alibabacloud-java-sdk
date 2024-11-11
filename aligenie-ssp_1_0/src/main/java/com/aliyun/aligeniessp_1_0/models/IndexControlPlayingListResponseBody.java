// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class IndexControlPlayingListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>10002398812</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public IndexControlPlayingListResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static IndexControlPlayingListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IndexControlPlayingListResponseBody self = new IndexControlPlayingListResponseBody();
        return TeaModel.build(map, self);
    }

    public IndexControlPlayingListResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public IndexControlPlayingListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IndexControlPlayingListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IndexControlPlayingListResponseBody setResult(IndexControlPlayingListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public IndexControlPlayingListResponseBodyResult getResult() {
        return this.result;
    }

    public IndexControlPlayingListResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class IndexControlPlayingListResponseBodyResultCover extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanResize")
        public Boolean canResize;

        /**
         * <strong>example:</strong>
         * <p><a href="http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&columns=640&rows=640">http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&amp;columns=640&amp;rows=640</a></p>
         */
        @NameInMap("Img")
        public String img;

        /**
         * <strong>example:</strong>
         * <p><a href="http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&columns=640&rows=640">http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&amp;columns=640&amp;rows=640</a></p>
         */
        @NameInMap("Large")
        public String large;

        /**
         * <strong>example:</strong>
         * <p><a href="http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&columns=640&rows=640">http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&amp;columns=640&amp;rows=640</a></p>
         */
        @NameInMap("Mediam")
        public String mediam;

        /**
         * <strong>example:</strong>
         * <p><a href="http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&columns=640&rows=640">http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&amp;columns=640&amp;rows=640</a></p>
         */
        @NameInMap("Medium")
        public String medium;

        /**
         * <strong>example:</strong>
         * <p><a href="http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&columns=640&rows=640">http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&amp;columns=640&amp;rows=640</a></p>
         */
        @NameInMap("Small")
        public String small;

        public static IndexControlPlayingListResponseBodyResultCover build(java.util.Map<String, ?> map) throws Exception {
            IndexControlPlayingListResponseBodyResultCover self = new IndexControlPlayingListResponseBodyResultCover();
            return TeaModel.build(map, self);
        }

        public IndexControlPlayingListResponseBodyResultCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public IndexControlPlayingListResponseBodyResultCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public IndexControlPlayingListResponseBodyResultCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public IndexControlPlayingListResponseBodyResultCover setMediam(String mediam) {
            this.mediam = mediam;
            return this;
        }
        public String getMediam() {
            return this.mediam;
        }

        public IndexControlPlayingListResponseBodyResultCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public IndexControlPlayingListResponseBodyResultCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class IndexControlPlayingListResponseBodyResult extends TeaModel {
        @NameInMap("AlbumName")
        public String albumName;

        /**
         * <strong>example:</strong>
         * <p>260744</p>
         */
        @NameInMap("AlbumRawId")
        public String albumRawId;

        /**
         * <strong>example:</strong>
         * <p>190</p>
         */
        @NameInMap("AudioLength")
        public Integer audioLength;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Copyright")
        public Integer copyright;

        @NameInMap("Cover")
        public IndexControlPlayingListResponseBodyResultCover cover;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultPlayOrder")
        public Integer defaultPlayOrder;

        /**
         * <strong>example:</strong>
         * <p><a href="https://openaudio.cos.tx.xmcdn.com/storages/587f-audiofreehighqps/15/CE/GKwRIJIGnb11ABc6SwF59DNb.mp3">https://openaudio.cos.tx.xmcdn.com/storages/587f-audiofreehighqps/15/CE/GKwRIJIGnb11ABc6SwF59DNb.mp3</a></p>
         */
        @NameInMap("ItemUrl")
        public String itemUrl;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Liked")
        public Boolean liked;

        /**
         * <strong>example:</strong>
         * <p><a href="https://aicontent.alibabausercontent.com/lyric/thirdsource/6f4c8408073db134b0d097c122b5a1a1.lrc">https://aicontent.alibabausercontent.com/lyric/thirdsource/6f4c8408073db134b0d097c122b5a1a1.lrc</a></p>
         */
        @NameInMap("LyricUrl")
        public String lyricUrl;

        /**
         * <strong>example:</strong>
         * <p>Repeat</p>
         */
        @NameInMap("PlayMode")
        public String playMode;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Pos")
        public Integer pos;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>550144364</p>
         */
        @NameInMap("RawId")
        public String rawId;

        @NameInMap("Singer")
        public String singer;

        /**
         * <strong>example:</strong>
         * <p>ximalayav2</p>
         */
        @NameInMap("Source")
        public String source;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>story</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("Valid")
        public String valid;

        public static IndexControlPlayingListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            IndexControlPlayingListResponseBodyResult self = new IndexControlPlayingListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public IndexControlPlayingListResponseBodyResult setAlbumName(String albumName) {
            this.albumName = albumName;
            return this;
        }
        public String getAlbumName() {
            return this.albumName;
        }

        public IndexControlPlayingListResponseBodyResult setAlbumRawId(String albumRawId) {
            this.albumRawId = albumRawId;
            return this;
        }
        public String getAlbumRawId() {
            return this.albumRawId;
        }

        public IndexControlPlayingListResponseBodyResult setAudioLength(Integer audioLength) {
            this.audioLength = audioLength;
            return this;
        }
        public Integer getAudioLength() {
            return this.audioLength;
        }

        public IndexControlPlayingListResponseBodyResult setCopyright(Integer copyright) {
            this.copyright = copyright;
            return this;
        }
        public Integer getCopyright() {
            return this.copyright;
        }

        public IndexControlPlayingListResponseBodyResult setCover(IndexControlPlayingListResponseBodyResultCover cover) {
            this.cover = cover;
            return this;
        }
        public IndexControlPlayingListResponseBodyResultCover getCover() {
            return this.cover;
        }

        public IndexControlPlayingListResponseBodyResult setDefaultPlayOrder(Integer defaultPlayOrder) {
            this.defaultPlayOrder = defaultPlayOrder;
            return this;
        }
        public Integer getDefaultPlayOrder() {
            return this.defaultPlayOrder;
        }

        public IndexControlPlayingListResponseBodyResult setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public IndexControlPlayingListResponseBodyResult setLiked(Boolean liked) {
            this.liked = liked;
            return this;
        }
        public Boolean getLiked() {
            return this.liked;
        }

        public IndexControlPlayingListResponseBodyResult setLyricUrl(String lyricUrl) {
            this.lyricUrl = lyricUrl;
            return this;
        }
        public String getLyricUrl() {
            return this.lyricUrl;
        }

        public IndexControlPlayingListResponseBodyResult setPlayMode(String playMode) {
            this.playMode = playMode;
            return this;
        }
        public String getPlayMode() {
            return this.playMode;
        }

        public IndexControlPlayingListResponseBodyResult setPos(Integer pos) {
            this.pos = pos;
            return this;
        }
        public Integer getPos() {
            return this.pos;
        }

        public IndexControlPlayingListResponseBodyResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public IndexControlPlayingListResponseBodyResult setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public IndexControlPlayingListResponseBodyResult setSinger(String singer) {
            this.singer = singer;
            return this;
        }
        public String getSinger() {
            return this.singer;
        }

        public IndexControlPlayingListResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public IndexControlPlayingListResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public IndexControlPlayingListResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public IndexControlPlayingListResponseBodyResult setValid(String valid) {
            this.valid = valid;
            return this;
        }
        public String getValid() {
            return this.valid;
        }

    }

}
