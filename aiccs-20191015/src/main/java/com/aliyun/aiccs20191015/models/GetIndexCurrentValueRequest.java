// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetIndexCurrentValueRequest extends TeaModel {
    @NameInMap("DepIds")
    public String depIds;

    @NameInMap("GroupIds")
    public String groupIds;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetIndexCurrentValueRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIndexCurrentValueRequest self = new GetIndexCurrentValueRequest();
        return TeaModel.build(map, self);
    }

    public GetIndexCurrentValueRequest setDepIds(String depIds) {
        this.depIds = depIds;
        return this;
    }
    public String getDepIds() {
        return this.depIds;
    }

    public GetIndexCurrentValueRequest setGroupIds(String groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public String getGroupIds() {
        return this.groupIds;
    }

    public GetIndexCurrentValueRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
