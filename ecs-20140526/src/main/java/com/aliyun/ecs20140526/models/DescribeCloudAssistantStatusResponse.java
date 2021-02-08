// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCloudAssistantStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceCloudAssistantStatusSet")
    @Validation(required = true)
    public DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet;

    public static DescribeCloudAssistantStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudAssistantStatusResponse self = new DescribeCloudAssistantStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCloudAssistantStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudAssistantStatusResponse setInstanceCloudAssistantStatusSet(DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet) {
        this.instanceCloudAssistantStatusSet = instanceCloudAssistantStatusSet;
        return this;
    }
    public DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSet getInstanceCloudAssistantStatusSet() {
        return this.instanceCloudAssistantStatusSet;
    }

    public static class DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("CloudAssistantStatus")
        @Validation(required = true)
        public String cloudAssistantStatus;

        @NameInMap("CloudAssistantVersion")
        @Validation(required = true)
        public String cloudAssistantVersion;

        public static DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus self = new DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setCloudAssistantStatus(String cloudAssistantStatus) {
            this.cloudAssistantStatus = cloudAssistantStatus;
            return this;
        }
        public String getCloudAssistantStatus() {
            return this.cloudAssistantStatus;
        }

        public DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setCloudAssistantVersion(String cloudAssistantVersion) {
            this.cloudAssistantVersion = cloudAssistantVersion;
            return this;
        }
        public String getCloudAssistantVersion() {
            return this.cloudAssistantVersion;
        }

    }

    public static class DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSet extends TeaModel {
        @NameInMap("InstanceCloudAssistantStatus")
        @Validation(required = true)
        public java.util.List<DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus> instanceCloudAssistantStatus;

        public static DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSet self = new DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSet();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSet setInstanceCloudAssistantStatus(java.util.List<DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus> instanceCloudAssistantStatus) {
            this.instanceCloudAssistantStatus = instanceCloudAssistantStatus;
            return this;
        }
        public java.util.List<DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus> getInstanceCloudAssistantStatus() {
            return this.instanceCloudAssistantStatus;
        }

    }

}
