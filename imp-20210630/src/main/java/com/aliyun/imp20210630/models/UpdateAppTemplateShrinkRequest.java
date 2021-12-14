// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateAppTemplateShrinkRequest extends TeaModel {
    // 应用模板唯一标识
    @NameInMap("AppTemplateId")
    public String appTemplateId;

    // 应用模板名称
    @NameInMap("AppTemplateName")
    public String appTemplateName;

    // 组件列表
    @NameInMap("ComponentList")
    public String componentListShrink;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateAppTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppTemplateShrinkRequest self = new UpdateAppTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppTemplateShrinkRequest setAppTemplateId(String appTemplateId) {
        this.appTemplateId = appTemplateId;
        return this;
    }
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

    public UpdateAppTemplateShrinkRequest setAppTemplateName(String appTemplateName) {
        this.appTemplateName = appTemplateName;
        return this;
    }
    public String getAppTemplateName() {
        return this.appTemplateName;
    }

    public UpdateAppTemplateShrinkRequest setComponentListShrink(String componentListShrink) {
        this.componentListShrink = componentListShrink;
        return this;
    }
    public String getComponentListShrink() {
        return this.componentListShrink;
    }

    public UpdateAppTemplateShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
