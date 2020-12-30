// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnUserConfigsRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("FunctionName")
    public String functionName;

    public static DescribeCdnUserConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnUserConfigsRequest self = new DescribeCdnUserConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnUserConfigsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnUserConfigsRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

}
