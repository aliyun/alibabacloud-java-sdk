// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb_inc20211201.models;

import com.aliyun.tea.*;

public class GetInitDmsAIServiceK8sEnvInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("data")
    public GetInitDmsAIServiceK8sEnvInfoResponseBodyData data;

    public static GetInitDmsAIServiceK8sEnvInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetInitDmsAIServiceK8sEnvInfoResponseBody self = new GetInitDmsAIServiceK8sEnvInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetInitDmsAIServiceK8sEnvInfoResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetInitDmsAIServiceK8sEnvInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetInitDmsAIServiceK8sEnvInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetInitDmsAIServiceK8sEnvInfoResponseBody setData(GetInitDmsAIServiceK8sEnvInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetInitDmsAIServiceK8sEnvInfoResponseBodyData getData() {
        return this.data;
    }

    public static class GetInitDmsAIServiceK8sEnvInfoResponseBodyData extends TeaModel {
        @NameInMap("Annotations")
        public java.util.Map<String, String> annotations;

        @NameInMap("ApiServerProxyPvlAddress")
        public String apiServerProxyPvlAddress;

        @NameInMap("AsiClusterId")
        public String asiClusterId;

        @NameInMap("DbClusterId")
        public String dbClusterId;

        @NameInMap("EngineParams")
        public java.util.Map<String, String> engineParams;

        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        @NameInMap("K8sServiceAccount")
        public String k8sServiceAccount;

        @NameInMap("Labels")
        public java.util.Map<String, String> labels;

        @NameInMap("MaxComputeResource")
        public String maxComputeResource;

        @NameInMap("MinComputeResource")
        public String minComputeResource;

        @NameInMap("PoolEngine")
        public String poolEngine;

        @NameInMap("PoolName")
        public String poolName;

        @NameInMap("PoolType")
        public String poolType;

        @NameInMap("PriorityClassName")
        public String priorityClassName;

        @NameInMap("Ready")
        public Boolean ready;

        @NameInMap("RuntimeClassName")
        public String runtimeClassName;

        @NameInMap("ServiceAccountToken")
        public String serviceAccountToken;

        @NameInMap("VolumesJson")
        public String volumesJson;

        public static GetInitDmsAIServiceK8sEnvInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetInitDmsAIServiceK8sEnvInfoResponseBodyData self = new GetInitDmsAIServiceK8sEnvInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setAnnotations(java.util.Map<String, String> annotations) {
            this.annotations = annotations;
            return this;
        }
        public java.util.Map<String, String> getAnnotations() {
            return this.annotations;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setApiServerProxyPvlAddress(String apiServerProxyPvlAddress) {
            this.apiServerProxyPvlAddress = apiServerProxyPvlAddress;
            return this;
        }
        public String getApiServerProxyPvlAddress() {
            return this.apiServerProxyPvlAddress;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setAsiClusterId(String asiClusterId) {
            this.asiClusterId = asiClusterId;
            return this;
        }
        public String getAsiClusterId() {
            return this.asiClusterId;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setDbClusterId(String dbClusterId) {
            this.dbClusterId = dbClusterId;
            return this;
        }
        public String getDbClusterId() {
            return this.dbClusterId;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setEngineParams(java.util.Map<String, String> engineParams) {
            this.engineParams = engineParams;
            return this;
        }
        public java.util.Map<String, String> getEngineParams() {
            return this.engineParams;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setK8sNamespace(String k8sNamespace) {
            this.k8sNamespace = k8sNamespace;
            return this;
        }
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setK8sServiceAccount(String k8sServiceAccount) {
            this.k8sServiceAccount = k8sServiceAccount;
            return this;
        }
        public String getK8sServiceAccount() {
            return this.k8sServiceAccount;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setLabels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.Map<String, String> getLabels() {
            return this.labels;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setMaxComputeResource(String maxComputeResource) {
            this.maxComputeResource = maxComputeResource;
            return this;
        }
        public String getMaxComputeResource() {
            return this.maxComputeResource;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setMinComputeResource(String minComputeResource) {
            this.minComputeResource = minComputeResource;
            return this;
        }
        public String getMinComputeResource() {
            return this.minComputeResource;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setPoolEngine(String poolEngine) {
            this.poolEngine = poolEngine;
            return this;
        }
        public String getPoolEngine() {
            return this.poolEngine;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setPoolName(String poolName) {
            this.poolName = poolName;
            return this;
        }
        public String getPoolName() {
            return this.poolName;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setPoolType(String poolType) {
            this.poolType = poolType;
            return this;
        }
        public String getPoolType() {
            return this.poolType;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setPriorityClassName(String priorityClassName) {
            this.priorityClassName = priorityClassName;
            return this;
        }
        public String getPriorityClassName() {
            return this.priorityClassName;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setReady(Boolean ready) {
            this.ready = ready;
            return this;
        }
        public Boolean getReady() {
            return this.ready;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setRuntimeClassName(String runtimeClassName) {
            this.runtimeClassName = runtimeClassName;
            return this;
        }
        public String getRuntimeClassName() {
            return this.runtimeClassName;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setServiceAccountToken(String serviceAccountToken) {
            this.serviceAccountToken = serviceAccountToken;
            return this;
        }
        public String getServiceAccountToken() {
            return this.serviceAccountToken;
        }

        public GetInitDmsAIServiceK8sEnvInfoResponseBodyData setVolumesJson(String volumesJson) {
            this.volumesJson = volumesJson;
            return this;
        }
        public String getVolumesJson() {
            return this.volumesJson;
        }

    }

}
