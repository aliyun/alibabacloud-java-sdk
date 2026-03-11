// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class Receiver extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>comment</p>
     */
    @NameInMap("comment")
    public String comment;

    /**
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("createdAt")
    public Long createdAt;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("createdBy")
    public String createdBy;

    /**
     * <strong>example:</strong>
     * <p>receiver_name</p>
     */
    @NameInMap("receiverName")
    public String receiverName;

    /**
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("receiverTenantId")
    public Long receiverTenantId;

    /**
     * <strong>example:</strong>
     * <p>1744970111419</p>
     */
    @NameInMap("updatedAt")
    public Long updatedAt;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::[accountId]:root</p>
     */
    @NameInMap("updatedBy")
    public String updatedBy;

    public static Receiver build(java.util.Map<String, ?> map) throws Exception {
        Receiver self = new Receiver();
        return TeaModel.build(map, self);
    }

    public Receiver setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public Receiver setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public Long getCreatedAt() {
        return this.createdAt;
    }

    public Receiver setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    public String getCreatedBy() {
        return this.createdBy;
    }

    public Receiver setReceiverName(String receiverName) {
        this.receiverName = receiverName;
        return this;
    }
    public String getReceiverName() {
        return this.receiverName;
    }

    public Receiver setReceiverTenantId(Long receiverTenantId) {
        this.receiverTenantId = receiverTenantId;
        return this;
    }
    public Long getReceiverTenantId() {
        return this.receiverTenantId;
    }

    public Receiver setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    public Receiver setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }
    public String getUpdatedBy() {
        return this.updatedBy;
    }

}
