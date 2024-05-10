// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFormComponentDefinitionListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("FormUuid")
    public String formUuid;

    @NameInMap("Language")
    public String language;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    public static GetFormComponentDefinitionListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFormComponentDefinitionListRequest self = new GetFormComponentDefinitionListRequest();
        return TeaModel.build(map, self);
    }

    public GetFormComponentDefinitionListRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetFormComponentDefinitionListRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public GetFormComponentDefinitionListRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetFormComponentDefinitionListRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
