// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class CreateWebsiteIndexPageBaselineRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateWebsiteIndexPageBaselineRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebsiteIndexPageBaselineRequest self = new CreateWebsiteIndexPageBaselineRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebsiteIndexPageBaselineRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateWebsiteIndexPageBaselineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateWebsiteIndexPageBaselineRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
