// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListAlbumDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Alias")
        public java.util.List<String> alias;

        @NameInMap("Audition")
        public Boolean audition;

        @NameInMap("Authors")
        public java.util.List<ListAlbumDetailResponseBodyResultOpenDataItemListAuthors> authors;

        @NameInMap("Category")
        public String category;

        @NameInMap("Charge")
        public Boolean charge;

        @NameInMap("CommCateId")
        public Long commCateId;

        @NameInMap("Cover")
        public ListAlbumDetailResponseBodyResultOpenDataItemListCover cover;

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

        @NameInMap("OrderIndex")
        public Long orderIndex;

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
        @NameInMap("CurrentPageNum")
        public Long currentPageNum;

        @NameInMap("OpenDataItemList")
        public java.util.List<ListAlbumDetailResponseBodyResultOpenDataItemList> openDataItemList;

        @NameInMap("PageSize")
        public Long pageSize;

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
