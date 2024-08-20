// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchSetDcdnDomainConfigsRequest extends TeaModel {
    /**
     * <p>The accelerated domain names. Specify multiple accelerated domain names with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com,example.org</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The features that you want to configure. Format:</p>
     * <ul>
     * <li><p><strong>functionName</strong>: The name of the feature. Separate multiple values with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/410622.html">A list of features</a>.</p>
     * </li>
     * <li><p><strong>argName</strong>: The feature parameters for <strong>functionName</strong>.</p>
     * </li>
     * <li><p><strong>argValue</strong>: The parameter values set for <strong>functionName</strong>.</p>
     * </li>
     * <li><p><strong>parentid</strong>: the rule ID. This parameter is optional. You can use the <strong>condition</strong> rules engine to create a rule. For information, see <a href="https://help.aliyun.com/document_detail/388460.html">Feature settings for domain names</a>. A rule can identify parameters that are included in requests and filter requests based on the identified parameters. After you create a rule, a <a href="https://help.aliyun.com/document_detail/388994.html">configid</a> is generated. A configid can be used as parentId that is referenced by other features. This way, you can combine rules and features for flexible configurations.</p>
     * </li>
     * </ul>
     * <p>If the <strong>parentId</strong> parameter is <strong>-1</strong>, the existing rules in the configurations are deleted.</p>
     * <pre><code class="language-["> {
     *    &quot;functionArgs&quot;: [
     *     {
     *      &quot;argName&quot;: &quot;Parameter A&quot;, 
     *      &quot;argValue&quot;: Value of parameter A&quot;
     *     }, 
     *   {
     *     &quot;argName&quot;: &quot;Parameter B&quot;, 
     *     &quot;argValue&quot;: &quot;Value of Parameter B&quot;
     *      }
     *  ], 
     *  &quot;functionName&quot;: &quot;Feature name&quot;
     *     }
     * ]```
     * </code></pre>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;functionArgs&quot;:[{&quot;argName&quot;:&quot;switch&quot;,&quot;argValue&quot;:&quot;on&quot;},{&quot;argName&quot;:&quot;region&quot;,&quot;argValue&quot;:&quot;*&quot;}],&quot;functionName&quot;:&quot;ipv6&quot;}]</p>
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
