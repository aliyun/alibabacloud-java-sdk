// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class QueryCallbackByPageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<QueryCallbackByPageResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryCallbackByPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCallbackByPageResponseBody self = new QueryCallbackByPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCallbackByPageResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryCallbackByPageResponseBody setItems(java.util.List<QueryCallbackByPageResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<QueryCallbackByPageResponseBodyItems> getItems() {
        return this.items;
    }

    public QueryCallbackByPageResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryCallbackByPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCallbackByPageResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryCallbackByPageResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>SHA256</p>
         */
        @NameInMap("CryptType")
        public String cryptType;

        /**
         * <strong>example:</strong>
         * <p>2024-06-03 15:20:14</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2024-06-03 15:20:14</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1697</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <p>Seed。</p>
         * 
         * <strong>example:</strong>
         * <p>cb6gYS8GXj4Vn4Y4FN0Y8R5M-1x46Mq</p>
         */
        @NameInMap("Seed")
        public String seed;

        /**
         * <p>UID。</p>
         * 
         * <strong>example:</strong>
         * <p>12161*****398900</p>
         */
        @NameInMap("Uid")
        public String uid;

        /**
         * <strong>example:</strong>
         * <p><a href="https://console.aliyun.com/">https://console.aliyun.com/</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static QueryCallbackByPageResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            QueryCallbackByPageResponseBodyItems self = new QueryCallbackByPageResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public QueryCallbackByPageResponseBodyItems setCryptType(String cryptType) {
            this.cryptType = cryptType;
            return this;
        }
        public String getCryptType() {
            return this.cryptType;
        }

        public QueryCallbackByPageResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryCallbackByPageResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryCallbackByPageResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryCallbackByPageResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryCallbackByPageResponseBodyItems setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public QueryCallbackByPageResponseBodyItems setSeed(String seed) {
            this.seed = seed;
            return this;
        }
        public String getSeed() {
            return this.seed;
        }

        public QueryCallbackByPageResponseBodyItems setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public QueryCallbackByPageResponseBodyItems setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
