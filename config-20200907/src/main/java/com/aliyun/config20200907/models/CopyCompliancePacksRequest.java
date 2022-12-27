// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CopyCompliancePacksRequest extends TeaModel {
    @NameInMap("DesAggregatorIds")
    public String desAggregatorIds;

    @NameInMap("SrcAggregatorId")
    public String srcAggregatorId;

    @NameInMap("SrcCompliancePackIds")
    public String srcCompliancePackIds;

    public static CopyCompliancePacksRequest build(java.util.Map<String, ?> map) throws Exception {
        CopyCompliancePacksRequest self = new CopyCompliancePacksRequest();
        return TeaModel.build(map, self);
    }

    public CopyCompliancePacksRequest setDesAggregatorIds(String desAggregatorIds) {
        this.desAggregatorIds = desAggregatorIds;
        return this;
    }
    public String getDesAggregatorIds() {
        return this.desAggregatorIds;
    }

    public CopyCompliancePacksRequest setSrcAggregatorId(String srcAggregatorId) {
        this.srcAggregatorId = srcAggregatorId;
        return this;
    }
    public String getSrcAggregatorId() {
        return this.srcAggregatorId;
    }

    public CopyCompliancePacksRequest setSrcCompliancePackIds(String srcCompliancePackIds) {
        this.srcCompliancePackIds = srcCompliancePackIds;
        return this;
    }
    public String getSrcCompliancePackIds() {
        return this.srcCompliancePackIds;
    }

}
