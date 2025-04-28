// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListRowPermissionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageRowPermissionQuery")
    public ListRowPermissionRequestPageRowPermissionQuery pageRowPermissionQuery;

    public static ListRowPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRowPermissionRequest self = new ListRowPermissionRequest();
        return TeaModel.build(map, self);
    }

    public ListRowPermissionRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListRowPermissionRequest setPageRowPermissionQuery(ListRowPermissionRequestPageRowPermissionQuery pageRowPermissionQuery) {
        this.pageRowPermissionQuery = pageRowPermissionQuery;
        return this;
    }
    public ListRowPermissionRequestPageRowPermissionQuery getPageRowPermissionQuery() {
        return this.pageRowPermissionQuery;
    }

    public static class ListRowPermissionRequestPageRowPermissionQuery extends TeaModel {
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListRowPermissionRequestPageRowPermissionQuery build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionRequestPageRowPermissionQuery self = new ListRowPermissionRequestPageRowPermissionQuery();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionRequestPageRowPermissionQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListRowPermissionRequestPageRowPermissionQuery setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListRowPermissionRequestPageRowPermissionQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
