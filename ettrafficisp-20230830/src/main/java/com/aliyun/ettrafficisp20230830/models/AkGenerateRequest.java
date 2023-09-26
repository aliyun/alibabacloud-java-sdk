// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class AkGenerateRequest extends TeaModel {
    @NameInMap("accessKeyName")
    public String accessKeyName;

    @NameInMap("permissions")
    public java.util.List<String> permissions;

    @NameInMap("userId")
    public Long userId;

    public static AkGenerateRequest build(java.util.Map<String, ?> map) throws Exception {
        AkGenerateRequest self = new AkGenerateRequest();
        return TeaModel.build(map, self);
    }

    public AkGenerateRequest setAccessKeyName(String accessKeyName) {
        this.accessKeyName = accessKeyName;
        return this;
    }
    public String getAccessKeyName() {
        return this.accessKeyName;
    }

    public AkGenerateRequest setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

    public AkGenerateRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
