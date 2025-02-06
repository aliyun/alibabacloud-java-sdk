// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkface20180720.models;

import com.aliyun.tea.*;

public class DeleteDeviceGroupRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("ProductKey")
    public String productKey;

    public static DeleteDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceGroupRequest self = new DeleteDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceGroupRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public DeleteDeviceGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteDeviceGroupRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public DeleteDeviceGroupRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
