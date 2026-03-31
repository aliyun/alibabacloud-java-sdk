// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateRemediationRequest extends TeaModel {
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
     * <p>For more information about how to obtain the ID of a rule, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-8a973ac2e2be00a2****</p>
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
     * <p>For more information about how to obtain the remediation template configuration, see the <code>TemplateDefinition</code> response parameter provided in <a href="https://help.aliyun.com/document_detail/416781.html">ListRemediationTemplates</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;bucketName&quot;: &quot;{resourceId}&quot;, &quot;regionId&quot;: &quot;{regionId}&quot;, &quot;permissionName&quot;: &quot;private&quot;}</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
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
     * <li>OOS: Operation Orchestration Service (official remediation)</li>
     * <li>FC: Function Compute (custom remediation)</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OOS</p>
     */
    @NameInMap("RemediationType")
    public String remediationType;

    /**
     * <p>The source of remediation. Valid values:</p>
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

    public static CreateRemediationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRemediationRequest self = new CreateRemediationRequest();
        return TeaModel.build(map, self);
    }

    public CreateRemediationRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateRemediationRequest setConfigRuleId(String configRuleId) {
        this.configRuleId = configRuleId;
        return this;
    }
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public CreateRemediationRequest setInvokeType(String invokeType) {
        this.invokeType = invokeType;
        return this;
    }
    public String getInvokeType() {
        return this.invokeType;
    }

    public CreateRemediationRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public CreateRemediationRequest setRemediationTemplateId(String remediationTemplateId) {
        this.remediationTemplateId = remediationTemplateId;
        return this;
    }
    public String getRemediationTemplateId() {
        return this.remediationTemplateId;
    }

    public CreateRemediationRequest setRemediationType(String remediationType) {
        this.remediationType = remediationType;
        return this;
    }
    public String getRemediationType() {
        return this.remediationType;
    }

    public CreateRemediationRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
