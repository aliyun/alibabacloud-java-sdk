// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class CreateFunctionResponseBody extends TeaModel {
    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("ModifiedAt")
    public String modifiedAt;

    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Spec")
    public CreateFunctionResponseBodySpec spec;

    public static CreateFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateFunctionResponseBody self = new CreateFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateFunctionResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateFunctionResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public CreateFunctionResponseBody setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public String getModifiedAt() {
        return this.modifiedAt;
    }

    public CreateFunctionResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateFunctionResponseBody setSpec(CreateFunctionResponseBodySpec spec) {
        this.spec = spec;
        return this;
    }
    public CreateFunctionResponseBodySpec getSpec() {
        return this.spec;
    }

    public static class CreateFunctionResponseBodySpec extends TeaModel {
        @NameInMap("InstanceConcurrency")
        public String instanceConcurrency;

        @NameInMap("Memory")
        public String memory;

        @NameInMap("Runtime")
        public String runtime;

        @NameInMap("Timeout")
        public String timeout;

        public static CreateFunctionResponseBodySpec build(java.util.Map<String, ?> map) throws Exception {
            CreateFunctionResponseBodySpec self = new CreateFunctionResponseBodySpec();
            return TeaModel.build(map, self);
        }

        public CreateFunctionResponseBodySpec setInstanceConcurrency(String instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }
        public String getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        public CreateFunctionResponseBodySpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public CreateFunctionResponseBodySpec setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public CreateFunctionResponseBodySpec setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

    }

}
