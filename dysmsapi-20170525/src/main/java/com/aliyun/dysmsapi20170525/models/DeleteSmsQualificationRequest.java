// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSmsQualificationRequest extends TeaModel {
    /**
     * <p>The review ticket ID. You can obtain the qualification and its corresponding review ticket ID under the current account by calling the <a href="~~QuerySmsQualificationRecord~~">QuerySmsQualificationRecord</a> operation, or on the <a href="https://dysms.console.aliyun.com/domestic/text/qualification">Qualification Management</a> page of Domestic Messages in the console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2001****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The qualification ID, which is the ID returned when you <a href="~~SubmitSmsQualification~~">apply for a qualification</a>. You can obtain the qualification ID under the current account by calling the <a href="~~QuerySmsQualificationRecord~~">QuerySmsQualificationRecord</a> operation, or on the <a href="https://dysms.console.aliyun.com/domestic/text/qualification">Qualification Management</a> page of Domestic Messages in the console.</p>
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

    public static DeleteSmsQualificationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSmsQualificationRequest self = new DeleteSmsQualificationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSmsQualificationRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public DeleteSmsQualificationRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteSmsQualificationRequest setQualificationGroupId(Long qualificationGroupId) {
        this.qualificationGroupId = qualificationGroupId;
        return this;
    }
    public Long getQualificationGroupId() {
        return this.qualificationGroupId;
    }

    public DeleteSmsQualificationRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteSmsQualificationRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
