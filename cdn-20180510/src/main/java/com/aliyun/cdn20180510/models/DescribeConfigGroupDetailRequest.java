// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeConfigGroupDetailRequest extends TeaModel {
    @NameInMap("ConfigGroupId")
    public String configGroupId;

    @NameInMap("ConfigGroupName")
    public String configGroupName;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DescribeConfigGroupDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigGroupDetailRequest self = new DescribeConfigGroupDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConfigGroupDetailRequest setConfigGroupId(String configGroupId) {
        this.configGroupId = configGroupId;
        return this;
    }
    public String getConfigGroupId() {
        return this.configGroupId;
    }

    public DescribeConfigGroupDetailRequest setConfigGroupName(String configGroupName) {
        this.configGroupName = configGroupName;
        return this;
    }
    public String getConfigGroupName() {
        return this.configGroupName;
    }

    public DescribeConfigGroupDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
