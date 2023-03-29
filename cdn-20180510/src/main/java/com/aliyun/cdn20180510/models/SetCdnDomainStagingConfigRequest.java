// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainStagingConfigRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The features that you want to configure. Format:</p>
     * <br>
     * <p>> - **functionName**: The name of the feature. Separate multiple values with commas (,).</p>
     * <p>> - **argName**: The feature parameters for **functionName**.</p>
     * <p>> - **argValue**: The parameter values set for **functionName**.</p>
     * <br>
     * <p>```</p>
     * <p>        [</p>
     * <p>         {</p>
     * <p>           "functionArgs": [</p>
     * <p>            {</p>
     * <p>             "argName": "Parameter A", </p>
     * <p>             "argValue": "Parameter value"</p>
     * <p>            }, </p>
     * <p>          {</p>
     * <p>            "argName": "Parameter B", </p>
     * <p>            "argValue": "Parameter value"</p>
     * <p>             }</p>
     * <p>         ], </p>
     * <p>         "functionName": "Feature name"</p>
     * <p>            }</p>
     * <p>        ]</p>
     * <p> ```</p>
     */
    @NameInMap("Functions")
    public String functions;

    public static SetCdnDomainStagingConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        SetCdnDomainStagingConfigRequest self = new SetCdnDomainStagingConfigRequest();
        return TeaModel.build(map, self);
    }

    public SetCdnDomainStagingConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public SetCdnDomainStagingConfigRequest setFunctions(String functions) {
        this.functions = functions;
        return this;
    }
    public String getFunctions() {
        return this.functions;
    }

}
