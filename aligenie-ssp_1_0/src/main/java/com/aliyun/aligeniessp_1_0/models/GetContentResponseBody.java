// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetContentResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AuthorTypes")
        public java.util.List<String> authorTypes;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("Source")
        public String source;

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
        @NameInMap("CanResize")
        public Boolean canResize;

        @NameInMap("Img")
        public String img;

        @NameInMap("Large")
        public String large;

        @NameInMap("Medium")
        public String medium;

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
        @NameInMap("AlbumId")
        public String albumId;

        @NameInMap("Alias")
        public java.util.List<String> alias;

        @NameInMap("Audition")
        public Boolean audition;

        @NameInMap("Authors")
        public java.util.List<GetContentResponseBodyResultAuthors> authors;

        @NameInMap("Category")
        public String category;

        @NameInMap("Charge")
        public Boolean charge;

        @NameInMap("CommCateId")
        public Long commCateId;

        @NameInMap("Cover")
        public GetContentResponseBodyResultCover cover;

        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("HotScore")
        public Double hotScore;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("Lyric")
        public String lyric;

        @NameInMap("RawId")
        public String rawId;

        @NameInMap("Source")
        public String source;

        @NameInMap("Styles")
        public java.util.List<String> styles;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

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
