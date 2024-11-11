// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAlbumResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>F12B6147-5925-19E5-A3AD-E1EE1360F34E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetAlbumResponseBodyResult result;

    public static GetAlbumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAlbumResponseBody self = new GetAlbumResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAlbumResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetAlbumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAlbumResponseBody setResult(GetAlbumResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetAlbumResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetAlbumResponseBodyResultAuthors extends TeaModel {
        @NameInMap("AuthorTypes")
        public java.util.List<String> authorTypes;

        /**
         * <strong>example:</strong>
         * <p>MALE</p>
         */
        @NameInMap("Gender")
        public String gender;

        /**
         * <strong>example:</strong>
         * <p>13123</p>
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
         * <p>qignting</p>
         */
        @NameInMap("Source")
        public String source;

        @NameInMap("Title")
        public String title;

        public static GetAlbumResponseBodyResultAuthors build(java.util.Map<String, ?> map) throws Exception {
            GetAlbumResponseBodyResultAuthors self = new GetAlbumResponseBodyResultAuthors();
            return TeaModel.build(map, self);
        }

        public GetAlbumResponseBodyResultAuthors setAuthorTypes(java.util.List<String> authorTypes) {
            this.authorTypes = authorTypes;
            return this;
        }
        public java.util.List<String> getAuthorTypes() {
            return this.authorTypes;
        }

        public GetAlbumResponseBodyResultAuthors setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public GetAlbumResponseBodyResultAuthors setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAlbumResponseBodyResultAuthors setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public GetAlbumResponseBodyResultAuthors setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAlbumResponseBodyResultAuthors setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetAlbumResponseBodyResultCover extends TeaModel {
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
        @NameInMap("Medium")
        public String medium;

        /**
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
         */
        @NameInMap("Small")
        public String small;

        public static GetAlbumResponseBodyResultCover build(java.util.Map<String, ?> map) throws Exception {
            GetAlbumResponseBodyResultCover self = new GetAlbumResponseBodyResultCover();
            return TeaModel.build(map, self);
        }

        public GetAlbumResponseBodyResultCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public GetAlbumResponseBodyResultCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public GetAlbumResponseBodyResultCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public GetAlbumResponseBodyResultCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public GetAlbumResponseBodyResultCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class GetAlbumResponseBodyResult extends TeaModel {
        @NameInMap("Alias")
        public java.util.List<String> alias;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Audition")
        public Boolean audition;

        @NameInMap("Authors")
        public java.util.List<GetAlbumResponseBodyResultAuthors> authors;

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
        public GetAlbumResponseBodyResultCover cover;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("Finished")
        public String finished;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HotScore")
        public Double hotScore;

        /**
         * <strong>example:</strong>
         * <p>1231231</p>
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
         * <p>23242</p>
         */
        @NameInMap("RawId")
        public String rawId;

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
         * <p>12</p>
         */
        @NameInMap("TotalEpisode")
        public Integer totalEpisode;

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

        public static GetAlbumResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetAlbumResponseBodyResult self = new GetAlbumResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetAlbumResponseBodyResult setAlias(java.util.List<String> alias) {
            this.alias = alias;
            return this;
        }
        public java.util.List<String> getAlias() {
            return this.alias;
        }

        public GetAlbumResponseBodyResult setAudition(Boolean audition) {
            this.audition = audition;
            return this;
        }
        public Boolean getAudition() {
            return this.audition;
        }

        public GetAlbumResponseBodyResult setAuthors(java.util.List<GetAlbumResponseBodyResultAuthors> authors) {
            this.authors = authors;
            return this;
        }
        public java.util.List<GetAlbumResponseBodyResultAuthors> getAuthors() {
            return this.authors;
        }

        public GetAlbumResponseBodyResult setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public GetAlbumResponseBodyResult setCharge(Boolean charge) {
            this.charge = charge;
            return this;
        }
        public Boolean getCharge() {
            return this.charge;
        }

        public GetAlbumResponseBodyResult setCommCateId(Long commCateId) {
            this.commCateId = commCateId;
            return this;
        }
        public Long getCommCateId() {
            return this.commCateId;
        }

        public GetAlbumResponseBodyResult setCover(GetAlbumResponseBodyResultCover cover) {
            this.cover = cover;
            return this;
        }
        public GetAlbumResponseBodyResultCover getCover() {
            return this.cover;
        }

        public GetAlbumResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetAlbumResponseBodyResult setFinished(String finished) {
            this.finished = finished;
            return this;
        }
        public String getFinished() {
            return this.finished;
        }

        public GetAlbumResponseBodyResult setHotScore(Double hotScore) {
            this.hotScore = hotScore;
            return this;
        }
        public Double getHotScore() {
            return this.hotScore;
        }

        public GetAlbumResponseBodyResult setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetAlbumResponseBodyResult setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public GetAlbumResponseBodyResult setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public GetAlbumResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetAlbumResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetAlbumResponseBodyResult setTotalEpisode(Integer totalEpisode) {
            this.totalEpisode = totalEpisode;
            return this;
        }
        public Integer getTotalEpisode() {
            return this.totalEpisode;
        }

        public GetAlbumResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetAlbumResponseBodyResult setValid(String valid) {
            this.valid = valid;
            return this;
        }
        public String getValid() {
            return this.valid;
        }

    }

}
