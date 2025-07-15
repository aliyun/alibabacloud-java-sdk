// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateCustomTemplateRequest extends TeaModel {
    /**
     * <p>The configuration of the template. The value is in the following JSON format: {height:xxx,scale:xxx,gop:xxx,bframes:xxx,cdesc:xxx}. All fields are required. If any field is left empty, the call fails.</p>
     * <blockquote>
     * <p> For more information, see <strong>Fields of the CustomTemplate parameter</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{height:1080,scale:[16:9],gop:60,bframes:30,cdesc:h264}</p>
     */
    @NameInMap("CustomTemplate")
    public String customTemplate;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the template.</p>
     * <blockquote>
     * <p>Record the template name. The template name is required if you want to use, query, or delete the template.</p>
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
