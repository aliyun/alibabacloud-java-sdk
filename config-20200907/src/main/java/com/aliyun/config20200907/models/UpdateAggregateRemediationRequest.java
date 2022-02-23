// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateRemediationRequest extends TeaModel {
    @NameInMap("AggregatorId")
    public String aggregatorId;

    @NameInMap("InvokeType")
    public String invokeType;

    @NameInMap("Params")
    public String params;

    @NameInMap("RemediationId")
    public String remediationId;

    @NameInMap("RemediationTemplateId")
    public String remediationTemplateId;

    @NameInMap("RemediationType")
    public String remediationType;

    @NameInMap("SourceType")
    public String sourceType;

    public static UpdateAggregateRemediationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAggregateRemediationRequest self = new UpdateAggregateRemediationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAggregateRemediationRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public UpdateAggregateRemediationRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public UpdateAggregateRemediationRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public UpdateAggregateRemediationRequest setRemediationId(String remediationId) {
        this.remediationId = remediationId;
        return this;
    }
    public String getRemediationId() {
        return this.remediationId;
    }

    public UpdateAggregateRemediationRequest setRemediationTemplateId(String remediationTemplateId) {
        this.remediationTemplateId = remediationTemplateId;
        return this;
    }
    public String getRemediationTemplateId() {
        return this.remediationTemplateId;
    }

    public UpdateAggregateRemediationRequest setRemediationType(String remediationType) {
        this.remediationType = remediationType;
        return this;
    }
    public String getRemediationType() {
        return this.remediationType;
    }

    public UpdateAggregateRemediationRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
