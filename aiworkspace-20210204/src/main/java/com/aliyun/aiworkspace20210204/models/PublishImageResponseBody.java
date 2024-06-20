// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class PublishImageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>image-dk******fa</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <strong>example:</strong>
     * <p>A0F049F0-8D69-5BAC-8F10-B******A34C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static PublishImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishImageResponseBody self = new PublishImageResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public PublishImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
