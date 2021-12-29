// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class UpdateAppTemplateConfigShrinkRequest extends TeaModel {
    // 应用模板唯一标识
    @NameInMap("AppTemplateId")
    public String appTemplateId;

    // 更新配置
    @NameInMap("ConfigList")
    public String configListShrink;

    public static UpdateAppTemplateConfigShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAppTemplateConfigShrinkRequest self = new UpdateAppTemplateConfigShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAppTemplateConfigShrinkRequest setAppTemplateId(String appTemplateId) {
        this.appTemplateId = appTemplateId;
        return this;
    }
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

    public UpdateAppTemplateConfigShrinkRequest setConfigListShrink(String configListShrink) {
        this.configListShrink = configListShrink;
        return this;
    }
    public String getConfigListShrink() {
        return this.configListShrink;
    }

}
