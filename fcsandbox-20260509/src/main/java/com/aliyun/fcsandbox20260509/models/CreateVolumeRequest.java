// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcsandbox20260509.models;

import com.aliyun.tea.*;

public class CreateVolumeRequest extends TeaModel {
    /**
     * <p>The form parameters.</p>
     */
    @NameInMap("body")
    public CreateVolumeInput body;

    public static CreateVolumeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVolumeRequest self = new CreateVolumeRequest();
        return TeaModel.build(map, self);
    }

    public CreateVolumeRequest setBody(CreateVolumeInput body) {
        this.body = body;
        return this;
    }
    public CreateVolumeInput getBody() {
        return this.body;
    }

}
