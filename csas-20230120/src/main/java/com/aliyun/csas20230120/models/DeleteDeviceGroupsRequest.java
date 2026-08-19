// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteDeviceGroupsRequest extends TeaModel {
    /**
     * <p>The collection of instance tag IDs to delete. Duplicate values are not allowed.</p>
     */
    @NameInMap("DeviceGroupIds")
    public java.util.List<String> deviceGroupIds;

    public static DeleteDeviceGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDeviceGroupsRequest self = new DeleteDeviceGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDeviceGroupsRequest setDeviceGroupIds(java.util.List<String> deviceGroupIds) {
        this.deviceGroupIds = deviceGroupIds;
        return this;
    }
    public java.util.List<String> getDeviceGroupIds() {
        return this.deviceGroupIds;
    }

}
