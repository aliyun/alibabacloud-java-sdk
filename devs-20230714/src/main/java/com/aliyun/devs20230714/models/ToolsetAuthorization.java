// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ToolsetAuthorization extends TeaModel {
    @NameInMap("authConfig")
    public java.util.Map<String, String> authConfig;

    /**
     * <strong>example:</strong>
     * <p>apiKey</p>
     */
    @NameInMap("type")
    public String type;

    public static ToolsetAuthorization build(java.util.Map<String, ?> map) throws Exception {
        ToolsetAuthorization self = new ToolsetAuthorization();
        return TeaModel.build(map, self);
    }

    public ToolsetAuthorization setAuthConfig(java.util.Map<String, String> authConfig) {
        this.authConfig = authConfig;
        return this;
    }
    public java.util.Map<String, String> getAuthConfig() {
        return this.authConfig;
    }

    public ToolsetAuthorization setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
