// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeReplicationRequest extends TeaModel {
    @NameInMap("ReplicationId")
    public String replicationId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeReplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeReplicationRequest self = new DescribeReplicationRequest();
        return TeaModel.build(map, self);
    }

    public DescribeReplicationRequest setReplicationId(String replicationId) {
        this.replicationId = replicationId;
        return this;
    }
    public String getReplicationId() {
        return this.replicationId;
    }

    public DescribeReplicationRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
