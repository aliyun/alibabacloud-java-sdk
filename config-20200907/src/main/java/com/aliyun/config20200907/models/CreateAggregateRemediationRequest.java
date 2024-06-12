// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateRemediationRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <br>
     * <p>For more information about how to obtain the ID of the account group, see [ListAggregators](https://help.aliyun.com/document_detail/255797.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The `token` can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The rule ID.</p>
     * <br>
     * <p>For more information about how to obtain the ID of a rule, see [ListAggregateConfigRules](https://help.aliyun.com/document_detail/264148.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The execution mode of the remediation template. Valid values:</p>
     * <br>
     * <p>*   NON_EXECUTION: The remediation template is not executed.</p>
     * <p>*   AUTO_EXECUTION: The remediation template is automatically executed.</p>
     * <p>*   MANUAL_EXECUTION: The remediation template is manually executed.</p>
     * <p>*   NOT_CONFIG: The execution mode is not specified.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InvokeType")
    public String invokeType;

    /**
     * <p>The configuration of the remediation template.</p>
     * <br>
     * <p>For more information about how to obtain the configuration of the remediation template, see [ListRemediationTemplates](https://help.aliyun.com/document_detail/416781.html). You can view the `TemplateDefinition` response parameter to obtain the configuration of the remediation template.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The ID of the remediation template.</p>
     * <br>
     * <p>*   If you set the `RemediationType` parameter to `OOS`, set this parameter to the identifier of the relevant official remediation template, such as `ACS-OSS-PutBucketAcl`. For more information about how to obtain the remediation template identifier, see [ListRemediationTemplates](https://help.aliyun.com/document_detail/416781.html).</p>
     * <p>*   If you set the `RemediationType` parameter to `FC`, set this parameter to the Alibaba Cloud Resource Name (ARN) of the relevant Function Compute resource, such as `acs:fc:cn-hangzhou:100931896542****:services/ConfigService.LATEST/functions/test-php`.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemediationTemplateId")
    public String remediationTemplateId;

    /**
     * <p>The type of the remediation template. Valid values:</p>
     * <br>
     * <p>*   OOS: stands for Operation Orchestration Service and indicates official remediation.</p>
     * <p>*   FC: stands for Function Compute and indicates custom remediation.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemediationType")
    public String remediationType;

    /**
     * <p>The source of remediation template. Valid values:</p>
     * <br>
     * <p>*   ALIYUN (default): official template.</p>
     * <p>*   CUSTOM: custom template.</p>
     * <p>*   NONE: none.</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static CreateAggregateRemediationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAggregateRemediationRequest self = new CreateAggregateRemediationRequest();
        return TeaModel.build(map, self);
    }

    public CreateAggregateRemediationRequest setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
        return this;
    }
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    public CreateAggregateRemediationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAggregateRemediationRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public CreateAggregateRemediationRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public CreateAggregateRemediationRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public CreateAggregateRemediationRequest setRemediationTemplateId(String remediationTemplateId) {
        this.remediationTemplateId = remediationTemplateId;
        return this;
    }
    public String getRemediationTemplateId() {
        return this.remediationTemplateId;
    }

    public CreateAggregateRemediationRequest setRemediationType(String remediationType) {
        this.remediationType = remediationType;
        return this;
    }
    public String getRemediationType() {
        return this.remediationType;
    }

    public CreateAggregateRemediationRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
