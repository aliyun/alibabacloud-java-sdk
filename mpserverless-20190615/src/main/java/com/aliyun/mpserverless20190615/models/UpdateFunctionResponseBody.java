// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateFunctionResponseBody extends TeaModel {
    @NameInMap("ModifiedAt")
    public String modifiedAt;

    @NameInMap("Desc")
    public String desc;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TimingTriggerConfig")
    public String timingTriggerConfig;

    @NameInMap("CreatedAt")
    public String createdAt;

    @NameInMap("HttpTriggerPath")
    public String httpTriggerPath;

    @NameInMap("Spec")
    public UpdateFunctionResponseBodySpec spec;

    @NameInMap("Name")
    public String name;

    public static UpdateFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionResponseBody self = new UpdateFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionResponseBody setModifiedAt(String modifiedAt) {
        this.modifiedAt = modifiedAt;
        return this;
    }
    public String getModifiedAt() {
        return this.modifiedAt;
    }

    public UpdateFunctionResponseBody setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateFunctionResponseBody setTimingTriggerConfig(String timingTriggerConfig) {
        this.timingTriggerConfig = timingTriggerConfig;
        return this;
    }
    public String getTimingTriggerConfig() {
        return this.timingTriggerConfig;
    }

    public UpdateFunctionResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public UpdateFunctionResponseBody setHttpTriggerPath(String httpTriggerPath) {
        this.httpTriggerPath = httpTriggerPath;
        return this;
    }
    public String getHttpTriggerPath() {
        return this.httpTriggerPath;
    }

    public UpdateFunctionResponseBody setSpec(UpdateFunctionResponseBodySpec spec) {
        this.spec = spec;
        return this;
    }
    public UpdateFunctionResponseBodySpec getSpec() {
        return this.spec;
    }

    public UpdateFunctionResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public static class UpdateFunctionResponseBodySpec extends TeaModel {
        @NameInMap("Timeout")
        public String timeout;

        @NameInMap("Runtime")
        public String runtime;

        @NameInMap("Memory")
        public String memory;

        public static UpdateFunctionResponseBodySpec build(java.util.Map<String, ?> map) throws Exception {
            UpdateFunctionResponseBodySpec self = new UpdateFunctionResponseBodySpec();
            return TeaModel.build(map, self);
        }

        public UpdateFunctionResponseBodySpec setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

        public UpdateFunctionResponseBodySpec setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public UpdateFunctionResponseBodySpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

    }

}
