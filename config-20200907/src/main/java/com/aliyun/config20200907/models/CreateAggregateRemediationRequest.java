// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAggregateRemediationRequest extends TeaModel {
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
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <code>token</code> can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The rule ID.</p>
     * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/264148.html">ListAggregateConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-6b7c626622af00b4****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The execution mode of the remediation template. Valid values:</p>
     * <ul>
     * <li>NON_EXECUTION: The remediation template is not executed.</li>
     * <li>AUTO_EXECUTION: The remediation template is automatically executed.</li>
     * <li>MANUAL_EXECUTION: The remediation template is manually executed.</li>
     * <li>NOT_CONFIG: The execution mode is not specified.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MANUAL_EXECUTION</p>
     */
    @NameInMap("InvokeType")
    public String invokeType;

    /**
     * <p>The configuration of the remediation template.</p>
     * <p>For more information about how to obtain the configuration of the remediation template, see <a href="https://help.aliyun.com/document_detail/416781.html">ListRemediationTemplates</a>. You can view the <code>TemplateDefinition</code> response parameter to obtain the configuration of the remediation template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;bucketName&quot;: &quot;{resourceId}&quot;, &quot;regionId&quot;: &quot;{regionId}&quot;, &quot;permissionName&quot;: &quot;private&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The ID of the remediation template.</p>
     * <ul>
     * <li>If you set the <code>RemediationType</code> parameter to <code>OOS</code>, set this parameter to the identifier of the relevant official remediation template, such as <code>ACS-OSS-PutBucketAcl</code>. For more information about how to obtain the remediation template identifier, see <a href="https://help.aliyun.com/document_detail/416781.html">ListRemediationTemplates</a>.</li>
     * <li>If you set the <code>RemediationType</code> parameter to <code>FC</code>, set this parameter to the Alibaba Cloud Resource Name (ARN) of the relevant Function Compute resource, such as <code>acs:fc:cn-hangzhou:100931896542****:services/ConfigService.LATEST/functions/test-php</code>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS-OSS-PutBucketAcl</p>
     */
    @NameInMap("RemediationTemplateId")
    public String remediationTemplateId;

    /**
     * <p>The type of the remediation template. Valid values:</p>
     * <ul>
     * <li>OOS: stands for Operation Orchestration Service and indicates official remediation.</li>
     * <li>FC: stands for Function Compute and indicates custom remediation.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OOS</p>
     */
    @NameInMap("RemediationType")
    public String remediationType;

    /**
     * <p>The source of remediation template. Valid values:</p>
     * <ul>
     * <li>ALIYUN (default): official template.</li>
     * <li>CUSTOM: custom template.</li>
     * <li>NONE: none.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
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
