// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateGWSImageResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ImageId")
    public String imageId;

    public static CreateGWSImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGWSImageResponseBody self = new CreateGWSImageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGWSImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGWSImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

}
