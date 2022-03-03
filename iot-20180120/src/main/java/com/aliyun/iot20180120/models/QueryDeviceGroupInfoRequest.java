// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryDeviceGroupInfoRequest extends TeaModel {
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryDeviceGroupInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceGroupInfoRequest self = new QueryDeviceGroupInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceGroupInfoRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public QueryDeviceGroupInfoRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public QueryDeviceGroupInfoRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
