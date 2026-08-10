// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListSecurityClassifyRequest extends TeaModel {
    /**
     * <p>The query conditions.</p>
     */
    @NameInMap("ListQuery")
    public ListSecurityClassifyRequestListQuery listQuery;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListSecurityClassifyRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSecurityClassifyRequest self = new ListSecurityClassifyRequest();
        return TeaModel.build(map, self);
    }

    public ListSecurityClassifyRequest setListQuery(ListSecurityClassifyRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListSecurityClassifyRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListSecurityClassifyRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListSecurityClassifyRequestListQuery extends TeaModel {
        /**
         * <p>The data level ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("LevelIndex")
        public Long levelIndex;

        /**
         * <p>The classification name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Personal Information</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The list of effective statuses. Valid values: ENABLE, DISABLE.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ENABLE&quot;]</p>
         */
        @NameInMap("StatusList")
        public java.util.List<String> statusList;

        public static ListSecurityClassifyRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListSecurityClassifyRequestListQuery self = new ListSecurityClassifyRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListSecurityClassifyRequestListQuery setLevelIndex(Long levelIndex) {
            this.levelIndex = levelIndex;
            return this;
        }
        public Long getLevelIndex() {
            return this.levelIndex;
        }

        public ListSecurityClassifyRequestListQuery setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSecurityClassifyRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListSecurityClassifyRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSecurityClassifyRequestListQuery setStatusList(java.util.List<String> statusList) {
            this.statusList = statusList;
            return this;
        }
        public java.util.List<String> getStatusList() {
            return this.statusList;
        }

    }

}
