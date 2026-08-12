// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class UpdateVolumeRequest extends TeaModel {
    @NameInMap("body")
    public UpdateVolumeInput body;

    public static UpdateVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateVolumeRequest self = new UpdateVolumeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateVolumeRequest setBody(UpdateVolumeInput body) {
        this.body = body;
        return this;
    }
    public UpdateVolumeInput getBody() {
        return this.body;
    }

}
