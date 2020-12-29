// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCloudAssistantStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("InstanceCloudAssistantStatusSet")
    public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet;

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

    public DescribeCloudAssistantStatusResponseBody setInstanceCloudAssistantStatusSet(DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet) {
        this.instanceCloudAssistantStatusSet = instanceCloudAssistantStatusSet;
        return this;
    }
    public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet getInstanceCloudAssistantStatusSet() {
        return this.instanceCloudAssistantStatusSet;
    }

    public static class DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus extends TeaModel {
        @NameInMap("CloudAssistantStatus")
        public String cloudAssistantStatus;

        @NameInMap("CloudAssistantVersion")
        public String cloudAssistantVersion;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus self = new DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setCloudAssistantStatus(String cloudAssistantStatus) {
            this.cloudAssistantStatus = cloudAssistantStatus;
            return this;
        }
        public String getCloudAssistantStatus() {
            return this.cloudAssistantStatus;
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setCloudAssistantVersion(String cloudAssistantVersion) {
            this.cloudAssistantVersion = cloudAssistantVersion;
            return this;
        }
        public String getCloudAssistantVersion() {
            return this.cloudAssistantVersion;
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet extends TeaModel {
        @NameInMap("InstanceCloudAssistantStatus")
        public java.util.List<DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus> instanceCloudAssistantStatus;

        public static DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet self = new DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setInstanceCloudAssistantStatus(java.util.List<DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus> instanceCloudAssistantStatus) {
            this.instanceCloudAssistantStatus = instanceCloudAssistantStatus;
            return this;
        }
        public java.util.List<DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus> getInstanceCloudAssistantStatus() {
            return this.instanceCloudAssistantStatus;
        }

    }

}
