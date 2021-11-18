// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class CreateCabInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Instance")
    public CreateCabInstanceResponseBodyInstance instance;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateCabInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCabInstanceResponseBody self = new CreateCabInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCabInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateCabInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateCabInstanceResponseBody setInstance(CreateCabInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public CreateCabInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public CreateCabInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateCabInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCabInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateCabInstanceResponseBodyInstance extends TeaModel {
        @NameInMap("CallCenterInstanceId")
        public String callCenterInstanceId;

        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("MaxConcurrentConversation")
        public Integer maxConcurrentConversation;

        @NameInMap("Owner")
        public String owner;

        public static CreateCabInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            CreateCabInstanceResponseBodyInstance self = new CreateCabInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public CreateCabInstanceResponseBodyInstance setCallCenterInstanceId(String callCenterInstanceId) {
            this.callCenterInstanceId = callCenterInstanceId;
            return this;
        }
        public String getCallCenterInstanceId() {
            return this.callCenterInstanceId;
        }

        public CreateCabInstanceResponseBodyInstance setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public CreateCabInstanceResponseBodyInstance setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public CreateCabInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateCabInstanceResponseBodyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public CreateCabInstanceResponseBodyInstance setMaxConcurrentConversation(Integer maxConcurrentConversation) {
            this.maxConcurrentConversation = maxConcurrentConversation;
            return this;
        }
        public Integer getMaxConcurrentConversation() {
            return this.maxConcurrentConversation;
        }

        public CreateCabInstanceResponseBodyInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

    }

}
