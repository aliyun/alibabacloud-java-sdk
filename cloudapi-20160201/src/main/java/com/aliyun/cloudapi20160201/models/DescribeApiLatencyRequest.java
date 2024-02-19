// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApiLatencyRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeApiLatencyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiLatencyRequest self = new DescribeApiLatencyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiLatencyRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribeApiLatencyRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeApiLatencyRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiLatencyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeApiLatencyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
