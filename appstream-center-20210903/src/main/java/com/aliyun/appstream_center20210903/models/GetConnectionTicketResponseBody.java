// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210903.models;

import com.aliyun.tea.*;

public class GetConnectionTicketResponseBody extends TeaModel {
    /**
     * <p>The delivery group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-53fvrq1oa******</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The application instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ai-gc1gemx6vp******</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>The persistent session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>p-0cdr5c9kl******</p>
     */
    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    /**
     * <p>The user avatar ID.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("AvatarId")
    public String avatarId;

    /**
     * <p>The queue information.</p>
     * <blockquote>
     * <p>This parameter is not available.</p>
     * </blockquote>
     */
    @NameInMap("BindQueueInfo")
    public GetConnectionTicketResponseBodyBindQueueInfo bindQueueInfo;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalError.TicketGenInternalError</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The logon token.</p>
     * 
     * <strong>example:</strong>
     * <p>v2c4e2ef03d62******</p>
     */
    @NameInMap("LoginToken")
    public String loginToken;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>reenter app instance failed</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The next polling interval, in milliseconds. If this parameter is empty, the value is 1000 ms.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("NextPollIntervalMs")
    public Integer nextPollIntervalMs;

    /**
     * <p>The operating system type.</p>
     * 
     * <strong>example:</strong>
     * <p>Windows</p>
     */
    @NameInMap("OsType")
    public String osType;

    /**
     * <p>The session policy.</p>
     */
    @NameInMap("Policy")
    public GetConnectionTicketResponseBodyPolicy policy;

    /**
     * <p>The ID of the region to which the delivery group belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AD2D0761-1FE5-549D-B169******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of retries.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RetryTimes")
    public Integer retryTimes;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f3d1b31c-605e-******</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The task status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("TaskStatus")
    public String taskStatus;

    /**
     * <p>The tenant ID, which is the Alibaba Cloud account UID.</p>
     * 
     * <strong>example:</strong>
     * <p>1126819517******</p>
     */
    @NameInMap("TenantId")
    public Long tenantId;

    /**
     * <p>The connection ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>n7n9bqZlPrvgUOPY0tOfVYGBBcdoPoH3******</p>
     */
    @NameInMap("Ticket")
    public String ticket;

