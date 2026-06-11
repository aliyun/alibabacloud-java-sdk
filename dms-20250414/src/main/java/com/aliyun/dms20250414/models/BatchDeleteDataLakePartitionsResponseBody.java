// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class BatchDeleteDataLakePartitionsResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>A list of errors.</p>
     */
    @NameInMap("PartitionErrors")
    public java.util.List<PartitionError> partitionErrors;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5B96E35F-A58E-5399-9041-09CF9A1E****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static BatchDeleteDataLakePartitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDataLakePartitionsResponseBody self = new BatchDeleteDataLakePartitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDataLakePartitionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BatchDeleteDataLakePartitionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchDeleteDataLakePartitionsResponseBody setPartitionErrors(java.util.List<PartitionError> partitionErrors) {
        this.partitionErrors = partitionErrors;
        return this;
    }
    public java.util.List<PartitionError> getPartitionErrors() {
        return this.partitionErrors;
    }

    public BatchDeleteDataLakePartitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteDataLakePartitionsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
