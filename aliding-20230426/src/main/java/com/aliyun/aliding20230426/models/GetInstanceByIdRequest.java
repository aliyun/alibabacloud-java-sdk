// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetInstanceByIdRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>APP_PBxxx</p>
     */
    @NameInMap("AppType")
    public String appType;

    /**
     * <strong>example:</strong>
     * <p>f30233fb-72e1-xxx</p>
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
