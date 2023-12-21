// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SendPopupRequest extends TeaModel {
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public SendPopupRequestTenantContext tenantContext;

    public static SendPopupRequest build(java.util.Map<String, ?> map) throws Exception {
        SendPopupRequest self = new SendPopupRequest();
        return TeaModel.build(map, self);
    }

    public SendPopupRequest setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public SendPopupRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SendPopupRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SendPopupRequest setTenantContext(SendPopupRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public SendPopupRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class SendPopupRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static SendPopupRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            SendPopupRequestTenantContext self = new SendPopupRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public SendPopupRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
