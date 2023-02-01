// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceSlbConnectRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SbcName")
    public String sbcName;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("StartTime")
    public String startTime;

    public static DescribeInstanceSlbConnectRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSlbConnectRequest self = new DescribeInstanceSlbConnectRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSlbConnectRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInstanceSlbConnectRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceSlbConnectRequest setSbcName(String sbcName) {
        this.sbcName = sbcName;
        return this;
    }
    public String getSbcName() {
        return this.sbcName;
    }

    public DescribeInstanceSlbConnectRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeInstanceSlbConnectRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
