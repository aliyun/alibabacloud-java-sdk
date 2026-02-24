// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class UpdateAggregateRemediationRequest extends TeaModel {
    /**
     * <p>The ID of the account group.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/255797.html">ListAggregators</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ca-6b4a626622af0012****</p>
     */
    @NameInMap("AggregatorId")
    public String aggregatorId;

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
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/270036.html">ListAggregateRemediations</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crr-909ba2d4716700eb****</p>
     */
    @NameInMap("RemediationId")
    public String remediationId;

    /**
     * <p>The ID of the remediation template.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/270066.html">ListRemediationTemplates</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>ACS-OSS-PutBucketAcl</p>
     */
    @NameInMap("RemediationTemplateId")
    public String remediationTemplateId;

    /**
     * <p>The type of the remediation. Valid values:</p>
     * <ul>
     * <li><p>OOS: Operation Orchestration Service (OOS) (template-based remediation).</p>
     * </li>
     * <li><p>FC: Function Compute (FC) (custom remediation).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OOS</p>
     */
    @NameInMap("RemediationType")
    public String remediationType;

    /**
     * <p>The source of the rule for which the remediation is performed. Valid values:</p>
     * <ul>
     * <li><p>ALIYUN: rule template.</p>
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
