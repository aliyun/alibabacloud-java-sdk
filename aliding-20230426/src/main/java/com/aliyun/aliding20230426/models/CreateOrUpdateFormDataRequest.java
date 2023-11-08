// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateOrUpdateFormDataRequest extends TeaModel {
    @NameInMap("AppType")
    public String appType;

    @NameInMap("FormDataJson")
    public String formDataJson;

    @NameInMap("FormUuid")
    public String formUuid;

    @NameInMap("NoExecuteExpression")
    public Boolean noExecuteExpression;

    @NameInMap("SearchCondition")
    public String searchCondition;

    @NameInMap("SystemToken")
    public String systemToken;

    @NameInMap("UserId")
    public String userId;

    public static CreateOrUpdateFormDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateFormDataRequest self = new CreateOrUpdateFormDataRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateFormDataRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public CreateOrUpdateFormDataRequest setFormDataJson(String formDataJson) {
        this.formDataJson = formDataJson;
        return this;
    }
    public String getFormDataJson() {
        return this.formDataJson;
    }

    public CreateOrUpdateFormDataRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public CreateOrUpdateFormDataRequest setNoExecuteExpression(Boolean noExecuteExpression) {
        this.noExecuteExpression = noExecuteExpression;
        return this;
    }
    public Boolean getNoExecuteExpression() {
        return this.noExecuteExpression;
    }

    public CreateOrUpdateFormDataRequest setSearchCondition(String searchCondition) {
        this.searchCondition = searchCondition;
        return this;
    }
    public String getSearchCondition() {
        return this.searchCondition;
    }

    public CreateOrUpdateFormDataRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public CreateOrUpdateFormDataRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
