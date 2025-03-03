// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class CreateDatasetFileMetasResponseBody extends TeaModel {
    @NameInMap("FailedDetails")
    public java.util.List<DatasetFileMetaResponse> failedDetails;

    /**
     * <strong>example:</strong>
     * <p>5A14FA81-DD4E-******-6343FE44B941</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Status")
    public Boolean status;

    @NameInMap("SucceedDetails")
    public java.util.List<DatasetFileMetaResponse> succeedDetails;

    public static CreateDatasetFileMetasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetFileMetasResponseBody self = new CreateDatasetFileMetasResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDatasetFileMetasResponseBody setFailedDetails(java.util.List<DatasetFileMetaResponse> failedDetails) {
        this.failedDetails = failedDetails;
        return this;
    }
    public java.util.List<DatasetFileMetaResponse> getFailedDetails() {
        return this.failedDetails;
    }

    public CreateDatasetFileMetasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDatasetFileMetasResponseBody setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public CreateDatasetFileMetasResponseBody setSucceedDetails(java.util.List<DatasetFileMetaResponse> succeedDetails) {
        this.succeedDetails = succeedDetails;
        return this;
    }
    public java.util.List<DatasetFileMetaResponse> getSucceedDetails() {
        return this.succeedDetails;
    }

}
