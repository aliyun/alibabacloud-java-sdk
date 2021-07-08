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

}
