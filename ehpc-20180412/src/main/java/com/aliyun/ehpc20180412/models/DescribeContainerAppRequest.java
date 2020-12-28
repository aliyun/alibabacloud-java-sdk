// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeContainerAppRequest extends TeaModel {
    @NameInMap("ContainerId")
    public String containerId;

    public static DescribeContainerAppRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerAppRequest self = new DescribeContainerAppRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContainerAppRequest setContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }
    public String getContainerId() {
        return this.containerId;
    }

}
