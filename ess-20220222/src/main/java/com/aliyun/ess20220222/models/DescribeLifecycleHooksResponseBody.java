// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeLifecycleHooksResponseBody extends TeaModel {
    /**
     * <p>Details of the lifecycle hooks.</p>
     */
    @NameInMap("LifecycleHooks")
    public java.util.List<DescribeLifecycleHooksResponseBodyLifecycleHooks> lifecycleHooks;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of lifecycle hooks.</p>
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
         * <p>The action that Auto Scaling performs after the lifecycle hook ends.</p>
         */
        @NameInMap("DefaultResult")
        public String defaultResult;

        /**
         * <p>The period of time before the lifecycle hook ends. Auto Scaling performs the specified action after the lifecycle hook ends.</p>
         */
        @NameInMap("HeartbeatTimeout")
        public Integer heartbeatTimeout;

        /**
         * <p>The ID of the lifecycle hook.</p>
         */
        @NameInMap("LifecycleHookId")
        public String lifecycleHookId;

        /**
         * <p>The name of the lifecycle hook.</p>
         */
        @NameInMap("LifecycleHookName")
        public String lifecycleHookName;

        /**
         * <p>The status of the lifecycle hook. Valid values:</p>
         * <br>
         * <p>*   Active</p>
         * <p>*   InActive</p>
         */
        @NameInMap("LifecycleHookStatus")
        public String lifecycleHookStatus;

        /**
         * <p>The type of the scaling activity to which the lifecycle hook applies.</p>
         */
        @NameInMap("LifecycleTransition")
        public String lifecycleTransition;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the method that is used by Auto Scaling to send notifications when the lifecycle hook takes effect. Specify the value in one of the following formats:</p>
         * <br>
         * <p>*   If you do not create a notification rule, specify the value in the `acs:ess:{region-id}:{account-id}:null/null` format.</p>
         * <p>*   If you specify a Message Service (MNS) queue as the notification method, specify the value in the `acs:mns:{region-id}:{account-id}:queue/{queuename}` format.</p>
         * <p>*   If you specify an MNS topic as the notification method, specify the value in the `acs:mns:{region-id}:{account-id}:topic/{topicname}` format.</p>
         * <p>*   If you specify an Operation Orchestration Service (OOS) template as the notification method, specify the value in the `acs:oos:{region-id}:{account-id}:template/{templatename}` format.</p>
         * <br>
         * <p>The variables in the preceding parameter formats have the following meanings:</p>
         * <br>
         * <p>*   region-id: the region ID of the scaling group.</p>
         * <p>*   account-id: the ID of the Alibaba Cloud account.</p>
         * <p>*   queuename: the name of the MNS queue.</p>
         * <p>*   topicname: the name of the MNS topic.</p>
         * <p>*   templatename: the name of the OOS template.</p>
         */
        @NameInMap("NotificationArn")
        public String notificationArn;

        /**
         * <p>The fixed string that is included in a notification. Auto Scaling sends the notification when the lifecycle hook takes effect.</p>
         */
        @NameInMap("NotificationMetadata")
        public String notificationMetadata;

        /**
         * <p>The ID of the scaling group.</p>
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
