// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetScheduleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2020-01-01T10:15:30+08:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>2020-01-01T10:15:30+08:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TenantContext")
    public GetScheduleRequestTenantContext tenantContext;

    @NameInMap("UserIds")
    public java.util.List<String> userIds;

    public static GetScheduleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScheduleRequest self = new GetScheduleRequest();
        return TeaModel.build(map, self);
    }

    public GetScheduleRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetScheduleRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetScheduleRequest setTenantContext(GetScheduleRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetScheduleRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetScheduleRequest setUserIds(java.util.List<String> userIds) {
        this.userIds = userIds;
        return this;
    }
    public java.util.List<String> getUserIds() {
        return this.userIds;
    }

    public static class GetScheduleRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetScheduleRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetScheduleRequestTenantContext self = new GetScheduleRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetScheduleRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
