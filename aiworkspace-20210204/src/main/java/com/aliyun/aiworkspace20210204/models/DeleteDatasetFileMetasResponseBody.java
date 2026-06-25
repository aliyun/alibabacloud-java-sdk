// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetFileMetasResponseBody extends TeaModel {
    /**
     * <p>A list of file metadata records that failed to be deleted.</p>
     */
    @NameInMap("FailedDetails")
    public java.util.List<DatasetFileMetaResponse> failedDetails;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the batch deletion. A value of \<code>true\\</code> indicates that all metadata records were deleted. If the value is \<code>false\\</code>, check the \<code>FailedDetails\\</code> parameter for more information.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    public static DeleteDatasetFileMetasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasetFileMetasResponseBody self = new DeleteDatasetFileMetasResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDatasetFileMetasResponseBody setFailedDetails(java.util.List<DatasetFileMetaResponse> failedDetails) {
        this.failedDetails = failedDetails;
        return this;
    }
    public java.util.List<DatasetFileMetaResponse> getFailedDetails() {
        return this.failedDetails;
    }

    public DeleteDatasetFileMetasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteDatasetFileMetasResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

}
