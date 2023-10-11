// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GrantHonorShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("expirationTime")
    public Long expirationTime;

    @NameInMap("grantReason")
    public String grantReason;

    @NameInMap("granterName")
    public String granterName;

    @NameInMap("honorId")
    public String honorId;

    @NameInMap("noticeAnnouncer")
    public Boolean noticeAnnouncer;

    @NameInMap("noticeSingle")
    public Boolean noticeSingle;

    @NameInMap("openConversationIds")
    public String openConversationIdsShrink;

    @NameInMap("orgId")
    public Long orgId;

    @NameInMap("receiverUserIds")
    public String receiverUserIdsShrink;

    @NameInMap("senderUserId")
    public String senderUserId;

    public static GrantHonorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantHonorShrinkRequest self = new GrantHonorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GrantHonorShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public GrantHonorShrinkRequest setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    public GrantHonorShrinkRequest setGrantReason(String grantReason) {
        this.grantReason = grantReason;
        return this;
    }
    public String getGrantReason() {
        return this.grantReason;
    }

    public GrantHonorShrinkRequest setGranterName(String granterName) {
        this.granterName = granterName;
        return this;
    }
    public String getGranterName() {
        return this.granterName;
    }

    public GrantHonorShrinkRequest setHonorId(String honorId) {
        this.honorId = honorId;
        return this;
    }
    public String getHonorId() {
        return this.honorId;
    }

    public GrantHonorShrinkRequest setNoticeAnnouncer(Boolean noticeAnnouncer) {
        this.noticeAnnouncer = noticeAnnouncer;
        return this;
    }
    public Boolean getNoticeAnnouncer() {
        return this.noticeAnnouncer;
    }

    public GrantHonorShrinkRequest setNoticeSingle(Boolean noticeSingle) {
        this.noticeSingle = noticeSingle;
        return this;
    }
    public Boolean getNoticeSingle() {
        return this.noticeSingle;
    }

    public GrantHonorShrinkRequest setOpenConversationIdsShrink(String openConversationIdsShrink) {
        this.openConversationIdsShrink = openConversationIdsShrink;
        return this;
    }
    public String getOpenConversationIdsShrink() {
        return this.openConversationIdsShrink;
    }

    public GrantHonorShrinkRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public GrantHonorShrinkRequest setReceiverUserIdsShrink(String receiverUserIdsShrink) {
        this.receiverUserIdsShrink = receiverUserIdsShrink;
        return this;
    }
    public String getReceiverUserIdsShrink() {
        return this.receiverUserIdsShrink;
    }

    public GrantHonorShrinkRequest setSenderUserId(String senderUserId) {
        this.senderUserId = senderUserId;
        return this;
    }
    public String getSenderUserId() {
        return this.senderUserId;
    }

}
