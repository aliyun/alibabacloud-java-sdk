// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeFunctionResponseBody extends TeaModel {
    @NameInMap("Deployment")
    public DescribeFunctionResponseBodyDeployment deployment;

    @NameInMap("Function")
    public DescribeFunctionResponseBodyFunction function;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFunctionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFunctionResponseBody self = new DescribeFunctionResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFunctionResponseBody setDeployment(DescribeFunctionResponseBodyDeployment deployment) {
        this.deployment = deployment;
        return this;
    }
    public DescribeFunctionResponseBodyDeployment getDeployment() {
        return this.deployment;
    }

    public DescribeFunctionResponseBody setFunction(DescribeFunctionResponseBodyFunction function) {
        this.function = function;
        return this;
    }
    public DescribeFunctionResponseBodyFunction getFunction() {
        return this.function;
    }

    public DescribeFunctionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFunctionResponseBodyDeployment extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("DeploymentId")
        public String deploymentId;

        @NameInMap("DownloadSignedUrl")
        public String downloadSignedUrl;

        @NameInMap("ModifiedAt")
        public String modifiedAt;

        @NameInMap("VersionNo")
        public String versionNo;

        public static DescribeFunctionResponseBodyDeployment build(java.util.Map<String, ?> map) throws Exception {
            DescribeFunctionResponseBodyDeployment self = new DescribeFunctionResponseBodyDeployment();
            return TeaModel.build(map, self);
        }

        public DescribeFunctionResponseBodyDeployment setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeFunctionResponseBodyDeployment setDeploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }
        public String getDeploymentId() {
            return this.deploymentId;
        }

        public DescribeFunctionResponseBodyDeployment setDownloadSignedUrl(String downloadSignedUrl) {
            this.downloadSignedUrl = downloadSignedUrl;
            return this;
        }
        public String getDownloadSignedUrl() {
            return this.downloadSignedUrl;
        }

        public DescribeFunctionResponseBodyDeployment setModifiedAt(String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        public DescribeFunctionResponseBodyDeployment setVersionNo(String versionNo) {
            this.versionNo = versionNo;
            return this;
        }
        public String getVersionNo() {
            return this.versionNo;
        }

    }

    public static class DescribeFunctionResponseBodyFunctionSpec extends TeaModel {
        @NameInMap("InstanceConcurrency")
        public Integer instanceConcurrency;

        @NameInMap("Memory")
        public String memory;

        @NameInMap("Runtime")
        public String runtime;

        @NameInMap("Timeout")
        public String timeout;

        public static DescribeFunctionResponseBodyFunctionSpec build(java.util.Map<String, ?> map) throws Exception {
            DescribeFunctionResponseBodyFunctionSpec self = new DescribeFunctionResponseBodyFunctionSpec();
            return TeaModel.build(map, self);
        }

        public DescribeFunctionResponseBodyFunctionSpec setInstanceConcurrency(Integer instanceConcurrency) {
            this.instanceConcurrency = instanceConcurrency;
            return this;
        }
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        public DescribeFunctionResponseBodyFunctionSpec setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public String getMemory() {
            return this.memory;
        }

        public DescribeFunctionResponseBodyFunctionSpec setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public DescribeFunctionResponseBodyFunctionSpec setTimeout(String timeout) {
            this.timeout = timeout;
            return this;
        }
        public String getTimeout() {
            return this.timeout;
        }

    }

    public static class DescribeFunctionResponseBodyFunction extends TeaModel {
        @NameInMap("CreatedAt")
        public String createdAt;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("HttpTriggerPath")
        public String httpTriggerPath;

        @NameInMap("ModifiedAt")
        public String modifiedAt;

        @NameInMap("Name")
        public String name;

        @NameInMap("Spec")
        public DescribeFunctionResponseBodyFunctionSpec spec;

        @NameInMap("TimingTriggerConfig")
        public String timingTriggerConfig;

        public static DescribeFunctionResponseBodyFunction build(java.util.Map<String, ?> map) throws Exception {
            DescribeFunctionResponseBodyFunction self = new DescribeFunctionResponseBodyFunction();
            return TeaModel.build(map, self);
        }

        public DescribeFunctionResponseBodyFunction setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public DescribeFunctionResponseBodyFunction setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeFunctionResponseBodyFunction setHttpTriggerPath(String httpTriggerPath) {
            this.httpTriggerPath = httpTriggerPath;
            return this;
        }
        public String getHttpTriggerPath() {
            return this.httpTriggerPath;
        }

        public DescribeFunctionResponseBodyFunction setModifiedAt(String modifiedAt) {
            this.modifiedAt = modifiedAt;
            return this;
        }
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        public DescribeFunctionResponseBodyFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeFunctionResponseBodyFunction setSpec(DescribeFunctionResponseBodyFunctionSpec spec) {
            this.spec = spec;
            return this;
        }
        public DescribeFunctionResponseBodyFunctionSpec getSpec() {
            return this.spec;
        }

        public DescribeFunctionResponseBodyFunction setTimingTriggerConfig(String timingTriggerConfig) {
            this.timingTriggerConfig = timingTriggerConfig;
            return this;
        }
        public String getTimingTriggerConfig() {
            return this.timingTriggerConfig;
        }

    }

}
