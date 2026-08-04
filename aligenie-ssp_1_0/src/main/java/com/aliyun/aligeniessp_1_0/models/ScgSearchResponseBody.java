// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ScgSearchResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>Response message</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>Number of records per page</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>73C67BD9-175A-1324-8202-9FAABBB3E6FA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Detailed returned information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;sourceId&quot;:0,&quot;copyright&quot;:0,&quot;releaseTime&quot;:1196438400000,&quot;hotScore&quot;:0.9546929544543479,&quot;tppExtendInfo&quot;:&quot;{\&quot;userEvent\&quot;:\&quot;前台投放\&quot;,\&quot;scgTopicName\&quot;:\&quot;inside民族中国风曲风音乐库\&quot;,\&quot;scgTopicId\&quot;:\&quot;MC201132\&quot;}&quot;,&quot;source&quot;:&quot;xiami&quot;,&quot;title&quot;:&quot;题帕三绝&quot;,&quot;type&quot;:&quot;music&quot;,&quot;x1Pv30d&quot;:10307,&quot;valid&quot;:10,&quot;cover&quot;:{&quot;img&quot;:&quot;<a href="http://img.xiami.net/qianxun/07d8ec1a38a5462c3afbfac41413b8af/47244c25fcf3a8f67442d02e3127d023-500x432.jpg%22,%22canResize%22:false%7D,%22duration%22:0,%22rawId%22:%221771626071%22,%22albumType%22:0,%22alias%22:%5B%22%E9%A2%98%E5%B8%95%E4%B8%89%E7%BB%9D%22%5D,%22id%22:268033175,%22supportAudition%22:false,%22contentType%22:%22MUSIC_CONTENT%22,%22authorIds%22:%5B%5D,%22singers%22:%22%E9%99%88%E5%8A%9B%22,%22albumRawId%22:%221771626071%22,%22album%22:false,%22x1PvTotal%22:14676,%22commCateId%22:80021001,%22finished%22:0,%22isAudition%22:false,%22appIds%22:%5B%5D,%22authorNames%22:%5B%22%E9%99%88%E5%8A%9B%22,%22%E7%8E%8B%E7%AB%8B%E5%B9%B3%22,%22%E6%9B%B9%E9%9B%AA%E8%8A%B9%22%5D,%22needCharge%22:false,%22isCharge%22:false,%22category%22:%22audio%22%7D">http://img.xiami.net/qianxun/07d8ec1a38a5462c3afbfac41413b8af/47244c25fcf3a8f67442d02e3127d023-500x432.jpg&quot;,&quot;canResize&quot;:false},&quot;duration&quot;:0,&quot;rawId&quot;:&quot;1771626071&quot;,&quot;albumType&quot;:0,&quot;alias&quot;:[&quot;题帕三绝&quot;],&quot;id&quot;:268033175,&quot;supportAudition&quot;:false,&quot;contentType&quot;:&quot;MUSIC_CONTENT&quot;,&quot;authorIds&quot;:[],&quot;singers&quot;:&quot;陈力&quot;,&quot;albumRawId&quot;:&quot;1771626071&quot;,&quot;album&quot;:false,&quot;x1PvTotal&quot;:14676,&quot;commCateId&quot;:80021001,&quot;finished&quot;:0,&quot;isAudition&quot;:false,&quot;appIds&quot;:[],&quot;authorNames&quot;:[&quot;陈力&quot;,&quot;王立平&quot;,&quot;曹雪芹&quot;],&quot;needCharge&quot;:false,&quot;isCharge&quot;:false,&quot;category&quot;:&quot;audio&quot;}</a></p>
     */
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
         * <p>Thumbnail image (Img, Large, Medium, and Small may not appear simultaneously; only one of them may be present)</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg">http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg</a></p>
         */
        @NameInMap("Img")
        public String img;

        /**
         * <p>Large graph</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg">http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg</a></p>
         */
        @NameInMap("Large")
        public String large;

        /**
         * <p>Medium image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg">http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg</a></p>
         */
        @NameInMap("Medium")
        public String medium;

        /**
         * <p>Small image</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg">http://img.xiami.net/images/album/img59/56/58da2153e3133_2826959_1490690387.jpg</a></p>
         */
        @NameInMap("Small")
        public String small;

        /**
         * <p>Whether scaling is supported</p>
         * 
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
         * <p>Whether it is an album</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Album")
        public Boolean album;

        /**
         * <p>Album ID</p>
         * 
         * <strong>example:</strong>
         * <p>1795716629</p>
         */
        @NameInMap("AlbumRawId")
        public String albumRawId;

        /**
         * <p>Album type</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AlbumType")
        public Integer albumType;

        /**
         * <p>Alias</p>
         */
        @NameInMap("Alias")
        public java.util.List<String> alias;

        /**
         * <p>Author ID</p>
         */
        @NameInMap("AuthorIds")
        public java.util.List<Long> authorIds;

        /**
         * <p>Author names</p>
         */
        @NameInMap("AuthorNames")
        public java.util.List<String> authorNames;

        /**
         * <p>Category</p>
         * 
         * <strong>example:</strong>
         * <p>audio</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>Content type</p>
         * 
         * <strong>example:</strong>
         * <p>MUSIC_CONTENT</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>Thumbnail</p>
         */
        @NameInMap("Cover")
        public ScgSearchResponseBodyResultCover cover;

        /**
         * <p>Whether audition is available</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsAudition")
        public Boolean isAudition;

        /**
         * <p>Is charged</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCharge")
        public String isCharge;

        /**
         * <p>Whether charging is required</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedCharge")
        public Boolean needCharge;

        /**
         * <p>Third-party content ID</p>
         * 
         * <strong>example:</strong>
         * <p>1795716629</p>
         */
        @NameInMap("RawId")
        public String rawId;

        /**
         * <p>Singer name</p>
         * 
         * <strong>example:</strong>
         * <p>黎偌天</p>
         */
        @NameInMap("Singers")
        public String singers;

        /**
         * <p>Content source</p>
         * 
         * <strong>example:</strong>
         * <p>xiami</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>Whether audition is supported</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("SupportAudition")
        public Boolean supportAudition;

        /**
         * <p>Content title</p>
         * 
         * <strong>example:</strong>
         * <p>那个人</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>Content type</p>
         * 
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
