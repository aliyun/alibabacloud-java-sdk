// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class GetPassThroughAuthInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>mm_2b7d37b695fb44faa983e5fbb032</p>
     */
    @NameInMap("appId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>35f9ed99b27a1e8374f6593bf969f7d6</p>
     */
    @NameInMap("deviceName")
    public String deviceName;

    public static GetPassThroughAuthInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPassThroughAuthInfoRequest self = new GetPassThroughAuthInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetPassThroughAuthInfoRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetPassThroughAuthInfoRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

}
