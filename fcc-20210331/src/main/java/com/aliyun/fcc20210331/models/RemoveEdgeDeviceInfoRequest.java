// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class RemoveEdgeDeviceInfoRequest extends TeaModel {
    @NameInMap("CoprId")
    public String coprId;

    @NameInMap("Id")
    public String id;

    public static RemoveEdgeDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveEdgeDeviceInfoRequest self = new RemoveEdgeDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public RemoveEdgeDeviceInfoRequest setCoprId(String coprId) {
        this.coprId = coprId;
        return this;
    }
    public String getCoprId() {
        return this.coprId;
    }

    public RemoveEdgeDeviceInfoRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
