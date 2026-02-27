// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetRowPermissionByTableGuidsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GetRowPermissionByTableGuidsQuery")
    public GetRowPermissionByTableGuidsRequestGetRowPermissionByTableGuidsQuery getRowPermissionByTableGuidsQuery;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetRowPermissionByTableGuidsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRowPermissionByTableGuidsRequest self = new GetRowPermissionByTableGuidsRequest();
        return TeaModel.build(map, self);
    }

    public GetRowPermissionByTableGuidsRequest setGetRowPermissionByTableGuidsQuery(GetRowPermissionByTableGuidsRequestGetRowPermissionByTableGuidsQuery getRowPermissionByTableGuidsQuery) {
        this.getRowPermissionByTableGuidsQuery = getRowPermissionByTableGuidsQuery;
        return this;
    }
    public GetRowPermissionByTableGuidsRequestGetRowPermissionByTableGuidsQuery getGetRowPermissionByTableGuidsQuery() {
        return this.getRowPermissionByTableGuidsQuery;
    }

    public GetRowPermissionByTableGuidsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static class GetRowPermissionByTableGuidsRequestGetRowPermissionByTableGuidsQuery extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("TableGuids")
        public java.util.List<String> tableGuids;

        public static GetRowPermissionByTableGuidsRequestGetRowPermissionByTableGuidsQuery build(java.util.Map<String, ?> map) throws Exception {
            GetRowPermissionByTableGuidsRequestGetRowPermissionByTableGuidsQuery self = new GetRowPermissionByTableGuidsRequestGetRowPermissionByTableGuidsQuery();
            return TeaModel.build(map, self);
        }

        public GetRowPermissionByTableGuidsRequestGetRowPermissionByTableGuidsQuery setTableGuids(java.util.List<String> tableGuids) {
            this.tableGuids = tableGuids;
            return this;
        }
        public java.util.List<String> getTableGuids() {
            return this.tableGuids;
        }

    }

}
