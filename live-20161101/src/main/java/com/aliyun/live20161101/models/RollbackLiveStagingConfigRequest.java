// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class RollbackLiveStagingConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static RollbackLiveStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackLiveStagingConfigRequest self = new RollbackLiveStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public RollbackLiveStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RollbackLiveStagingConfigRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public RollbackLiveStagingConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
