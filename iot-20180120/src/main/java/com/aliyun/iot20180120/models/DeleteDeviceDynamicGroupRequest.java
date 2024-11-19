// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteDeviceDynamicGroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tDQvBJqbUyHs***</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>iot-<em><strong>-v6</strong></em></p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static DeleteDeviceDynamicGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceDynamicGroupRequest self = new DeleteDeviceDynamicGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceDynamicGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteDeviceDynamicGroupRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
