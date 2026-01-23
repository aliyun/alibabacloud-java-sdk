// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSecurityIdentifyResultsRequest extends TeaModel {
    @NameInMap("ListQuery")
    public ListSecurityIdentifyResultsRequestListQuery listQuery;

    /**
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
        @NameInMap("BizUnitNameList")
        public java.util.List<String> bizUnitNameList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClassifyId")
        public Long classifyId;

        @NameInMap("DatasourceNameList")
        public java.util.List<String> datasourceNameList;

        /**
         * <strong>example:</strong>
         * <p>DEV</p>
         */
        @NameInMap("Env")
        public String env;

        @NameInMap("IsLocked")
        public Boolean isLocked;

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

        @NameInMap("ProjectNameList")
        public java.util.List<String> projectNameList;

        /**
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
