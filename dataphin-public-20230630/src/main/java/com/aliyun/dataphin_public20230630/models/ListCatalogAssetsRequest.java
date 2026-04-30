// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListCatalogAssetsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListCatalogAssetsQuery")
    public ListCatalogAssetsRequestListCatalogAssetsQuery listCatalogAssetsQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListCatalogAssetsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCatalogAssetsRequest self = new ListCatalogAssetsRequest();
        return TeaModel.build(map, self);
    }

    public ListCatalogAssetsRequest setListCatalogAssetsQuery(ListCatalogAssetsRequestListCatalogAssetsQuery listCatalogAssetsQuery) {
        this.listCatalogAssetsQuery = listCatalogAssetsQuery;
        return this;
    }
    public ListCatalogAssetsRequestListCatalogAssetsQuery getListCatalogAssetsQuery() {
        return this.listCatalogAssetsQuery;
    }

    public ListCatalogAssetsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListCatalogAssetsRequestListCatalogAssetsQuery extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>EXACT_MATCH</p>
         */
        @NameInMap("QueryMode")
        public String queryMode;

        public static ListCatalogAssetsRequestListCatalogAssetsQuery build(java.util.Map<String, ?> map) throws Exception {
            ListCatalogAssetsRequestListCatalogAssetsQuery self = new ListCatalogAssetsRequestListCatalogAssetsQuery();
            return TeaModel.build(map, self);
        }

        public ListCatalogAssetsRequestListCatalogAssetsQuery setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public ListCatalogAssetsRequestListCatalogAssetsQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListCatalogAssetsRequestListCatalogAssetsQuery setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCatalogAssetsRequestListCatalogAssetsQuery setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListCatalogAssetsRequestListCatalogAssetsQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCatalogAssetsRequestListCatalogAssetsQuery setQueryMode(String queryMode) {
            this.queryMode = queryMode;
            return this;
        }
        public String getQueryMode() {
            return this.queryMode;
        }

    }

}
