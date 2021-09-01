// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class RegisterEdgeDeviceRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("EdgeDeviceId")
    public String edgeDeviceId;

    @NameInMap("DetailJson")
    public String detailJson;

    public static RegisterEdgeDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterEdgeDeviceRequest self = new RegisterEdgeDeviceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterEdgeDeviceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public RegisterEdgeDeviceRequest setEdgeDeviceId(String edgeDeviceId) {
        this.edgeDeviceId = edgeDeviceId;
        return this;
    }
    public String getEdgeDeviceId() {
        return this.edgeDeviceId;
    }

    public RegisterEdgeDeviceRequest setDetailJson(String detailJson) {
        this.detailJson = detailJson;
        return this;
    }
    public String getDetailJson() {
        return this.detailJson;
    }

}
