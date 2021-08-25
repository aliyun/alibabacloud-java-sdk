// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateRemediationsRequest extends TeaModel {
    @NameInMap("RemediationIds")
    public String remediationIds;

    @NameInMap("AggregatorId")
    public String aggregatorId;

    public static DeleteAggregateRemediationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateRemediationsRequest self = new DeleteAggregateRemediationsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateRemediationsRequest setRemediationIds(String remediationIds) {
        this.remediationIds = remediationIds;
        return this;
    }
    public String getRemediationIds() {
        return this.remediationIds;
    }

    public DeleteAggregateRemediationsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

}
