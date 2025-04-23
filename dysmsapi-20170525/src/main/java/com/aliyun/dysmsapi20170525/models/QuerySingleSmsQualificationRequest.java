// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySingleSmsQualificationRequest extends TeaModel {
    /**
     * <p>工单id</p>
     * 
     * <strong>example:</strong>
     * <p>2001****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>资质id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10000****</p>
     */
    @NameInMap("QualificationGroupId")
    public Long qualificationGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static QuerySingleSmsQualificationRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySingleSmsQualificationRequest self = new QuerySingleSmsQualificationRequest();
        return TeaModel.build(map, self);
    }

    public QuerySingleSmsQualificationRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public QuerySingleSmsQualificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySingleSmsQualificationRequest setQualificationGroupId(Long qualificationGroupId) {
        this.qualificationGroupId = qualificationGroupId;
        return this;
    }
    public Long getQualificationGroupId() {
        return this.qualificationGroupId;
    }

    public QuerySingleSmsQualificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySingleSmsQualificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
