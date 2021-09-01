// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetAllVideoDevicesRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("EdgeDeviceId")
    public String edgeDeviceId;

    public static GetAllVideoDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllVideoDevicesRequest self = new GetAllVideoDevicesRequest();
        return TeaModel.build(map, self);
    }

    public GetAllVideoDevicesRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetAllVideoDevicesRequest setEdgeDeviceId(String edgeDeviceId) {
        this.edgeDeviceId = edgeDeviceId;
        return this;
    }
    public String getEdgeDeviceId() {
        return this.edgeDeviceId;
    }

}
