// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetAppRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("PackageName")
    public String packageName;

    @NameInMap("DeviceId")
    public String deviceId;

    public static GetAppRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppRequest self = new GetAppRequest();
        return TeaModel.build(map, self);
    }

    public GetAppRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetAppRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public GetAppRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

}
