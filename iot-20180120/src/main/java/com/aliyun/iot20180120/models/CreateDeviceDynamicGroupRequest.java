// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateDeviceDynamicGroupRequest extends TeaModel {
    @NameInMap("DynamicGroupExpression")
    public String dynamicGroupExpression;

    @NameInMap("GroupDesc")
    public String groupDesc;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static CreateDeviceDynamicGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDeviceDynamicGroupRequest self = new CreateDeviceDynamicGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDeviceDynamicGroupRequest setDynamicGroupExpression(String dynamicGroupExpression) {
        this.dynamicGroupExpression = dynamicGroupExpression;
        return this;
    }
    public String getDynamicGroupExpression() {
        return this.dynamicGroupExpression;
    }

    public CreateDeviceDynamicGroupRequest setGroupDesc(String groupDesc) {
        this.groupDesc = groupDesc;
        return this;
    }
    public String getGroupDesc() {
        return this.groupDesc;
    }

    public CreateDeviceDynamicGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateDeviceDynamicGroupRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
