// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeLifecycleHooksResponseBody extends TeaModel {
    /**
     * <p>The details of the lifecycle hooks.</p>
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
         * <p>The next action that is performed after the lifecycle hook times out.</p>
         * 
         * <strong>example:</strong>
         * <p>CONTINUE</p>
         */
        @NameInMap("DefaultResult")
        public String defaultResult;

        /**
         * <p>The period of time before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action that is specified by DefaultResult.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("HeartbeatTimeout")
        public Integer heartbeatTimeout;

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
         * <li>Active: The lifecycle hook is enabled.</li>
         * <li>InActive: The lifecycle hook is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        @NameInMap("LifecycleHookStatus")
        public String lifecycleHookStatus;

        /**
         * <p>The type of the scaling activity to which the lifecycle hook applies.</p>
         * 
         * <strong>example:</strong>
         * <p>SCALE_OUT</p>
         */
        @NameInMap("LifecycleTransition")
        public String lifecycleTransition;

        /**
         * <p>The ARN of the notification recipient when the lifecycle hook takes effect. The value of this parameter is in one of the following formats:</p>
         * <ul>
         * <li>If you did not specify this parameter, the return value is in the <code>acs:ess:{region-id}:{account-id}:null/null</code> format.</li>
         * <li>If you specified a Message Service (MNS) queue as the notification recipient, the return value is in the <code>acs:mns:{region-id}:{account-id}:queue/{queuename}</code> format.</li>
         * <li>If you specified an MNS topic as the notification recipient, the return value is in the <code>acs:mns:{region-id}:{account-id}:topic/{topicname}</code> format.</li>
         * <li>If you specified a CloudOps Orchestration Service (OOS) template as the notification recipient, the return value is in the <code>acs:oos:{region-id}:{account-id}:template/{templatename}</code> format.</li>
         * <li>If you specified an event bus as the notification recipient, the return value is in the <code>acs:eventbridge:{region-id}:{account-id}:eventbus/default</code> format.</li>
         * </ul>
         * <p>The variables in the preceding formats have the following meanings:</p>
         * <ul>
         * <li>region-id: the region ID of your scaling group.</li>
         * <li>account-id: the ID of your Alibaba Cloud.</li>
         * <li>queuename: the name of the MNS queue.</li>
         * <li>topicname: the name of the MNS topic.</li>
         * <li>templatename: the name of the OOS template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>acs:ess:cn-beijing:161456884340****:null/null</p>
         */
        @NameInMap("NotificationArn")
        public String notificationArn;

        /**
         * <p>The fixed string that is included in a notification that Auto Scaling sends when the lifecycle hook takes effect.</p>
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
