// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DescribeLifecycleHooksResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("LifecycleHooks")
    public DescribeLifecycleHooksResponseBodyLifecycleHooks lifecycleHooks;

    public static DescribeLifecycleHooksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLifecycleHooksResponseBody self = new DescribeLifecycleHooksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLifecycleHooksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLifecycleHooksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLifecycleHooksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLifecycleHooksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLifecycleHooksResponseBody setLifecycleHooks(DescribeLifecycleHooksResponseBodyLifecycleHooks lifecycleHooks) {
        this.lifecycleHooks = lifecycleHooks;
        return this;
    }
    public DescribeLifecycleHooksResponseBodyLifecycleHooks getLifecycleHooks() {
        return this.lifecycleHooks;
    }

    public static class DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook extends TeaModel {
        @NameInMap("DefaultResult")
        public String defaultResult;

        @NameInMap("LifecycleHookId")
        public String lifecycleHookId;

        @NameInMap("LifecycleHookName")
        public String lifecycleHookName;

        @NameInMap("LifecycleTransition")
        public String lifecycleTransition;

        @NameInMap("NotificationMetadata")
        public String notificationMetadata;

        @NameInMap("NotificationArn")
        public String notificationArn;

        @NameInMap("HeartbeatTimeout")
        public Integer heartbeatTimeout;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        public static DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook build(java.util.Map<String, ?> map) throws Exception {
            DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook self = new DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook();
            return TeaModel.build(map, self);
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook setDefaultResult(String defaultResult) {
            this.defaultResult = defaultResult;
            return this;
        }
        public String getDefaultResult() {
            return this.defaultResult;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook setLifecycleHookId(String lifecycleHookId) {
            this.lifecycleHookId = lifecycleHookId;
            return this;
        }
        public String getLifecycleHookId() {
            return this.lifecycleHookId;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook setLifecycleHookName(String lifecycleHookName) {
            this.lifecycleHookName = lifecycleHookName;
            return this;
        }
        public String getLifecycleHookName() {
            return this.lifecycleHookName;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook setLifecycleTransition(String lifecycleTransition) {
            this.lifecycleTransition = lifecycleTransition;
            return this;
        }
        public String getLifecycleTransition() {
            return this.lifecycleTransition;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook setNotificationMetadata(String notificationMetadata) {
            this.notificationMetadata = notificationMetadata;
            return this;
        }
        public String getNotificationMetadata() {
            return this.notificationMetadata;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook setNotificationArn(String notificationArn) {
            this.notificationArn = notificationArn;
            return this;
        }
        public String getNotificationArn() {
            return this.notificationArn;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook setHeartbeatTimeout(Integer heartbeatTimeout) {
            this.heartbeatTimeout = heartbeatTimeout;
            return this;
        }
        public Integer getHeartbeatTimeout() {
            return this.heartbeatTimeout;
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

    }

    public static class DescribeLifecycleHooksResponseBodyLifecycleHooks extends TeaModel {
        @NameInMap("LifecycleHook")
        public java.util.List<DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook> lifecycleHook;

        public static DescribeLifecycleHooksResponseBodyLifecycleHooks build(java.util.Map<String, ?> map) throws Exception {
            DescribeLifecycleHooksResponseBodyLifecycleHooks self = new DescribeLifecycleHooksResponseBodyLifecycleHooks();
            return TeaModel.build(map, self);
        }

        public DescribeLifecycleHooksResponseBodyLifecycleHooks setLifecycleHook(java.util.List<DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook> lifecycleHook) {
            this.lifecycleHook = lifecycleHook;
            return this;
        }
        public java.util.List<DescribeLifecycleHooksResponseBodyLifecycleHooksLifecycleHook> getLifecycleHook() {
            return this.lifecycleHook;
        }

    }

}
