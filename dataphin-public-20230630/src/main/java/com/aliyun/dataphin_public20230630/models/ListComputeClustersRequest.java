// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListComputeClustersRequest extends TeaModel {
    /**
     * <p>The query conditions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListComputeClustersRequestListQuery listQuery;

    /**
     * <p>The maximum number of records to return in this response.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page. An empty value indicates that no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>fdccfa4f825bf506c591e285f1123403</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListComputeClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComputeClustersRequest self = new ListComputeClustersRequest();
        return TeaModel.build(map, self);
    }

    public ListComputeClustersRequest setListQuery(ListComputeClustersRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListComputeClustersRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListComputeClustersRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListComputeClustersRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListComputeClustersRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListComputeClustersRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListComputeClustersRequestListQuery extends TeaModel {
        /**
         * <p>The keyword for filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The page number. The value must be greater than 0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of records per page. The value must be greater than 0.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of cluster versions.</p>
         */
        @NameInMap("TypeVersionList")
        public java.util.List<String> typeVersionList;

        public static ListComputeClustersRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListComputeClustersRequestListQuery self = new ListComputeClustersRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListComputeClustersRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListComputeClustersRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListComputeClustersRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListComputeClustersRequestListQuery setTypeVersionList(java.util.List<String> typeVersionList) {
            this.typeVersionList = typeVersionList;
            return this;
        }
        public java.util.List<String> getTypeVersionList() {
            return this.typeVersionList;
        }

    }

}
