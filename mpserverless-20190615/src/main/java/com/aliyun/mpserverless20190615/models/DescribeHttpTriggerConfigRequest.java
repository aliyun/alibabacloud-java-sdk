// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeHttpTriggerConfigRequest extends TeaModel {
    @NameInMap("SpaceId")
    public String spaceId;

    public static DescribeHttpTriggerConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpTriggerConfigRequest self = new DescribeHttpTriggerConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHttpTriggerConfigRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

}
