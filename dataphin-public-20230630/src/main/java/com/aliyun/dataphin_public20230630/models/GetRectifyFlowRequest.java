// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetRectifyFlowRequest extends TeaModel {
    /**
     * <p>The business request parameters.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GetQuery")
    public GetRectifyFlowRequestGetQuery getQuery;

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
     * <p>The operator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpUserId")
    public String opUserId;

    public static GetRectifyFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRectifyFlowRequest self = new GetRectifyFlowRequest();
        return TeaModel.build(map, self);
    }

    public GetRectifyFlowRequest setGetQuery(GetRectifyFlowRequestGetQuery getQuery) {
        this.getQuery = getQuery;
        return this;
    }
    public GetRectifyFlowRequestGetQuery getGetQuery() {
        return this.getQuery;
    }

    public GetRectifyFlowRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetRectifyFlowRequest setOpUserId(String opUserId) {
        this.opUserId = opUserId;
        return this;
    }
    public String getOpUserId() {
        return this.opUserId;
    }

    public static class GetRectifyFlowRequestGetQuery extends TeaModel {
        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>6500387</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of items per page. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>9919509</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The ID of the rectification process.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>442777862946</p>
         */
        @NameInMap("RectifyId")
        public Long rectifyId;

        public static GetRectifyFlowRequestGetQuery build(java.util.Map<String, ?> map) throws Exception {
            GetRectifyFlowRequestGetQuery self = new GetRectifyFlowRequestGetQuery();
            return TeaModel.build(map, self);
        }

        public GetRectifyFlowRequestGetQuery setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public GetRectifyFlowRequestGetQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public GetRectifyFlowRequestGetQuery setRectifyId(Long rectifyId) {
            this.rectifyId = rectifyId;
            return this;
        }
        public Long getRectifyId() {
            return this.rectifyId;
        }

    }

}
