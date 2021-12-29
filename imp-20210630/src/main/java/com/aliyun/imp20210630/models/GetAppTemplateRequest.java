// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class GetAppTemplateRequest extends TeaModel {
    // 应用模板唯一标识
    @NameInMap("AppTemplateId")
    public String appTemplateId;

    public static GetAppTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppTemplateRequest self = new GetAppTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetAppTemplateRequest setAppTemplateId(String appTemplateId) {
        this.appTemplateId = appTemplateId;
        return this;
    }
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

}
