// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ResetAppCodeRequest extends TeaModel {
    /**
     * <p>The AppCode of the app.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3aaf905a0a1f4f0eabc6d891dfa08afc</p>
     */
    @NameInMap("AppCode")
    public String appCode;

    /**
     * <p>The new AppCode of the app.</p>
     * 
     * <strong>example:</strong>
     * <p>6f0e7ab2aa5f4b8fb18421e6edf4fb6c2</p>
     */
    @NameInMap("NewAppCode")
    public String newAppCode;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static ResetAppCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetAppCodeRequest self = new ResetAppCodeRequest();
        return TeaModel.build(map, self);
    }

    public ResetAppCodeRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ResetAppCodeRequest setNewAppCode(String newAppCode) {
        this.newAppCode = newAppCode;
        return this;
    }
    public String getNewAppCode() {
        return this.newAppCode;
    }

    public ResetAppCodeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
