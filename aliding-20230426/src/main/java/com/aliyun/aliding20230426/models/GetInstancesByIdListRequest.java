// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstancesByIdListRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("Language")
    public String language;

    @NameInMap("ProcessInstanceIds")
    public String processInstanceIds;

    @NameInMap("SystemToken")
    public String systemToken;

    public static GetInstancesByIdListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstancesByIdListRequest self = new GetInstancesByIdListRequest();
        return TeaModel.build(map, self);
    }

    public GetInstancesByIdListRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetInstancesByIdListRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetInstancesByIdListRequest setProcessInstanceIds(String processInstanceIds) {
        this.processInstanceIds = processInstanceIds;
        return this;
    }
    public String getProcessInstanceIds() {
        return this.processInstanceIds;
    }

    public GetInstancesByIdListRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
