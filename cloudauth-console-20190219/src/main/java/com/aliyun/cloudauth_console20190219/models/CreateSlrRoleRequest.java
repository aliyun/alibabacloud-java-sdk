// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class CreateSlrRoleRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("RoleName")
    public String roleName;

    @NameInMap("DurationSeconds")
    public Long durationSeconds;

    public static CreateSlrRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrRoleRequest self = new CreateSlrRoleRequest();
        return TeaModel.build(map, self);
    }

    public CreateSlrRoleRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public CreateSlrRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public CreateSlrRoleRequest setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

}
