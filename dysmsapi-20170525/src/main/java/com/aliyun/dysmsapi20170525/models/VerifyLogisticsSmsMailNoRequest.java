// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class VerifyLogisticsSmsMailNoRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("ExpressCompanyCode")
    public String expressCompanyCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("MailNo")
    public String mailNo;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("PlatformCompanyCode")
    public String platformCompanyCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static VerifyLogisticsSmsMailNoRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyLogisticsSmsMailNoRequest self = new VerifyLogisticsSmsMailNoRequest();
        return TeaModel.build(map, self);
    }

    public VerifyLogisticsSmsMailNoRequest setExpressCompanyCode(String expressCompanyCode) {
        this.expressCompanyCode = expressCompanyCode;
        return this;
    }
    public String getExpressCompanyCode() {
        return this.expressCompanyCode;
    }

    public VerifyLogisticsSmsMailNoRequest setMailNo(String mailNo) {
        this.mailNo = mailNo;
        return this;
    }
    public String getMailNo() {
        return this.mailNo;
    }

    public VerifyLogisticsSmsMailNoRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public VerifyLogisticsSmsMailNoRequest setPlatformCompanyCode(String platformCompanyCode) {
        this.platformCompanyCode = platformCompanyCode;
        return this;
    }
    public String getPlatformCompanyCode() {
        return this.platformCompanyCode;
    }

    public VerifyLogisticsSmsMailNoRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public VerifyLogisticsSmsMailNoRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
