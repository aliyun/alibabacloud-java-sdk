// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeLifecycleHooksResponseBody extends TeaModel {
    /**
     * <p>The list of lifecycle hooks.</p>
     */
    @NameInMap("LifecycleHooks")
    public java.util.List<DescribeLifecycleHooksResponseBodyLifecycleHooks> lifecycleHooks;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of lifecycle hooks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLifecycleHooksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecycleHooksResponseBody self = new DescribeLifecycleHooksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLifecycleHooksResponseBody setLifecycleHooks(java.util.List<DescribeLifecycleHooksResponseBodyLifecycleHooks> lifecycleHooks) {
        this.lifecycleHooks = lifecycleHooks;
        return this;
    }
    public java.util.List<DescribeLifecycleHooksResponseBodyLifecycleHooks> getLifecycleHooks() {
        return this.lifecycleHooks;
    }

    public DescribeLifecycleHooksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLifecycleHooksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLifecycleHooksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLifecycleHooksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLifecycleHooksResponseBodyLifecycleHooks extends TeaModel {
        /**
         * <p>The action to perform after the wait state of the instance ends.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTINUE</p>
         */
        @NameInMap("DefaultResult")
        public String defaultResult;

        /**
         * <p>The wait time configured in the lifecycle hook for the scaling activity. The next action is performed after the wait time expires.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("HeartbeatTimeout")
        public Integer heartbeatTimeout;

        /**
         * <p>The specific scenarios in which the lifecycle hook is triggered.</p>
         */
        @NameInMap("LifecycleActionSources")
        public java.util.List<String> lifecycleActionSources;

        /**
         * <p>The ID of the lifecycle hook.</p>
         * 
         * <strong>example:</strong>
         * <p>ash-bp19d1032y9kij96****</p>
         */
        @NameInMap("LifecycleHookId")
        public String lifecycleHookId;

        /**
         * <p>The name of the lifecycle hook.</p>
         * 
         * <strong>example:</strong>
         * <p>lifecyclehook****</p>
         */
        @NameInMap("LifecycleHookName")
        public String lifecycleHookName;

        /**
         * <p>The status of the lifecycle hook. Valid values:</p>
         * <ul>
         * <li>Active: The lifecycle hook is active.</li>
         * <li>InActive: The lifecycle hook is inactive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("LifecycleHookStatus")
        public String lifecycleHookStatus;

        /**
         * <p>The scaling activity type associated with the lifecycle hook.</p>
         * 
         * <strong>example:</strong>
         * <p>SCALE_OUT</p>
         */
        @NameInMap("LifecycleTransition")
        public String lifecycleTransition;

        /**
         * <p>The identifier of the notification recipient for the lifecycle hook. The parameter format is as follows:</p>
         * <ul>
         * <li>Notifications not configured: <code>acs:ess:{region-id}:{account-id}:null/null</code>.</li>
         * <li>MNS queue: <code>acs:mns:{region-id}:{account-id}:queue/{queuename}</code>.</li>
         * <li>MNS topic: <code>acs:mns:{region-id}:{account-id}:topic/{topicname}</code>.</li>
         * <li>OOS template: <code>acs:oos:{region-id}:{account-id}:template/{templatename}</code>.</li>
         * <li>EventBridge: <code>acs:eventbridge:{region-id}:{account-id}:eventbus/default</code>.</li>
         * </ul>
         * <p>The variables in the parameter format have the following meanings:</p>
         * <ul>
         * <li>region-id: The ID of the region where the scaling group resides.</li>
         * <li>account-id: The Alibaba Cloud account ID.</li>
         * <li>queuename: The name of the MNS queue.</li>
         * <li>topicname: The name of the MNS topic.</li>
         * <li>templatename: The name of the OOS template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:ess:cn-beijing:161456884340****:null/null</p>
         */
        @NameInMap("NotificationArn")
        public String notificationArn;

        /**
         * <p>The fixed string information for the wait state of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>Test Lifecycle Hook.</p>
         */
        @NameInMap("NotificationMetadata")
        public String notificationMetadata;

        /**
         * <p>The ID of the scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1igpak5ft1flyp****</p>
         */
        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        public static DescribeLifecycleHooksResponseBodyLifecycleHooks build(java.util.Map<String, ?> map) throws Exception {
            DescribeLifecycleHooksResponseBodyLifecycleHooks self = new DescribeLifecycleHooksResponseBodyLifecycleHooks();
            return TeaModel.build(map, self);
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooks setDefaultResult(String defaultResult) {
            this.defaultResult = defaultResult;
            return this;
        }
        public String getDefaultResult() {
            return this.defaultResult;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooks setHeartbeatTimeout(Integer heartbeatTimeout) {
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }
        public Integer getHeartbeatTimeout() {
            return this.heartbeatTimeout;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooks setLifecycleActionSources(java.util.List<String> lifecycleActionSources) {
            this.lifecycleActionSources = lifecycleActionSources;
            return this;
        }
        public java.util.List<String> getLifecycleActionSources() {
            return this.lifecycleActionSources;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooks setLifecycleHookId(String lifecycleHookId) {
            this.lifecycleHookId = lifecycleHookId;
            return this;
        }
        public String getLifecycleHookId() {
            return this.lifecycleHookId;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooks setLifecycleHookName(String lifecycleHookName) {
            this.lifecycleHookName = lifecycleHookName;
            return this;
        }
        public String getLifecycleHookName() {
            return this.lifecycleHookName;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooks setLifecycleHookStatus(String lifecycleHookStatus) {
            this.lifecycleHookStatus = lifecycleHookStatus;
            return this;
        }
        public String getLifecycleHookStatus() {
            return this.lifecycleHookStatus;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooks setLifecycleTransition(String lifecycleTransition) {
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }
        public String getLifecycleTransition() {
            return this.lifecycleTransition;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooks setNotificationArn(String notificationArn) {
            this.notificationArn = notificationArn;
            return this;
        }
        public String getNotificationArn() {
            return this.notificationArn;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooks setNotificationMetadata(String notificationMetadata) {
            this.notificationMetadata = notificationMetadata;
            return this;
        }
        public String getNotificationMetadata() {
            return this.notificationMetadata;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooks setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

    }

}
