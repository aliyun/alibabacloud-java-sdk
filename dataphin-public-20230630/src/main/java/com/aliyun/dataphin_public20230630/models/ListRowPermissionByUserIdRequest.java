// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListRowPermissionByUserIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListRowPermissionByUserIdQuery")
    public ListRowPermissionByUserIdRequestListRowPermissionByUserIdQuery listRowPermissionByUserIdQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static ListRowPermissionByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRowPermissionByUserIdRequest self = new ListRowPermissionByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public ListRowPermissionByUserIdRequest setListRowPermissionByUserIdQuery(ListRowPermissionByUserIdRequestListRowPermissionByUserIdQuery listRowPermissionByUserIdQuery) {
        this.listRowPermissionByUserIdQuery = listRowPermissionByUserIdQuery;
        return this;
    }
    public ListRowPermissionByUserIdRequestListRowPermissionByUserIdQuery getListRowPermissionByUserIdQuery() {
        return this.listRowPermissionByUserIdQuery;
    }

    public ListRowPermissionByUserIdRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class ListRowPermissionByUserIdRequestListRowPermissionByUserIdQuery extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30008888</p>
         */
        @NameInMap("Operator")
        public String operator;

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

        public static ListRowPermissionByUserIdRequestListRowPermissionByUserIdQuery build(java.util.Map<String, ?> map) throws Exception {
            ListRowPermissionByUserIdRequestListRowPermissionByUserIdQuery self = new ListRowPermissionByUserIdRequestListRowPermissionByUserIdQuery();
            return TeaModel.build(map, self);
        }

        public ListRowPermissionByUserIdRequestListRowPermissionByUserIdQuery setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public ListRowPermissionByUserIdRequestListRowPermissionByUserIdQuery setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListRowPermissionByUserIdRequestListRowPermissionByUserIdQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
