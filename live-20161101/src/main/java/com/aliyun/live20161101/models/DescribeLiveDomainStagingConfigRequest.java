// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainStagingConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("FunctionNames")
    public String functionNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeLiveDomainStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainStagingConfigRequest self = new DescribeLiveDomainStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainStagingConfigRequest setFunctionNames(String functionNames) {
        this.functionNames = functionNames;
        return this;
    }
    public String getFunctionNames() {
        return this.functionNames;
    }

    public DescribeLiveDomainStagingConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
