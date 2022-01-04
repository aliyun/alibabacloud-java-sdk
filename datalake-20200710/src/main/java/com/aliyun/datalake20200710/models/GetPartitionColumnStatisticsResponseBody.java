// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetPartitionColumnStatisticsResponseBody extends TeaModel {
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

    public static GetPartitionColumnStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionColumnStatisticsResponseBody self = new GetPartitionColumnStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPartitionColumnStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPartitionColumnStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPartitionColumnStatisticsResponseBody setPartitionStatisticsMap(java.util.Map<String, java.util.List<ColumnStatisticsObj>> partitionStatisticsMap) {
        this.partitionStatisticsMap = partitionStatisticsMap;
        return this;
    }
    public java.util.Map<String, java.util.List<ColumnStatisticsObj>> getPartitionStatisticsMap() {
        return this.partitionStatisticsMap;
    }

    public GetPartitionColumnStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPartitionColumnStatisticsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
