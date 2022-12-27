// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserConfigsRequest extends TeaModel {
    // The configuration item that you want to query. Valid values:
    // 
    // *   **domain\_business\_control**: Alibaba Cloud CDN configurations
    // *   **waf**: Web Application Firewall (WAF) configurations
    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("OwnerId")
    public Long ownerId;

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

    public DescribeCdnUserConfigsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
