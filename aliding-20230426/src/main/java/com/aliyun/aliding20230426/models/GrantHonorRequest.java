// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GrantHonorRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GrantHonorRequestTenantContext tenantContext;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("expirationTime")
    public Long expirationTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("grantReason")
    public String grantReason;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("granterName")
    public String granterName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21659398</p>
     */
    @NameInMap("honorId")
    public String honorId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("noticeAnnouncer")
    public Boolean noticeAnnouncer;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("noticeSingle")
    public Boolean noticeSingle;

    @NameInMap("openConversationIds")
    public java.util.List<String> openConversationIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>345391052</p>
     */
    @NameInMap("orgId")
    public Long orgId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("receiverUserIds")
    public java.util.List<String> receiverUserIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>363784</p>
     */
    @NameInMap("senderUserId")
    public String senderUserId;

    public static GrantHonorRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantHonorRequest self = new GrantHonorRequest();
        return TeaModel.build(map, self);
    }

    public GrantHonorRequest setTenantContext(GrantHonorRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GrantHonorRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GrantHonorRequest setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public GrantHonorRequest setGrantReason(String grantReason) {
        this.grantReason = grantReason;
        return this;
    }
    public String getGrantReason() {
        return this.grantReason;
    }

    public GrantHonorRequest setGranterName(String granterName) {
        this.granterName = granterName;
        return this;
    }
    public String getGranterName() {
        return this.granterName;
    }

    public GrantHonorRequest setHonorId(String honorId) {
        this.honorId = honorId;
        return this;
    }
    public String getHonorId() {
        return this.honorId;
    }

    public GrantHonorRequest setNoticeAnnouncer(Boolean noticeAnnouncer) {
        this.noticeAnnouncer = noticeAnnouncer;
        return this;
    }
    public Boolean getNoticeAnnouncer() {
        return this.noticeAnnouncer;
    }

    public GrantHonorRequest setNoticeSingle(Boolean noticeSingle) {
        this.noticeSingle = noticeSingle;
        return this;
    }
    public Boolean getNoticeSingle() {
        return this.noticeSingle;
    }

    public GrantHonorRequest setOpenConversationIds(java.util.List<String> openConversationIds) {
        this.openConversationIds = openConversationIds;
        return this;
    }
    public java.util.List<String> getOpenConversationIds() {
        return this.openConversationIds;
    }

    public GrantHonorRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public GrantHonorRequest setReceiverUserIds(java.util.List<String> receiverUserIds) {
        this.receiverUserIds = receiverUserIds;
        return this;
    }
    public java.util.List<String> getReceiverUserIds() {
        return this.receiverUserIds;
    }

    public GrantHonorRequest setSenderUserId(String senderUserId) {
        this.senderUserId = senderUserId;
        return this;
    }
    public String getSenderUserId() {
        return this.senderUserId;
    }

    public static class GrantHonorRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GrantHonorRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GrantHonorRequestTenantContext self = new GrantHonorRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GrantHonorRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
