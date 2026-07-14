// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class PauseMarketingFLowRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>439859845**234</p>
     */
    @NameInMap("ActivityCode")
    public String activityCode;

    /**
     * <strong>example:</strong>
     * <p>N/A</p>
     */
    @NameInMap("ActivityId")
    public String activityId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static PauseMarketingFLowRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseMarketingFLowRequest self = new PauseMarketingFLowRequest();
        return TeaModel.build(map, self);
    }

    public PauseMarketingFLowRequest setActivityCode(String activityCode) {
        this.activityCode = activityCode;
        return this;
    }
    public String getActivityCode() {
        return this.activityCode;
    }

    public PauseMarketingFLowRequest setActivityId(String activityId) {
        this.activityId = activityId;
        return this;
    }
    public String getActivityId() {
        return this.activityId;
    }

    public PauseMarketingFLowRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public PauseMarketingFLowRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public PauseMarketingFLowRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
