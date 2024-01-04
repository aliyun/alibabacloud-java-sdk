// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteCollectionDataResponseBody extends TeaModel {
    /**
     * <p>The number of rows that are affected by the request.</p>
     */
    @NameInMap("AppliedRows")
    public Long appliedRows;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **success**</p>
     * <p>*   **fail**</p>
     */
    @NameInMap("Status")
    public String status;

    public static DeleteCollectionDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteCollectionDataResponseBody self = new DeleteCollectionDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteCollectionDataResponseBody setAppliedRows(Long appliedRows) {
        this.appliedRows = appliedRows;
        return this;
    }
    public Long getAppliedRows() {
        return this.appliedRows;
    }

    public DeleteCollectionDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteCollectionDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteCollectionDataResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
