// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RemoveDeviceBelongIdentifiersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IdentifierIds")
    public java.util.List<String> identifierIds;

    public static RemoveDeviceBelongIdentifiersRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDeviceBelongIdentifiersRequest self = new RemoveDeviceBelongIdentifiersRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDeviceBelongIdentifiersRequest setIdentifierIds(java.util.List<String> identifierIds) {
        this.identifierIds = identifierIds;
        return this;
    }
    public java.util.List<String> getIdentifierIds() {
        return this.identifierIds;
    }

}
