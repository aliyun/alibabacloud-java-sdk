// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyCabInstanceResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Instance")
    public ModifyCabInstanceResponseBodyInstance instance;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyCabInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCabInstanceResponseBody self = new ModifyCabInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCabInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ModifyCabInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCabInstanceResponseBody setInstance(ModifyCabInstanceResponseBodyInstance instance) {
        this.instance = instance;
        return this;
    }
    public ModifyCabInstanceResponseBodyInstance getInstance() {
        return this.instance;
    }

    public ModifyCabInstanceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ModifyCabInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ModifyCabInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyCabInstanceResponseBodyInstance extends TeaModel {
        @NameInMap("CreationTime")
        public Long creationTime;

        @NameInMap("CallCenterInstanceId")
        public String callCenterInstanceId;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("MaxConcurrentConversation")
        public Integer maxConcurrentConversation;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        public static ModifyCabInstanceResponseBodyInstance build(java.util.Map<String, ?> map) throws Exception {
            ModifyCabInstanceResponseBodyInstance self = new ModifyCabInstanceResponseBodyInstance();
            return TeaModel.build(map, self);
        }

        public ModifyCabInstanceResponseBodyInstance setCreationTime(Long creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public Long getCreationTime() {
            return this.creationTime;
        }

        public ModifyCabInstanceResponseBodyInstance setCallCenterInstanceId(String callCenterInstanceId) {
            this.callCenterInstanceId = callCenterInstanceId;
            return this;
        }
        public String getCallCenterInstanceId() {
            return this.callCenterInstanceId;
        }

        public ModifyCabInstanceResponseBodyInstance setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public ModifyCabInstanceResponseBodyInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ModifyCabInstanceResponseBodyInstance setMaxConcurrentConversation(Integer maxConcurrentConversation) {
            this.maxConcurrentConversation = maxConcurrentConversation;
            return this;
        }
        public Integer getMaxConcurrentConversation() {
            return this.maxConcurrentConversation;
        }

        public ModifyCabInstanceResponseBodyInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ModifyCabInstanceResponseBodyInstance setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

    }

}
