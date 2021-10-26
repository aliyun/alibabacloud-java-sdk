// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeRegionQpsGroupByInstanceRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("StageName")
    public String stageName;

    public static DescribeRegionQpsGroupByInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRegionQpsGroupByInstanceRequest self = new DescribeRegionQpsGroupByInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRegionQpsGroupByInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeRegionQpsGroupByInstanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRegionQpsGroupByInstanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRegionQpsGroupByInstanceRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
