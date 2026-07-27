// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListKgEntityRequest extends TeaModel {
    /**
     * <p>The entity type code.</p>
     * 
     * <strong>example:</strong>
     * <p>Company</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The paged query filter conditions.</p>
     */
    @NameInMap("ListQuery")
    public ListKgEntityRequestListQuery listQuery;

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
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>f1d4559a4db044158305e2d89bccf81f</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListKgEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKgEntityRequest self = new ListKgEntityRequest();
        return TeaModel.build(map, self);
    }

    public ListKgEntityRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListKgEntityRequest setListQuery(ListKgEntityRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListKgEntityRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListKgEntityRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListKgEntityRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListKgEntityRequestListQueryFilterList extends TeaModel {
        /**
         * <p>The operator. Valid values:</p>
         * <ul>
         * <li>eq: equal to.</li>
         * <li>neq: not equal to.</li>
         * <li>contains: contains.</li>
         * <li>gt: greater than.</li>
         * <li>gte: greater than or equal to.</li>
         * <li>lt: less than.</li>
         * <li>lte: less than or equal to.</li>
         * <li>like: fuzzy match.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("Op")
        public String op;

        /**
         * <p>The property code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>company_name</p>
         */
        @NameInMap("PropertyCode")
        public String propertyCode;

        /**
         * <p>The property match value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListKgEntityRequestListQueryFilterList build(java.util.Map<String, ?> map) throws Exception {
            ListKgEntityRequestListQueryFilterList self = new ListKgEntityRequestListQueryFilterList();
            return TeaModel.build(map, self);
        }

        public ListKgEntityRequestListQueryFilterList setOp(String op) {
            this.op = op;
            return this;
        }
        public String getOp() {
            return this.op;
        }

        public ListKgEntityRequestListQueryFilterList setPropertyCode(String propertyCode) {
            this.propertyCode = propertyCode;
            return this;
        }
        public String getPropertyCode() {
            return this.propertyCode;
        }

        public ListKgEntityRequestListQueryFilterList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListKgEntityRequestListQuery extends TeaModel {
        /**
         * <p>The property filter conditions.</p>
         */
        @NameInMap("FilterList")
        public java.util.List<ListKgEntityRequestListQueryFilterList> filterList;

        /**
         * <p>The keyword for searching display properties.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>The number of records per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListKgEntityRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListKgEntityRequestListQuery self = new ListKgEntityRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListKgEntityRequestListQuery setFilterList(java.util.List<ListKgEntityRequestListQueryFilterList> filterList) {
            this.filterList = filterList;
            return this;
        }
        public java.util.List<ListKgEntityRequestListQueryFilterList> getFilterList() {
            return this.filterList;
        }

        public ListKgEntityRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListKgEntityRequestListQuery setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListKgEntityRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
