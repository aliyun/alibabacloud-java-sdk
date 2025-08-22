// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ProvisionApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>407426893752729****</p>
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

    public static ProvisionApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        ProvisionApplicationRequest self = new ProvisionApplicationRequest();
        return TeaModel.build(map, self);
    }

    public ProvisionApplicationRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ProvisionApplicationRequest setScopes(String scopes) {
        this.scopes = scopes;
        return this;
    }
    public String getScopes() {
        return this.scopes;
    }

}
