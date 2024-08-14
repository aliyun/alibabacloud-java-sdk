// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ScheduleKeyDeletionRequest extends TeaModel {
    /**
     * <p>The ID of the customer master key (CMK). The ID must be globally unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7906979c-8e06-46a2-be2d-68e3ccbc****</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The scheduled period after which the CMK is deleted. During this period, the CMK is in the PendingDeletion state. After this period ends, you cannot cancel the key deletion task.</p>
     * <p>Valid values: 7 to 366.</p>
     * <p>Unit: days.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("PendingWindowInDays")
    public Integer pendingWindowInDays;

    public static ScheduleKeyDeletionRequest build(java.util.Map<String, ?> map) throws Exception {
        ScheduleKeyDeletionRequest self = new ScheduleKeyDeletionRequest();
        return TeaModel.build(map, self);
    }

    public ScheduleKeyDeletionRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public ScheduleKeyDeletionRequest setPendingWindowInDays(Integer pendingWindowInDays) {
        this.pendingWindowInDays = pendingWindowInDays;
        return this;
    }
    public Integer getPendingWindowInDays() {
        return this.pendingWindowInDays;
    }

}
