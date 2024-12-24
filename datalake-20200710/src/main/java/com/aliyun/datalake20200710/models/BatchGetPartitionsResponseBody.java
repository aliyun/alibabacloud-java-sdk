// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchGetPartitionsResponseBody extends TeaModel {
    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of error messages.</p>
     */
    @NameInMap("PartitionErrors")
    public java.util.List<PartitionError> partitionErrors;

    /**
     * <p>The list of partition specifications.</p>
     */
    @NameInMap("PartitionSpecs")
    public java.util.List<PartitionSpec> partitionSpecs;

    /**
     * <p>The list of partition details.</p>
     */
    @NameInMap("Partitions")
    public java.util.List<Partition> partitions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B7F4B621-E41E-4C84-B97F-42B5380A32BB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static BatchGetPartitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetPartitionsResponseBody self = new BatchGetPartitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetPartitionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetPartitionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchGetPartitionsResponseBody setPartitionErrors(java.util.List<PartitionError> partitionErrors) {
        this.partitionErrors = partitionErrors;
        return this;
    }
    public java.util.List<PartitionError> getPartitionErrors() {
        return this.partitionErrors;
    }

    public BatchGetPartitionsResponseBody setPartitionSpecs(java.util.List<PartitionSpec> partitionSpecs) {
        this.partitionSpecs = partitionSpecs;
        return this;
    }
    public java.util.List<PartitionSpec> getPartitionSpecs() {
        return this.partitionSpecs;
    }

    public BatchGetPartitionsResponseBody setPartitions(java.util.List<Partition> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.List<Partition> getPartitions() {
        return this.partitions;
    }

    public BatchGetPartitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetPartitionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
