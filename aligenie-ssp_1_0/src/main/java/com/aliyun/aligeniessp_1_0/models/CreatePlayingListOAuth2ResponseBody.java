// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreatePlayingListOAuth2ResponseBody extends TeaModel {
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
    public CreatePlayingListOAuth2ResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreatePlayingListOAuth2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePlayingListOAuth2ResponseBody self = new CreatePlayingListOAuth2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePlayingListOAuth2ResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreatePlayingListOAuth2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePlayingListOAuth2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePlayingListOAuth2ResponseBody setResult(CreatePlayingListOAuth2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreatePlayingListOAuth2ResponseBodyResult getResult() {
        return this.result;
    }

    public CreatePlayingListOAuth2ResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreatePlayingListOAuth2ResponseBodyResultCover extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanResize")
        public Boolean canResize;

        /**
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
         */
        @NameInMap("Img")
        public String img;

        /**
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
         */
        @NameInMap("Large")
        public String large;

        /**
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
         */
        @NameInMap("Mediam")
        public String mediam;

        /**
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
         */
        @NameInMap("Medium")
        public String medium;

        /**
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
         */
        @NameInMap("Small")
        public String small;

        public static CreatePlayingListOAuth2ResponseBodyResultCover build(java.util.Map<String, ?> map) throws Exception {
            CreatePlayingListOAuth2ResponseBodyResultCover self = new CreatePlayingListOAuth2ResponseBodyResultCover();
            return TeaModel.build(map, self);
        }

        public CreatePlayingListOAuth2ResponseBodyResultCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public CreatePlayingListOAuth2ResponseBodyResultCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public CreatePlayingListOAuth2ResponseBodyResultCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public CreatePlayingListOAuth2ResponseBodyResultCover setMediam(String mediam) {
            this.mediam = mediam;
            return this;
        }
        public String getMediam() {
            return this.mediam;
        }

        public CreatePlayingListOAuth2ResponseBodyResultCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public CreatePlayingListOAuth2ResponseBodyResultCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class CreatePlayingListOAuth2ResponseBodyResult extends TeaModel {
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
        public CreatePlayingListOAuth2ResponseBodyResultCover cover;

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
         * <p>1</p>
         */
        @NameInMap("Pos")
        public Integer pos;

        /**
         * <strong>example:</strong>
         * <p>96.0</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("RawId")
        public String rawId;

        @NameInMap("Singer")
        public String singer;

        /**
         * <strong>example:</strong>
         * <p>qignting</p>
         */
        @NameInMap("Source")
        public String source;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>program</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("Valid")
        public String valid;

        public static CreatePlayingListOAuth2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreatePlayingListOAuth2ResponseBodyResult self = new CreatePlayingListOAuth2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreatePlayingListOAuth2ResponseBodyResult setAlbumName(String albumName) {
            this.albumName = albumName;
            return this;
        }
        public String getAlbumName() {
            return this.albumName;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setAlbumRawId(String albumRawId) {
            this.albumRawId = albumRawId;
            return this;
        }
        public String getAlbumRawId() {
            return this.albumRawId;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setAudioLength(Integer audioLength) {
            this.audioLength = audioLength;
            return this;
        }
        public Integer getAudioLength() {
            return this.audioLength;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setCopyright(Integer copyright) {
            this.copyright = copyright;
            return this;
        }
        public Integer getCopyright() {
            return this.copyright;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setCover(CreatePlayingListOAuth2ResponseBodyResultCover cover) {
            this.cover = cover;
            return this;
        }
        public CreatePlayingListOAuth2ResponseBodyResultCover getCover() {
            return this.cover;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setDefaultPlayOrder(Integer defaultPlayOrder) {
            this.defaultPlayOrder = defaultPlayOrder;
            return this;
        }
        public Integer getDefaultPlayOrder() {
            return this.defaultPlayOrder;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setLiked(Boolean liked) {
            this.liked = liked;
            return this;
        }
        public Boolean getLiked() {
            return this.liked;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setLyricUrl(String lyricUrl) {
            this.lyricUrl = lyricUrl;
            return this;
        }
        public String getLyricUrl() {
            return this.lyricUrl;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setPlayMode(String playMode) {
            this.playMode = playMode;
            return this;
        }
        public String getPlayMode() {
            return this.playMode;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setPos(Integer pos) {
            this.pos = pos;
            return this;
        }
        public Integer getPos() {
            return this.pos;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setSinger(String singer) {
            this.singer = singer;
            return this;
        }
        public String getSinger() {
            return this.singer;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreatePlayingListOAuth2ResponseBodyResult setValid(String valid) {
            this.valid = valid;
            return this;
        }
        public String getValid() {
            return this.valid;
        }

    }

}
