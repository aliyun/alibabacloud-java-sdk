// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListNavigationByFormTypeRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("FormType")
    public String formType;

    @NameInMap("Language")
    public String language;

    @NameInMap("SystemToken")
    public String systemToken;

    public static ListNavigationByFormTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNavigationByFormTypeRequest self = new ListNavigationByFormTypeRequest();
        return TeaModel.build(map, self);
    }

    public ListNavigationByFormTypeRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public ListNavigationByFormTypeRequest setFormType(String formType) {
        this.formType = formType;
        return this;
    }
    public String getFormType() {
        return this.formType;
    }

    public ListNavigationByFormTypeRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListNavigationByFormTypeRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
