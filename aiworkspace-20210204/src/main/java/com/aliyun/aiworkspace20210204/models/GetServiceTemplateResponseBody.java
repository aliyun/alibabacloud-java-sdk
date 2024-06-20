// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetServiceTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-30T12:51:33.028Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>{
     *       &quot;processor&quot;: &quot;tensorflow_gpu_1.12&quot;
     * }</p>
     */
    @NameInMap("InferenceSpec")
    public java.util.Map<String, ?> inferenceSpec;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <strong>example:</strong>
     * <p>1234567890******</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>pai</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <strong>example:</strong>
     * <p>40325405-579C-4D82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>stable diffusion 1.5</p>
     */
    @NameInMap("ServiceTemplateDescription")
    public String serviceTemplateDescription;

    /**
     * <strong>example:</strong>
     * <p>https://***.md</p>
     */
    @NameInMap("ServiceTemplateDoc")
    public String serviceTemplateDoc;

    /**
     * <strong>example:</strong>
     * <p>st-rbvg5wzlj****9ks92</p>
     */
    @NameInMap("ServiceTemplateId")
    public String serviceTemplateId;

    /**
     * <strong>example:</strong>
     * <p>stable_diffusion_aigc</p>
     */
    @NameInMap("ServiceTemplateName")
    public String serviceTemplateName;

    /**
     * <strong>example:</strong>
     * <p>1234567890******</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetServiceTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetServiceTemplateResponseBody self = new GetServiceTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetServiceTemplateResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetServiceTemplateResponseBody setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public GetServiceTemplateResponseBody setInferenceSpec(java.util.Map<String, ?> inferenceSpec) {
        this.inferenceSpec = inferenceSpec;
        return this;
    }
    public java.util.Map<String, ?> getInferenceSpec() {
        return this.inferenceSpec;
    }

    public GetServiceTemplateResponseBody setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public GetServiceTemplateResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetServiceTemplateResponseBody setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public GetServiceTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetServiceTemplateResponseBody setServiceTemplateDescription(String serviceTemplateDescription) {
        this.serviceTemplateDescription = serviceTemplateDescription;
        return this;
    }
    public String getServiceTemplateDescription() {
        return this.serviceTemplateDescription;
    }

    public GetServiceTemplateResponseBody setServiceTemplateDoc(String serviceTemplateDoc) {
        this.serviceTemplateDoc = serviceTemplateDoc;
        return this;
    }
    public String getServiceTemplateDoc() {
        return this.serviceTemplateDoc;
    }

    public GetServiceTemplateResponseBody setServiceTemplateId(String serviceTemplateId) {
        this.serviceTemplateId = serviceTemplateId;
        return this;
    }
    public String getServiceTemplateId() {
        return this.serviceTemplateId;
    }

    public GetServiceTemplateResponseBody setServiceTemplateName(String serviceTemplateName) {
        this.serviceTemplateName = serviceTemplateName;
        return this;
    }
    public String getServiceTemplateName() {
        return this.serviceTemplateName;
    }

    public GetServiceTemplateResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
