// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetUnbindedEdgeDevicesRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("EdgeDeviceId")
    public String edgeDeviceId;

    public static GetUnbindedEdgeDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnbindedEdgeDevicesRequest self = new GetUnbindedEdgeDevicesRequest();
        return TeaModel.build(map, self);
    }

    public GetUnbindedEdgeDevicesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetUnbindedEdgeDevicesRequest setEdgeDeviceId(String edgeDeviceId) {
        this.edgeDeviceId = edgeDeviceId;
        return this;
    }
    public String getEdgeDeviceId() {
        return this.edgeDeviceId;
    }

}
