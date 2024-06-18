// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UploadMediaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abcd1234</p>
     */
    @NameInMap("mediaId")
    public String mediaId;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>abcd-1234-wxyz-9876</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UploadMediaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadMediaResponseBody self = new UploadMediaResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadMediaResponseBody setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public UploadMediaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
