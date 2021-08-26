// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CreateAppTemplateRequest extends TeaModel {
    // 应用模板名称
    @NameInMap("AppTemplateName")
    public String appTemplateName;

    // 应用模板场景，电商business，课堂classroom
    @NameInMap("Scene")
    public String scene;

    // 组件列表
    @NameInMap("ComponentList")
    public java.util.List<String> componentList;

    public static CreateAppTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAppTemplateRequest self = new CreateAppTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateAppTemplateRequest setAppTemplateName(String appTemplateName) {
        this.appTemplateName = appTemplateName;
        return this;
    }
    public String getAppTemplateName() {
        return this.appTemplateName;
    }

    public CreateAppTemplateRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public CreateAppTemplateRequest setComponentList(java.util.List<String> componentList) {
        this.componentList = componentList;
        return this;
    }
    public java.util.List<String> getComponentList() {
        return this.componentList;
    }

}
