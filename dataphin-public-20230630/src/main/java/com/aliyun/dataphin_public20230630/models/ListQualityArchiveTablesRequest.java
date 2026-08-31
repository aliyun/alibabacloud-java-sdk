// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListQualityArchiveTablesRequest extends TeaModel {
    /**
     * <p>The input parameters for querying the anomaly archived table list.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListQualityArchiveTablesRequestListQuery listQuery;

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
     * <p>The ID of the operator user.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static ListQualityArchiveTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQualityArchiveTablesRequest self = new ListQualityArchiveTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListQualityArchiveTablesRequest setListQuery(ListQualityArchiveTablesRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListQualityArchiveTablesRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListQualityArchiveTablesRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListQualityArchiveTablesRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListQualityArchiveTablesRequestListQuery extends TeaModel {
        /**
         * <p>The ID of the monitored object.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("WatchId")
        public Long watchId;

        public static ListQualityArchiveTablesRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListQualityArchiveTablesRequestListQuery self = new ListQualityArchiveTablesRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListQualityArchiveTablesRequestListQuery setWatchId(Long watchId) {
            this.watchId = watchId;
            return this;
        }
        public Long getWatchId() {
            return this.watchId;
        }

    }

}
