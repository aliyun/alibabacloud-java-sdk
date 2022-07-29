// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListRecommendContentResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ListRecommendContentResponseBodyResult> result;

    public static ListRecommendContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecommendContentResponseBody self = new ListRecommendContentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecommendContentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListRecommendContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRecommendContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecommendContentResponseBody setResult(java.util.List<ListRecommendContentResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListRecommendContentResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListRecommendContentResponseBodyResultAuthorsCover extends TeaModel {
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

        public static ListRecommendContentResponseBodyResultAuthorsCover build(java.util.Map<String, ?> map) throws Exception {
            ListRecommendContentResponseBodyResultAuthorsCover self = new ListRecommendContentResponseBodyResultAuthorsCover();
            return TeaModel.build(map, self);
        }

        public ListRecommendContentResponseBodyResultAuthorsCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public ListRecommendContentResponseBodyResultAuthorsCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public ListRecommendContentResponseBodyResultAuthorsCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public ListRecommendContentResponseBodyResultAuthorsCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public ListRecommendContentResponseBodyResultAuthorsCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class ListRecommendContentResponseBodyResultAuthors extends TeaModel {
        @NameInMap("AuthorTypes")
        public java.util.List<String> authorTypes;

        @NameInMap("Cover")
        public ListRecommendContentResponseBodyResultAuthorsCover cover;

        @NameInMap("Description")
        public String description;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("RawId")
        public String rawId;

        @NameInMap("Source")
        public String source;

        @NameInMap("Title")
        public String title;

        public static ListRecommendContentResponseBodyResultAuthors build(java.util.Map<String, ?> map) throws Exception {
            ListRecommendContentResponseBodyResultAuthors self = new ListRecommendContentResponseBodyResultAuthors();
            return TeaModel.build(map, self);
        }

        public ListRecommendContentResponseBodyResultAuthors setAuthorTypes(java.util.List<String> authorTypes) {
            this.authorTypes = authorTypes;
            return this;
        }
        public java.util.List<String> getAuthorTypes() {
            return this.authorTypes;
        }

        public ListRecommendContentResponseBodyResultAuthors setCover(ListRecommendContentResponseBodyResultAuthorsCover cover) {
            this.cover = cover;
            return this;
        }
        public ListRecommendContentResponseBodyResultAuthorsCover getCover() {
            return this.cover;
        }

        public ListRecommendContentResponseBodyResultAuthors setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRecommendContentResponseBodyResultAuthors setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListRecommendContentResponseBodyResultAuthors setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRecommendContentResponseBodyResultAuthors setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListRecommendContentResponseBodyResultAuthors setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public ListRecommendContentResponseBodyResultAuthors setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListRecommendContentResponseBodyResultAuthors setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListRecommendContentResponseBodyResultCover extends TeaModel {
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

        public static ListRecommendContentResponseBodyResultCover build(java.util.Map<String, ?> map) throws Exception {
            ListRecommendContentResponseBodyResultCover self = new ListRecommendContentResponseBodyResultCover();
            return TeaModel.build(map, self);
        }

        public ListRecommendContentResponseBodyResultCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public ListRecommendContentResponseBodyResultCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public ListRecommendContentResponseBodyResultCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public ListRecommendContentResponseBodyResultCover setMediam(String mediam) {
            this.mediam = mediam;
            return this;
        }
        public String getMediam() {
            return this.mediam;
        }

        public ListRecommendContentResponseBodyResultCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public ListRecommendContentResponseBodyResultCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class ListRecommendContentResponseBodyResult extends TeaModel {
        @NameInMap("Alias")
        public java.util.List<String> alias;

        @NameInMap("Audition")
        public Boolean audition;

        @NameInMap("Authors")
        public java.util.List<ListRecommendContentResponseBodyResultAuthors> authors;

        @NameInMap("Category")
        public String category;

        @NameInMap("Charge")
        public Boolean charge;

        @NameInMap("CommCateId")
        public Long commCateId;

        @NameInMap("Cover")
        public ListRecommendContentResponseBodyResultCover cover;

        @NameInMap("Description")
        public String description;

        @NameInMap("HotScore")
        public Double hotScore;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ItemType")
        public String itemType;

        @NameInMap("RawId")
        public String rawId;

        @NameInMap("Source")
        public String source;

        @NameInMap("Title")
        public String title;

        @NameInMap("Type")
        public String type;

        @NameInMap("Valid")
        public String valid;

        public static ListRecommendContentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListRecommendContentResponseBodyResult self = new ListRecommendContentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListRecommendContentResponseBodyResult setAlias(java.util.List<String> alias) {
            this.alias = alias;
            return this;
        }
        public java.util.List<String> getAlias() {
            return this.alias;
        }

        public ListRecommendContentResponseBodyResult setAudition(Boolean audition) {
            this.audition = audition;
            return this;
        }
        public Boolean getAudition() {
            return this.audition;
        }

        public ListRecommendContentResponseBodyResult setAuthors(java.util.List<ListRecommendContentResponseBodyResultAuthors> authors) {
            this.authors = authors;
            return this;
        }
        public java.util.List<ListRecommendContentResponseBodyResultAuthors> getAuthors() {
            return this.authors;
        }

        public ListRecommendContentResponseBodyResult setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListRecommendContentResponseBodyResult setCharge(Boolean charge) {
            this.charge = charge;
            return this;
        }
        public Boolean getCharge() {
            return this.charge;
        }

        public ListRecommendContentResponseBodyResult setCommCateId(Long commCateId) {
            this.commCateId = commCateId;
            return this;
        }
        public Long getCommCateId() {
            return this.commCateId;
        }

        public ListRecommendContentResponseBodyResult setCover(ListRecommendContentResponseBodyResultCover cover) {
            this.cover = cover;
            return this;
        }
        public ListRecommendContentResponseBodyResultCover getCover() {
            return this.cover;
        }

        public ListRecommendContentResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRecommendContentResponseBodyResult setHotScore(Double hotScore) {
            this.hotScore = hotScore;
            return this;
        }
        public Double getHotScore() {
            return this.hotScore;
        }

        public ListRecommendContentResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListRecommendContentResponseBodyResult setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListRecommendContentResponseBodyResult setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public ListRecommendContentResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListRecommendContentResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListRecommendContentResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListRecommendContentResponseBodyResult setValid(String valid) {
            this.valid = valid;
            return this;
        }
        public String getValid() {
            return this.valid;
        }

    }

}
