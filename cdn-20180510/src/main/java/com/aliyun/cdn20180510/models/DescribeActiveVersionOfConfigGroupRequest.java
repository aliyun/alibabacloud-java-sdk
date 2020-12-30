// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeActiveVersionOfConfigGroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ConfigGroupId")
    public String configGroupId;

    @NameInMap("Env")
    public String env;

    public static DescribeActiveVersionOfConfigGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeActiveVersionOfConfigGroupRequest self = new DescribeActiveVersionOfConfigGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeActiveVersionOfConfigGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeActiveVersionOfConfigGroupRequest setConfigGroupId(String configGroupId) {
        this.configGroupId = configGroupId;
        return this;
    }
    public String getConfigGroupId() {
        return this.configGroupId;
    }

    public DescribeActiveVersionOfConfigGroupRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

}
