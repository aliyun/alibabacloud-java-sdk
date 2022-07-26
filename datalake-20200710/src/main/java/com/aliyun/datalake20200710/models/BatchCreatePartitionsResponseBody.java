// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchCreatePartitionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PartitionErrors")
    public java.util.List<PartitionError> partitionErrors;

    @NameInMap("Partitions")
    public java.util.List<Partition> partitions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static BatchCreatePartitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCreatePartitionsResponseBody self = new BatchCreatePartitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCreatePartitionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCreatePartitionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchCreatePartitionsResponseBody setPartitionErrors(java.util.List<PartitionError> partitionErrors) {
        this.partitionErrors = partitionErrors;
        return this;
    }
    public java.util.List<PartitionError> getPartitionErrors() {
        return this.partitionErrors;
    }

    public BatchCreatePartitionsResponseBody setPartitions(java.util.List<Partition> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.List<Partition> getPartitions() {
        return this.partitions;
    }

    public BatchCreatePartitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchCreatePartitionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
