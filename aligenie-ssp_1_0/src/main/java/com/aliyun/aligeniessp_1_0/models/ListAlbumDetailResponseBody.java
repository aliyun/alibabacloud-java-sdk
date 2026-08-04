// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListAlbumDetailResponseBody extends TeaModel {
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
     * <p>Id of the request</p>
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
    public ListAlbumDetailResponseBodyResult result;

    public static ListAlbumDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlbumDetailResponseBody self = new ListAlbumDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlbumDetailResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListAlbumDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlbumDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlbumDetailResponseBody setResult(ListAlbumDetailResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListAlbumDetailResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListAlbumDetailResponseBodyResultOpenDataItemListAuthors extends TeaModel {
        /**
         * <p>Author type</p>
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
         * <p>Primary key ID of the author</p>
         * 
         * <strong>example:</strong>
         * <p>12314</p>
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

        public static ListAlbumDetailResponseBodyResultOpenDataItemListAuthors build(java.util.Map<String, ?> map) throws Exception {
            ListAlbumDetailResponseBodyResultOpenDataItemListAuthors self = new ListAlbumDetailResponseBodyResultOpenDataItemListAuthors();
            return TeaModel.build(map, self);
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemListAuthors setAuthorTypes(java.util.List<String> authorTypes) {
            this.authorTypes = authorTypes;
            return this;
        }
        public java.util.List<String> getAuthorTypes() {
            return this.authorTypes;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemListAuthors setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemListAuthors setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemListAuthors setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemListAuthors setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemListAuthors setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListAlbumDetailResponseBodyResultOpenDataItemListCover extends TeaModel {
        /**
         * <p>Indicates whether OSS rules can be used for cropping</p>
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

        public static ListAlbumDetailResponseBodyResultOpenDataItemListCover build(java.util.Map<String, ?> map) throws Exception {
            ListAlbumDetailResponseBodyResultOpenDataItemListCover self = new ListAlbumDetailResponseBodyResultOpenDataItemListCover();
            return TeaModel.build(map, self);
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemListCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemListCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemListCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemListCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemListCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class ListAlbumDetailResponseBodyResultOpenDataItemList extends TeaModel {
        /**
         * <p>Alias</p>
         */
        @NameInMap("Alias")
        public java.util.List<String> alias;

        /**
         * <p>Indicates whether the content is available for audition</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Audition")
        public Boolean audition;

        /**
         * <p>Author of the content</p>
         */
        @NameInMap("Authors")
        public java.util.List<ListAlbumDetailResponseBodyResultOpenDataItemListAuthors> authors;

        /**
         * <p>Transform controlType based on the associated public category</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Is charged</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Charge")
        public Boolean charge;

        /**
         * <p>category ID</p>
         * 
         * <strong>example:</strong>
         * <p>80012017</p>
         */
        @NameInMap("CommCateId")
        public Long commCateId;

        /**
         * <p>Content thumbnail</p>
         */
        @NameInMap("Cover")
        public ListAlbumDetailResponseBodyResultOpenDataItemListCover cover;

        /**
         * <p>Content description</p>
         * 
         * <strong>example:</strong>
         * <p>内容描述</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Duration</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>popularity score</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("HotScore")
        public Double hotScore;

        /**
         * <p>content ID</p>
         * 
         * <strong>example:</strong>
         * <p>1231231</p>
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
         * <p>OrderIndex sequence</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OrderIndex")
        public Long orderIndex;

        /**
         * <p>Third-party ID</p>
         * 
         * <strong>example:</strong>
         * <p>12323423</p>
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
         * <p>style</p>
         */
        @NameInMap("Styles")
        public java.util.List<String> styles;

        /**
         * <p>Title</p>
         * 
         * <strong>example:</strong>
         * <p>超能狂少在都市</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Transform favoriteType based on the associated public category</p>
         * 
         * <strong>example:</strong>
         * <p>program</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Indicates whether the content is playable</p>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("Valid")
        public String valid;

        public static ListAlbumDetailResponseBodyResultOpenDataItemList build(java.util.Map<String, ?> map) throws Exception {
            ListAlbumDetailResponseBodyResultOpenDataItemList self = new ListAlbumDetailResponseBodyResultOpenDataItemList();
            return TeaModel.build(map, self);
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setAlias(java.util.List<String> alias) {
            this.alias = alias;
            return this;
        }
        public java.util.List<String> getAlias() {
            return this.alias;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setAudition(Boolean audition) {
            this.audition = audition;
            return this;
        }
        public Boolean getAudition() {
            return this.audition;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setAuthors(java.util.List<ListAlbumDetailResponseBodyResultOpenDataItemListAuthors> authors) {
            this.authors = authors;
            return this;
        }
        public java.util.List<ListAlbumDetailResponseBodyResultOpenDataItemListAuthors> getAuthors() {
            return this.authors;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setCharge(Boolean charge) {
            this.charge = charge;
            return this;
        }
        public Boolean getCharge() {
            return this.charge;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setCommCateId(Long commCateId) {
            this.commCateId = commCateId;
            return this;
        }
        public Long getCommCateId() {
            return this.commCateId;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setCover(ListAlbumDetailResponseBodyResultOpenDataItemListCover cover) {
            this.cover = cover;
            return this;
        }
        public ListAlbumDetailResponseBodyResultOpenDataItemListCover getCover() {
            return this.cover;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setHotScore(Double hotScore) {
            this.hotScore = hotScore;
            return this;
        }
        public Double getHotScore() {
            return this.hotScore;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setOrderIndex(Long orderIndex) {
            this.orderIndex = orderIndex;
            return this;
        }
        public Long getOrderIndex() {
            return this.orderIndex;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setStyles(java.util.List<String> styles) {
            this.styles = styles;
            return this;
        }
        public java.util.List<String> getStyles() {
            return this.styles;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAlbumDetailResponseBodyResultOpenDataItemList setValid(String valid) {
            this.valid = valid;
            return this;
        }
        public String getValid() {
            return this.valid;
        }

    }

    public static class ListAlbumDetailResponseBodyResult extends TeaModel {
        /**
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPageNum")
        public Long currentPageNum;

        /**
         * <p>Data information</p>
         */
        @NameInMap("OpenDataItemList")
        public java.util.List<ListAlbumDetailResponseBodyResultOpenDataItemList> openDataItemList;

        /**
         * <p>Number of records per page</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>total number of records</p>
         * 
         * <strong>example:</strong>
         * <p>21421</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListAlbumDetailResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListAlbumDetailResponseBodyResult self = new ListAlbumDetailResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListAlbumDetailResponseBodyResult setCurrentPageNum(Long currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Long getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListAlbumDetailResponseBodyResult setOpenDataItemList(java.util.List<ListAlbumDetailResponseBodyResultOpenDataItemList> openDataItemList) {
            this.openDataItemList = openDataItemList;
            return this;
        }
        public java.util.List<ListAlbumDetailResponseBodyResultOpenDataItemList> getOpenDataItemList() {
            return this.openDataItemList;
        }

        public ListAlbumDetailResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListAlbumDetailResponseBodyResult setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
