// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BindDmAccountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("AccountCode")
    public String accountCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExtendAttr")
    public BindDmAccountRequestExtendAttr extendAttr;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static BindDmAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDmAccountRequest self = new BindDmAccountRequest();
        return TeaModel.build(map, self);
    }

    public BindDmAccountRequest setAccountCode(String accountCode) {
        this.accountCode = accountCode;
        return this;
    }
    public String getAccountCode() {
        return this.accountCode;
    }

    public BindDmAccountRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public BindDmAccountRequest setExtendAttr(BindDmAccountRequestExtendAttr extendAttr) {
        this.extendAttr = extendAttr;
        return this;
    }
    public BindDmAccountRequestExtendAttr getExtendAttr() {
        return this.extendAttr;
    }

    public BindDmAccountRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BindDmAccountRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public BindDmAccountRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class BindDmAccountRequestExtendAttr extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("SendType")
        public String sendType;

        public static BindDmAccountRequestExtendAttr build(java.util.Map<String, ?> map) throws Exception {
            BindDmAccountRequestExtendAttr self = new BindDmAccountRequestExtendAttr();
            return TeaModel.build(map, self);
        }

        public BindDmAccountRequestExtendAttr setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public BindDmAccountRequestExtendAttr setSendType(String sendType) {
            this.sendType = sendType;
            return this;
        }
        public String getSendType() {
            return this.sendType;
        }

    }

}
