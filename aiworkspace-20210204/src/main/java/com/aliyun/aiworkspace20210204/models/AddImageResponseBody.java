// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class AddImageResponseBody extends TeaModel {
    // 镜像 id
    @NameInMap("ImageId")
    public String imageId;

    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    public static AddImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddImageResponseBody self = new AddImageResponseBody();
        return TeaModel.build(map, self);
    }

    public AddImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public AddImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
