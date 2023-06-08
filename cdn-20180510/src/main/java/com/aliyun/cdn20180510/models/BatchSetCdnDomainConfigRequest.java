// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetCdnDomainConfigRequest extends TeaModel {
    /**
     * <p>The accelerated domain names. You can specify multiple accelerated domain names and separate them with commas (,).</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The features that you want to configure. Format:</p>
     * <br>
     * <p>*   **functionName**: the name of the feature. This parameter is required. Separate multiple values with commas (,). For more information, see [Parameters for configuring features for domain names](~~388460~~).</p>
     * <p>*   **argName**: the feature parameter for **functionName**. This parameter is required. You can specify multiple feature parameters.</p>
     * <p>*   **argValue**: the parameter value that is specified for **functionName**. This parameter is required.</p>
     * <p>*   **parentid**: the rule condition ID. This parameter is optional. You can use the **condition** rule engine to create a rule condition. For information, see [Parameters for configuring features for domain names](~~388460~~). A rule condition can identify parameters that are included in requests and filter requests based on the identified parameters. After you create a rule condition, a [configid](~~388994~~) is generated. A configid can be used as parentId that is referenced by other features. This way, you can combine rule conditions and features for flexible configurations.</p>
     * <br>
     * <p>If the **ParentId** parameter is \*\*-1\*\*, the existing rule conditions in the configurations are deleted.</p>
     * <br>
     * <p>```[{</p>
     * <p>   "functionArgs": [{</p>
     * <p>     "argName": "Parameter A", </p>
     * <p>     "argValue": "Value of parameter A"</p>
     * <p>    }, </p>
     * <p>  {</p>
     * <p>    "argName": "Parameter B", </p>
     * <p>    "argValue": "Value of parameter B"</p>
     * <p>     }], </p>
     * <p> "functionName": "Feature name"</p>
     * <p> "parentId": Optional. parentId corresponds to configid of the referenced rule condition</p>
     * <p>}]</p>
     * <p>```</p>
     * <br>
     * <p>The following code provides a sample configuration if **parentId** is not used. In this example, the **origin_request_header** feature is used to add back-to-origin HTTP headers, and the rule condition whose configuration ID is **configid=222728944812032** is referenced.</p>
     * <br>
     * <p>```[{</p>
     * <p>        "functionArgs": [{</p>
     * <p>            "argName": "header_operation_type",</p>
     * <p>            "argValue": "add"</p>
     * <p>        }, {</p>
     * <p>            "argName": "header_name",</p>
     * <p>            "argValue": "Accept-Encoding"</p>
     * <p>        }, {</p>
     * <p>            "argName": "header_value",</p>
     * <p>            "argValue": "gzip"</p>
     * <p>        }, {</p>
     * <p>            "argName": "duplicate",</p>
     * <p>            "argValue": "off"</p>
     * <p>        }],</p>
     * <p>        "functionName": "origin_request_header"</p>
     * <p>}]</p>
     * <p>```</p>
     * <br>
     * <p>The following code shows a sample configuration if **parentId** is used. In this example, the **origin_request_header** feature is used to add back-to-origin HTTP headers, and the rule condition whose configuration ID is **222728944812032** is referenced.</p>
     * <br>
     * <p>```[{</p>
     * <p>        "functionArgs": [{</p>
     * <p>            "argName": "header_operation_type",</p>
     * <p>            "argValue": "add"</p>
     * <p>        }, {</p>
     * <p>            "argName": "header_name",</p>
     * <p>            "argValue": "Accept-Encoding"</p>
     * <p>        }, {</p>
     * <p>            "argName": "header_value",</p>
     * <p>            "argValue": "gzip"</p>
     * <p>        }, {</p>
     * <p>            "argName": "duplicate",</p>
     * <p>            "argValue": "off"</p>
     * <p>        }],</p>
     * <p>        "functionName": "origin_request_header",</p>
     * <p>        "parentId": 222728944812032</p>
     * <p>}]</p>
     * <p>```</p>
     * <br>
     * <p>The following code provides a sample configuration that deletes the reference to **parentId** for a feature that uses **parentId**. This example shows how to delete the rule condition that has a configuration ID of **222728944812032** and is referenced when **origin_request_header** feature is used to add back-to-origin HTTP headers.</p>
     * <br>
     * <p>```[{</p>
     * <p>        "functionArgs": [{</p>
     * <p>            "argName": "header_operation_type",</p>
     * <p>            "argValue": "add"</p>
     * <p>        }, {</p>
     * <p>            "argName": "header_name",</p>
     * <p>            "argValue": "Accept-Encoding"</p>
     * <p>        }, {</p>
     * <p>            "argName": "header_value",</p>
     * <p>            "argValue": "gzip"</p>
     * <p>        }, {</p>
     * <p>            "argName": "duplicate",</p>
     * <p>            "argValue": "off"</p>
     * <p>        }],</p>
     * <p>        "functionName": "origin_request_header",</p>
     * <p>        "parentId": -1</p>
     * <p>}]</p>
     * <p>```</p>
     */
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
