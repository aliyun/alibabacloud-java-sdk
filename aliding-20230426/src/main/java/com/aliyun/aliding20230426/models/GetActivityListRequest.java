// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetActivityListRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("Language")
    public String language;

    @NameInMap("ProcessCode")
    public String processCode;

    @NameInMap("SystemToken")
    public String systemToken;

    public static GetActivityListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetActivityListRequest self = new GetActivityListRequest();
        return TeaModel.build(map, self);
    }

    public GetActivityListRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetActivityListRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetActivityListRequest setProcessCode(String processCode) {
        this.processCode = processCode;
        return this;
    }
    public String getProcessCode() {
        return this.processCode;
    }

    public GetActivityListRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
