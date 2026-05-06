// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeOnlineUserCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AdAssignedUserCount")
    public Long adAssignedUserCount;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("AssignedUserCount")
    public Long assignedUserCount;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OnlineUserCount")
    public Long onlineUserCount;

    /**
     * <strong>example:</strong>
     * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("SimpleAssignedUserCount")
    public Long simpleAssignedUserCount;

    public static DescribeOnlineUserCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnlineUserCountResponseBody self = new DescribeOnlineUserCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOnlineUserCountResponseBody setAdAssignedUserCount(Long adAssignedUserCount) {
        this.adAssignedUserCount = adAssignedUserCount;
        return this;
    }
    public Long getAdAssignedUserCount() {
        return this.adAssignedUserCount;
    }

    public DescribeOnlineUserCountResponseBody setAssignedUserCount(Long assignedUserCount) {
        this.assignedUserCount = assignedUserCount;
        return this;
    }
    public Long getAssignedUserCount() {
        return this.assignedUserCount;
    }

    public DescribeOnlineUserCountResponseBody setOnlineUserCount(Long onlineUserCount) {
        this.onlineUserCount = onlineUserCount;
        return this;
    }
    public Long getOnlineUserCount() {
        return this.onlineUserCount;
    }

    public DescribeOnlineUserCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOnlineUserCountResponseBody setSimpleAssignedUserCount(Long simpleAssignedUserCount) {
        this.simpleAssignedUserCount = simpleAssignedUserCount;
        return this;
    }
    public Long getSimpleAssignedUserCount() {
        return this.simpleAssignedUserCount;
    }

}
