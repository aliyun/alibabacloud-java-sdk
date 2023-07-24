// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainStagingConfigRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. Separate multiple accelerated domain names with commas (,).</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The list of features. Format: `[{"functionArgs":[{"argName":"parameter key","argValue":"parameter value"},{"argName":"xx","argValue":"xx"}],"functionName": feature name"}]`</p>
     * <br>
     * <p>> Separate multiple parameters with commas (,).</p>
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
