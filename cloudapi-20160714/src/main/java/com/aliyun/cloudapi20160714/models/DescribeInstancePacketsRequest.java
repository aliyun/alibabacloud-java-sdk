// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstancePacketsRequest extends TeaModel {
    /**
     * <p>The end time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-05-24T10:14:53Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apigateway-cn-2r426lavr001</p>
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
     * <p>2022-05-18T01:14:26Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeInstancePacketsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancePacketsRequest self = new DescribeInstancePacketsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstancePacketsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInstancePacketsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstancePacketsRequest setSbcName(String sbcName) {
        this.sbcName = sbcName;
        return this;
    }
    public String getSbcName() {
        return this.sbcName;
    }

    public DescribeInstancePacketsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeInstancePacketsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
