// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateCollectionDataMetadataResponseBody extends TeaModel {
    @NameInMap("AppliedRows")
    public Long appliedRows;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
