// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateRemediationRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>You can the [ListAggregators](https://help.aliyun.com/document_detail/255797.html) operation to obtain the ID of the account group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The execution mode of the remediation. Valid values:</p>
     * <br>
     * <p>*   NON_EXECUTION: The remediation is not executed.</p>
     * <p>*   AUTO_EXECUTION: The remediation is automatically executed.</p>
     * <p>*   MANUAL_EXECUTION: The remediation is manually executed.</p>
     * <p>*   NOT_CONFIG: The execution mode is not specified.</p>
     */
    @NameInMap("InvokeType")
    public String invokeType;

    /**
     * <p>The desired parameter values of the remediation setting.</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The ID of the remediation setting.</p>
     * <br>
     * <p>You can call the [ListAggregateRemediations](https://help.aliyun.com/document_detail/270036.html) operation to obtain the ID of the remediation setting.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemediationId")
    public String remediationId;

    /**
     * <p>The ID of the remediation template.</p>
     * <br>
     * <p>You can call the [ListRemediationTemplates](https://help.aliyun.com/document_detail/270066.html) operation to obtain the ID of the remediation template.</p>
     */
    @NameInMap("RemediationTemplateId")
    public String remediationTemplateId;

    /**
     * <p>The type of the remediation template. Valid values:</p>
     * <br>
     * <p>*   OOS: Operation Orchestration Service (OOS)</p>
     * <p>*   FC: Function Compute. You can use Function Compute to configure custom remediation settings.</p>
     */
    @NameInMap("RemediationType")
    public String remediationType;

    /**
     * <p>The type of the rule for which the remediation template is configured. Valid values:</p>
     * <br>
     * <p>*   ALIYUN: managed rule.</p>
     * <p>*   CUSTOM: custom rule.</p>
     * <p>*   NONE: The rule is not specified.</p>
     */
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
