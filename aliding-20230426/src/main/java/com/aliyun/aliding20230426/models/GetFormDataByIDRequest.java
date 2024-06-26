// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFormDataByIDRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>APP_PBKT0MFBEBTDO8T7SLVP</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>FORM_INST_12345</p>
     */
    @NameInMap("Id")
    public String id;

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

    public static GetFormDataByIDRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFormDataByIDRequest self = new GetFormDataByIDRequest();
        return TeaModel.build(map, self);
    }

    public GetFormDataByIDRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetFormDataByIDRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetFormDataByIDRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetFormDataByIDRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
