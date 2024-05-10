// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetFieldDefByUuidRequest extends TeaModel {
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

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SystemToken")
    public String systemToken;

    public static GetFieldDefByUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFieldDefByUuidRequest self = new GetFieldDefByUuidRequest();
        return TeaModel.build(map, self);
    }

    public GetFieldDefByUuidRequest setAppType(String appType) {
        this.appType = appType;
        return this;
    }
    public String getAppType() {
        return this.appType;
    }

    public GetFieldDefByUuidRequest setFormUuid(String formUuid) {
        this.formUuid = formUuid;
        return this;
    }
    public String getFormUuid() {
        return this.formUuid;
    }

    public GetFieldDefByUuidRequest setSystemToken(String systemToken) {
        this.systemToken = systemToken;
        return this;
    }
    public String getSystemToken() {
        return this.systemToken;
    }

}
