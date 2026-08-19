// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetDeviceGroupRequest extends TeaModel {
    /**
     * <p>The device label ID. You can obtain this value from:</p>
     * <ul>
     * <li><a href="~~ListDeviceGroups~~">ListDeviceGroups</a>: Lists device labels.</li>
     * <li><a href="~~CreateDeviceGroup~~">CreateDeviceGroup</a>: Creates a device label.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>device-group-5191cf830a5e****</p>
     */
    @NameInMap("DeviceGroupId")
    public String deviceGroupId;

    public static GetDeviceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceGroupRequest self = new GetDeviceGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceGroupRequest setDeviceGroupId(String deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
        return this;
    }
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

}
