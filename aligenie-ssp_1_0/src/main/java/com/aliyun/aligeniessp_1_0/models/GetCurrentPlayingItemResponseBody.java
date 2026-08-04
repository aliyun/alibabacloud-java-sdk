// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetCurrentPlayingItemResponseBody extends TeaModel {
    /**
     * <p>Return code of the invocation</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Additional information. A common scenario is providing a brief description for failed invocations to help the caller identify the issue.</p>
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
     * <p>Actual return result of the service</p>
     */
    @NameInMap("Result")
    public GetCurrentPlayingItemResponseBodyResult result;

    /**
     * <p>Indicates whether the invocation succeeded. true indicates success, and false indicates failure. When the invocation fails, check the Message field for details.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static GetCurrentPlayingItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentPlayingItemResponseBody self = new GetCurrentPlayingItemResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCurrentPlayingItemResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetCurrentPlayingItemResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCurrentPlayingItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCurrentPlayingItemResponseBody setResult(GetCurrentPlayingItemResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetCurrentPlayingItemResponseBodyResult getResult() {
        return this.result;
    }

    public GetCurrentPlayingItemResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetCurrentPlayingItemResponseBodyResultCover extends TeaModel {
        /**
         * <p>Indicates whether OSS rules can be used for cropping.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanResize")
        public Boolean canResize;

        /**
         * <p>Default image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&columns=640&rows=640">http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&amp;columns=640&amp;rows=640</a></p>
         */
        @NameInMap("Img")
        public String img;

        /**
         * <p>Large image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&columns=640&rows=640">http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&amp;columns=640&amp;rows=640</a></p>
         */
        @NameInMap("Large")
        public String large;

        /**
         * <p>Medium image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&columns=640&rows=640">http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&amp;columns=640&amp;rows=640</a></p>
         */
        @NameInMap("Mediam")
        public String mediam;

        /**
         * <p>Medium image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&columns=640&rows=640">http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&amp;columns=640&amp;rows=640</a></p>
         */
        @NameInMap("Medium")
        public String medium;

        /**
         * <p>Small image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&columns=640&rows=640">http://imgopen.xmcdn.com/group58/M06/08/9B/wKgLglzTyTjiOy0oAAcOTv16ohg815.jpg!op_type=3&amp;columns=640&amp;rows=640</a></p>
         */
        @NameInMap("Small")
        public String small;

        public static GetCurrentPlayingItemResponseBodyResultCover build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentPlayingItemResponseBodyResultCover self = new GetCurrentPlayingItemResponseBodyResultCover();
            return TeaModel.build(map, self);
        }

        public GetCurrentPlayingItemResponseBodyResultCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public GetCurrentPlayingItemResponseBodyResultCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public GetCurrentPlayingItemResponseBodyResultCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public GetCurrentPlayingItemResponseBodyResultCover setMediam(String mediam) {
            this.mediam = mediam;
            return this;
        }
        public String getMediam() {
            return this.mediam;
        }

        public GetCurrentPlayingItemResponseBodyResultCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public GetCurrentPlayingItemResponseBodyResultCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class GetCurrentPlayingItemResponseBodyResult extends TeaModel {
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
         * <p>The copyright field is upgraded to indicate whether playback is allowed: 0 means playable, 1 or 2 means not playable.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Copyright")
        public Integer copyright;

        /**
         * <p>Thumbnail image object</p>
         */
        @NameInMap("Cover")
        public GetCurrentPlayingItemResponseBodyResultCover cover;

        /**
         * <p>Default playback order for the package: 0 for sequential order, 1 for reverse order.</p>
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
        public String liked;

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
         * <p>The position of this item in the playlist</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Pos")
        public Integer pos;

        /**
         * <p>Song playback progress</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>Third-party ID</p>
         * 
         * <strong>example:</strong>
         * <p>550144364</p>
         */
        @NameInMap("RawId")
        public String rawId;

        /**
         * <p>author</p>
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
         * <p>ximalayav2</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>title</p>
         * 
         * <strong>example:</strong>
         * <p>足球鞋赛车 晚安妈妈</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Type (such as music, program, joke, news, children_song, radio, etc.)</p>
         * 
         * <strong>example:</strong>
         * <p>story</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Indicates whether playback is allowed: VALID(10), UNKNOWN(20), NOT_VALID(30)</p>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("Valid")
        public String valid;

        public static GetCurrentPlayingItemResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentPlayingItemResponseBodyResult self = new GetCurrentPlayingItemResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetCurrentPlayingItemResponseBodyResult setAlbumName(String albumName) {
            this.albumName = albumName;
            return this;
        }
        public String getAlbumName() {
            return this.albumName;
        }

        public GetCurrentPlayingItemResponseBodyResult setAlbumRawId(String albumRawId) {
            this.albumRawId = albumRawId;
            return this;
        }
        public String getAlbumRawId() {
            return this.albumRawId;
        }

        public GetCurrentPlayingItemResponseBodyResult setAudioLength(Integer audioLength) {
            this.audioLength = audioLength;
            return this;
        }
        public Integer getAudioLength() {
            return this.audioLength;
        }

        public GetCurrentPlayingItemResponseBodyResult setCopyright(Integer copyright) {
            this.copyright = copyright;
            return this;
        }
        public Integer getCopyright() {
            return this.copyright;
        }

        public GetCurrentPlayingItemResponseBodyResult setCover(GetCurrentPlayingItemResponseBodyResultCover cover) {
            this.cover = cover;
            return this;
        }
        public GetCurrentPlayingItemResponseBodyResultCover getCover() {
            return this.cover;
        }

        public GetCurrentPlayingItemResponseBodyResult setDefaultPlayOrder(Integer defaultPlayOrder) {
            this.defaultPlayOrder = defaultPlayOrder;
            return this;
        }
        public Integer getDefaultPlayOrder() {
            return this.defaultPlayOrder;
        }

        public GetCurrentPlayingItemResponseBodyResult setItemUrl(String itemUrl) {
            this.itemUrl = itemUrl;
            return this;
        }
        public String getItemUrl() {
            return this.itemUrl;
        }

        public GetCurrentPlayingItemResponseBodyResult setLiked(String liked) {
            this.liked = liked;
            return this;
        }
        public String getLiked() {
            return this.liked;
        }

        public GetCurrentPlayingItemResponseBodyResult setLyricUrl(String lyricUrl) {
            this.lyricUrl = lyricUrl;
            return this;
        }
        public String getLyricUrl() {
            return this.lyricUrl;
        }

        public GetCurrentPlayingItemResponseBodyResult setPlayMode(String playMode) {
            this.playMode = playMode;
            return this;
        }
        public String getPlayMode() {
            return this.playMode;
        }

        public GetCurrentPlayingItemResponseBodyResult setPos(Integer pos) {
            this.pos = pos;
            return this;
        }
        public Integer getPos() {
            return this.pos;
        }

        public GetCurrentPlayingItemResponseBodyResult setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetCurrentPlayingItemResponseBodyResult setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public GetCurrentPlayingItemResponseBodyResult setSinger(String singer) {
            this.singer = singer;
            return this;
        }
        public String getSinger() {
            return this.singer;
        }

        public GetCurrentPlayingItemResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetCurrentPlayingItemResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetCurrentPlayingItemResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCurrentPlayingItemResponseBodyResult setValid(String valid) {
            this.valid = valid;
            return this;
        }
        public String getValid() {
            return this.valid;
        }

    }

}
