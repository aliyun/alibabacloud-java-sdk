// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetVideoScreenShotRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("EdgeId")
    public String edgeId;

    public static GetVideoScreenShotRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoScreenShotRequest self = new GetVideoScreenShotRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoScreenShotRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetVideoScreenShotRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetVideoScreenShotRequest setEdgeId(String edgeId) {
        this.edgeId = edgeId;
        return this;
    }
    public String getEdgeId() {
        return this.edgeId;
    }

}
