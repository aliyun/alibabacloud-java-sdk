// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StopInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceResponses")
    @Validation(required = true)
    public StopInstancesResponseInstanceResponses instanceResponses;

    public static StopInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        StopInstancesResponse self = new StopInstancesResponse();
        return TeaModel.build(map, self);
    }

    public static class StopInstancesResponseInstanceResponsesInstanceResponse extends TeaModel {
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

        public static StopInstancesResponseInstanceResponsesInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
            StopInstancesResponseInstanceResponsesInstanceResponse self = new StopInstancesResponseInstanceResponsesInstanceResponse();
            return TeaModel.build(map, self);
        }

    }

    public static class StopInstancesResponseInstanceResponses extends TeaModel {
        @NameInMap("InstanceResponse")
        @Validation(required = true)
        public java.util.List<StopInstancesResponseInstanceResponsesInstanceResponse> instanceResponse;

        public static StopInstancesResponseInstanceResponses build(java.util.Map<String, ?> map) throws Exception {
            StopInstancesResponseInstanceResponses self = new StopInstancesResponseInstanceResponses();
            return TeaModel.build(map, self);
        }

    }

}
