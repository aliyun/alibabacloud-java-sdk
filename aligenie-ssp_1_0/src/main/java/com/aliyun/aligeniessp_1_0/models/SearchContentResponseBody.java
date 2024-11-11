// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class SearchContentResponseBody extends TeaModel {
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F12B6147-5925-19E5-A3AD-E1EE1360F34E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<SearchContentResponseBodyResult> result;

    public static SearchContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchContentResponseBody self = new SearchContentResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchContentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public SearchContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchContentResponseBody setResult(java.util.List<SearchContentResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<SearchContentResponseBodyResult> getResult() {
        return this.result;
    }

    public static class SearchContentResponseBodyResultAuthorsCover extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanResize")
        public Boolean canResize;

        /**
         * <strong>example:</strong>
         * <p><a href="https://a.jpg">https://a.jpg</a></p>
         */
        @NameInMap("Img")
        public String img;

        /**
         * <strong>example:</strong>
         * <p><a href="https://a.jpg">https://a.jpg</a></p>
         */
        @NameInMap("Large")
        public String large;

        /**
         * <strong>example:</strong>
         * <p><a href="https://a.jpg">https://a.jpg</a></p>
         */
        @NameInMap("Medium")
        public String medium;

        /**
         * <strong>example:</strong>
         * <p><a href="https://a.jpg">https://a.jpg</a></p>
         */
        @NameInMap("Small")
        public String small;

        public static SearchContentResponseBodyResultAuthorsCover build(java.util.Map<String, ?> map) throws Exception {
            SearchContentResponseBodyResultAuthorsCover self = new SearchContentResponseBodyResultAuthorsCover();
            return TeaModel.build(map, self);
        }

        public SearchContentResponseBodyResultAuthorsCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public SearchContentResponseBodyResultAuthorsCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public SearchContentResponseBodyResultAuthorsCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public SearchContentResponseBodyResultAuthorsCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public SearchContentResponseBodyResultAuthorsCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class SearchContentResponseBodyResultAuthors extends TeaModel {
        @NameInMap("AuthorTypes")
        public java.util.List<String> authorTypes;

        @NameInMap("Cover")
        public SearchContentResponseBodyResultAuthorsCover cover;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>MALE</p>
         */
        @NameInMap("Gender")
        public String gender;

        /**
         * <strong>example:</strong>
         * <p>13597709</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <strong>example:</strong>
         * <p>123123</p>
         */
        @NameInMap("RawId")
        public String rawId;

        /**
         * <strong>example:</strong>
         * <p>qingting</p>
         */
        @NameInMap("Source")
        public String source;

        @NameInMap("Title")
        public String title;

        public static SearchContentResponseBodyResultAuthors build(java.util.Map<String, ?> map) throws Exception {
            SearchContentResponseBodyResultAuthors self = new SearchContentResponseBodyResultAuthors();
            return TeaModel.build(map, self);
        }

        public SearchContentResponseBodyResultAuthors setAuthorTypes(java.util.List<String> authorTypes) {
            this.authorTypes = authorTypes;
            return this;
        }
        public java.util.List<String> getAuthorTypes() {
            return this.authorTypes;
        }

        public SearchContentResponseBodyResultAuthors setCover(SearchContentResponseBodyResultAuthorsCover cover) {
            this.cover = cover;
            return this;
        }
        public SearchContentResponseBodyResultAuthorsCover getCover() {
            return this.cover;
        }

        public SearchContentResponseBodyResultAuthors setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchContentResponseBodyResultAuthors setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public SearchContentResponseBodyResultAuthors setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SearchContentResponseBodyResultAuthors setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public SearchContentResponseBodyResultAuthors setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public SearchContentResponseBodyResultAuthors setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public SearchContentResponseBodyResultAuthors setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class SearchContentResponseBodyResultCover extends TeaModel {
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

        public static SearchContentResponseBodyResultCover build(java.util.Map<String, ?> map) throws Exception {
            SearchContentResponseBodyResultCover self = new SearchContentResponseBodyResultCover();
            return TeaModel.build(map, self);
        }

        public SearchContentResponseBodyResultCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public SearchContentResponseBodyResultCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public SearchContentResponseBodyResultCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public SearchContentResponseBodyResultCover setMediam(String mediam) {
            this.mediam = mediam;
            return this;
        }
        public String getMediam() {
            return this.mediam;
        }

        public SearchContentResponseBodyResultCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public SearchContentResponseBodyResultCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class SearchContentResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>13123</p>
         */
        @NameInMap("AlbumId")
        public String albumId;

        @NameInMap("Alias")
        public java.util.List<String> alias;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Audition")
        public Boolean audition;

        @NameInMap("Authors")
        public java.util.List<SearchContentResponseBodyResultAuthors> authors;

        /**
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>fasle</p>
         */
        @NameInMap("Charge")
        public Boolean charge;

        /**
         * <strong>example:</strong>
         * <p>80012017</p>
         */
        @NameInMap("CommCateId")
        public Long commCateId;

        @NameInMap("Cover")
        public SearchContentResponseBodyResultCover cover;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HotScore")
        public Double hotScore;

        /**
         * <strong>example:</strong>
         * <p>13597709</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>ALBUM</p>
         */
        @NameInMap("ItemType")
        public String itemType;

        /**
         * <strong>example:</strong>
         * <p><a href="http://a1231.lrc">http://a1231.lrc</a></p>
         */
        @NameInMap("Lyric")
        public String lyric;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderIndex")
        public String orderIndex;

        /**
         * <strong>example:</strong>
         * <p>qingting</p>
         */
        @NameInMap("Source")
        public String source;

        @NameInMap("Styles")
        public java.util.List<String> styles;

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

        public static SearchContentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            SearchContentResponseBodyResult self = new SearchContentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public SearchContentResponseBodyResult setAlbumId(String albumId) {
            this.albumId = albumId;
            return this;
        }
        public String getAlbumId() {
            return this.albumId;
        }

        public SearchContentResponseBodyResult setAlias(java.util.List<String> alias) {
            this.alias = alias;
            return this;
        }
        public java.util.List<String> getAlias() {
            return this.alias;
        }

        public SearchContentResponseBodyResult setAudition(Boolean audition) {
            this.audition = audition;
            return this;
        }
        public Boolean getAudition() {
            return this.audition;
        }

        public SearchContentResponseBodyResult setAuthors(java.util.List<SearchContentResponseBodyResultAuthors> authors) {
            this.authors = authors;
            return this;
        }
        public java.util.List<SearchContentResponseBodyResultAuthors> getAuthors() {
            return this.authors;
        }

        public SearchContentResponseBodyResult setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public SearchContentResponseBodyResult setCharge(Boolean charge) {
            this.charge = charge;
            return this;
        }
        public Boolean getCharge() {
            return this.charge;
        }

        public SearchContentResponseBodyResult setCommCateId(Long commCateId) {
            this.commCateId = commCateId;
            return this;
        }
        public Long getCommCateId() {
            return this.commCateId;
        }

        public SearchContentResponseBodyResult setCover(SearchContentResponseBodyResultCover cover) {
            this.cover = cover;
            return this;
        }
        public SearchContentResponseBodyResultCover getCover() {
            return this.cover;
        }

        public SearchContentResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchContentResponseBodyResult setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public SearchContentResponseBodyResult setHotScore(Double hotScore) {
            this.hotScore = hotScore;
            return this;
        }
        public Double getHotScore() {
            return this.hotScore;
        }

        public SearchContentResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SearchContentResponseBodyResult setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public SearchContentResponseBodyResult setLyric(String lyric) {
            this.lyric = lyric;
            return this;
        }
        public String getLyric() {
            return this.lyric;
        }

        public SearchContentResponseBodyResult setOrderIndex(String orderIndex) {
            this.orderIndex = orderIndex;
            return this;
        }
        public String getOrderIndex() {
            return this.orderIndex;
        }

        public SearchContentResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public SearchContentResponseBodyResult setStyles(java.util.List<String> styles) {
            this.styles = styles;
            return this;
        }
        public java.util.List<String> getStyles() {
            return this.styles;
        }

        public SearchContentResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public SearchContentResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SearchContentResponseBodyResult setValid(String valid) {
            this.valid = valid;
            return this;
        }
        public String getValid() {
            return this.valid;
        }

    }

}
