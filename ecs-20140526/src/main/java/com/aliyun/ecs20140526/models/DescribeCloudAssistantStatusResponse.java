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

    }

    public static class DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSet extends TeaModel {
        @NameInMap("InstanceCloudAssistantStatus")
        @Validation(required = true)
        public java.util.List<DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus> instanceCloudAssistantStatus;

        public static DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSet self = new DescribeCloudAssistantStatusResponseInstanceCloudAssistantStatusSet();
            return TeaModel.build(map, self);
        }

    }

}
