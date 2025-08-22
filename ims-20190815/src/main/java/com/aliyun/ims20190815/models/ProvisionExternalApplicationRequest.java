// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ProvisionExternalApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>403550611646604****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The permissions that are granted to the application. Separate multiple permissions with a semicolon (;).</p>
     * <blockquote>
     * <p> For more information about the supported permissions, see <a href="https://help.aliyun.com/document_detail/93693.html">Overview</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>openid;aliuid</p>
     */
    @NameInMap("Scopes")
    public String scopes;

    public static ProvisionExternalApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ProvisionExternalApplicationRequest self = new ProvisionExternalApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ProvisionExternalApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ProvisionExternalApplicationRequest setScopes(String scopes) {
        this.scopes = scopes;
        return this;
    }
    public String getScopes() {
        return this.scopes;
    }

}
