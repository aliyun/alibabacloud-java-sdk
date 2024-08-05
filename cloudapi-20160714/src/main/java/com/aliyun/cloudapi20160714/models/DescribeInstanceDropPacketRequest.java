// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceDropPacketRequest extends TeaModel {
    /**
     * <p>The end time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-12-16T02:04:36Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apigateway-cn-v641b9dxc00p</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The statistical metric. Valid values:</p>
     * <ul>
     * <li>Maximum</li>
     * <li>Minimum</li>
     * <li>Average</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Maximum</p>
     */
    @NameInMap("SbcName")
    public String sbcName;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The start time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-09-06T04:00:36Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeInstanceDropPacketRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceDropPacketRequest self = new DescribeInstanceDropPacketRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceDropPacketRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInstanceDropPacketRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceDropPacketRequest setSbcName(String sbcName) {
        this.sbcName = sbcName;
        return this;
    }
    public String getSbcName() {
        return this.sbcName;
    }

    public DescribeInstanceDropPacketRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeInstanceDropPacketRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
