// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class BatchCreateDataLakePartitionsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
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
     * <p>The list of created partitions. This parameter is returned when the <strong>NeedResult</strong> parameter is set to <strong>true</strong>.</p>
     */
    @NameInMap("Partitions")
    public java.util.List<DLPartition> partitions;

    /**
     * <p>The request ID, used for log tracing and troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>0C1CB646-1DE4-4AD0-B4A4-7D47DD52****</p>
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

    public static BatchCreateDataLakePartitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreateDataLakePartitionsResponseBody self = new BatchCreateDataLakePartitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreateDataLakePartitionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public BatchCreateDataLakePartitionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public BatchCreateDataLakePartitionsResponseBody setPartitions(java.util.List<DLPartition> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.List<DLPartition> getPartitions() {
        return this.partitions;
    }

    public BatchCreateDataLakePartitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreateDataLakePartitionsResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
