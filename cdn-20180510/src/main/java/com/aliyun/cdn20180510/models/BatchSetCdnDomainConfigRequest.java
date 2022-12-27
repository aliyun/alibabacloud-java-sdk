// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetCdnDomainConfigRequest extends TeaModel {
    // The accelerated domain name. Separate multiple accelerated domain names with commas (,).
    @NameInMap("DomainNames")
    public String domainNames;

    // The features that you want to configure. Format:
    // 
    // *   **functionName**: the name of the feature. This parameter is required. Separate multiple values with commas (,). For more information, see [A list of features](~~388460~~).
    // *   **argName**: the feature parameter for **functionName**. This parameter is required. You can specify multiple feature parameters.
    // *   **argValue**: the parameter value that is specified for **functionName**. This parameter is required.
    // *   **parentid**: the rule condition ID. This parameter is optional. You can use the **condition** rule engine to create a rule condition. For information, see [BatchSetCdnDomainConfig and SetCdnDomainStagingConfig](~~388460~~). A rule condition can identify parameters that are included in requests and filter requests based on the identified parameters. After you create a rule condition, a [configid](~~388994~~) is generated. configid can be used as parentId that is referenced by other features. This way, you can combine rule conditions and features for flexible configurations.
    // 
    // If you set **parentId** to **-1**, the existing rule conditions in the configurations are deleted.
    // 
    //     [{
    //        "functionArgs": [{
    //          "argName": "Parameter A", 
    //          "argValue": Value of parameter A"
    //         }, 
    //       {
    //         "argName": "Parameter B", 
    //         "argValue": "Value of parameter B"
    //          }], 
    //      "functionName": "Feature name"
    //      "parentId": "Optional, which corresponds to configid of the referenced rule condition"
    //     }]
    // 
    // The following code shows a sample configuration if **parentId** is not used.
    // 
    // In this example, the **origin_request_header** feature is used to add back-to-origin HTTP headers, and the rule condition whose configuration ID is **222728944812032** is referenced.
    // 
    //     [{
    //             "functionArgs": [{
    //                 "argName": "header_operation_type",
    //                 "argValue": "add"
    //             }, {
    //                 "argName": "header_name",
    //                 "argValue": "Accept-Encoding"
    //             }, {
    //                 "argName": "header_value",
    //                 "argValue": "gzip"
    //             }, {
    //                 "argName": "duplicate",
    //                 "argValue": "off"
    //             }],
    //             "functionName": "origin_request_header"
    //     }]
    // 
    // The following code shows a sample configuration if **parentId** is used.
    // 
    // In this example, the **origin_request_header** feature is used to add back-to-origin HTTP headers, and the rule condition whose configuration ID is **222728944812032** is referenced.
    // 
    //     [{
    //             "functionArgs": [{
    //                 "argName": "header_operation_type",
    //                 "argValue": "add"
    //             }, {
    //                 "argName": "header_name",
    //                 "argValue": "Accept-Encoding"
    //             }, {
    //                 "argName": "header_value",
    //                 "argValue": "gzip"
    //             }, {
    //                 "argName": "duplicate",
    //                 "argValue": "off"
    //             }],
    //             "functionName": "origin_request_header",
    //             "parentId": "222728944812032"
    //     }]
    @NameInMap("Functions")
    public String functions;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchSetCdnDomainConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetCdnDomainConfigRequest self = new BatchSetCdnDomainConfigRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetCdnDomainConfigRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchSetCdnDomainConfigRequest setFunctions(String functions) {
        this.functions = functions;
        return this;
    }
    public String getFunctions() {
        return this.functions;
    }

    public BatchSetCdnDomainConfigRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BatchSetCdnDomainConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchSetCdnDomainConfigRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
