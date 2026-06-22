// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ApiTemplate extends TeaModel {
    /**
     * <p>The name of the API operation.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateCluster</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>The parameters in the API operation template.</p>
     * 
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzabjyop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The status of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AT-Af***</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The name of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>datalakeTest1</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static ApiTemplate build(java.util.Map<String, ?> map) throws Exception {
        ApiTemplate self = new ApiTemplate();
        return TeaModel.build(map, self);
    }

    public ApiTemplate setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public ApiTemplate setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ApiTemplate setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ApiTemplate setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ApiTemplate setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ApiTemplate setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public ApiTemplate setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
