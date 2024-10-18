// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetGroupLiveListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1398324600000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cidt*****Xa4K10w==</p>
     */
    @NameInMap("OpenConversationId")
    public String openConversationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1398324600000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public GetGroupLiveListRequestTenantContext tenantContext;

    public static GetGroupLiveListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupLiveListRequest self = new GetGroupLiveListRequest();
        return TeaModel.build(map, self);
    }

    public GetGroupLiveListRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetGroupLiveListRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public GetGroupLiveListRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetGroupLiveListRequest setTenantContext(GetGroupLiveListRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetGroupLiveListRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetGroupLiveListRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetGroupLiveListRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetGroupLiveListRequestTenantContext self = new GetGroupLiveListRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetGroupLiveListRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
