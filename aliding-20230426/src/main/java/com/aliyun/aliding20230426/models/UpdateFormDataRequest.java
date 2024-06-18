// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class UpdateFormDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>APP_PBKTxxx</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>FORM_INxxx</p>
     */
    @NameInMap("FormInstanceId")
    public String formInstanceId;

    /**
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <strong>example:</strong>
     * <p>hexxxx</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("UpdateFormDataJson")
    public String updateFormDataJson;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseLatestVersion")
    public Boolean useLatestVersion;

    public static UpdateFormDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFormDataRequest self = new UpdateFormDataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFormDataRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public UpdateFormDataRequest setFormInstanceId(String formInstanceId) {
        this.formInstanceId = formInstanceId;
        return this;
    }
    public String getFormInstanceId() {
        return this.formInstanceId;
    }

    public UpdateFormDataRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public UpdateFormDataRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

    public UpdateFormDataRequest setUpdateFormDataJson(String updateFormDataJson) {
        this.updateFormDataJson = updateFormDataJson;
        return this;
    }
    public String getUpdateFormDataJson() {
        return this.updateFormDataJson;
    }

    public UpdateFormDataRequest setUseLatestVersion(Boolean useLatestVersion) {
        this.useLatestVersion = useLatestVersion;
        return this;
    }
    public Boolean getUseLatestVersion() {
        return this.useLatestVersion;
    }

}
