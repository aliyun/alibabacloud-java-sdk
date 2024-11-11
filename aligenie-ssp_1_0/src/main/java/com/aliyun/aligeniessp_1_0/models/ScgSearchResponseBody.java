// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScgSearchResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>73C67BD9-175A-1324-8202-9FAABBB3E6FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<ScgSearchResponseBodyResult> result;

    public static ScgSearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScgSearchResponseBody self = new ScgSearchResponseBody();
        return TeaModel.build(map, self);
    }

    public ScgSearchResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ScgSearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ScgSearchResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ScgSearchResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ScgSearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScgSearchResponseBody setResult(java.util.List<ScgSearchResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ScgSearchResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ScgSearchResponseBodyResultCover extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg">http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg</a></p>
         */
        @NameInMap("Img")
        public String img;

        /**
         * <strong>example:</strong>
         * <p><a href="http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg">http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg</a></p>
         */
        @NameInMap("Large")
        public String large;

        /**
         * <strong>example:</strong>
         * <p><a href="http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg">http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg</a></p>
         */
        @NameInMap("Medium")
        public String medium;

        /**
         * <strong>example:</strong>
         * <p><a href="http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg">http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg</a></p>
         */
        @NameInMap("Small")
        public String small;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("canResize")
        public Boolean canResize;

        public static ScgSearchResponseBodyResultCover build(java.util.Map<String, ?> map) throws Exception {
            ScgSearchResponseBodyResultCover self = new ScgSearchResponseBodyResultCover();
            return TeaModel.build(map, self);
        }

        public ScgSearchResponseBodyResultCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public ScgSearchResponseBodyResultCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public ScgSearchResponseBodyResultCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public ScgSearchResponseBodyResultCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

        public ScgSearchResponseBodyResultCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

    }

    public static class ScgSearchResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Album")
        public Boolean album;

        /**
         * <strong>example:</strong>
         * <p>1795716629</p>
         */
        @NameInMap("AlbumRawId")
        public String albumRawId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlbumType")
        public Integer albumType;

        @NameInMap("Alias")
        public java.util.List<String> alias;

        @NameInMap("AuthorIds")
        public java.util.List<Long> authorIds;

        @NameInMap("AuthorNames")
        public java.util.List<String> authorNames;

        /**
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <strong>example:</strong>
         * <p>MUSIC_CONTENT</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("Cover")
        public ScgSearchResponseBodyResultCover cover;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAudition")
        public Boolean isAudition;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCharge")
        public String isCharge;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedCharge")
        public Boolean needCharge;

        /**
         * <strong>example:</strong>
         * <p>1795716629</p>
         */
        @NameInMap("RawId")
        public String rawId;

        @NameInMap("Singers")
        public String singers;

        /**
         * <strong>example:</strong>
         * <p>xiami</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportAudition")
        public Boolean supportAudition;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>music</p>
         */
        @NameInMap("Type")
        public String type;

        public static ScgSearchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ScgSearchResponseBodyResult self = new ScgSearchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ScgSearchResponseBodyResult setAlbum(Boolean album) {
            this.album = album;
            return this;
        }
        public Boolean getAlbum() {
            return this.album;
        }

        public ScgSearchResponseBodyResult setAlbumRawId(String albumRawId) {
            this.albumRawId = albumRawId;
            return this;
        }
        public String getAlbumRawId() {
            return this.albumRawId;
        }

        public ScgSearchResponseBodyResult setAlbumType(Integer albumType) {
            this.albumType = albumType;
            return this;
        }
        public Integer getAlbumType() {
            return this.albumType;
        }

        public ScgSearchResponseBodyResult setAlias(java.util.List<String> alias) {
            this.alias = alias;
            return this;
        }
        public java.util.List<String> getAlias() {
            return this.alias;
        }

        public ScgSearchResponseBodyResult setAuthorIds(java.util.List<Long> authorIds) {
            this.authorIds = authorIds;
            return this;
        }
        public java.util.List<Long> getAuthorIds() {
            return this.authorIds;
        }

        public ScgSearchResponseBodyResult setAuthorNames(java.util.List<String> authorNames) {
            this.authorNames = authorNames;
            return this;
        }
        public java.util.List<String> getAuthorNames() {
            return this.authorNames;
        }

        public ScgSearchResponseBodyResult setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ScgSearchResponseBodyResult setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public ScgSearchResponseBodyResult setCover(ScgSearchResponseBodyResultCover cover) {
            this.cover = cover;
            return this;
        }
        public ScgSearchResponseBodyResultCover getCover() {
            return this.cover;
        }

        public ScgSearchResponseBodyResult setIsAudition(Boolean isAudition) {
            this.isAudition = isAudition;
            return this;
        }
        public Boolean getIsAudition() {
            return this.isAudition;
        }

        public ScgSearchResponseBodyResult setIsCharge(String isCharge) {
            this.isCharge = isCharge;
            return this;
        }
        public String getIsCharge() {
            return this.isCharge;
        }

        public ScgSearchResponseBodyResult setNeedCharge(Boolean needCharge) {
            this.needCharge = needCharge;
            return this;
        }
        public Boolean getNeedCharge() {
            return this.needCharge;
        }

        public ScgSearchResponseBodyResult setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public ScgSearchResponseBodyResult setSingers(String singers) {
            this.singers = singers;
            return this;
        }
        public String getSingers() {
            return this.singers;
        }

        public ScgSearchResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ScgSearchResponseBodyResult setSupportAudition(Boolean supportAudition) {
            this.supportAudition = supportAudition;
            return this;
        }
        public Boolean getSupportAudition() {
            return this.supportAudition;
        }

        public ScgSearchResponseBodyResult setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ScgSearchResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
