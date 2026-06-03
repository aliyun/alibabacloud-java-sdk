// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class CreateDypnsSmsVerifyMessageQueueRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("QueryQueueTypes")
    public String queryQueueTypes;

    /**
     * <strong>example:</strong>
     * <p>dypnsSmsVerifyMnsReport</p>
     */
    @NameInMap("QueueType")
    public String queueType;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CreateDypnsSmsVerifyMessageQueueRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDypnsSmsVerifyMessageQueueRequest self = new CreateDypnsSmsVerifyMessageQueueRequest();
        return TeaModel.build(map, self);
    }

    public CreateDypnsSmsVerifyMessageQueueRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDypnsSmsVerifyMessageQueueRequest setQueryQueueTypes(String queryQueueTypes) {
        this.queryQueueTypes = queryQueueTypes;
        return this;
    }
    public String getQueryQueueTypes() {
        return this.queryQueueTypes;
    }

    public CreateDypnsSmsVerifyMessageQueueRequest setQueueType(String queueType) {
        this.queueType = queueType;
        return this;
    }
    public String getQueueType() {
        return this.queueType;
    }

    public CreateDypnsSmsVerifyMessageQueueRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public CreateDypnsSmsVerifyMessageQueueRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDypnsSmsVerifyMessageQueueRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
