// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstanceByIdRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("Id")
    public String id;

    @NameInMap("Language")
    public String language;

    @NameInMap("SystemToken")
    public String systemToken;

    public static GetInstanceByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceByIdRequest self = new GetInstanceByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceByIdRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetInstanceByIdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetInstanceByIdRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetInstanceByIdRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
