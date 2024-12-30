// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataLakePartitionResponseBody extends TeaModel {
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

    @NameInMap("Partition")
    public DLPartition partition;

    /**
     * <strong>example:</strong>
     * <p>427688B8-ADFB-4C4E-9D45-EF5C1FD6E23D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateDataLakePartitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDataLakePartitionResponseBody self = new CreateDataLakePartitionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDataLakePartitionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateDataLakePartitionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDataLakePartitionResponseBody setPartition(DLPartition partition) {
        this.partition = partition;
        return this;
    }
    public DLPartition getPartition() {
        return this.partition;
    }

    public CreateDataLakePartitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDataLakePartitionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