    public static GetConnectionTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetConnectionTicketResponseBody self = new GetConnectionTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetConnectionTicketResponseBody setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public GetConnectionTicketResponseBody setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public GetConnectionTicketResponseBody setAppInstancePersistentId(String appInstancePersistentId) {
        this.appInstancePersistentId = appInstancePersistentId;
        return this;
    }
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
    }

    public GetConnectionTicketResponseBody setAvatarId(String avatarId) {
        this.avatarId = avatarId;
        return this;
    }
    public String getAvatarId() {
        return this.avatarId;
    }

    public GetConnectionTicketResponseBody setBindQueueInfo(GetConnectionTicketResponseBodyBindQueueInfo bindQueueInfo) {
        this.bindQueueInfo = bindQueueInfo;
        return this;
    }
    public GetConnectionTicketResponseBodyBindQueueInfo getBindQueueInfo() {
        return this.bindQueueInfo;
    }

    public GetConnectionTicketResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetConnectionTicketResponseBody setLoginToken(String loginToken) {
        this.loginToken = loginToken;
        return this;
    }
    public String getLoginToken() {
        return this.loginToken;
    }

    public GetConnectionTicketResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetConnectionTicketResponseBody setNextPollIntervalMs(Integer nextPollIntervalMs) {
        this.nextPollIntervalMs = nextPollIntervalMs;
        return this;
    }
    public Integer getNextPollIntervalMs() {
        return this.nextPollIntervalMs;
    }

    public GetConnectionTicketResponseBody setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public GetConnectionTicketResponseBody setPolicy(GetConnectionTicketResponseBodyPolicy policy) {
        this.policy = policy;
        return this;
    }
    public GetConnectionTicketResponseBodyPolicy getPolicy() {
        return this.policy;
    }

    public GetConnectionTicketResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetConnectionTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetConnectionTicketResponseBody setRetryTimes(Integer retryTimes) {
        this.retryTimes = retryTimes;
        return this;
    }
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

    public GetConnectionTicketResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetConnectionTicketResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public GetConnectionTicketResponseBody setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

    public GetConnectionTicketResponseBody setTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }
    public String getTicket() {
        return this.ticket;
    }

    public static class GetConnectionTicketResponseBodyBindQueueInfo extends TeaModel {
        /**
         * <p>The queue task status.</p>
         * 
         * <strong>example:</strong>
         * <p>Waiting</p>
         */
        @NameInMap("QueueStatus")
        public String queueStatus;

        /**
         * <p>The ranking information.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Rank")
        public Integer rank;

        /**
         * <p>The timeout period for manual connection after the turn is reached.</p>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        @NameInMap("ReadyTimeout")
        public Long readyTimeout;

        /**
         * <p>The remaining wait time. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RemainingTime")
        public Long remainingTime;

        /**
         * <p>The queue request key.</p>
         * 
         * <strong>example:</strong>
         * <p>alice******</p>
         */
        @NameInMap("RequestKey")
        public String requestKey;

        /**
         * <p>The queue ID.</p>
         * 
         * <strong>example:</strong>
         * <p>aig-53fvrq1oa******</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The time already waited in the queue. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("WaitTime")
        public Long waitTime;

        public static GetConnectionTicketResponseBodyBindQueueInfo build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionTicketResponseBodyBindQueueInfo self = new GetConnectionTicketResponseBodyBindQueueInfo();
            return TeaModel.build(map, self);
        }

        public GetConnectionTicketResponseBodyBindQueueInfo setQueueStatus(String queueStatus) {
            this.queueStatus = queueStatus;
            return this;
        }
        public String getQueueStatus() {
            return this.queueStatus;
        }

        public GetConnectionTicketResponseBodyBindQueueInfo setRank(Integer rank) {
            this.rank = rank;
            return this;
        }
        public Integer getRank() {
            return this.rank;
        }

        public GetConnectionTicketResponseBodyBindQueueInfo setReadyTimeout(Long readyTimeout) {
            this.readyTimeout = readyTimeout;
            return this;
        }
        public Long getReadyTimeout() {
            return this.readyTimeout;
        }

        public GetConnectionTicketResponseBodyBindQueueInfo setRemainingTime(Long remainingTime) {
            this.remainingTime = remainingTime;
            return this;
        }
        public Long getRemainingTime() {
            return this.remainingTime;
        }

        public GetConnectionTicketResponseBodyBindQueueInfo setRequestKey(String requestKey) {
            this.requestKey = requestKey;
            return this;
        }
        public String getRequestKey() {
            return this.requestKey;
        }

        public GetConnectionTicketResponseBodyBindQueueInfo setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public GetConnectionTicketResponseBodyBindQueueInfo setWaitTime(Long waitTime) {
            this.waitTime = waitTime;
            return this;
        }
        public Long getWaitTime() {
            return this.waitTime;
        }

    }

    public static class GetConnectionTicketResponseBodyPolicy extends TeaModel {
        /**
         * <p>Specifies whether to use adaptive resolution.</p>
         * <blockquote>
         * <ul>
         * <li><code>true</code>: The session resolution changes with the terminal display area. In this case, <code>SessionResolutionWidth</code> and <code>SessionResolutionHeight</code> are the maximum values of the resolution change.</li>
         * <li><code>false</code>: The session resolution does not change with the terminal display area. In this case, the resolution is fixed to the values of <code>SessionResolutionWidth</code> and <code>SessionResolutionHeight</code>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ResolutionAdaptive")
        public String resolutionAdaptive;

        /**
         * <p>The resolution height, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("ResolutionHeight")
        public Integer resolutionHeight;

        /**
         * <p>The resolution width, in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("ResolutionWidth")
        public Integer resolutionWidth;

        public static GetConnectionTicketResponseBodyPolicy build(java.util.Map<String, ?> map) throws Exception {
            GetConnectionTicketResponseBodyPolicy self = new GetConnectionTicketResponseBodyPolicy();
            return TeaModel.build(map, self);
        }

        public GetConnectionTicketResponseBodyPolicy setResolutionAdaptive(String resolutionAdaptive) {
            this.resolutionAdaptive = resolutionAdaptive;
            return this;
        }
        public String getResolutionAdaptive() {
            return this.resolutionAdaptive;
        }

        public GetConnectionTicketResponseBodyPolicy setResolutionHeight(Integer resolutionHeight) {
            this.resolutionHeight = resolutionHeight;
            return this;
        }
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        public GetConnectionTicketResponseBodyPolicy setResolutionWidth(Integer resolutionWidth) {
            this.resolutionWidth = resolutionWidth;
            return this;
        }
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

    }

}
