// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainStagingConfigRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>>  The maximum number of times that users can call this operation per second is 30.</p>
     */
    @NameInMap("Functions")
    public String functions;

    public static SetDcdnDomainStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDcdnDomainStagingConfigRequest self = new SetDcdnDomainStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetDcdnDomainStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetDcdnDomainStagingConfigRequest setFunctions(String functions) {
        this.functions = functions;
        return this;
    }
    public String getFunctions() {
        return this.functions;
    }

}
