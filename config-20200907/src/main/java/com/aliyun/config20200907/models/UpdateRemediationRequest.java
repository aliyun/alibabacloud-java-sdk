// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateRemediationRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotency of the request. You can use the client to generate the value, but you must ensure that the value is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>2014295338-e7361358-5822-4276-8d30-b5183fac****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The execution mode of the remediation. Valid values:</p>
     * <ul>
     * <li>NON_EXECUTION: The remediation is not executed.</li>
     * <li>AUTO_EXECUTION: The remediation is automatically executed.</li>
     * <li>MANUAL_EXECUTION: The remediation is manually executed.</li>
     * <li>NOT_CONFIG: The execution mode is not specified.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AUTO_EXECUTION</p>
     */
    @NameInMap("InvokeType")
    public String invokeType;

    /**
     * <p>The desired parameter values of the remediation setting.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;properties&quot;:[{&quot;name&quot;:&quot;regionId&quot;,&quot;type&quot;:&quot;STRING&quot;,&quot;value&quot;:&quot;{regionId}&quot;,&quot;allowedValues&quot;:[]},{&quot;name&quot;:&quot;bucketName&quot;,&quot;type&quot;:&quot;STRING&quot;,&quot;value&quot;:&quot;{resourceId}&quot;,&quot;allowedValues&quot;:[],&quot;description&quot;:&quot;OSS Bucket Name.&quot;},{&quot;name&quot;:&quot;permissionName&quot;,&quot;type&quot;:&quot;STRING&quot;,&quot;value&quot;:&quot;private&quot;,&quot;allowedValues&quot;:[&quot;public-read-write&quot;,&quot;public-read&quot;,&quot;private&quot;],&quot;description&quot;:&quot;ACL Permission Name.&quot;}]}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The ID of the remediation setting.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/270772.html">ListRemediations</a> operation to obtain the ID of the remediation setting.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-909ba2d4716700eb****</p>
     */
    @NameInMap("RemediationId")
    public String remediationId;

    /**
     * <p>The ID of the remediation template.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/270066.html">ListRemediationTemplates</a> operation to obtain the ID of the remediation template.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS-OSS-PutBucketAcl</p>
     */
    @NameInMap("RemediationTemplateId")
    public String remediationTemplateId;

    /**
     * <p>The type of the remediation template. Valid values:</p>
     * <ul>
     * <li>OOS: Operation Orchestration Service (OOS)</li>
     * <li>FC: Function Compute. You can use Function Compute to configure custom remediation settings.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OOS</p>
     */
    @NameInMap("RemediationType")
    public String remediationType;

    /**
     * <p>The source of the remediation setting. Valid values:</p>
     * <ul>
     * <li>ALIYUN: the default remediation setting of Alibaba Cloud.</li>
     * <li>CUSTOM: a custom remediation setting.</li>
     * <li>NONE: The source is not specified.</li>
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
