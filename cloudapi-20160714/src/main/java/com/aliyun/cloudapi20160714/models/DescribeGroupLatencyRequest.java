// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeGroupLatencyRequest extends TeaModel {
    /**
     * <p>The end time of the time range to query. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the API group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The environment in which you want to perform the query. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**: the production environment</p>
     * <p>*   **PRE**: the staging environment</p>
     * <p>*   **TEST**: the test environment</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StageName")
    public String stageName;

    /**
     * <p>The start time of the time range to query. The time follows the ISO 8601 standard and UTC time is used. Format: YYYY-MM-DDThh:mm:ssZ.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeGroupLatencyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupLatencyRequest self = new DescribeGroupLatencyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGroupLatencyRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeGroupLatencyRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeGroupLatencyRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeGroupLatencyRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

    public DescribeGroupLatencyRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
