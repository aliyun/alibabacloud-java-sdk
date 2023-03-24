// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetDefaultDomainRequest extends TeaModel {
    /**
     * <p>The default domain name.</p>
     * <br>
     * <p>The name is in the format of `<AccountAlias>.onaliyun.com`. `<AccountAlias>` indicates the account alias. By default, the value of AccountAlias is the ID of the Alibaba Cloud account. The default domain name must end with `.onaliyun.com`.</p>
     * <br>
     * <p>The default domain name can contain up to 64 characters in length. The name can contain letters, digits, periods (.), underscores (\_), and hyphens (-).</p>
     * <br>
     * <p>>  The default domain name cannot start or end with a hyphen (-) and cannot have two consecutive hyphens (-).</p>
     */
    @NameInMap("DefaultDomainName")
    public String defaultDomainName;

    public static SetDefaultDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultDomainRequest self = new SetDefaultDomainRequest();
        return TeaModel.build(map, self);
    }

    public SetDefaultDomainRequest setDefaultDomainName(String defaultDomainName) {
        this.defaultDomainName = defaultDomainName;
        return this;
    }
    public String getDefaultDomainName() {
        return this.defaultDomainName;
    }

}
