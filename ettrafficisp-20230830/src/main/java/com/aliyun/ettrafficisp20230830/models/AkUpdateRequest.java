// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class AkUpdateRequest extends TeaModel {
    @NameInMap("accessKeyId")
    public String accessKeyId;

    @NameInMap("accessKeyName")
    public String accessKeyName;

    @NameInMap("permissions")
    public java.util.List<String> permissions;

    public static AkUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        AkUpdateRequest self = new AkUpdateRequest();
        return TeaModel.build(map, self);
    }

    public AkUpdateRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public AkUpdateRequest setAccessKeyName(String accessKeyName) {
        this.accessKeyName = accessKeyName;
        return this;
    }
    public String getAccessKeyName() {
        return this.accessKeyName;
    }

    public AkUpdateRequest setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

}
