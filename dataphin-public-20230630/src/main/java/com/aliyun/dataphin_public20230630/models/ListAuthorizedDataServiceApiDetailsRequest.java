// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListAuthorizedDataServiceApiDetailsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListAuthorizedDataServiceApiDetailsRequestListQuery listQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListAuthorizedDataServiceApiDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedDataServiceApiDetailsRequest self = new ListAuthorizedDataServiceApiDetailsRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedDataServiceApiDetailsRequest setListQuery(ListAuthorizedDataServiceApiDetailsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListAuthorizedDataServiceApiDetailsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListAuthorizedDataServiceApiDetailsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListAuthorizedDataServiceApiDetailsRequestListQuery extends TeaModel {
        /**
         * <p>AppKey</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200000000</p>
         */
        @NameInMap("AppKey")
        public Long appKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Page")
        public Integer page;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListAuthorizedDataServiceApiDetailsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedDataServiceApiDetailsRequestListQuery self = new ListAuthorizedDataServiceApiDetailsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedDataServiceApiDetailsRequestListQuery setAppKey(Long appKey) {
            this.appKey = appKey;
            return this;
        }
        public Long getAppKey() {
            return this.appKey;
        }

        public ListAuthorizedDataServiceApiDetailsRequestListQuery setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public ListAuthorizedDataServiceApiDetailsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
