// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPermissionByCodeShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flow_001</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>393847477</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("Permissions")
    public String permissionsShrink;

    public static GetPermissionByCodeShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionByCodeShrinkRequest self = new GetPermissionByCodeShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetPermissionByCodeShrinkRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPermissionByCodeShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetPermissionByCodeShrinkRequest setPermissionsShrink(String permissionsShrink) {
        this.permissionsShrink = permissionsShrink;
        return this;
    }
    public String getPermissionsShrink() {
        return this.permissionsShrink;
    }

}
