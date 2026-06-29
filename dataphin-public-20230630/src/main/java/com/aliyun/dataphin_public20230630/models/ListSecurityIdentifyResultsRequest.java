// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSecurityIdentifyResultsRequest extends TeaModel {
    /**
     * <p>Query conditions.</p>
     */
    @NameInMap("ListQuery")
    public ListSecurityIdentifyResultsRequestListQuery listQuery;

    /**
     * <p>Tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListSecurityIdentifyResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityIdentifyResultsRequest self = new ListSecurityIdentifyResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListSecurityIdentifyResultsRequest setListQuery(ListSecurityIdentifyResultsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListSecurityIdentifyResultsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListSecurityIdentifyResultsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListSecurityIdentifyResultsRequestListQuery extends TeaModel {
        /**
         * <p>Business unit names.</p>
         */
        @NameInMap("BizUnitNameList")
        public java.util.List<String> bizUnitNameList;

        /**
         * <p>Data classification ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClassifyId")
        public Long classifyId;

        /**
         * <p>Data source names.</p>
         */
        @NameInMap("DatasourceNameList")
        public java.util.List<String> datasourceNameList;

        /**
         * <p>Environment identifier of the data source, project, or business unit.</p>
         * 
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        /**
         * <p>Whether it is locked.</p>
         */
        @NameInMap("IsLocked")
        public Boolean isLocked;

        /**
         * <p>Keyword filter. Supports matching by table catalog, table name, table display name, and field name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>Page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>Number of records per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Project names.</p>
         */
        @NameInMap("ProjectNameList")
        public java.util.List<String> projectNameList;

        /**
         * <p>Effective status filter: ENABLE or DISABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>ENABLE</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListSecurityIdentifyResultsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityIdentifyResultsRequestListQuery self = new ListSecurityIdentifyResultsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListSecurityIdentifyResultsRequestListQuery setBizUnitNameList(java.util.List<String> bizUnitNameList) {
            this.bizUnitNameList = bizUnitNameList;
            return this;
        }
        public java.util.List<String> getBizUnitNameList() {
            return this.bizUnitNameList;
        }

        public ListSecurityIdentifyResultsRequestListQuery setClassifyId(Long classifyId) {
            this.classifyId = classifyId;
            return this;
        }
        public Long getClassifyId() {
            return this.classifyId;
        }

        public ListSecurityIdentifyResultsRequestListQuery setDatasourceNameList(java.util.List<String> datasourceNameList) {
            this.datasourceNameList = datasourceNameList;
            return this;
        }
        public java.util.List<String> getDatasourceNameList() {
            return this.datasourceNameList;
        }

        public ListSecurityIdentifyResultsRequestListQuery setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

        public ListSecurityIdentifyResultsRequestListQuery setIsLocked(Boolean isLocked) {
            this.isLocked = isLocked;
            return this;
        }
        public Boolean getIsLocked() {
            return this.isLocked;
        }

        public ListSecurityIdentifyResultsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListSecurityIdentifyResultsRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListSecurityIdentifyResultsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSecurityIdentifyResultsRequestListQuery setProjectNameList(java.util.List<String> projectNameList) {
            this.projectNameList = projectNameList;
            return this;
        }
        public java.util.List<String> getProjectNameList() {
            return this.projectNameList;
        }

        public ListSecurityIdentifyResultsRequestListQuery setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
