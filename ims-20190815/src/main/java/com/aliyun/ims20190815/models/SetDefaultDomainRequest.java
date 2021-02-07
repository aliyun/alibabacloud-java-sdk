// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class SetDefaultDomainRequest extends TeaModel {
    @NameInMap("DefaultDomainName")
    public String defaultDomainName;

    @NameInMap("AkProxySuffix")
    public String akProxySuffix;

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

    public SetDefaultDomainRequest setAkProxySuffix(String akProxySuffix) {
        this.akProxySuffix = akProxySuffix;
        return this;
    }
    public String getAkProxySuffix() {
        return this.akProxySuffix;
    }

}
