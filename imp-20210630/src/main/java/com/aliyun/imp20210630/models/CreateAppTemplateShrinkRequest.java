// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateAppTemplateShrinkRequest extends TeaModel {
    // 应用模板名称
    @NameInMap("AppTemplateName")
    public String appTemplateName;

    // 组件列表
    @NameInMap("ComponentList")
    public String componentListShrink;

    // 集成方式（一体化SDK：paasSDK，样板间：standardRoom）
    @NameInMap("IntegrationMode")
    public String integrationMode;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    // 应用模板场景，电商business，课堂classroom
    @NameInMap("Scene")
    public String scene;

    public static CreateAppTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppTemplateShrinkRequest self = new CreateAppTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppTemplateShrinkRequest setAppTemplateName(String appTemplateName) {
        this.appTemplateName = appTemplateName;
        return this;
    }
    public String getAppTemplateName() {
        return this.appTemplateName;
    }

    public CreateAppTemplateShrinkRequest setComponentListShrink(String componentListShrink) {
        this.componentListShrink = componentListShrink;
        return this;
    }
    public String getComponentListShrink() {
        return this.componentListShrink;
    }

    public CreateAppTemplateShrinkRequest setIntegrationMode(String integrationMode) {
        this.integrationMode = integrationMode;
        return this;
    }
    public String getIntegrationMode() {
        return this.integrationMode;
    }

    public CreateAppTemplateShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateAppTemplateShrinkRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
