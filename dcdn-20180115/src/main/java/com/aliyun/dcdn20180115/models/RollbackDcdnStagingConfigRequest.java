// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RollbackDcdnStagingConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("FunctionName")
    public String functionName;

    public static RollbackDcdnStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackDcdnStagingConfigRequest self = new RollbackDcdnStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public RollbackDcdnStagingConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RollbackDcdnStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public RollbackDcdnStagingConfigRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

}
