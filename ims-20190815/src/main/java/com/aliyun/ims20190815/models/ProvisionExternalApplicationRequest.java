// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class ProvisionExternalApplicationRequest extends TeaModel {
    /**
     * <p>The ID of the external application that was created by another Alibaba Cloud account and can be installed by the current account. The application IDs returned by <code>ListApplications</code> for the current account are not applicable. <code>ListExternalApplications</code> and <code>ListApplicationProvisionInfos</code> only query installed records and cannot discover external application IDs that have not been installed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>403550611646604****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The permission scopes granted to the application. You can specify multiple scopes separated by semicolons (;).</p>
     * <blockquote>
     * <p>For supported permission scopes, refer to &quot;OAuth Scopes&quot; in <a href="https://help.aliyun.com/document_detail/93693.html">OAuth application overview</a>.</p>
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
