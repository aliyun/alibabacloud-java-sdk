// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateDomainRequest extends TeaModel {
    /**
     * <p>Domain name, length 1-50, can include numbers, uppercase letters, lowercase letters, ., and -.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sub.example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The selector field in the DKIM protocol, used to identify a specific public key. It is recommended to leave it blank, as the system will automatically generate it based on cluster information. If the user specifies it manually, for example, if the sending domain is &quot;sub.example.com&quot; and dkimSelector is set to &quot;default&quot;, then the host record will be &quot;default._domainkey.sub&quot;
     * Constraints: </p>
     * <ol>
     * <li>The length must not exceed 60 characters. </li>
     * <li>It must consist of visible characters only. </li>
     * <li>It cannot start with a hyphen (-). </li>
     * <li>It cannot end with a hyphen (-). </li>
     * <li>It cannot contain any of the following characters: _ :;/!*~.@#$%^&amp;()+=[{]}|?&lt;&gt;,\&quot;&quot;</li>
     * </ol>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("dkimSelector")
    public String dkimSelector;

    public static CreateDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainRequest self = new CreateDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateDomainRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateDomainRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateDomainRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateDomainRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateDomainRequest setDkimSelector(String dkimSelector) {
        this.dkimSelector = dkimSelector;
        return this;
    }
    public String getDkimSelector() {
        return this.dkimSelector;
    }

}
