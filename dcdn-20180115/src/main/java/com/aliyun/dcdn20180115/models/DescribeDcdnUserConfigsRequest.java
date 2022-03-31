// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserConfigsRequest extends TeaModel {
    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeDcdnUserConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserConfigsRequest self = new DescribeDcdnUserConfigsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserConfigsRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public DescribeDcdnUserConfigsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
