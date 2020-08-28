// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryAIPlanTemplatesRequest extends TeaModel {
    @NameInMap("AppTemplateId")
    @Validation(required = true)
    public String appTemplateId;

    @NameInMap("AppVersion")
    @Validation(required = true)
    public String appVersion;

    public static QueryAIPlanTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAIPlanTemplatesRequest self = new QueryAIPlanTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public QueryAIPlanTemplatesRequest setAppTemplateId(String appTemplateId) {
        this.appTemplateId = appTemplateId;
        return this;
    }
    public String getAppTemplateId() {
        return this.appTemplateId;
    }

    public QueryAIPlanTemplatesRequest setAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }
    public String getAppVersion() {
        return this.appVersion;
    }

}
