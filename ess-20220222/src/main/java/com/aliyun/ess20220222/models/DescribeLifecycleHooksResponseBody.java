// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DescribeLifecycleHooksResponseBody extends TeaModel {
    @NameInMap("LifecycleHooks")
    public java.util.List<DescribeLifecycleHooksResponseBodyLifecycleHooks> lifecycleHooks;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("DefaultResult")
        public String defaultResult;

        @NameInMap("HeartbeatTimeout")
        public Integer heartbeatTimeout;

        @NameInMap("LifecycleHookId")
        public String lifecycleHookId;

        @NameInMap("LifecycleHookName")
        public String lifecycleHookName;

        @NameInMap("LifecycleHookStatus")
        public String lifecycleHookStatus;

        @NameInMap("LifecycleTransition")
        public String lifecycleTransition;

        @NameInMap("NotificationArn")
        public String notificationArn;

        @NameInMap("NotificationMetadata")
        public String notificationMetadata;

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
