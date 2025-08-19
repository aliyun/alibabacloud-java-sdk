// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ResidentConfig extends TeaModel {
    @NameInMap("count")
    public Long count;

    @NameInMap("poolId")
    public String poolId;

    public static ResidentConfig build(java.util.Map<String, ?> map) throws Exception {
        ResidentConfig self = new ResidentConfig();
        return TeaModel.build(map, self);
    }

    public ResidentConfig setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ResidentConfig setPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }
    public String getPoolId() {
        return this.poolId;
    }

}
