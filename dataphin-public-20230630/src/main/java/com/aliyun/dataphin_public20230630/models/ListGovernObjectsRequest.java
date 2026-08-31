// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListGovernObjectsRequest extends TeaModel {
    /**
     * <p>The paged query conditions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListGovernObjectsRequestListQuery listQuery;

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

    public static ListGovernObjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGovernObjectsRequest self = new ListGovernObjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListGovernObjectsRequest setListQuery(ListGovernObjectsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListGovernObjectsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListGovernObjectsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListGovernObjectsRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListGovernObjectsRequestListQuery extends TeaModel {
        /**
         * <p>The governance item type. Valid values:</p>
         * <ul>
         * <li>TABLE</li>
         * <li>DATASOURCE_TABLE</li>
         * <li>DATASOURCE</li>
         * <li>INDEX</li>
         * <li>REALTIME_LOGICAL_TABLE</li>
         * <li>QD_FEATURE</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("GovernItemType")
        public String governItemType;

        /**
         * <p>The search keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The owner.</p>
         * 
         * <strong>example:</strong>
         * <p>user123</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of records per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of project names used to filter results.</p>
         */
        @NameInMap("ProjectNames")
        public java.util.List<String> projectNames;

        /**
         * <p>The list of governance object statuses. Valid values:</p>
         * <ul>
         * <li>NEW</li>
         * <li>VERIFY</li>
         * <li>FINISHED</li>
         * <li>IGNORE</li>
         * </ul>
         */
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        /**
         * <p>The view type. Valid values:</p>
         * <ul>
         * <li>ALL</li>
         * <li>OWNER</li>
         * <li>PROJECT</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ALL</p>
         */
        @NameInMap("ViewType")
        public String viewType;

        public static ListGovernObjectsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListGovernObjectsRequestListQuery self = new ListGovernObjectsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListGovernObjectsRequestListQuery setGovernItemType(String governItemType) {
            this.governItemType = governItemType;
            return this;
        }
        public String getGovernItemType() {
            return this.governItemType;
        }

        public ListGovernObjectsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListGovernObjectsRequestListQuery setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ListGovernObjectsRequestListQuery setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListGovernObjectsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListGovernObjectsRequestListQuery setProjectNames(java.util.List<String> projectNames) {
            this.projectNames = projectNames;
            return this;
        }
        public java.util.List<String> getProjectNames() {
            return this.projectNames;
        }

        public ListGovernObjectsRequestListQuery setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        public ListGovernObjectsRequestListQuery setViewType(String viewType) {
            this.viewType = viewType;
            return this;
        }
        public String getViewType() {
            return this.viewType;
        }

    }

}
