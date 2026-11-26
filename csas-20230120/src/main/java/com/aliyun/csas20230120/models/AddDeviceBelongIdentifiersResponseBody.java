// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AddDeviceBelongIdentifiersResponseBody extends TeaModel {
    /**
     * <p>The IDs of the records actually added in the batch, returned in the input order of the added items. Skipped duplicates are not included in the array. An empty list is returned if no records are added in the batch.</p>
     */
    @NameInMap("IdentifierIds")
    public java.util.List<String> identifierIds;

    /**
     * <p>The request ID. You can use this ID to locate the API call.</p>
     * 
     * <strong>example:</strong>
     * <p>7A92B549-EC82-5F79-8301-63711AFC9DCE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddDeviceBelongIdentifiersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceBelongIdentifiersResponseBody self = new AddDeviceBelongIdentifiersResponseBody();
        return TeaModel.build(map, self);
    }

    public AddDeviceBelongIdentifiersResponseBody setIdentifierIds(java.util.List<String> identifierIds) {
        this.identifierIds = identifierIds;
        return this;
    }
    public java.util.List<String> getIdentifierIds() {
        return this.identifierIds;
    }

    public AddDeviceBelongIdentifiersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
