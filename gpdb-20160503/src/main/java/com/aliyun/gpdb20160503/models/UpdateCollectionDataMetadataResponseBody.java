// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateCollectionDataMetadataResponseBody extends TeaModel {
    /**
     * <p>Number of effective entries.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AppliedRows")
    public Long appliedRows;

    /**
     * <p>Detailed information when the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>failed to connect database, detailMsg: getConnection fail::SQL State: 28P01, Error Code: 0, Error Message: FATAL: password</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Status, with the following values:</p>
     * <ul>
     * <li><strong>success</strong>: Success.</li>
     * <li><strong>fail</strong>: Failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateCollectionDataMetadataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateCollectionDataMetadataResponseBody self = new UpdateCollectionDataMetadataResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateCollectionDataMetadataResponseBody setAppliedRows(Long appliedRows) {
        this.appliedRows = appliedRows;
        return this;
    }
    public Long getAppliedRows() {
        return this.appliedRows;
    }

    public UpdateCollectionDataMetadataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateCollectionDataMetadataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateCollectionDataMetadataResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
