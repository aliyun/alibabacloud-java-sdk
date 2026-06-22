// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class QueryChatappPhoneNumbersRequest extends TeaModel {
    /**
     * <p>The Space ID of the ISV sub-customer.</p>
     * 
     * <strong>example:</strong>
     * <p>29348393884****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The verification code of the Independent Software Vendor (ISV). This code is used to verify if the user is authorized by the ISV.</p>
     * 
     * <strong>example:</strong>
     * <p>aksik93kdkkxmwol9****</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The status of the phone number.</p>
     * 
     * <strong>example:</strong>
     * <p>VERIFIED</p>
     */
    @NameInMap("Status")
    public String status;

    public static QueryChatappPhoneNumbersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryChatappPhoneNumbersRequest self = new QueryChatappPhoneNumbersRequest();
        return TeaModel.build(map, self);
    }

    public QueryChatappPhoneNumbersRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public QueryChatappPhoneNumbersRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public QueryChatappPhoneNumbersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QueryChatappPhoneNumbersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QueryChatappPhoneNumbersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QueryChatappPhoneNumbersRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
