// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RebootInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceResponses")
    @Validation(required = true)
    public RebootInstancesResponseInstanceResponses instanceResponses;

    public static RebootInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RebootInstancesResponse self = new RebootInstancesResponse();
        return TeaModel.build(map, self);
    }

    public static class RebootInstancesResponseInstanceResponsesInstanceResponse extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("PreviousStatus")
        @Validation(required = true)
        public String previousStatus;

        @NameInMap("CurrentStatus")
        @Validation(required = true)
        public String currentStatus;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        public static RebootInstancesResponseInstanceResponsesInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
            RebootInstancesResponseInstanceResponsesInstanceResponse self = new RebootInstancesResponseInstanceResponsesInstanceResponse();
            return TeaModel.build(map, self);
        }

    }

    public static class RebootInstancesResponseInstanceResponses extends TeaModel {
        @NameInMap("InstanceResponse")
        @Validation(required = true)
        public java.util.List<RebootInstancesResponseInstanceResponsesInstanceResponse> instanceResponse;

        public static RebootInstancesResponseInstanceResponses build(java.util.Map<String, ?> map) throws Exception {
            RebootInstancesResponseInstanceResponses self = new RebootInstancesResponseInstanceResponses();
            return TeaModel.build(map, self);
        }

    }

}
