// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PublishDcdnStagingConfigToProductionRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each request.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The name of the feature.</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    public static PublishDcdnStagingConfigToProductionRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishDcdnStagingConfigToProductionRequest self = new PublishDcdnStagingConfigToProductionRequest();
        return TeaModel.build(map, self);
    }

    public PublishDcdnStagingConfigToProductionRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public PublishDcdnStagingConfigToProductionRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

}
