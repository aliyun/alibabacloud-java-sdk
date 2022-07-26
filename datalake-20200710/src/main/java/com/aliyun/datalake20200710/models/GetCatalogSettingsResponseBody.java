// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class GetCatalogSettingsResponseBody extends TeaModel {
    @NameInMap("CatalogSettings")
    public CatalogSettings catalogSettings;

    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCatalogSettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCatalogSettingsResponseBody self = new GetCatalogSettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCatalogSettingsResponseBody setCatalogSettings(CatalogSettings catalogSettings) {
        this.catalogSettings = catalogSettings;
        return this;
    }
    public CatalogSettings getCatalogSettings() {
        return this.catalogSettings;
    }

    public GetCatalogSettingsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetCatalogSettingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCatalogSettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCatalogSettingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
