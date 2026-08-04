// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetContentResponseBody extends TeaModel {
    /**
     * <p>Code encoding</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Message information</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request RequestId</p>
     * 
     * <strong>example:</strong>
     * <p>F12B6147-5925-19E5-A3AD-E1EE1360F34E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Return Result</p>
     */
    @NameInMap("Result")
    public GetContentResponseBodyResult result;

    public static GetContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContentResponseBody self = new GetContentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContentResponseBody setResult(GetContentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetContentResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetContentResponseBodyResultAuthors extends TeaModel {
        /**
         * <p>author type</p>
         */
        @NameInMap("AuthorTypes")
        public java.util.List<String> authorTypes;

        /**
         * <p>Gender</p>
         * 
         * <strong>example:</strong>
         * <p>MALE</p>
         */
        @NameInMap("Gender")
        public String gender;

        /**
         * <p>Author primary key ID</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Is online</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>Source</p>
         * 
         * <strong>example:</strong>
         * <p>qingting</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Author title</p>
         * 
         * <strong>example:</strong>
         * <p>播音呆瓜小贼</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetContentResponseBodyResultAuthors build(java.util.Map<String, ?> map) throws Exception {
            GetContentResponseBodyResultAuthors self = new GetContentResponseBodyResultAuthors();
            return TeaModel.build(map, self);
        }

        public GetContentResponseBodyResultAuthors setAuthorTypes(java.util.List<String> authorTypes) {
            this.authorTypes = authorTypes;
            return this;
        }
        public java.util.List<String> getAuthorTypes() {
            return this.authorTypes;
        }

        public GetContentResponseBodyResultAuthors setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetContentResponseBodyResultAuthors setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetContentResponseBodyResultAuthors setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public GetContentResponseBodyResultAuthors setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetContentResponseBodyResultAuthors setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetContentResponseBodyResultCover extends TeaModel {
        /**
         * <p>Indicates whether OSS rules can be used to crop the image.</p>
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
        @NameInMap("Medium")
        public String medium;

        /**
         * <p>Small image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
         */
        @NameInMap("Small")
        public String small;

        public static GetContentResponseBodyResultCover build(java.util.Map<String, ?> map) throws Exception {
            GetContentResponseBodyResultCover self = new GetContentResponseBodyResultCover();
            return TeaModel.build(map, self);
        }

        public GetContentResponseBodyResultCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public GetContentResponseBodyResultCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public GetContentResponseBodyResultCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public GetContentResponseBodyResultCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public GetContentResponseBodyResultCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class GetContentResponseBodyResult extends TeaModel {
        /**
         * <p>ID of the corresponding album</p>
         * 
         * <strong>example:</strong>
         * <p>1231</p>
         */
        @NameInMap("AlbumId")
        public String albumId;

        /**
         * <p>Alias</p>
         */
        @NameInMap("Alias")
        public java.util.List<String> alias;

        /**
         * <p>Is audition available</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Audition")
        public Boolean audition;

        /**
         * <p>Content authors</p>
         */
        @NameInMap("Authors")
        public java.util.List<GetContentResponseBodyResultAuthors> authors;

        /**
         * <p>Transform controlType based on the associated public category</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>is charged</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Charge")
        public Boolean charge;

        /**
         * <p>ID of the corresponding category</p>
         * 
         * <strong>example:</strong>
         * <p>80012017</p>
         */
        @NameInMap("CommCateId")
        public Long commCateId;

        /**
         * <p>album thumbnail image</p>
         */
        @NameInMap("Cover")
        public GetContentResponseBodyResultCover cover;

        /**
         * <p>Content description</p>
         * 
         * <strong>example:</strong>
         * <p>内容描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>duration information</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>Popularity score</p>
         * 
         * <strong>example:</strong>
         * <p>内容描述</p>
         */
        @NameInMap("HotScore")
        public Double hotScore;

        /**
         * <p>Content ID</p>
         * 
         * <strong>example:</strong>
         * <p>13597709</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Type of content, such as music, audio, radio, jokes, etc.</p>
         * 
         * <strong>example:</strong>
         * <p>ALBUM</p>
         */
        @NameInMap("ItemType")
        public String itemType;

        /**
         * <p>Lyric information</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://1231.lrc">http://1231.lrc</a></p>
         */
        @NameInMap("Lyric")
        public String lyric;

        /**
         * <p>third-party ID of the content</p>
         * 
         * <strong>example:</strong>
         * <p>1231231</p>
         */
        @NameInMap("RawId")
        public String rawId;

        /**
         * <p>Source</p>
         * 
         * <strong>example:</strong>
         * <p>qingting</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Genre</p>
         */
        @NameInMap("Styles")
        public java.util.List<String> styles;

        /**
         * <p>title</p>
         * 
         * <strong>example:</strong>
         * <p>超能狂少在都市</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Transform to favoriteType based on the associated public category</p>
         * 
         * <strong>example:</strong>
         * <p>program</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Indicates whether the content is playable.</p>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("Valid")
        public String valid;

        public static GetContentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetContentResponseBodyResult self = new GetContentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetContentResponseBodyResult setAlbumId(String albumId) {
            this.albumId = albumId;
            return this;
        }
        public String getAlbumId() {
            return this.albumId;
        }

        public GetContentResponseBodyResult setAlias(java.util.List<String> alias) {
            this.alias = alias;
            return this;
        }
        public java.util.List<String> getAlias() {
            return this.alias;
        }

        public GetContentResponseBodyResult setAudition(Boolean audition) {
            this.audition = audition;
            return this;
        }
        public Boolean getAudition() {
            return this.audition;
        }

        public GetContentResponseBodyResult setAuthors(java.util.List<GetContentResponseBodyResultAuthors> authors) {
            this.authors = authors;
            return this;
        }
        public java.util.List<GetContentResponseBodyResultAuthors> getAuthors() {
            return this.authors;
        }

        public GetContentResponseBodyResult setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetContentResponseBodyResult setCharge(Boolean charge) {
            this.charge = charge;
            return this;
        }
        public Boolean getCharge() {
            return this.charge;
        }

        public GetContentResponseBodyResult setCommCateId(Long commCateId) {
            this.commCateId = commCateId;
            return this;
        }
        public Long getCommCateId() {
            return this.commCateId;
        }

        public GetContentResponseBodyResult setCover(GetContentResponseBodyResultCover cover) {
            this.cover = cover;
            return this;
        }
        public GetContentResponseBodyResultCover getCover() {
            return this.cover;
        }

        public GetContentResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetContentResponseBodyResult setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetContentResponseBodyResult setHotScore(Double hotScore) {
            this.hotScore = hotScore;
            return this;
        }
        public Double getHotScore() {
            return this.hotScore;
        }

        public GetContentResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetContentResponseBodyResult setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public GetContentResponseBodyResult setLyric(String lyric) {
            this.lyric = lyric;
            return this;
        }
        public String getLyric() {
            return this.lyric;
        }

        public GetContentResponseBodyResult setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public GetContentResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetContentResponseBodyResult setStyles(java.util.List<String> styles) {
            this.styles = styles;
            return this;
        }
        public java.util.List<String> getStyles() {
            return this.styles;
        }

        public GetContentResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetContentResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetContentResponseBodyResult setValid(String valid) {
            this.valid = valid;
            return this;
        }
        public String getValid() {
            return this.valid;
        }

    }

}
