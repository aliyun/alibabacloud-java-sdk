// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainStagingConfigRequest extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The names of the features to query. You can separate multiple features with commas (,).</p>
     */
    @NameInMap("FunctionNames")
    public String functionNames;

    public static DescribeDcdnDomainStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainStagingConfigRequest self = new DescribeDcdnDomainStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnDomainStagingConfigRequest setFunctionNames(String functionNames) {
        this.functionNames = functionNames;
        return this;
    }
    public String getFunctionNames() {
        return this.functionNames;
    }

}
