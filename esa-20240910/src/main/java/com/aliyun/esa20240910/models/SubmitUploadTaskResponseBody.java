// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SubmitUploadTaskResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the file upload task.</p>
     * 
     * <strong>example:</strong>
     * <p>1593805857882113</p>
     */
    @NameInMap("UploadId")
    public Long uploadId;

    public static SubmitUploadTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitUploadTaskResponseBody self = new SubmitUploadTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitUploadTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitUploadTaskResponseBody setUploadId(Long uploadId) {
        this.uploadId = uploadId;
        return this;
    }
    public Long getUploadId() {
        return this.uploadId;
    }

}
