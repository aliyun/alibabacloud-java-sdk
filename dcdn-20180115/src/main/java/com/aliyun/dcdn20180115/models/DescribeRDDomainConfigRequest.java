// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeRDDomainConfigRequest extends TeaModel {
    /**
     * <p>The accelerated domain name.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The name of the feature. Default value: source_group.</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    public static DescribeRDDomainConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRDDomainConfigRequest self = new DescribeRDDomainConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRDDomainConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeRDDomainConfigRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

}
