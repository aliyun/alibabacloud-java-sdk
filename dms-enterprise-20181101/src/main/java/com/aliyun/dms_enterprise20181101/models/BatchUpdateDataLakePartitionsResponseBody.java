// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class BatchUpdateDataLakePartitionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("PartitionErrors")
    public java.util.List<PartitionError> partitionErrors;

    /**
     * <strong>example:</strong>
     * <p>C5B8E84B-42B6-4374-AD5A-6264E1753378</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchUpdateDataLakePartitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateDataLakePartitionsResponseBody self = new BatchUpdateDataLakePartitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateDataLakePartitionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BatchUpdateDataLakePartitionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchUpdateDataLakePartitionsResponseBody setPartitionErrors(java.util.List<PartitionError> partitionErrors) {
        this.partitionErrors = partitionErrors;
        return this;
    }
    public java.util.List<PartitionError> getPartitionErrors() {
        return this.partitionErrors;
    }

    public BatchUpdateDataLakePartitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchUpdateDataLakePartitionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
