// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListCatalogsResponseBody extends TeaModel {
    @NameInMap("catalogs")
    public java.util.List<ListCatalogsResponseBodyCatalogs> catalogs;

    /**
     * <p>一次获取的最大记录数。</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>下一页TOKEN。</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>记录总数。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListCatalogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogsResponseBody self = new ListCatalogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCatalogsResponseBody setCatalogs(java.util.List<ListCatalogsResponseBodyCatalogs> catalogs) {
        this.catalogs = catalogs;
        return this;
    }
    public java.util.List<ListCatalogsResponseBodyCatalogs> getCatalogs() {
        return this.catalogs;
    }

    public ListCatalogsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListCatalogsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListCatalogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCatalogsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCatalogsResponseBodyCatalogs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alias</p>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <p>regionId。</p>
         * 
         * <strong>example:</strong>
         * <p>15097**********</p>
         */
        @NameInMap("catalogId")
        public String catalogId;

        /**
         * <strong>example:</strong>
         * <p>HMS</p>
         */
        @NameInMap("catalogProvider")
        public String catalogProvider;

        /**
         * <strong>example:</strong>
         * <p>default_catalog</p>
         */
        @NameInMap("catalogType")
        public String catalogType;

        @NameInMap("environments")
        public java.util.List<String> environments;

        @NameInMap("extras")
        public java.util.Map<String, String> extras;

        /**
         * <strong>example:</strong>
         * <p>1760604889</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1760604889</p>
         */
        @NameInMap("gmtModified")
        public Long gmtModified;

        /**
         * <strong>example:</strong>
         * <p>15097**********</p>
         */
        @NameInMap("resourceOwnerId")
        public String resourceOwnerId;

        /**
         * <p>工作空间id。</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155****</p>
         */
        @NameInMap("workspaceId")
        public String workspaceId;

        public static ListCatalogsResponseBodyCatalogs build(java.util.Map<String, ?> map) throws Exception {
            ListCatalogsResponseBodyCatalogs self = new ListCatalogsResponseBodyCatalogs();
            return TeaModel.build(map, self);
        }

        public ListCatalogsResponseBodyCatalogs setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListCatalogsResponseBodyCatalogs setCatalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }
        public String getCatalogId() {
            return this.catalogId;
        }

        public ListCatalogsResponseBodyCatalogs setCatalogProvider(String catalogProvider) {
            this.catalogProvider = catalogProvider;
            return this;
        }
        public String getCatalogProvider() {
            return this.catalogProvider;
        }

        public ListCatalogsResponseBodyCatalogs setCatalogType(String catalogType) {
            this.catalogType = catalogType;
            return this;
        }
        public String getCatalogType() {
            return this.catalogType;
        }

        public ListCatalogsResponseBodyCatalogs setEnvironments(java.util.List<String> environments) {
            this.environments = environments;
            return this;
        }
        public java.util.List<String> getEnvironments() {
            return this.environments;
        }

        public ListCatalogsResponseBodyCatalogs setExtras(java.util.Map<String, String> extras) {
            this.extras = extras;
            return this;
        }
        public java.util.Map<String, String> getExtras() {
            return this.extras;
        }

        public ListCatalogsResponseBodyCatalogs setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCatalogsResponseBodyCatalogs setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public ListCatalogsResponseBodyCatalogs setResourceOwnerId(String resourceOwnerId) {
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }
        public String getResourceOwnerId() {
            return this.resourceOwnerId;
        }

        public ListCatalogsResponseBodyCatalogs setWorkspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }
        public String getWorkspaceId() {
            return this.workspaceId;
        }

    }

}
