// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListComputeSourcesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListComputeSourcesRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListComputeSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComputeSourcesRequest self = new ListComputeSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListComputeSourcesRequest setListQuery(ListComputeSourcesRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListComputeSourcesRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListComputeSourcesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListComputeSourcesRequestListQuery extends TeaModel {
        @NameInMap("BindProject")
        public Boolean bindProject;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>MaxCompute</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListComputeSourcesRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListComputeSourcesRequestListQuery self = new ListComputeSourcesRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListComputeSourcesRequestListQuery setBindProject(Boolean bindProject) {
            this.bindProject = bindProject;
            return this;
        }
        public Boolean getBindProject() {
            return this.bindProject;
        }

        public ListComputeSourcesRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListComputeSourcesRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListComputeSourcesRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListComputeSourcesRequestListQuery setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
