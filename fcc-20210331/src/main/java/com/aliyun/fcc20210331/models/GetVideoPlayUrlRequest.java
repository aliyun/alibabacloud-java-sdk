// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetVideoPlayUrlRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("EdgeId")
    public String edgeId;

    public static GetVideoPlayUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlayUrlRequest self = new GetVideoPlayUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetVideoPlayUrlRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public GetVideoPlayUrlRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public GetVideoPlayUrlRequest setEdgeId(String edgeId) {
        this.edgeId = edgeId;
        return this;
    }
    public String getEdgeId() {
        return this.edgeId;
    }

}
