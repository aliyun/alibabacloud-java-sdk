// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateCustomTemplateRequest extends TeaModel {
    /**
     * <p>The template configuration in JSON format. The value must be in the following format: {height:xxx,scale:xxx,gop:xxx,bframes:xxx,cdesc:xxx}. All fields are required. The call fails if any field is missing.</p>
     * <blockquote>
     * <p>For more information about the parameters, see the <strong>CustomTemplate details</strong> table below.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;height&quot;:&quot;1060&quot;,&quot;scale&quot;:&quot;[16:9]&quot;,&quot;gop&quot;:&quot;60&quot;,&quot;bframes&quot;:&quot;30&quot;,&quot;cdesc&quot;:&quot;h264&quot;}</p>
     */
    @NameInMap("CustomTemplate")
    public String customTemplate;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the template to add.</p>
     * <blockquote>
     * <p>Record the template name after you create it. The name is required for subsequent operations, such as using, querying, and deleting the template.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestTemplate</p>
     */
    @NameInMap("Template")
    public String template;

    public static CreateCustomTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomTemplateRequest self = new CreateCustomTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomTemplateRequest setCustomTemplate(String customTemplate) {
        this.customTemplate = customTemplate;
        return this;
    }
    public String getCustomTemplate() {
        return this.customTemplate;
    }

    public CreateCustomTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateCustomTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCustomTemplateRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

}
