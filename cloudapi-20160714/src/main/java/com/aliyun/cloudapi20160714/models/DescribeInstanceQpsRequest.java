// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeInstanceQpsRequest extends TeaModel {
    /**
     * <p>The end time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The environment in which the API is requested. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**: the production environment</p>
     * <p>*   **PRE**: the pre-release environment</p>
     * <p>*   **TEST**: the test environment</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>The start time. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeInstanceQpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceQpsRequest self = new DescribeInstanceQpsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceQpsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeInstanceQpsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeInstanceQpsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeInstanceQpsRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribeInstanceQpsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
