// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QuerySuperDeviceGroupRequest extends TeaModel {
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("GroupId")
    public String groupId;

    public static QuerySuperDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySuperDeviceGroupRequest self = new QuerySuperDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public QuerySuperDeviceGroupRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QuerySuperDeviceGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
