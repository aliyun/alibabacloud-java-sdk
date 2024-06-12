// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateRemediationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

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
     * <p>You can call the [ListRemediations](https://help.aliyun.com/document_detail/270772.html) operation to obtain the ID of the remediation setting.</p>
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
     * <p>The source of the remediation setting. Valid values:</p>
     * <br>
     * <p>*   ALIYUN: the default remediation setting of Alibaba Cloud.</p>
     * <p>*   CUSTOM: a custom remediation setting.</p>
     * <p>*   NONE: The source is not specified.</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static UpdateRemediationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRemediationRequest self = new UpdateRemediationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRemediationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateRemediationRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public UpdateRemediationRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public UpdateRemediationRequest setRemediationId(String remediationId) {
        this.remediationId = remediationId;
        return this;
    }
    public String getRemediationId() {
        return this.remediationId;
    }

    public UpdateRemediationRequest setRemediationTemplateId(String remediationTemplateId) {
        this.remediationTemplateId = remediationTemplateId;
        return this;
    }
    public String getRemediationTemplateId() {
        return this.remediationTemplateId;
    }

    public UpdateRemediationRequest setRemediationType(String remediationType) {
        this.remediationType = remediationType;
        return this;
    }
    public String getRemediationType() {
        return this.remediationType;
    }

    public UpdateRemediationRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
