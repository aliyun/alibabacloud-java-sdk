// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainStagingConfigRequest extends TeaModel {
    // The accelerated domain name. You can specify only one domain name in each call.
    @NameInMap("DomainName")
    public String domainName;

    // The list of feature names. Separate multiple values with commas (,). For more information, see [A list of features](~~388460~~).
    @NameInMap("FunctionNames")
    public String functionNames;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeCdnDomainStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainStagingConfigRequest self = new DescribeCdnDomainStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeCdnDomainStagingConfigRequest setFunctionNames(String functionNames) {
        this.functionNames = functionNames;
        return this;
    }
    public String getFunctionNames() {
        return this.functionNames;
    }

    public DescribeCdnDomainStagingConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
