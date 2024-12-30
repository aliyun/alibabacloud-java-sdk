// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDataLakePartitionByFilterResponseBody extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>NesLoKLEdIZrKhDT7I2gS****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("PartitionList")
    public java.util.List<DLPartition> partitionList;

    /**
     * <strong>example:</strong>
     * <p>427688B8-ADFB-4C4E-9D45-EF5C1FD6E23D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListDataLakePartitionByFilterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDataLakePartitionByFilterResponseBody self = new ListDataLakePartitionByFilterResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDataLakePartitionByFilterResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDataLakePartitionByFilterResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDataLakePartitionByFilterResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDataLakePartitionByFilterResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDataLakePartitionByFilterResponseBody setPartitionList(java.util.List<DLPartition> partitionList) {
        this.partitionList = partitionList;
        return this;
    }
    public java.util.List<DLPartition> getPartitionList() {
        return this.partitionList;
    }

    public ListDataLakePartitionByFilterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDataLakePartitionByFilterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
