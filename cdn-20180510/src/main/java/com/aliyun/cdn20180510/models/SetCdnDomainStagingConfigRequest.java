// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainStagingConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Functions")
    public String functions;

    public static SetCdnDomainStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainStagingConfigRequest self = new SetCdnDomainStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetCdnDomainStagingConfigRequest setFunctions(String functions) {
        this.functions = functions;
        return this;
    }
    public String getFunctions() {
        return this.functions;
    }

}
