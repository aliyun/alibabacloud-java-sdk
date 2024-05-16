// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class PublishStagingConfigToProductionRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each call.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

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

}
