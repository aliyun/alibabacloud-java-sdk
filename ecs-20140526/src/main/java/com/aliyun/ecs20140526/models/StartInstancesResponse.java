// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceResponses")
    @Validation(required = true)
    public StartInstancesResponseInstanceResponses instanceResponses;

    public static StartInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        StartInstancesResponse self = new StartInstancesResponse();
        return TeaModel.build(map, self);
    }

    public static class StartInstancesResponseInstanceResponsesInstanceResponse extends TeaModel {
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

        public static StartInstancesResponseInstanceResponsesInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
            StartInstancesResponseInstanceResponsesInstanceResponse self = new StartInstancesResponseInstanceResponsesInstanceResponse();
            return TeaModel.build(map, self);
        }

    }

    public static class StartInstancesResponseInstanceResponses extends TeaModel {
        @NameInMap("InstanceResponse")
        @Validation(required = true)
        public java.util.List<StartInstancesResponseInstanceResponsesInstanceResponse> instanceResponse;

        public static StartInstancesResponseInstanceResponses build(java.util.Map<String, ?> map) throws Exception {
            StartInstancesResponseInstanceResponses self = new StartInstancesResponseInstanceResponses();
            return TeaModel.build(map, self);
        }

    }

}
