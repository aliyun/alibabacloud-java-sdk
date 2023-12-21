// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SendSearchShadeRequest extends TeaModel {
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public SendSearchShadeRequestTenantContext tenantContext;

    public static SendSearchShadeRequest build(java.util.Map<String, ?> map) throws Exception {
        SendSearchShadeRequest self = new SendSearchShadeRequest();
        return TeaModel.build(map, self);
    }

    public SendSearchShadeRequest setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public SendSearchShadeRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SendSearchShadeRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SendSearchShadeRequest setTenantContext(SendSearchShadeRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public SendSearchShadeRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class SendSearchShadeRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static SendSearchShadeRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            SendSearchShadeRequestTenantContext self = new SendSearchShadeRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public SendSearchShadeRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
