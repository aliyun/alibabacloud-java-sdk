// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class AkDisableRequest extends TeaModel {
    @NameInMap("accessKeyId")
    public String accessKeyId;

    @NameInMap("accessKeyName")
    public String accessKeyName;

    @NameInMap("permissions")
    public java.util.List<String> permissions;

    public static AkDisableRequest build(java.util.Map<String, ?> map) throws Exception {
        AkDisableRequest self = new AkDisableRequest();
        return TeaModel.build(map, self);
    }

    public AkDisableRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public AkDisableRequest setAccessKeyName(String accessKeyName) {
        this.accessKeyName = accessKeyName;
        return this;
    }
    public String getAccessKeyName() {
        return this.accessKeyName;
    }

    public AkDisableRequest setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

}
