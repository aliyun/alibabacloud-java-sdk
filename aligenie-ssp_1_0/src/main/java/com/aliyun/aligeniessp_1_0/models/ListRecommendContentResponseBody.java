// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListRecommendContentResponseBody extends TeaModel {
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
        /**
         * <p>Indicates whether OSS rules can be used to crop the image</p>
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
         * <p><a href="https://a.jpg">https://a.jpg</a></p>
         */
        @NameInMap("Img")
        public String img;

        /**
         * <p>Large image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://a.jpg">https://a.jpg</a></p>
         */
        @NameInMap("Large")
        public String large;

        /**
         * <p>Medium image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://a.jpg">https://a.jpg</a></p>
         */
        @NameInMap("Medium")
        public String medium;

        /**
         * <p>Small image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://a.jpg">https://a.jpg</a></p>
         */
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
        /**
         * <p>Author types</p>
         */
        @NameInMap("AuthorTypes")
        public java.util.List<String> authorTypes;

        /**
         * <p>Profile picture</p>
         */
        @NameInMap("Cover")
        public ListRecommendContentResponseBodyResultAuthorsCover cover;

        /**
         * <p>Author description</p>
         * 
         * <strong>example:</strong>
         * <p>播音呆瓜小贼</p>
         */
        @NameInMap("Description")
        public String description;

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
         * <p>13597709</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Whether the author is online</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>Third-party author ID</p>
         * 
         * <strong>example:</strong>
         * <p>12311</p>
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
         * <p>Author title</p>
         * 
         * <strong>example:</strong>
         * <p>播音呆瓜小贼</p>
         */
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
        /**
         * <p>Whether OSS rules can be used for cropping</p>
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
         * <p>Medium image (Deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
         */
        @NameInMap("Mediam")
        public String mediam;

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
         * <p>Content author</p>
         */
        @NameInMap("Authors")
        public java.util.List<ListRecommendContentResponseBodyResultAuthors> authors;

        /**
         * <p>Transform controlType based on the assigned public category</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Whether the content is charged</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Charge")
        public Boolean charge;

        /**
         * <p>Corresponding category ID</p>
         * 
         * <strong>example:</strong>
         * <p>80012017</p>
         */
        @NameInMap("CommCateId")
        public Long commCateId;

        /**
         * <p>Album cover image</p>
         */
        @NameInMap("Cover")
        public ListRecommendContentResponseBodyResultCover cover;

        /**
         * <p>Content description</p>
         * 
         * <strong>example:</strong>
         * <p>内容描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Hot Score</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
         * <p>Third-party ID</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
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
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>超能狂少在都市</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Transformed favoriteType based on the associated public category</p>
         * 
         * <strong>example:</strong>
         * <p>program</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Whether playable</p>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
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
