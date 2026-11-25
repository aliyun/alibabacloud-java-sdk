// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AddDeviceBelongIdentifiersResponseBody extends TeaModel {
    @NameInMap("IdentifierIds")
    public java.util.List<String> identifierIds;

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
