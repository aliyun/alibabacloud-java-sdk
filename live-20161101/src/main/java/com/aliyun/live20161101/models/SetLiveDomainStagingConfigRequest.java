// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetLiveDomainStagingConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("Functions")
    public String functions;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static SetLiveDomainStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLiveDomainStagingConfigRequest self = new SetLiveDomainStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetLiveDomainStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetLiveDomainStagingConfigRequest setFunctions(String functions) {
        this.functions = functions;
        return this;
    }
    public String getFunctions() {
        return this.functions;
    }

    public SetLiveDomainStagingConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
