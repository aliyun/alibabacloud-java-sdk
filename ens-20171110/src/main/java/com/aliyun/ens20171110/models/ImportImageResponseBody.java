// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ImportImageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>m-5wn1dh*******b48f440ntvad</p>
     */
    @NameInMap("ImageId")
    public String imageId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BA984</p>
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
