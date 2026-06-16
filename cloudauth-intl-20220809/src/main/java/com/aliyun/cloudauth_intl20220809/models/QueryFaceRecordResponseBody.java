// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class QueryFaceRecordResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CurrentPage")
    public Long currentPage;

    /**
     * <p>The list of returned records.</p>
     */
    @NameInMap("Items")
    public java.util.List<QueryFaceRecordResponseBodyItems> items;

    /**
     * <p>The maximum number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The token for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAARfZmVDe9NvRXloR5+8CK9nwqHyx44CQz3pa71+mmu0e</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7F971622-38C0-5F56-B2EC-315367979B4F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static QueryFaceRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFaceRecordResponseBody self = new QueryFaceRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFaceRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFaceRecordResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryFaceRecordResponseBody setItems(java.util.List<QueryFaceRecordResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<QueryFaceRecordResponseBodyItems> getItems() {
        return this.items;
    }

    public QueryFaceRecordResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryFaceRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFaceRecordResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryFaceRecordResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryFaceRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFaceRecordResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryFaceRecordResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class QueryFaceRecordResponseBodyItems extends TeaModel {
        /**
         * <p>The face ID.</p>
         * 
         * <strong>example:</strong>
         * <p>230642938</p>
         */
        @NameInMap("FaceId")
        public String faceId;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-15T02:20:28Z</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The primary key ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16112</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The URL of the face image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.xxxx.com/1.jpg">http://www.xxxx.com/1.jpg</a></p>
         */
        @NameInMap("ImgOssUrl")
        public String imgOssUrl;

        /**
         * <p>The merchant user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CuN6hiD08qr</p>
         */
        @NameInMap("MerchantUserId")
        public String merchantUserId;

        /**
         * <p>The registration type.</p>
         * 
         * <strong>example:</strong>
         * <p>MANUAL</p>
         */
        @NameInMap("RegistrationType")
        public String registrationType;

        public static QueryFaceRecordResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            QueryFaceRecordResponseBodyItems self = new QueryFaceRecordResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public QueryFaceRecordResponseBodyItems setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public QueryFaceRecordResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryFaceRecordResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryFaceRecordResponseBodyItems setImgOssUrl(String imgOssUrl) {
            this.imgOssUrl = imgOssUrl;
            return this;
        }
        public String getImgOssUrl() {
            return this.imgOssUrl;
        }

        public QueryFaceRecordResponseBodyItems setMerchantUserId(String merchantUserId) {
            this.merchantUserId = merchantUserId;
            return this;
        }
        public String getMerchantUserId() {
            return this.merchantUserId;
        }

        public QueryFaceRecordResponseBodyItems setRegistrationType(String registrationType) {
            this.registrationType = registrationType;
            return this;
        }
        public String getRegistrationType() {
            return this.registrationType;
        }

    }

}
