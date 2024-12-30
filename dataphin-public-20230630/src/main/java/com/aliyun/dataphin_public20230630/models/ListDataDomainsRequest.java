// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataDomainsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListDataDomainsRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListDataDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataDomainsRequest self = new ListDataDomainsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataDomainsRequest setListQuery(ListDataDomainsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListDataDomainsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListDataDomainsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListDataDomainsRequestListQuery extends TeaModel {
        @NameInMap("BizUnitIdList")
        public java.util.List<Long> bizUnitIdList;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        @NameInMap("ParentIdList")
        public java.util.List<Long> parentIdList;

        public static ListDataDomainsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListDataDomainsRequestListQuery self = new ListDataDomainsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListDataDomainsRequestListQuery setBizUnitIdList(java.util.List<Long> bizUnitIdList) {
            this.bizUnitIdList = bizUnitIdList;
            return this;
        }
        public java.util.List<Long> getBizUnitIdList() {
            return this.bizUnitIdList;
        }

        public ListDataDomainsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListDataDomainsRequestListQuery setParentIdList(java.util.List<Long> parentIdList) {
            this.parentIdList = parentIdList;
            return this;
        }
        public java.util.List<Long> getParentIdList() {
            return this.parentIdList;
        }

    }

}
