// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class RollbackDcdnStagingConfigRequest extends TeaModel {
    /**
     * <p>>  You can call this operation up to 30 times per second per account.</p>
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
