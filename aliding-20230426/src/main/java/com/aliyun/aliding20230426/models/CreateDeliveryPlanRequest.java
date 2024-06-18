// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateDeliveryPlanRequest extends TeaModel {
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <strong>example:</strong>
     * <p>1699265024987</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>1028</p>
     */
    @NameInMap("ResId")
    public String resId;

    /**
     * <strong>example:</strong>
     * <p>1699265024987</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public CreateDeliveryPlanRequestTenantContext tenantContext;

    @NameInMap("UserIdList")
    public java.util.List<String> userIdList;

    public static CreateDeliveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeliveryPlanRequest self = new CreateDeliveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeliveryPlanRequest setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public CreateDeliveryPlanRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public CreateDeliveryPlanRequest setResId(String resId) {
        this.resId = resId;
        return this;
    }
    public String getResId() {
        return this.resId;
    }

    public CreateDeliveryPlanRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public CreateDeliveryPlanRequest setTenantContext(CreateDeliveryPlanRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CreateDeliveryPlanRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public CreateDeliveryPlanRequest setUserIdList(java.util.List<String> userIdList) {
        this.userIdList = userIdList;
        return this;
    }
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

    public static class CreateDeliveryPlanRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CreateDeliveryPlanRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CreateDeliveryPlanRequestTenantContext self = new CreateDeliveryPlanRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CreateDeliveryPlanRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
