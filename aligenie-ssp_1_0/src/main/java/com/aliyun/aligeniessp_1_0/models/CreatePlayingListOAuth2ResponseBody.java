// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class CreatePlayingListOAuth2ResponseBody extends TeaModel {
    /**
     * <p>Return code of the invocation</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Additional information, typically used to briefly describe a failed invocation to help the caller identify the issue.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>10002398812</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Actual return result from the service</p>
     */
    @NameInMap("Result")
    public CreatePlayingListOAuth2ResponseBodyResult result;

    /**
     * <p>Indicates whether the invocation succeeded. true indicates success, and false indicates failure. When the value is false, check the Message field.</p>
     * 
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
         * <p>Indicates whether cropping using OSS rules is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanResize")
        public Boolean canResize;

        /**
         * <p>default image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
         */
        @NameInMap("Img")
        public String img;

        /**
         * <p>Large image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
         */
        @NameInMap("Large")
        public String large;

        /**
         * <p>Medium image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
         */
        @NameInMap("Mediam")
        public String mediam;

        /**
         * <p>medium image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
         */
        @NameInMap("Medium")
        public String medium;

        /**
         * <p>small image</p>
         * 
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
        /**
         * <p>Third-party album name</p>
         * 
         * <strong>example:</strong>
         * <p>晚安妈妈睡前故事</p>
         */
        @NameInMap("AlbumName")
        public String albumName;

        /**
         * <p>Third-party album ID</p>
         * 
         * <strong>example:</strong>
         * <p>260744</p>
         */
        @NameInMap("AlbumRawId")
        public String albumRawId;

        /**
         * <p>Length</p>
         * 
         * <strong>example:</strong>
         * <p>190</p>
         */
        @NameInMap("AudioLength")
        public Integer audioLength;

        /**
         * <p>The copyright field has been upgraded to indicate whether the content is playable: 0 means playable, 1 or 2 means not playable.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Copyright")
        public Integer copyright;

        /**
         * <p>thumbnail image object</p>
         */
        @NameInMap("Cover")
        public CreatePlayingListOAuth2ResponseBodyResultCover cover;

        /**
         * <p>Default playback order for the package: 0 for sequential, 1 for reverse order.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultPlayOrder")
        public Integer defaultPlayOrder;

        /**
         * <p>Playback URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://openaudio.cos.tx.xmcdn.com/storages/587f-audiofreehighqps/15/CE/GKwRIJIGnb11ABc6SwF59DNb.mp3">https://openaudio.cos.tx.xmcdn.com/storages/587f-audiofreehighqps/15/CE/GKwRIJIGnb11ABc6SwF59DNb.mp3</a></p>
         */
        @NameInMap("ItemUrl")
        public String itemUrl;

        /**
         * <p>is collected</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Liked")
        public Boolean liked;

        /**
         * <p>Lyrics URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aicontent.alibabausercontent.com/lyric/thirdsource/6f4c8408073db134b0d097c122b5a1a1.lrc">https://aicontent.alibabausercontent.com/lyric/thirdsource/6f4c8408073db134b0d097c122b5a1a1.lrc</a></p>
         */
        @NameInMap("LyricUrl")
        public String lyricUrl;

        /**
         * <p>Playback mode (Repeat, Shuffle, RepeatOne, Normal)</p>
         * 
         * <strong>example:</strong>
         * <p>Repeat</p>
         */
        @NameInMap("PlayMode")
        public String playMode;

        /**
         * <p>Position of this item in the playlist.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Pos")
        public Integer pos;

        /**
         * <p>Song playback progress</p>
         * 
         * <strong>example:</strong>
         * <p>96.0</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>third-party ID</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("RawId")
        public String rawId;

        /**
         * <p>Author</p>
         * 
         * <strong>example:</strong>
         * <p>晚安妈妈</p>
         */
        @NameInMap("Singer")
        public String singer;

        /**
         * <p>Source</p>
         * 
         * <strong>example:</strong>
         * <p>qignting</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>title</p>
         * 
         * <strong>example:</strong>
         * <p>超能狂少在都市</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>type (such as music, program, joke, news, children_song, radio, etc.)</p>
         * 
         * <strong>example:</strong>
         * <p>program</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Playback availability status: VALID(10), UNKNOWN(20), NOT_VALID(30).</p>
         * 
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
