// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionsByFilterResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
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
     * <p>The page turning token, which is used to obtain the next page of data.</p>
     * 
     * <strong>example:</strong>
     * <p>2cb472ec1bf84f8d92f9c4baa0d21c19aa</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The list of partition specifications.</p>
     */
    @NameInMap("PartitionSpecs")
    public java.util.List<PartitionSpec> partitionSpecs;

    /**
     * <p>The list of partition details after query.</p>
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
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListPartitionsByFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsByFilterResponseBody self = new ListPartitionsByFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPartitionsByFilterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPartitionsByFilterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPartitionsByFilterResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListPartitionsByFilterResponseBody setPartitionSpecs(java.util.List<PartitionSpec> partitionSpecs) {
        this.partitionSpecs = partitionSpecs;
        return this;
    }
    public java.util.List<PartitionSpec> getPartitionSpecs() {
        return this.partitionSpecs;
    }

    public ListPartitionsByFilterResponseBody setPartitions(java.util.List<Partition> partitions) {
        this.partitions = partitions;
        return this;
    }
    public java.util.List<Partition> getPartitions() {
        return this.partitions;
    }

    public ListPartitionsByFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPartitionsByFilterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
