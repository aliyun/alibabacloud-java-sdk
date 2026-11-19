// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListDataServiceAppsRequest extends TeaModel {
    /**
     * <p>The query parameters for listing all applications under the tenant.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListDataServiceAppsRequestListQuery listQuery;

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
     * <p>The ID of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListDataServiceAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataServiceAppsRequest self = new ListDataServiceAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListDataServiceAppsRequest setListQuery(ListDataServiceAppsRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListDataServiceAppsRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListDataServiceAppsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListDataServiceAppsRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListDataServiceAppsRequestListQuery extends TeaModel {
        /**
         * <p>The application group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        @NameInMap("AppGroupId")
        public Integer appGroupId;

        /**
         * <p>The keyword used to search for application names.</p>
         * 
         * <strong>example:</strong>
         * <p>Marketing dashboard</p>
         */
        @NameInMap("Keyword")
        public String keyword;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNo")
        public Integer pageNo;

        /**
         * <p>The number of records per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListDataServiceAppsRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListDataServiceAppsRequestListQuery self = new ListDataServiceAppsRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListDataServiceAppsRequestListQuery setAppGroupId(Integer appGroupId) {
            this.appGroupId = appGroupId;
            return this;
        }
        public Integer getAppGroupId() {
            return this.appGroupId;
        }

        public ListDataServiceAppsRequestListQuery setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

        public ListDataServiceAppsRequestListQuery setPageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }
        public Integer getPageNo() {
            return this.pageNo;
        }

        public ListDataServiceAppsRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
