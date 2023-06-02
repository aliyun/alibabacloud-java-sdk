// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScgSearchResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

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
        @NameInMap("Img")
        public String img;

        @NameInMap("Large")
        public String large;

        @NameInMap("Medium")
        public String medium;

        @NameInMap("Small")
        public String small;

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
        @NameInMap("Album")
        public Boolean album;

        @NameInMap("AlbumRawId")
        public String albumRawId;

        @NameInMap("AlbumType")
        public Integer albumType;

        @NameInMap("Alias")
        public java.util.List<String> alias;

        @NameInMap("AuthorIds")
        public java.util.List<Long> authorIds;

        @NameInMap("AuthorNames")
        public java.util.List<String> authorNames;

        @NameInMap("Category")
        public String category;

        @NameInMap("ContentType")
        public String contentType;

        @NameInMap("Cover")
        public ScgSearchResponseBodyResultCover cover;

        @NameInMap("IsAudition")
        public Boolean isAudition;

        @NameInMap("IsCharge")
        public String isCharge;

        @NameInMap("NeedCharge")
        public Boolean needCharge;

        @NameInMap("RawId")
        public String rawId;

        @NameInMap("Singers")
        public String singers;

        @NameInMap("Source")
        public String source;

        @NameInMap("SupportAudition")
        public Boolean supportAudition;

        @NameInMap("Title")
        public String title;

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
