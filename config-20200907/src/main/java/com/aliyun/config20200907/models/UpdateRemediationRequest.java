// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateRemediationRequest extends TeaModel {
    /**
     * <p>A client token that is used to ensure the idempotence of the request. Generate a token that is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>2014295338-e7361358-5822-4276-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The execution mode of the remediation. Valid values:</p>
     * <ul>
     * <li><p>NON_EXECUTION: The remediation is not executed.</p>
     * </li>
     * <li><p>AUTO_EXECUTION: The remediation is automatically executed.</p>
     * </li>
     * <li><p>MANUAL_EXECUTION: The remediation is manually executed.</p>
     * </li>
     * <li><p>NOT_CONFIG: The execution mode is not specified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AUTO_EXECUTION</p>
     */
    @NameInMap("InvokeType")
    public String invokeType;

    /**
     * <p>The parameters of the remediation setting.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;properties&quot;:[{&quot;name&quot;:&quot;regionId&quot;,&quot;type&quot;:&quot;STRING&quot;,&quot;value&quot;:&quot;{regionId}&quot;,&quot;allowedValues&quot;:[]},{&quot;name&quot;:&quot;bucketName&quot;,&quot;type&quot;:&quot;STRING&quot;,&quot;value&quot;:&quot;{resourceId}&quot;,&quot;allowedValues&quot;:[],&quot;description&quot;:&quot;OSS Bucket名称。&quot;},{&quot;name&quot;:&quot;permissionName&quot;,&quot;type&quot;:&quot;STRING&quot;,&quot;value&quot;:&quot;private&quot;,&quot;allowedValues&quot;:[&quot;public-read-write&quot;,&quot;public-read&quot;,&quot;private&quot;],&quot;description&quot;:&quot;ACL权限名称。&quot;}]}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The ID of the remediation setting.</p>
     * <p>For more information about how to obtain the ID of a remediation setting, see <a href="https://help.aliyun.com/document_detail/270772.html">ListRemediations</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-909ba2d4716700eb****</p>
     */
    @NameInMap("RemediationId")
    public String remediationId;

    /**
     * <p>The ID of the remediation template.</p>
     * <p>For more information about how to obtain the ID of a remediation template, see <a href="https://help.aliyun.com/document_detail/270066.html">ListRemediationTemplates</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS-OSS-PutBucketAcl</p>
     */
    @NameInMap("RemediationTemplateId")
    public String remediationTemplateId;

    /**
     * <p>The type of the remediation. Valid values:</p>
     * <ul>
     * <li><p>OOS: Operation Orchestration Service (template-based remediation).</p>
     * </li>
     * <li><p>FC: Function Compute (custom remediation).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OOS</p>
     */
    @NameInMap("RemediationType")
    public String remediationType;

    /**
     * <p>The source of the remediation. Valid values:</p>
     * <ul>
     * <li><p>ALIYUN: official remediation.</p>
     * </li>
     * <li><p>CUSTOM: custom remediation.</p>
     * </li>
     * <li><p>NONE: none.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ALIYUN</p>
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
