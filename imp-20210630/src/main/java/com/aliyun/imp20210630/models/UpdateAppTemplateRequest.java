// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateAppTemplateRequest extends TeaModel {
    // 应用模板唯一标识
    @NameInMap("AppTemplateId")
    public String appTemplateId;

    // 应用模板名称
    @NameInMap("AppTemplateName")
    public String appTemplateName;

    // 组件列表
    @NameInMap("ComponentList")
    public java.util.List<String> componentList;

    public static UpdateAppTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppTemplateRequest self = new UpdateAppTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppTemplateRequest setAppTemplateId(String appTemplateId) {
        this.appTemplateId = appTemplateId;
        return this;
    }
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

    public UpdateAppTemplateRequest setAppTemplateName(String appTemplateName) {
        this.appTemplateName = appTemplateName;
        return this;
    }
    public String getAppTemplateName() {
        return this.appTemplateName;
    }

    public UpdateAppTemplateRequest setComponentList(java.util.List<String> componentList) {
        this.componentList = componentList;
        return this;
    }
    public java.util.List<String> getComponentList() {
        return this.componentList;
    }

}
