// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListCSBGatewayRequest extends TeaModel {
    @NameInMap("LogicalRegionId")
    public String logicalRegionId;

    public static ListCSBGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCSBGatewayRequest self = new ListCSBGatewayRequest();
        return TeaModel.build(map, self);
    }

    public ListCSBGatewayRequest setLogicalRegionId(String logicalRegionId) {
        this.logicalRegionId = logicalRegionId;
        return this;
    }
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

}
