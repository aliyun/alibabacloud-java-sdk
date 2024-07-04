// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ApiTemplate extends TeaModel {
    /**
     * <p>接口名。</p>
     * 
     * <strong>example:</strong>
     * <p>CreateCluster</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>模版接口参数。</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>区域ID。</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>资源组ID。</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmzabjyop****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>模板状态。</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>模板ID。</p>
     * 
     * <strong>example:</strong>
     * <p>AT-Af***</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>模板ID。</p>
     * 
     * <strong>example:</strong>
     * <p>AT-Af***</p>
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
