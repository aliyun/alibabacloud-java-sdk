// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("PartitionSpecs")
    public java.util.List<PartitionSpec> partitionSpecs;

    @NameInMap("Partitions")
    public java.util.List<Partition> partitions;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPartitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsResponseBody self = new ListPartitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPartitionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPartitionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPartitionsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListPartitionsResponseBody setPartitionSpecs(java.util.List<PartitionSpec> partitionSpecs) {
        this.partitionSpecs = partitionSpecs;
        return this;
    }
    public java.util.List<PartitionSpec> getPartitionSpecs() {
        return this.partitionSpecs;
    }

    public ListPartitionsResponseBody setPartitions(java.util.List<Partition> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.List<Partition> getPartitions() {
        return this.partitions;
    }

    public ListPartitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPartitionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
