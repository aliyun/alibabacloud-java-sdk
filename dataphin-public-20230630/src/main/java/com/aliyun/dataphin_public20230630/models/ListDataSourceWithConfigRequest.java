// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataSourceWithConfigRequest extends TeaModel {
    /**
     * <p>The paged query parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListDataSourceWithConfigRequestListQuery listQuery;

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
     * <p>The operator user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListDataSourceWithConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceWithConfigRequest self = new ListDataSourceWithConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceWithConfigRequest setListQuery(ListDataSourceWithConfigRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListDataSourceWithConfigRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListDataSourceWithConfigRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListDataSourceWithConfigRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListDataSourceWithConfigRequestListQuery extends TeaModel {
        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>vcns-test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The owners of the data sources.</p>
         */
        @NameInMap("OwnerList")
        public java.util.List<String> ownerList;

        /**
         * <p>The page number. The starting page is 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>The number of records per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The usage scopes of the data sources. Valid values:</p>
         * <ul>
         * <li>STREAMING: Real-time.</li>
         * <li>OFFLINE: Offline.</li>
         * <li>DIP_META_SYNC: Metadata warehouse initialization.</li>
         * <li>DATA_DISTILL: Data distillation.</li>
         * <li>CUMPUTE_SOURCE_SHADOW: Shadow compute source.</li>
         * <li>LABEL: Label.</li>
         * <li>ALL: Offline and real-time.</li>
         * </ul>
         */
        @NameInMap("ScopeList")
        public java.util.List<String> scopeList;

        /**
         * <p>The tag specified during data source creation.</p>
         * 
         * <strong>example:</strong>
         * <p>xx test</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The data source types.</p>
         */
        @NameInMap("TypeList")
        public java.util.List<String> typeList;

        public static ListDataSourceWithConfigRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListDataSourceWithConfigRequestListQuery self = new ListDataSourceWithConfigRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListDataSourceWithConfigRequestListQuery setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDataSourceWithConfigRequestListQuery setOwnerList(java.util.List<String> ownerList) {
            this.ownerList = ownerList;
            return this;
        }
        public java.util.List<String> getOwnerList() {
            return this.ownerList;
        }

        public ListDataSourceWithConfigRequestListQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListDataSourceWithConfigRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListDataSourceWithConfigRequestListQuery setScopeList(java.util.List<String> scopeList) {
            this.scopeList = scopeList;
            return this;
        }
        public java.util.List<String> getScopeList() {
            return this.scopeList;
        }

        public ListDataSourceWithConfigRequestListQuery setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public ListDataSourceWithConfigRequestListQuery setTypeList(java.util.List<String> typeList) {
            this.typeList = typeList;
            return this;
        }
        public java.util.List<String> getTypeList() {
            return this.typeList;
        }

    }

}
