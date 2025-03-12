// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class BatchSetGrayDomainFunctionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;functionArgs&quot;: [{&quot;argName&quot;: &quot;key&quot;,&quot;argValue&quot;: &quot;Content-Encoding&quot;},{&quot;argName&quot;: &quot;value&quot;,&quot;argValue&quot;: &quot;gzip&quot;}],&quot;functionName&quot;: &quot;set_resp_header&quot;} ]</p>
     */
    @NameInMap("Configs")
    public String configs;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com,xxx.org.com</p>
     */
    @NameInMap("DomainNames")
    public String domainNames;

    public static BatchSetGrayDomainFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchSetGrayDomainFunctionRequest self = new BatchSetGrayDomainFunctionRequest();
        return TeaModel.build(map, self);
    }

    public BatchSetGrayDomainFunctionRequest setConfigs(String configs) {
        this.configs = configs;
        return this;
    }
    public String getConfigs() {
        return this.configs;
    }

    public BatchSetGrayDomainFunctionRequest setDomainNames(String domainNames) {
        this.domainNames = domainNames;
        return this;
    }
    public String getDomainNames() {
        return this.domainNames;
    }

}
