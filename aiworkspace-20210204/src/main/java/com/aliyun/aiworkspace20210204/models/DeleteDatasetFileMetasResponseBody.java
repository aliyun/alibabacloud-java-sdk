// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteDatasetFileMetasResponseBody extends TeaModel {
    /**
     * <p>The metadata records that fail to be deleted for the dataset files.</p>
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
     * <p>Indicates whether the metadata records of all dataset files were deleted. The value true indicates that the metadata records of all dataset files are deleted. If the value is false, view the failure details specified by FailedDetails.</p>
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
