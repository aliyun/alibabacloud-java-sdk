// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetCdnDomainConfigRequest extends TeaModel {
    /**
     * <p>The accelerated domain names. You can specify multiple accelerated domain names and separate them with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    /**
     * <p>The features that you want to configure. Format:</p>
     * <ul>
     * <li><strong>functionName</strong>: the name of the feature. This parameter is required. Separate multiple values with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/388460.html">Parameters for configuring features for domain names</a>.</li>
     * <li><strong>argName</strong>: the feature parameter for <strong>functionName</strong>. This parameter is required. You can specify multiple feature parameters.</li>
     * <li><strong>argValue</strong>: the parameter value that is specified for <strong>functionName</strong>. This parameter is required.</li>
     * <li><strong>parentid</strong>: the rule condition ID. This parameter is optional. You can use the <strong>condition</strong> rule engine to create a rule condition. For information, see <a href="https://help.aliyun.com/document_detail/388460.html">Parameters for configuring features for domain names</a>. A rule condition can identify parameters that are included in requests and filter requests based on the identified parameters. After you create a rule condition, a <a href="https://help.aliyun.com/document_detail/388994.html">configid</a> is generated. A configid can be used as parentId that is referenced by other features. This way, you can combine rule conditions and features for flexible configurations.</li>
     * </ul>
     * <p>If the <strong>ParentId</strong> parameter is \<em>\</em>-1\<em>\</em>, the existing rule conditions in the configurations are deleted.</p>
     * <pre><code class="language-[{">   &quot;functionArgs&quot;: [{
     *      &quot;argName&quot;: &quot;Parameter A&quot;, 
     *      &quot;argValue&quot;: &quot;Value of parameter A&quot;
     *     }, 
     *   {
     *     &quot;argName&quot;: &quot;Parameter B&quot;, 
     *     &quot;argValue&quot;: &quot;Value of parameter B&quot;
     *      }], 
     *  &quot;functionName&quot;: &quot;Feature name&quot;
     *  &quot;parentId&quot;: Optional. parentId corresponds to configid of the referenced rule condition
     * }]
     * </code></pre>
     * <p>The following code provides a sample configuration if <strong>parentId</strong> is not used. In this example, the <strong>origin_request_header</strong> feature is used to add back-to-origin HTTP headers, and the rule condition whose configuration ID is <strong>configid=222728944812032</strong> is referenced.</p>
     * <pre><code class="language-[{">        &quot;functionArgs&quot;: [{
     *             &quot;argName&quot;: &quot;header_operation_type&quot;,
     *             &quot;argValue&quot;: &quot;add&quot;
     *         }, {
     *             &quot;argName&quot;: &quot;header_name&quot;,
     *             &quot;argValue&quot;: &quot;Accept-Encoding&quot;
     *         }, {
     *             &quot;argName&quot;: &quot;header_value&quot;,
     *             &quot;argValue&quot;: &quot;gzip&quot;
     *         }, {
     *             &quot;argName&quot;: &quot;duplicate&quot;,
     *             &quot;argValue&quot;: &quot;off&quot;
     *         }],
     *         &quot;functionName&quot;: &quot;origin_request_header&quot;
     * }]
     * </code></pre>
     * <p>The following code shows a sample configuration if <strong>parentId</strong> is used. In this example, the <strong>origin_request_header</strong> feature is used to add back-to-origin HTTP headers, and the rule condition whose configuration ID is <strong>222728944812032</strong> is referenced.</p>
     * <pre><code class="language-[{">        &quot;functionArgs&quot;: [{
     *             &quot;argName&quot;: &quot;header_operation_type&quot;,
     *             &quot;argValue&quot;: &quot;add&quot;
     *         }, {
     *             &quot;argName&quot;: &quot;header_name&quot;,
     *             &quot;argValue&quot;: &quot;Accept-Encoding&quot;
     *         }, {
     *             &quot;argName&quot;: &quot;header_value&quot;,
     *             &quot;argValue&quot;: &quot;gzip&quot;
     *         }, {
     *             &quot;argName&quot;: &quot;duplicate&quot;,
     *             &quot;argValue&quot;: &quot;off&quot;
     *         }],
     *         &quot;functionName&quot;: &quot;origin_request_header&quot;,
     *         &quot;parentId&quot;: 222728944812032
     * }]
     * </code></pre>
     * <p>The following code provides a sample configuration that deletes the reference to <strong>parentId</strong> for a feature that uses <strong>parentId</strong>. This example shows how to delete the rule condition that has a configuration ID of <strong>222728944812032</strong> and is referenced when <strong>origin_request_header</strong> feature is used to add back-to-origin HTTP headers.</p>
     * <pre><code class="language-[{">        &quot;functionArgs&quot;: [{
     *             &quot;argName&quot;: &quot;header_operation_type&quot;,
     *             &quot;argValue&quot;: &quot;add&quot;
     *         }, {
     *             &quot;argName&quot;: &quot;header_name&quot;,
     *             &quot;argValue&quot;: &quot;Accept-Encoding&quot;
     *         }, {
     *             &quot;argName&quot;: &quot;header_value&quot;,
     *             &quot;argValue&quot;: &quot;gzip&quot;
     *         }, {
     *             &quot;argName&quot;: &quot;duplicate&quot;,
     *             &quot;argValue&quot;: &quot;off&quot;
     *         }],
     *         &quot;functionName&quot;: &quot;origin_request_header&quot;,
     *         &quot;parentId&quot;: -1
     * }]
     * </code></pre>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;functionArgs&quot;: [{&quot;argName&quot;: &quot;key&quot;,&quot;argValue&quot;: &quot;Content-Encoding&quot;},{&quot;argName&quot;: &quot;value&quot;,&quot;argValue&quot;: &quot;gzip&quot;}],&quot;functionName&quot;: &quot;set_resp_header&quot;} ]</p>
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
