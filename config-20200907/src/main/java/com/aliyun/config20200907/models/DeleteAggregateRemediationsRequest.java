// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class DeleteAggregateRemediationsRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information about how to obtain the ID of the account group, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-6b4a626622af0012****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The ID of the remediation template. Separate multiple remediation template IDs with commas (,).</p>
     * <p>For more information about how to obtain the ID of a remediation template, see <a href="https://help.aliyun.com/document_detail/270036.html">ListAggregateRemediations</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-909ba2d4716700eb****</p>
     */
    @NameInMap("RemediationIds")
    public String remediationIds;

    public static DeleteAggregateRemediationsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAggregateRemediationsRequest self = new DeleteAggregateRemediationsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAggregateRemediationsRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public DeleteAggregateRemediationsRequest setRemediationIds(String remediationIds) {
        this.remediationIds = remediationIds;
        return this;
    }
    public String getRemediationIds() {
        return this.remediationIds;
    }

}
