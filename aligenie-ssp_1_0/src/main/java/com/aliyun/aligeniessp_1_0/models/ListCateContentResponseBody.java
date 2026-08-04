// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListCateContentResponseBody extends TeaModel {
    /**
     * <p>code encoding</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>message information</p>
     * 
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

    /**
     * <p>Return Result</p>
     */
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
         * <p>Indicates whether the image can be cropped using OSS rules.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanResize")
        public Boolean canResize;

        /**
         * <p>default image</p>
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
         * <p>Medium image (Deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://a.jpg">https://a.jpg</a></p>
         */
        @NameInMap("Mediam")
        public String mediam;

        /**
         * <p>medium image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://a.jpg">https://a.jpg</a></p>
         */
        @NameInMap("Medium")
        public String medium;

        /**
         * <p>small image</p>
         * 
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
        /**
         * <p>Author type</p>
         */
        @NameInMap("AuthorTypes")
        public java.util.List<String> authorTypes;

        /**
         * <p>profile picture</p>
         */
        @NameInMap("Cover")
        public ListCateContentResponseBodyResultOpenDataItemListAuthorsCover cover;

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
         * <p>Primary key ID of the author information</p>
         * 
         * <strong>example:</strong>
         * <p>13597709</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Whether it is online</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>third-party author ID</p>
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
         * <p>Author title</p>
         * 
         * <strong>example:</strong>
         * <p>播音呆瓜小贼</p>
         */
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
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718275.jpg">http://pic.qtfm.cn/2017/0207/2017020718275.jpg</a></p>
         */
        @NameInMap("Large")
        public String large;

        /**
         * <p>Medium image (Deprecated)</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020718275.jpg">http://pic.qtfm.cn/2017/0207/2017020718275.jpg</a></p>
         */
        @NameInMap("Mediam")
        public String mediam;

        /**
         * <p>Medium image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/20170207175.jpg">http://pic.qtfm.cn/2017/0207/20170207175.jpg</a></p>
         */
        @NameInMap("Medium")
        public String medium;

        /**
         * <p>Small image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://pic.qtfm.cn/2017/0207/2017020675.jpg">http://pic.qtfm.cn/2017/0207/2017020675.jpg</a></p>
         */
        @NameInMap("Small")
        public String small;

        /**
         * <p>Indicates whether cropping can be performed using OSS rules.</p>
         * 
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
        /**
         * <p>Alias</p>
         */
        @NameInMap("Alias")
        public java.util.List<String> alias;

        /**
         * <p>Is audition available</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Audition")
        public Boolean audition;

        /**
         * <p>author information</p>
         */
        @NameInMap("Authors")
        public java.util.List<ListCateContentResponseBodyResultOpenDataItemListAuthors> authors;

        /**
         * <p>Transform controlType based on the assigned public category</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Whether it is charged</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Charge")
        public Boolean charge;

        /**
         * <p>Category ID</p>
         * 
         * <strong>example:</strong>
         * <p>80012017</p>
         */
        @NameInMap("CommCateId")
        public String commCateId;

        /**
         * <p>Album thumbnail image</p>
         */
        @NameInMap("Cover")
        public ListCateContentResponseBodyResultOpenDataItemListCover cover;

        /**
         * <p>Content description</p>
         * 
         * <strong>example:</strong>
         * <p>作者：月不醉 简介：啥，假冒你男友？退役兵王回归都市后做了一名小保安，机缘巧合下却被冷艳女总拉去客串男友，从此之后，他与冷艳老总开始纠缠不清···拳打恶一代，脚踩高富帅，哥哥我专治各种不服。面对各类的阴谋阳谋，面对各种黑恶势力，且看哥如何称霸都市，踏上巅峰！</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Popularity score</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HotScore")
        public Double hotScore;

        /**
         * <p>Type of content, such as music, audio, radio, jokes, etc.</p>
         * 
         * <strong>example:</strong>
         * <p>ALBUM</p>
         */
        @NameInMap("ItemType")
        public String itemType;

        /**
         * <p>Third-party ID of the album</p>
         * 
         * <strong>example:</strong>
         * <p>206775</p>
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
         * <p>Transform favoriteType based on the associated public category.</p>
         * 
         * <strong>example:</strong>
         * <p>program</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Indicates whether the content is playable.</p>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        @NameInMap("Valid")
        public String valid;

        /**
         * <p>Primary key ID</p>
         * 
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
         * <p>Current page number</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPageNum")
        public Integer currentPageNum;

        /**
         * <p>Data information</p>
         */
        @NameInMap("OpenDataItemList")
        public java.util.List<ListCateContentResponseBodyResultOpenDataItemList> openDataItemList;

        /**
         * <p>Number of records per page</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total number of records</p>
         * 
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
