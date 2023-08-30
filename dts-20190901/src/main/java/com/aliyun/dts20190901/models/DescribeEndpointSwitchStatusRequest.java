// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20190901.models;

import com.aliyun.tea.*;

public class DescribeEndpointSwitchStatusRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("TaskId")
    public String taskId;

    public static DescribeEndpointSwitchStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEndpointSwitchStatusRequest self = new DescribeEndpointSwitchStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEndpointSwitchStatusRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeEndpointSwitchStatusRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeEndpointSwitchStatusRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
