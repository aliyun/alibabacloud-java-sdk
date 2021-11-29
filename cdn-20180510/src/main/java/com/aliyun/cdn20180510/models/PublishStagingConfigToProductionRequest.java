// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PublishStagingConfigToProductionRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static PublishStagingConfigToProductionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishStagingConfigToProductionRequest self = new PublishStagingConfigToProductionRequest();
        return TeaModel.build(map, self);
    }

    public PublishStagingConfigToProductionRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public PublishStagingConfigToProductionRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public PublishStagingConfigToProductionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
