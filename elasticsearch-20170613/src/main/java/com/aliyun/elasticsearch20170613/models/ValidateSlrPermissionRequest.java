// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ValidateSlrPermissionRequest extends TeaModel {
    /**
     * <p>A client-generated token used to ensure the idempotence of the request. The value must be unique across different requests and cannot exceed 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The name of the service-linked role. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;- AliyunServiceRoleForElasticsearchOps: used to perform elastic scaling tasks for clusters- AliyunServiceRoleForElasticsearchCollector: used to create and manage Beats collectors</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForElasticsearchCollector</p>
     */
    @NameInMap("rolename")
    public String rolename;

    public static ValidateSlrPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateSlrPermissionRequest self = new ValidateSlrPermissionRequest();
        return TeaModel.build(map, self);
    }

    public ValidateSlrPermissionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ValidateSlrPermissionRequest setRolename(String rolename) {
        this.rolename = rolename;
        return this;
    }
    public String getRolename() {
        return this.rolename;
    }

}
