// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class SetCdnDomainStagingConfigRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. You can specify only one domain name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The features that you want to configure. Format:</p>
     * <blockquote>
     * <ul>
     * <li><strong>functionName</strong>: The name of the feature. Separate multiple values with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/388460.html">A list of features</a>.</li>
     * <li><strong>argName</strong>: The feature parameters for <strong>functionName</strong>.</li>
     * <li><strong>argValue</strong>: The parameter values set for <strong>functionName</strong>.</li>
     * </ul>
     * </blockquote>
     * <pre><code>    [
     *      {
     *        &quot;functionArgs&quot;: [
     *         {
     *          &quot;argName&quot;: &quot;Parameter A&quot;, 
     *          &quot;argValue&quot;: &quot;Value of Parameter A&quot;
     *         }, 
     *       {
     *         &quot;argName&quot;: &quot;Parameter B&quot;, 
     *         &quot;argValue&quot;: &quot;Value of Parameter B&quot;
     *          }
     *      ], 
     *      &quot;functionName&quot;: &quot;Feature name&quot;
     *         }
     *     ]
     * </code></pre>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;functionArgs&quot;:[{&quot;argName&quot;:&quot;enable&quot;,&quot;argValue&quot;:&quot;on&quot;},{&quot;argName&quot;:&quot;pri&quot;,&quot;argValue&quot;:&quot;1&quot;},{&quot;argName&quot;:&quot;rule&quot;,&quot;argValue&quot;:&quot;xxx&quot;}],&quot;functionName&quot;:&quot;edge_function&quot;}]</p>
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
