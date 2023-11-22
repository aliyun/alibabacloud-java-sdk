// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnDomainConfigsRequest extends TeaModel {
    /**
     * <p>The accelerated domain names. Specify multiple accelerated domain names with commas (,).</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The features that you want to configure. Format:</p>
     * <br>
     * <p>*   **functionName**: The name of the feature. Separate multiple values with commas (,). For more information, see [A list of features](~~410622~~).</p>
     * <p>*   **argName**: The feature parameters for **functionName**.</p>
     * <p>*   **argValue**: The parameter values set for **functionName**.</p>
     * <br>
     * <p><!----></p>
     * <br>
     * <p>    [</p>
     * <p>     {</p>
     * <p>       "functionArgs": [</p>
     * <p>        {</p>
     * <p>         "argName": "Parameter A", </p>
     * <p>         "argValue": "Value of parameter A"</p>
     * <p>        }, </p>
     * <p>      {</p>
     * <p>    "argName": "Parameter B", </p>
     * <p>    "argValue": "Value of parameter B"     }</p>
     * <p>     ], </p>
     * <p>     "functionName": "Feature name"</p>
     * <p>        }</p>
     * <p>    ]</p>
     */
    @NameInMap("Functions")
    public String functions;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static BatchSetDcdnDomainConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetDcdnDomainConfigsRequest self = new BatchSetDcdnDomainConfigsRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetDcdnDomainConfigsRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

    public BatchSetDcdnDomainConfigsRequest setFunctions(String functions) {
        this.functions = functions;
        return this;
    }
    public String getFunctions() {
        return this.functions;
    }

    public BatchSetDcdnDomainConfigsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public BatchSetDcdnDomainConfigsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public BatchSetDcdnDomainConfigsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
