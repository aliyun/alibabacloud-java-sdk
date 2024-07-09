// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UploadImageResponseBody extends TeaModel {
    /**
     * <p>The ID of the custom image.</p>
     * 
     * <strong>example:</strong>
     * <p>m-d4dwr5tgrgvd****</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>2CC66B0A-BA3B-5D87-BFBE-11AAAD7A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UploadImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadImageResponseBody self = new UploadImageResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public UploadImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
