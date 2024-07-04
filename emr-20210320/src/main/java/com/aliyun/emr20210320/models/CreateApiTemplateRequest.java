// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class CreateApiTemplateRequest extends TeaModel {
    /**
     * <p>接口名。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateCluster</p>
     */
    @NameInMap("ApiName")
    public String apiName;

    /**
     * <p>接口request内容。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>content</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>地域ID。</p>
     * <p>This parameter is required.</p>
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
     * <p>集群模板名字。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATALAKE模板</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    public static CreateApiTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApiTemplateRequest self = new CreateApiTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateApiTemplateRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public CreateApiTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateApiTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApiTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateApiTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

}
