// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ServiceTemplate extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35Z</p>
     */
    @NameInMap("GmtModifiedTime")
    public String gmtModifiedTime;

    /**
     * <strong>example:</strong>
     * <p>{     &quot;processor&quot;: &quot;tensorflow_gpu_1.12&quot; }</p>
     */
    @NameInMap("InferenceSpec")
    public java.util.Map<String, ?> inferenceSpec;

    @NameInMap("Labels")
    public java.util.List<Label> labels;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderNumber")
    public Long orderNumber;

    /**
     * <strong>example:</strong>
     * <p>155770209****904</p>
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
     * <p>这里是一个描述。</p>
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
     * <p>st-asdkjf**skdhh</p>
     */
    @NameInMap("ServiceTemplateId")
    public String serviceTemplateId;

    /**
     * <strong>example:</strong>
     * <p>foo</p>
     */
    @NameInMap("ServiceTemplateName")
    public String serviceTemplateName;

    /**
     * <strong>example:</strong>
     * <p>155770209****904</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static ServiceTemplate build(java.util.Map<String, ?> map) throws Exception {
        ServiceTemplate self = new ServiceTemplate();
        return TeaModel.build(map, self);
    }

    public ServiceTemplate setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public ServiceTemplate setGmtModifiedTime(String gmtModifiedTime) {
        this.gmtModifiedTime = gmtModifiedTime;
        return this;
    }
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    public ServiceTemplate setInferenceSpec(java.util.Map<String, ?> inferenceSpec) {
        this.inferenceSpec = inferenceSpec;
        return this;
    }
    public java.util.Map<String, ?> getInferenceSpec() {
        return this.inferenceSpec;
    }

    public ServiceTemplate setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public ServiceTemplate setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    public Long getOrderNumber() {
        return this.orderNumber;
    }

    public ServiceTemplate setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public ServiceTemplate setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ServiceTemplate setServiceTemplateDescription(String serviceTemplateDescription) {
        this.serviceTemplateDescription = serviceTemplateDescription;
        return this;
    }
    public String getServiceTemplateDescription() {
        return this.serviceTemplateDescription;
    }

    public ServiceTemplate setServiceTemplateDoc(String serviceTemplateDoc) {
        this.serviceTemplateDoc = serviceTemplateDoc;
        return this;
    }
    public String getServiceTemplateDoc() {
        return this.serviceTemplateDoc;
    }

    public ServiceTemplate setServiceTemplateId(String serviceTemplateId) {
        this.serviceTemplateId = serviceTemplateId;
        return this;
    }
    public String getServiceTemplateId() {
        return this.serviceTemplateId;
    }

    public ServiceTemplate setServiceTemplateName(String serviceTemplateName) {
        this.serviceTemplateName = serviceTemplateName;
        return this;
    }
    public String getServiceTemplateName() {
        return this.serviceTemplateName;
    }

    public ServiceTemplate setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
