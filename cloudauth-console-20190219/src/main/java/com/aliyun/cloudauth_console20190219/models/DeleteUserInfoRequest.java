// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DeleteUserInfoRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("UserId")
    public Long userId;

    @NameInMap("ProjectId")
    public String projectId;

    public static DeleteUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserInfoRequest self = new DeleteUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserInfoRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DeleteUserInfoRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public DeleteUserInfoRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
