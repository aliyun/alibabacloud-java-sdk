// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class HandleOidcCallbackRequest extends TeaModel {
    /**
     * <p>The code parameter carried in the OIDC callback request.</p>
     * 
     * <strong>example:</strong>
     * <p>code-xxxxxxxx</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The state parameter carried in the OIDC callback request.</p>
     * 
     * <strong>example:</strong>
     * <p>state-xxxxxxxx</p>
     */
    @NameInMap("state")
    public String state;

    public static HandleOidcCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleOidcCallbackRequest self = new HandleOidcCallbackRequest();
        return TeaModel.build(map, self);
    }

    public HandleOidcCallbackRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HandleOidcCallbackRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
