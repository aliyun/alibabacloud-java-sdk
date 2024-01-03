// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class GetTemplateRequest extends TeaModel {
    /**
     * <p>Template Area</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>ResourceGroup ID</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>Template ID</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static GetTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplateRequest self = new GetTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplateRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public GetTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

}
