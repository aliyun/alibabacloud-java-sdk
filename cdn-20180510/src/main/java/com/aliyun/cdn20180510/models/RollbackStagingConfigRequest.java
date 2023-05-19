// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class RollbackStagingConfigRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    public static RollbackStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        RollbackStagingConfigRequest self = new RollbackStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public RollbackStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

}
