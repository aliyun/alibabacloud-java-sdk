// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListBizEntitiesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListBizEntitiesRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListBizEntitiesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBizEntitiesRequest self = new ListBizEntitiesRequest();
        return TeaModel.build(map, self);
    }

    public ListBizEntitiesRequest setListQuery(ListBizEntitiesRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListBizEntitiesRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListBizEntitiesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListBizEntitiesRequestListQueryFilterCriteria extends TeaModel {
        @NameInMap("BizUnitIdList")
        public java.util.List<Long> bizUnitIdList;

        @NameInMap("BizUnitNameList")
        public java.util.List<String> bizUnitNameList;

        @NameInMap("DataDomainIdList")
        public java.util.List<Long> dataDomainIdList;

        @NameInMap("DataDomainNameList")
        public java.util.List<String> dataDomainNameList;

        @NameInMap("HasTableRef")
        public Boolean hasTableRef;

        @NameInMap("OwnerUserIdList")
        public java.util.List<String> ownerUserIdList;

        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        @NameInMap("SubTypeList")
        public java.util.List<String> subTypeList;

        public static ListBizEntitiesRequestListQueryFilterCriteria build(java.util.Map<String, ?> map) throws Exception {
            ListBizEntitiesRequestListQueryFilterCriteria self = new ListBizEntitiesRequestListQueryFilterCriteria();
            return TeaModel.build(map, self);
        }

        public ListBizEntitiesRequestListQueryFilterCriteria setBizUnitIdList(java.util.List<Long> bizUnitIdList) {
            this.bizUnitIdList = bizUnitIdList;
            return this;
        }
        public java.util.List<Long> getBizUnitIdList() {
            return this.bizUnitIdList;
        }

        public ListBizEntitiesRequestListQueryFilterCriteria setBizUnitNameList(java.util.List<String> bizUnitNameList) {
            this.bizUnitNameList = bizUnitNameList;
            return this;
        }
        public java.util.List<String> getBizUnitNameList() {
            return this.bizUnitNameList;
        }

        public ListBizEntitiesRequestListQueryFilterCriteria setDataDomainIdList(java.util.List<Long> dataDomainIdList) {
            this.dataDomainIdList = dataDomainIdList;
            return this;
        }
        public java.util.List<Long> getDataDomainIdList() {
            return this.dataDomainIdList;
        }

        public ListBizEntitiesRequestListQueryFilterCriteria setDataDomainNameList(java.util.List<String> dataDomainNameList) {
            this.dataDomainNameList = dataDomainNameList;
            return this;
        }
        public java.util.List<String> getDataDomainNameList() {
            return this.dataDomainNameList;
        }

        public ListBizEntitiesRequestListQueryFilterCriteria setHasTableRef(Boolean hasTableRef) {
            this.hasTableRef = hasTableRef;
            return this;
        }
        public Boolean getHasTableRef() {
            return this.hasTableRef;
        }

        public ListBizEntitiesRequestListQueryFilterCriteria setOwnerUserIdList(java.util.List<String> ownerUserIdList) {
            this.ownerUserIdList = ownerUserIdList;
            return this;
        }
        public java.util.List<String> getOwnerUserIdList() {
            return this.ownerUserIdList;
        }

        public ListBizEntitiesRequestListQueryFilterCriteria setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

        public ListBizEntitiesRequestListQueryFilterCriteria setSubTypeList(java.util.List<String> subTypeList) {
            this.subTypeList = subTypeList;
            return this;
        }
        public java.util.List<String> getSubTypeList() {
            return this.subTypeList;
        }

    }

    public static class ListBizEntitiesRequestListQuery extends TeaModel {
        @NameInMap("FilterCriteria")
        public ListBizEntitiesRequestListQueryFilterCriteria filterCriteria;

        /**
         * <strong>example:</strong>
         * <p>object_</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListBizEntitiesRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListBizEntitiesRequestListQuery self = new ListBizEntitiesRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListBizEntitiesRequestListQuery setFilterCriteria(ListBizEntitiesRequestListQueryFilterCriteria filterCriteria) {
            this.filterCriteria = filterCriteria;
            return this;
        }
        public ListBizEntitiesRequestListQueryFilterCriteria getFilterCriteria() {
            return this.filterCriteria;
        }

        public ListBizEntitiesRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListBizEntitiesRequestListQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListBizEntitiesRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
