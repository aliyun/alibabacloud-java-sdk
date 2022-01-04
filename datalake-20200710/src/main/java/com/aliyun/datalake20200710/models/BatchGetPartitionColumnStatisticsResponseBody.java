// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchGetPartitionColumnStatisticsResponseBody extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    // Message
    @NameInMap("Message")
    public String message;

    // PartitionStatisticsMap
    @NameInMap("PartitionStatisticsMap")
    public java.util.Map<String, java.util.List<ColumnStatisticsObj>> partitionStatisticsMap;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    public static BatchGetPartitionColumnStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetPartitionColumnStatisticsResponseBody self = new BatchGetPartitionColumnStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetPartitionColumnStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetPartitionColumnStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchGetPartitionColumnStatisticsResponseBody setPartitionStatisticsMap(java.util.Map<String, java.util.List<ColumnStatisticsObj>> partitionStatisticsMap) {
        this.partitionStatisticsMap = partitionStatisticsMap;
        return this;
    }
    public java.util.Map<String, java.util.List<ColumnStatisticsObj>> getPartitionStatisticsMap() {
        return this.partitionStatisticsMap;
    }

    public BatchGetPartitionColumnStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetPartitionColumnStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
