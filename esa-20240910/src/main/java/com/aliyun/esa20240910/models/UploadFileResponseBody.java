// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class UploadFileResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3C6CCEC4-6B88-4D4A-93E4-D47B3D92CF8F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the file upload task. You can use this ID for task submission or query subsequently.</p>
     * 
     * <strong>example:</strong>
     * <p>159253299357****</p>
     */
    @NameInMap("UploadId")
    public Long uploadId;

    public static UploadFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadFileResponseBody self = new UploadFileResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UploadFileResponseBody setUploadId(Long uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public Long getUploadId() {
        return this.uploadId;
    }

}
