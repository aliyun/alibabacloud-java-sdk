// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListRectifyFlowRequest extends TeaModel {
    /**
     * <p>The business request parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListQuery")
    public ListRectifyFlowRequestListQuery listQuery;

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

    public static ListRectifyFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRectifyFlowRequest self = new ListRectifyFlowRequest();
        return TeaModel.build(map, self);
    }

    public ListRectifyFlowRequest setListQuery(ListRectifyFlowRequestListQuery listQuery) {
        this.listQuery = listQuery;
        return this;
    }
    public ListRectifyFlowRequestListQuery getListQuery() {
        return this.listQuery;
    }

    public ListRectifyFlowRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public ListRectifyFlowRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class ListRectifyFlowRequestListQuery extends TeaModel {
        /**
         * <p>The governance object type. Valid values: TABLE, DATASOURCE_TABLE, DATASOURCE, INDEX, REALTIME_LOGICAL_TABLE, and QD_FEATURE.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TABLE</p>
         */
        @NameInMap("GovernItemType")
        public String governItemType;

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>7381905</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>8322096</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The priority filters. Valid values: HIGH, MIDDLE, and LOW.</p>
         */
        @NameInMap("PriorityFilters")
        public java.util.List<String> priorityFilters;

        /**
         * <p>The list of rectifier IDs.</p>
         */
        @NameInMap("RectifyUserFilters")
        public java.util.List<String> rectifyUserFilters;

        /**
         * <p>SUBMIT_RECTIFY, SUBMIT_VERIFY, FINISH_VERIFY, and REJECT_VERIFY.</p>
         */
        @NameInMap("StatusFilters")
        public java.util.List<String> statusFilters;

        /**
         * <p>The list of verifier IDs.</p>
         */
        @NameInMap("VerifyUserFilters")
        public java.util.List<String> verifyUserFilters;

        public static ListRectifyFlowRequestListQuery build(java.util.Map<String, ?> map) throws Exception {
            ListRectifyFlowRequestListQuery self = new ListRectifyFlowRequestListQuery();
            return TeaModel.build(map, self);
        }

        public ListRectifyFlowRequestListQuery setGovernItemType(String governItemType) {
            this.governItemType = governItemType;
            return this;
        }
        public String getGovernItemType() {
            return this.governItemType;
        }

        public ListRectifyFlowRequestListQuery setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRectifyFlowRequestListQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRectifyFlowRequestListQuery setPriorityFilters(java.util.List<String> priorityFilters) {
            this.priorityFilters = priorityFilters;
            return this;
        }
        public java.util.List<String> getPriorityFilters() {
            return this.priorityFilters;
        }

        public ListRectifyFlowRequestListQuery setRectifyUserFilters(java.util.List<String> rectifyUserFilters) {
            this.rectifyUserFilters = rectifyUserFilters;
            return this;
        }
        public java.util.List<String> getRectifyUserFilters() {
            return this.rectifyUserFilters;
        }

        public ListRectifyFlowRequestListQuery setStatusFilters(java.util.List<String> statusFilters) {
            this.statusFilters = statusFilters;
            return this;
        }
        public java.util.List<String> getStatusFilters() {
            return this.statusFilters;
        }

        public ListRectifyFlowRequestListQuery setVerifyUserFilters(java.util.List<String> verifyUserFilters) {
            this.verifyUserFilters = verifyUserFilters;
            return this;
        }
        public java.util.List<String> getVerifyUserFilters() {
            return this.verifyUserFilters;
        }

    }

}
