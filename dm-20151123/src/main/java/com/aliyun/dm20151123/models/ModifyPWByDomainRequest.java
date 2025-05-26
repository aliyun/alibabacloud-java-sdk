// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ModifyPWByDomainRequest extends TeaModel {
    /**
     * <p>Domain name, length 1-50, can include numbers, uppercase letters, lowercase letters, ., and -.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <ul>
     * <li><p>Length should be between 10 to 20 characters, and must contain numbers, uppercase letters, and lowercase letters.</p>
     * </li>
     * <li><p>At least 2 digits, 2 uppercase letters, and 2 lowercase letters are required, and neither digits nor letters can consist of a single character repeated.</p>
     * </li>
     * <li><p>Cannot be the same as the last set password.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DM1mail1234</p>
     */
    @NameInMap("Password")
    public String password;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyPWByDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPWByDomainRequest self = new ModifyPWByDomainRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPWByDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public ModifyPWByDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyPWByDomainRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyPWByDomainRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyPWByDomainRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
