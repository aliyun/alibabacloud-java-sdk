// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeContainerAppRequest extends TeaModel {
    /**
     * <p>The ID of the containerized application.</p>
     * <br>
     * <p>You can call the [ListContainerApps](~~87333~~) operation to query the ID of the containerized application.</p>
     */
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
