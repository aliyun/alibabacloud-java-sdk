// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SendBannerRequest extends TeaModel {
    @NameInMap("Content")
    public java.util.Map<String, ?> content;

    /**
     * <strong>example:</strong>
     * <p>1693881641000L</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>1693881641000L</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("TenantContext")
    public SendBannerRequestTenantContext tenantContext;

    public static SendBannerRequest build(java.util.Map<String, ?> map) throws Exception {
        SendBannerRequest self = new SendBannerRequest();
        return TeaModel.build(map, self);
    }

    public SendBannerRequest setContent(java.util.Map<String, ?> content) {
        this.content = content;
        return this;
    }
    public java.util.Map<String, ?> getContent() {
        return this.content;
    }

    public SendBannerRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SendBannerRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SendBannerRequest setTenantContext(SendBannerRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public SendBannerRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class SendBannerRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static SendBannerRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            SendBannerRequestTenantContext self = new SendBannerRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public SendBannerRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
