// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCateContentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>sucess</p>
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
    public ListCateContentResponseBodyResult result;

    public static ListCateContentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCateContentResponseBody self = new ListCateContentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCateContentResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListCateContentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCateContentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCateContentResponseBody setResult(ListCateContentResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListCateContentResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListCateContentResponseBodyResultOpenDataItemListAuthorsCover extends TeaModel {
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
        @NameInMap("Mediam")
        public String mediam;

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

        public static ListCateContentResponseBodyResultOpenDataItemListAuthorsCover build(java.util.Map<String, ?> map) throws Exception {
            ListCateContentResponseBodyResultOpenDataItemListAuthorsCover self = new ListCateContentResponseBodyResultOpenDataItemListAuthorsCover();
            return TeaModel.build(map, self);
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthorsCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthorsCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthorsCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthorsCover setMediam(String mediam) {
            this.mediam = mediam;
            return this;
        }
        public String getMediam() {
            return this.mediam;
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthorsCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthorsCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

    }

    public static class ListCateContentResponseBodyResultOpenDataItemListAuthors extends TeaModel {
        @NameInMap("AuthorTypes")
        public java.util.List<String> authorTypes;

        @NameInMap("Cover")
        public ListCateContentResponseBodyResultOpenDataItemListAuthorsCover cover;

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

        public static ListCateContentResponseBodyResultOpenDataItemListAuthors build(java.util.Map<String, ?> map) throws Exception {
            ListCateContentResponseBodyResultOpenDataItemListAuthors self = new ListCateContentResponseBodyResultOpenDataItemListAuthors();
            return TeaModel.build(map, self);
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthors setAuthorTypes(java.util.List<String> authorTypes) {
            this.authorTypes = authorTypes;
            return this;
        }
        public java.util.List<String> getAuthorTypes() {
            return this.authorTypes;
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthors setCover(ListCateContentResponseBodyResultOpenDataItemListAuthorsCover cover) {
            this.cover = cover;
            return this;
        }
        public ListCateContentResponseBodyResultOpenDataItemListAuthorsCover getCover() {
            return this.cover;
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthors setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthors setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthors setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthors setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthors setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthors setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListCateContentResponseBodyResultOpenDataItemListAuthors setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListCateContentResponseBodyResultOpenDataItemListCover extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718285.jpg">http://pic.qtfm.cn/2017/0207/2017020718285.jpg</a></p>
         */
        @NameInMap("Img")
        public String img;

        /**
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718275.jpg">http://pic.qtfm.cn/2017/0207/2017020718275.jpg</a></p>
         */
        @NameInMap("Large")
        public String large;

        /**
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718275.jpg">http://pic.qtfm.cn/2017/0207/2017020718275.jpg</a></p>
         */
        @NameInMap("Mediam")
        public String mediam;

        /**
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/20170207175.jpg">http://pic.qtfm.cn/2017/0207/20170207175.jpg</a></p>
         */
        @NameInMap("Medium")
        public String medium;

        /**
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020675.jpg">http://pic.qtfm.cn/2017/0207/2017020675.jpg</a></p>
         */
        @NameInMap("Small")
        public String small;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("canResize")
        public Boolean canResize;

        public static ListCateContentResponseBodyResultOpenDataItemListCover build(java.util.Map<String, ?> map) throws Exception {
            ListCateContentResponseBodyResultOpenDataItemListCover self = new ListCateContentResponseBodyResultOpenDataItemListCover();
            return TeaModel.build(map, self);
        }

        public ListCateContentResponseBodyResultOpenDataItemListCover setImg(String img) {
            this.img = img;
            return this;
        }
        public String getImg() {
            return this.img;
        }

        public ListCateContentResponseBodyResultOpenDataItemListCover setLarge(String large) {
            this.large = large;
            return this;
        }
        public String getLarge() {
            return this.large;
        }

        public ListCateContentResponseBodyResultOpenDataItemListCover setMediam(String mediam) {
            this.mediam = mediam;
            return this;
        }
        public String getMediam() {
            return this.mediam;
        }

        public ListCateContentResponseBodyResultOpenDataItemListCover setMedium(String medium) {
            this.medium = medium;
            return this;
        }
        public String getMedium() {
            return this.medium;
        }

        public ListCateContentResponseBodyResultOpenDataItemListCover setSmall(String small) {
            this.small = small;
            return this;
        }
        public String getSmall() {
            return this.small;
        }

        public ListCateContentResponseBodyResultOpenDataItemListCover setCanResize(Boolean canResize) {
            this.canResize = canResize;
            return this;
        }
        public Boolean getCanResize() {
            return this.canResize;
        }

    }

    public static class ListCateContentResponseBodyResultOpenDataItemList extends TeaModel {
        @NameInMap("Alias")
        public java.util.List<String> alias;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Audition")
        public Boolean audition;

        @NameInMap("Authors")
        public java.util.List<ListCateContentResponseBodyResultOpenDataItemListAuthors> authors;

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
        public String commCateId;

        @NameInMap("Cover")
        public ListCateContentResponseBodyResultOpenDataItemListCover cover;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HotScore")
        public Double hotScore;

        /**
         * <strong>example:</strong>
         * <p>ALBUM</p>
         */
        @NameInMap("ItemType")
        public String itemType;

        /**
         * <strong>example:</strong>
         * <p>206775</p>
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

        /**
         * <strong>example:</strong>
         * <p>26152778</p>
         */
        @NameInMap("id")
        public Long id;

        public static ListCateContentResponseBodyResultOpenDataItemList build(java.util.Map<String, ?> map) throws Exception {
            ListCateContentResponseBodyResultOpenDataItemList self = new ListCateContentResponseBodyResultOpenDataItemList();
            return TeaModel.build(map, self);
        }

        public ListCateContentResponseBodyResultOpenDataItemList setAlias(java.util.List<String> alias) {
            this.alias = alias;
            return this;
        }
        public java.util.List<String> getAlias() {
            return this.alias;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setAudition(Boolean audition) {
            this.audition = audition;
            return this;
        }
        public Boolean getAudition() {
            return this.audition;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setAuthors(java.util.List<ListCateContentResponseBodyResultOpenDataItemListAuthors> authors) {
            this.authors = authors;
            return this;
        }
        public java.util.List<ListCateContentResponseBodyResultOpenDataItemListAuthors> getAuthors() {
            return this.authors;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setCharge(Boolean charge) {
            this.charge = charge;
            return this;
        }
        public Boolean getCharge() {
            return this.charge;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setCommCateId(String commCateId) {
            this.commCateId = commCateId;
            return this;
        }
        public String getCommCateId() {
            return this.commCateId;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setCover(ListCateContentResponseBodyResultOpenDataItemListCover cover) {
            this.cover = cover;
            return this;
        }
        public ListCateContentResponseBodyResultOpenDataItemListCover getCover() {
            return this.cover;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setHotScore(Double hotScore) {
            this.hotScore = hotScore;
            return this;
        }
        public Double getHotScore() {
            return this.hotScore;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setItemType(String itemType) {
            this.itemType = itemType;
            return this;
        }
        public String getItemType() {
            return this.itemType;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setValid(String valid) {
            this.valid = valid;
            return this;
        }
        public String getValid() {
            return this.valid;
        }

        public ListCateContentResponseBodyResultOpenDataItemList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

    }

    public static class ListCateContentResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        @NameInMap("OpenDataItemList")
        public java.util.List<ListCateContentResponseBodyResultOpenDataItemList> openDataItemList;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>12002</p>
         */
        @NameInMap("TotalSize")
        public Long totalSize;

        public static ListCateContentResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListCateContentResponseBodyResult self = new ListCateContentResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListCateContentResponseBodyResult setCurrentPageNum(Integer currentPageNum) {
            this.currentPageNum = currentPageNum;
            return this;
        }
        public Integer getCurrentPageNum() {
            return this.currentPageNum;
        }

        public ListCateContentResponseBodyResult setOpenDataItemList(java.util.List<ListCateContentResponseBodyResultOpenDataItemList> openDataItemList) {
            this.openDataItemList = openDataItemList;
            return this;
        }
        public java.util.List<ListCateContentResponseBodyResultOpenDataItemList> getOpenDataItemList() {
            return this.openDataItemList;
        }

        public ListCateContentResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCateContentResponseBodyResult setTotalSize(Long totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Long getTotalSize() {
            return this.totalSize;
        }

    }

}
