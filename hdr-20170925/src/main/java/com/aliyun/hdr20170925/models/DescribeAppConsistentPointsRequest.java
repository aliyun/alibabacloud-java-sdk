// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class DescribeAppConsistentPointsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ServerId")
    public String serverId;

    @NameInMap("StartTime")
    public Long startTime;

    public static DescribeAppConsistentPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppConsistentPointsRequest self = new DescribeAppConsistentPointsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAppConsistentPointsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeAppConsistentPointsRequest setServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }
    public String getServerId() {
        return this.serverId;
    }

    public DescribeAppConsistentPointsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
