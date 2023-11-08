// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteFormDataRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("FormInstanceId")
    public String formInstanceId;

    @NameInMap("Language")
    public String language;

    @NameInMap("SystemToken")
    public String systemToken;

    public static DeleteFormDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFormDataRequest self = new DeleteFormDataRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFormDataRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public DeleteFormDataRequest setFormInstanceId(String formInstanceId) {
        this.formInstanceId = formInstanceId;
        return this;
    }
    public String getFormInstanceId() {
        return this.formInstanceId;
    }

    public DeleteFormDataRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public DeleteFormDataRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
