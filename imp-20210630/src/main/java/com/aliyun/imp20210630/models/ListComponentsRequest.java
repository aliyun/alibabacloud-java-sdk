// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListComponentsRequest extends TeaModel {
    // 应用唯一标识
    @NameInMap("AppId")
    public String appId;

    // 应用模板唯一标识
    @NameInMap("AppTemplateId")
    public String appTemplateId;

    public static ListComponentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListComponentsRequest self = new ListComponentsRequest();
        return TeaModel.build(map, self);
    }

    public ListComponentsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListComponentsRequest setAppTemplateId(String appTemplateId) {
        this.appTemplateId = appTemplateId;
        return this;
    }
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

}
