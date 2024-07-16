// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20170622.models;

import com.aliyun.tea.*;

public class ModifyPWByDomainRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Password")
    public String password;

    @NameInMap("ResourceOwnerId")
    public String resourceOwnerId;

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

    public ModifyPWByDomainRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyPWByDomainRequest setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
