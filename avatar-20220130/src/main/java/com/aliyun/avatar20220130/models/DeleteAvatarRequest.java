// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class DeleteAvatarRequest extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("TenantId")
    public Long tenantId;

    public static DeleteAvatarRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAvatarRequest self = new DeleteAvatarRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAvatarRequest setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAvatarRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
