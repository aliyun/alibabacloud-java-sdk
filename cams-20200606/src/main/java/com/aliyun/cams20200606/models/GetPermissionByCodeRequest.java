// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPermissionByCodeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("Permissions")
    public java.util.List<String> permissions;

    public static GetPermissionByCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPermissionByCodeRequest self = new GetPermissionByCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetPermissionByCodeRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPermissionByCodeRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public GetPermissionByCodeRequest setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

}
