// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListMusicResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>43<em><strong>28C-A810-5</strong></em>-8747-EC226A086881</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ListMusicResponseBodyResult result;

    public static ListMusicResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMusicResponseBody self = new ListMusicResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMusicResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListMusicResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMusicResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMusicResponseBody setResult(ListMusicResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListMusicResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListMusicResponseBodyResultModel extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MusicId")
        public Long musicId;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MusicName")
        public String musicName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MusicType")
        public Long musicType;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("MusicTypeName")
        public String musicTypeName;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xx">http://xx</a></p>
         */
        @NameInMap("MusicUrl")
        public String musicUrl;

        public static ListMusicResponseBodyResultModel build(java.util.Map<String, ?> map) throws Exception {
            ListMusicResponseBodyResultModel self = new ListMusicResponseBodyResultModel();
            return TeaModel.build(map, self);
        }

        public ListMusicResponseBodyResultModel setMusicId(Long musicId) {
            this.musicId = musicId;
            return this;
        }
        public Long getMusicId() {
            return this.musicId;
        }

        public ListMusicResponseBodyResultModel setMusicName(String musicName) {
            this.musicName = musicName;
            return this;
        }
        public String getMusicName() {
            return this.musicName;
        }

        public ListMusicResponseBodyResultModel setMusicType(Long musicType) {
            this.musicType = musicType;
            return this;
        }
        public Long getMusicType() {
            return this.musicType;
        }

        public ListMusicResponseBodyResultModel setMusicTypeName(String musicTypeName) {
            this.musicTypeName = musicTypeName;
            return this;
        }
        public String getMusicTypeName() {
            return this.musicTypeName;
        }

        public ListMusicResponseBodyResultModel setMusicUrl(String musicUrl) {
            this.musicUrl = musicUrl;
            return this;
        }
        public String getMusicUrl() {
            return this.musicUrl;
        }

    }

    public static class ListMusicResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("Model")
        public java.util.List<ListMusicResponseBodyResultModel> model;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageCount")
        public Integer pageCount;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListMusicResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListMusicResponseBodyResult self = new ListMusicResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListMusicResponseBodyResult setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListMusicResponseBodyResult setModel(java.util.List<ListMusicResponseBodyResultModel> model) {
            this.model = model;
            return this;
        }
        public java.util.List<ListMusicResponseBodyResultModel> getModel() {
            return this.model;
        }

        public ListMusicResponseBodyResult setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public ListMusicResponseBodyResult setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMusicResponseBodyResult setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
