// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceDropConnectionsRequest extends TeaModel {
    /**
     * <p>The end time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the dedicated instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The statistical metric. Valid values:</p>
     * <br>
     * <p>*   Maximum</p>
     * <p>*   Minimum</p>
     * <p>*   Average</p>
     */
    @NameInMap("SbcName")
    public String sbcName;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The start time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeInstanceDropConnectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDropConnectionsRequest self = new DescribeInstanceDropConnectionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDropConnectionsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInstanceDropConnectionsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceDropConnectionsRequest setSbcName(String sbcName) {
        this.sbcName = sbcName;
        return this;
    }
    public String getSbcName() {
        return this.sbcName;
    }

    public DescribeInstanceDropConnectionsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeInstanceDropConnectionsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
