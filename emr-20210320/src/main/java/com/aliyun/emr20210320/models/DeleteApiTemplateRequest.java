// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class DeleteApiTemplateRequest extends TeaModel {
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
     * <p>区域ID。</p>
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
     * <p>集群模板id。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>at-****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static DeleteApiTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiTemplateRequest self = new DeleteApiTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApiTemplateRequest setApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }
    public String getApiName() {
        return this.apiName;
    }

    public DeleteApiTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteApiTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DeleteApiTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
