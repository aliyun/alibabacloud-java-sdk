// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetDataLakePartitionResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message returned if the call fails.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The information about the data lakehouse table partition.</p>
     */
    @NameInMap("Partition")
    public DLPartition partition;

    /**
     * <p>The request ID, used for log tracing and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>FE8EE2F1-4880-46BC-A704-5CF63EAF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The call was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The call failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataLakePartitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataLakePartitionResponseBody self = new GetDataLakePartitionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataLakePartitionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDataLakePartitionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDataLakePartitionResponseBody setPartition(DLPartition partition) {
        this.partition = partition;
        return this;
    }
    public DLPartition getPartition() {
        return this.partition;
    }

    public GetDataLakePartitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataLakePartitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
