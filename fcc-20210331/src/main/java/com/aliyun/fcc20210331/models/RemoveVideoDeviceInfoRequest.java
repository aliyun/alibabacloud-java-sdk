// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class RemoveVideoDeviceInfoRequest extends TeaModel {
    @NameInMap("CoprId")
    public String coprId;

    @NameInMap("Id")
    public String id;

    public static RemoveVideoDeviceInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveVideoDeviceInfoRequest self = new RemoveVideoDeviceInfoRequest();
        return TeaModel.build(map, self);
    }

    public RemoveVideoDeviceInfoRequest setCoprId(String coprId) {
        this.coprId = coprId;
        return this;
    }
    public String getCoprId() {
        return this.coprId;
    }

    public RemoveVideoDeviceInfoRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
