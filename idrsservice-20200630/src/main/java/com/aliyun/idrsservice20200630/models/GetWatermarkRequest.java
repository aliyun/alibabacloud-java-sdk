// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetWatermarkRequest extends TeaModel {
    @NameInMap("ClientVersion")
    public String clientVersion;

    @NameInMap("WatermarkId")
    public String watermarkId;

    public static GetWatermarkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWatermarkRequest self = new GetWatermarkRequest();
        return TeaModel.build(map, self);
    }

    public GetWatermarkRequest setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
        return this;
    }
    public String getClientVersion() {
        return this.clientVersion;
    }

    public GetWatermarkRequest setWatermarkId(String watermarkId) {
        this.watermarkId = watermarkId;
        return this;
    }
    public String getWatermarkId() {
        return this.watermarkId;
    }

}
