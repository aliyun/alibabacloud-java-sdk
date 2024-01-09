// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class TestCleanupRequest extends TeaModel {
    @NameInMap("ServerId")
    public String serverId;

    public static TestCleanupRequest build(java.util.Map<String, ?> map) throws Exception {
        TestCleanupRequest self = new TestCleanupRequest();
        return TeaModel.build(map, self);
    }

    public TestCleanupRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

}
