// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListPlayHistoryResponseBody extends TeaModel {
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

    @NameInMap("Result")
    public java.util.List<ListPlayHistoryResponseBodyResult> result;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F12B6147-5925-19E5-A3AD-E1EE1360F34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListPlayHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPlayHistoryResponseBody self = new ListPlayHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPlayHistoryResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListPlayHistoryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPlayHistoryResponseBody setResult(java.util.List<ListPlayHistoryResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListPlayHistoryResponseBodyResult> getResult() {
        return this.result;
    }

    public ListPlayHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPlayHistoryResponseBodyResultAuthorsCover extends TeaModel {
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

        public static ListPlayHistoryResponseBodyResultAuthorsCover build(java.util.Map<String, ?> map) throws Exception {
            ListPlayHistoryResponseBodyResultAuthorsCover self = new ListPlayHistoryResponseBodyResultAuthorsCover();
            return TeaModel.build(map, self);
        }

        public ListPlayHistoryResponseBodyResultAuthorsCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public ListPlayHistoryResponseBodyResultAuthorsCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public ListPlayHistoryResponseBodyResultAuthorsCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public ListPlayHistoryResponseBodyResultAuthorsCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public ListPlayHistoryResponseBodyResultAuthorsCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class ListPlayHistoryResponseBodyResultAuthors extends TeaModel {
        @NameInMap("AuthorTypes")
        public java.util.List<String> authorTypes;

        @NameInMap("Cover")
        public ListPlayHistoryResponseBodyResultAuthorsCover cover;

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
         * <p>false</p>
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

        public static ListPlayHistoryResponseBodyResultAuthors build(java.util.Map<String, ?> map) throws Exception {
            ListPlayHistoryResponseBodyResultAuthors self = new ListPlayHistoryResponseBodyResultAuthors();
            return TeaModel.build(map, self);
        }

        public ListPlayHistoryResponseBodyResultAuthors setAuthorTypes(java.util.List<String> authorTypes) {
            this.authorTypes = authorTypes;
            return this;
        }
        public java.util.List<String> getAuthorTypes() {
            return this.authorTypes;
        }

        public ListPlayHistoryResponseBodyResultAuthors setCover(ListPlayHistoryResponseBodyResultAuthorsCover cover) {
            this.cover = cover;
            return this;
        }
        public ListPlayHistoryResponseBodyResultAuthorsCover getCover() {
            return this.cover;
        }

        public ListPlayHistoryResponseBodyResultAuthors setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPlayHistoryResponseBodyResultAuthors setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListPlayHistoryResponseBodyResultAuthors setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListPlayHistoryResponseBodyResultAuthors setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListPlayHistoryResponseBodyResultAuthors setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public ListPlayHistoryResponseBodyResultAuthors setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListPlayHistoryResponseBodyResultAuthors setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListPlayHistoryResponseBodyResultCover extends TeaModel {
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

        public static ListPlayHistoryResponseBodyResultCover build(java.util.Map<String, ?> map) throws Exception {
            ListPlayHistoryResponseBodyResultCover self = new ListPlayHistoryResponseBodyResultCover();
            return TeaModel.build(map, self);
        }

        public ListPlayHistoryResponseBodyResultCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public ListPlayHistoryResponseBodyResultCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public ListPlayHistoryResponseBodyResultCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public ListPlayHistoryResponseBodyResultCover setMediam(String mediam) {
            this.mediam = mediam;
            return this;
        }
        public String getMediam() {
            return this.mediam;
        }

        public ListPlayHistoryResponseBodyResultCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public ListPlayHistoryResponseBodyResultCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class ListPlayHistoryResponseBodyResult extends TeaModel {
        @NameInMap("Alias")
        public java.util.List<String> alias;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Audition")
        public Boolean audition;

        @NameInMap("Authors")
        public java.util.List<ListPlayHistoryResponseBodyResultAuthors> authors;

        /**
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>false</p>
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
        public ListPlayHistoryResponseBodyResultCover cover;

        @NameInMap("Description")
        public String description;

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
         * <p>qingting</p>
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

        public static ListPlayHistoryResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListPlayHistoryResponseBodyResult self = new ListPlayHistoryResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListPlayHistoryResponseBodyResult setAlias(java.util.List<String> alias) {
            this.alias = alias;
            return this;
        }
        public java.util.List<String> getAlias() {
            return this.alias;
        }

        public ListPlayHistoryResponseBodyResult setAudition(Boolean audition) {
            this.audition = audition;
            return this;
        }
        public Boolean getAudition() {
            return this.audition;
        }

        public ListPlayHistoryResponseBodyResult setAuthors(java.util.List<ListPlayHistoryResponseBodyResultAuthors> authors) {
            this.authors = authors;
            return this;
        }
        public java.util.List<ListPlayHistoryResponseBodyResultAuthors> getAuthors() {
            return this.authors;
        }

        public ListPlayHistoryResponseBodyResult setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListPlayHistoryResponseBodyResult setCharge(Boolean charge) {
            this.charge = charge;
            return this;
        }
        public Boolean getCharge() {
            return this.charge;
        }

        public ListPlayHistoryResponseBodyResult setCommCateId(Long commCateId) {
            this.commCateId = commCateId;
            return this;
        }
        public Long getCommCateId() {
            return this.commCateId;
        }

        public ListPlayHistoryResponseBodyResult setCover(ListPlayHistoryResponseBodyResultCover cover) {
            this.cover = cover;
            return this;
        }
        public ListPlayHistoryResponseBodyResultCover getCover() {
            return this.cover;
        }

        public ListPlayHistoryResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPlayHistoryResponseBodyResult setHotScore(Double hotScore) {
            this.hotScore = hotScore;
            return this;
        }
        public Double getHotScore() {
            return this.hotScore;
        }

        public ListPlayHistoryResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListPlayHistoryResponseBodyResult setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListPlayHistoryResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListPlayHistoryResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListPlayHistoryResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListPlayHistoryResponseBodyResult setValid(String valid) {
            this.valid = valid;
            return this;
        }
        public String getValid() {
            return this.valid;
        }

    }

}
