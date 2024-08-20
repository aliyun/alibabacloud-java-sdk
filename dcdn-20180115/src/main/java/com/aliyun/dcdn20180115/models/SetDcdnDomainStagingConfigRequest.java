// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class SetDcdnDomainStagingConfigRequest extends TeaModel {
    /**
     * <p>The accelerated domain name. Separate multiple accelerated domain names with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The list of features. Format: <code>[{&quot;functionArgs&quot;:[{&quot;argName&quot;:&quot;parameter key&quot;,&quot;argValue&quot;:&quot;parameter value&quot;},{&quot;argName&quot;:&quot;xx&quot;,&quot;argValue&quot;:&quot;xx&quot;}],&quot;functionName&quot;: feature name&quot;}]</code></p>
     * <blockquote>
     * <p>Separate multiple parameters with commas (,).</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;functionArgs\&quot;:[{\&quot;argName\&quot;:\&quot;enable\&quot;,\&quot;argValue\&quot;:\&quot;on\&quot;,\&quot;argName\&quot;:\&quot;pri\&quot;,\&quot;argValue\&quot;:\&quot;1\&quot;,\&quot;argName\&quot;:\&quot;rule\&quot;,\&quot;argValue\&quot;:\&quot;xxx\&quot;}],\&quot;functionName\&quot;:\&quot;edge_function\&quot;}]</p>
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
