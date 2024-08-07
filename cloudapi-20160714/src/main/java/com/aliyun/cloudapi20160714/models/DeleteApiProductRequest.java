// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteApiProductRequest extends TeaModel {
    /**
     * <p>The ID of the API product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>117b7a64a8b3f064eaa4a47ac62aac5e</p>
     */
    @NameInMap("ApiProductId")
    public String apiProductId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteApiProductRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiProductRequest self = new DeleteApiProductRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApiProductRequest setApiProductId(String apiProductId) {
        this.apiProductId = apiProductId;
        return this;
    }
    public String getApiProductId() {
        return this.apiProductId;
    }

    public DeleteApiProductRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
