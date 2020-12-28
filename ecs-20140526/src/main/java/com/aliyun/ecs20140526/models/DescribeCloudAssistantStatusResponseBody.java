// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCloudAssistantStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceCloudAssistantStatusSet")
    public java.util.List<DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet> instanceCloudAssistantStatusSet;

    public static DescribeCloudAssistantStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudAssistantStatusResponseBody self = new DescribeCloudAssistantStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudAssistantStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudAssistantStatusResponseBody setInstanceCloudAssistantStatusSet(java.util.List<DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet> instanceCloudAssistantStatusSet) {
        this.instanceCloudAssistantStatusSet = instanceCloudAssistantStatusSet;
        return this;
    }
    public java.util.List<DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet> getInstanceCloudAssistantStatusSet() {
        return this.instanceCloudAssistantStatusSet;
    }

    public static class DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet extends TeaModel {
        @NameInMap("CloudAssistantStatus")
        public String cloudAssistantStatus;

        @NameInMap("CloudAssistantVersion")
        public String cloudAssistantVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet self = new DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setCloudAssistantStatus(String cloudAssistantStatus) {
            this.cloudAssistantStatus = cloudAssistantStatus;
            return this;
        }
        public String getCloudAssistantStatus() {
            return this.cloudAssistantStatus;
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setCloudAssistantVersion(String cloudAssistantVersion) {
            this.cloudAssistantVersion = cloudAssistantVersion;
            return this;
        }
        public String getCloudAssistantVersion() {
            return this.cloudAssistantVersion;
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
