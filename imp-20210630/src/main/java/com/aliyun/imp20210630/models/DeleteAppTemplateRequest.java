// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteAppTemplateRequest extends TeaModel {
    // 模板唯一标识
    @NameInMap("AppTemplateId")
    public String appTemplateId;

    public static DeleteAppTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppTemplateRequest self = new DeleteAppTemplateRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppTemplateRequest setAppTemplateId(String appTemplateId) {
        this.appTemplateId = appTemplateId;
        return this;
    }
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

}
