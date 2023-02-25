// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RollbackDcdnStagingConfigRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name in each call.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static RollbackDcdnStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackDcdnStagingConfigRequest self = new RollbackDcdnStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public RollbackDcdnStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
