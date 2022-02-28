// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class TestCleanupRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("UserUid")
    public Long userUid;

    public static TestCleanupRequest build(java.util.Map<String, ?> map) throws Exception {
        TestCleanupRequest self = new TestCleanupRequest();
        return TeaModel.build(map, self);
    }

    public TestCleanupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public TestCleanupRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public TestCleanupRequest setUserUid(Long userUid) {
        this.userUid = userUid;
        return this;
    }
    public Long getUserUid() {
        return this.userUid;
    }

}
