// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserConfigsRequest extends TeaModel {
    /**
     * <p>The configuration that you want to query. Valid values:</p>
     * <br>
     * <p>*   **domain_business_control**: user configurations</p>
     * <p>*   **waf**: Web Application Firewall (WAF) configurations</p>
     */
    @NameInMap("FunctionName")
    public String functionName;

    public static DescribeCdnUserConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserConfigsRequest self = new DescribeCdnUserConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserConfigsRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

}
