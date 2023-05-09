// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateImageFromAppInstanceGroupResponseBody extends TeaModel {
    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateImageFromAppInstanceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateImageFromAppInstanceGroupResponseBody self = new CreateImageFromAppInstanceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateImageFromAppInstanceGroupResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public CreateImageFromAppInstanceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
