// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class ImportImageResponseBody extends TeaModel {
    /**
     * <p>The ID of the image that is imported to the instance.</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ImportImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportImageResponseBody self = new ImportImageResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportImageResponseBody setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public ImportImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
