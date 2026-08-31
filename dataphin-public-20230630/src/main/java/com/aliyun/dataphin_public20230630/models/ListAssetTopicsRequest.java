// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAssetTopicsRequest extends TeaModel {
    /**
     * <p>The query parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListAssetTopicsRequestListQuery listQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListAssetTopicsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssetTopicsRequest self = new ListAssetTopicsRequest();
        return TeaModel.build(map, self);
    }

    public ListAssetTopicsRequest setListQuery(ListAssetTopicsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListAssetTopicsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListAssetTopicsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListAssetTopicsRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListAssetTopicsRequestListQuery extends TeaModel {
        /**
         * <p>The asset type. Valid values: TABLE, INDEX, API, DASHBOARD.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("AssetType")
        public String assetType;

        /**
         * <p>The keyword for the topic name. Maximum length: 256 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>Core Metrics</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>9770420</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of entries per page. Default value: 50. Valid values: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>7428337</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListAssetTopicsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListAssetTopicsRequestListQuery self = new ListAssetTopicsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListAssetTopicsRequestListQuery setAssetType(String assetType) {
            this.assetType = assetType;
            return this;
        }
        public String getAssetType() {
            return this.assetType;
        }

        public ListAssetTopicsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListAssetTopicsRequestListQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListAssetTopicsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
