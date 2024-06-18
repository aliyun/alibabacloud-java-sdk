// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CreateOrUpdateFormDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>APP_XCE0EVXS6DYG3YDYC5RD</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;countrySelectField_l0c1cwiu\&quot;:[{\&quot;value\&quot;:\&quot;US\&quot;}]}</p>
     */
    @NameInMap("FormDataJson")
    public String formDataJson;

    /**
     * <strong>example:</strong>
     * <p>FORM-GX866MC1NC1VOFF6WVQW33FD16E23L3CPMKVKA</p>
     */
    @NameInMap("FormUuid")
    public String formUuid;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NoExecuteExpression")
    public Boolean noExecuteExpression;

    @NameInMap("SearchCondition")
    public String searchCondition;

    /**
     * <strong>example:</strong>
     * <p>09866181UTZVVD4R3DC955FNKIM52HVPU5WWK7</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    /**
     * <strong>example:</strong>
     * <p>012345</p>
     */
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
