// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ettrafficisp20230830.models;

import com.aliyun.tea.*;

public class AkEnableRequest extends TeaModel {
    @NameInMap("accessKeyId")
    public String accessKeyId;

    @NameInMap("accessKeyName")
    public String accessKeyName;

    @NameInMap("permissions")
    public java.util.List<String> permissions;

    public static AkEnableRequest build(java.util.Map<String, ?> map) throws Exception {
        AkEnableRequest self = new AkEnableRequest();
        return TeaModel.build(map, self);
    }

    public AkEnableRequest setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public AkEnableRequest setAccessKeyName(String accessKeyName) {
        this.accessKeyName = accessKeyName;
        return this;
    }
    public String getAccessKeyName() {
        return this.accessKeyName;
    }

    public AkEnableRequest setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

}
