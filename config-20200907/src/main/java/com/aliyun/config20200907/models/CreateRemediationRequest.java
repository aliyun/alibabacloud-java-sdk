// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateRemediationRequest extends TeaModel {
    /**
     * <p>A client token to ensure the idempotence of the request. The token must be unique for each request. The <code>ClientToken</code> parameter contains only ASCII characters and must not exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The rule ID.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/169607.html">ListConfigRules</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cr-8a973ac2e2be00a2****</p>
     */
    @NameInMap("ConfigRuleId")
    public String configRuleId;

    /**
     * <p>The execution mode of the remediation. Valid values:</p>
     * <ul>
     * <li><p>NON_EXECUTION: The remediation is not executed.</p>
     * </li>
     * <li><p>AUTO_EXECUTION: The remediation is automatically executed.</p>
     * </li>
     * <li><p>MANUAL_EXECUTION: The remediation is manually executed.</p>
     * </li>
     * <li><p>NOT_CONFIG: The execution mode is not set.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MANUAL_EXECUTION</p>
     */
    @NameInMap("InvokeType")
    public String invokeType;

    /**
     * <p>The remediation parameters.</p>
     * <p>For more information, see the <code>TemplateDefinition</code> parameter in <a href="https://help.aliyun.com/document_detail/416781.html">ListRemediationTemplates</a>.</p>
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
     * <li><p>If <code>RemediationType</code> is set to <code>OOS</code>, set this parameter to <code>ACS-OSS-PutBucketAcl</code>. For more information, see <a href="https://help.aliyun.com/document_detail/416781.html">ListRemediationTemplates</a>.</p>
     * </li>
     * <li><p>If <code>RemediationType</code> is set to <code>FC</code>, set this parameter to the Alibaba Cloud Resource Name (ARN) of the function in Function Compute. Example: <code>acs:fc:cn-hangzhou:100931896542****:services/ConfigService.LATEST/functions/test-php</code>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS-OSS-PutBucketAcl</p>
     */
    @NameInMap("RemediationTemplateId")
    public String remediationTemplateId;

    /**
     * <p>The type of the remediation. Valid values:</p>
     * <ul>
     * <li><p>OOS: template-based remediation using OOS.</p>
     * </li>
     * <li><p>FC: custom remediation using FC.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OOS</p>
     */
    @NameInMap("RemediationType")
    public String remediationType;

    /**
     * <p>The source of the remediation template. Valid values:</p>
     * <ul>
     * <li><p>ALIYUN (default): an official template.</p>
     * </li>
     * <li><p>CUSTOM: a custom template. This value is required for custom FC remediations.</p>
     * </li>
     * <li><p>NONE: no source.</p>
     * </li>
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
