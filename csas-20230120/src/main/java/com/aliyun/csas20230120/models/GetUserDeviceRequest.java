// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetUserDeviceRequest extends TeaModel {
    /**
     * <p>The ID of the terminal device. Valid values:</p>
     * <ul>
     * <li><a href="~~GetUserDevice~~">GetUserDevice</a>: Queries the details of a user terminal device.</li>
     * <li><a href="~~ListUserDevices~~">ListUserDevices</a>: Queries multiple user terminal devices.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
     */
    @NameInMap("DeviceTag")
    public String deviceTag;

    public static GetUserDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserDeviceRequest self = new GetUserDeviceRequest();
        return TeaModel.build(map, self);
    }

    public GetUserDeviceRequest setDeviceTag(String deviceTag) {
        this.deviceTag = deviceTag;
        return this;
    }
    public String getDeviceTag() {
        return this.deviceTag;
    }

}
