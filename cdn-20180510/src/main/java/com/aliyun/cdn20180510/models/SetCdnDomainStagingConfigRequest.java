// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainStagingConfigRequest extends TeaModel {
    // The accelerated domain name. You can specify only one domain name.
    @NameInMap("DomainName")
    public String domainName;

    // The features that you want to configure. Format:
    // 
    // > - **functionName**: The name of the feature. Separate multiple values with commas (,).
    // > - **argName**: The feature parameters for **functionName**.
    // > - **argValue**: The parameter values set for **functionName**.
    // 
    // ```
    //         [
    //          {
    //            "functionArgs": [
    //             {
    //              "argName": "Parameter A", 
    //              "argValue": "Parameter value"
    //             }, 
    //           {
    //             "argName": "Parameter B", 
    //             "argValue": "Parameter value"
    //              }
    //          ], 
    //          "functionName": "Feature name"
    //             }
    //         ]
    //  ```
    @NameInMap("Functions")
    public String functions;

    @NameInMap("OwnerId")
    public Long ownerId;

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

    public SetCdnDomainStagingConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
