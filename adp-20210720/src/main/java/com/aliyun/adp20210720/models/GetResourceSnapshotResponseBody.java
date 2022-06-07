// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetResourceSnapshotResponseBody extends TeaModel {
    @NameInMap("CPULimit")
    public String CPULimit;

    @NameInMap("CPURequest")
    public String CPURequest;

    @NameInMap("adpInfo")
    public GetResourceSnapshotResponseBodyAdpInfo adpInfo;

    @NameInMap("memoryLimit")
    public String memoryLimit;

    @NameInMap("memoryRequest")
    public String memoryRequest;

    @NameInMap("productInfo")
    public GetResourceSnapshotResponseBodyProductInfo productInfo;

    @NameInMap("storageRequest")
    public String storageRequest;

    public static GetResourceSnapshotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceSnapshotResponseBody self = new GetResourceSnapshotResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceSnapshotResponseBody setCPULimit(String CPULimit) {
        this.CPULimit = CPULimit;
        return this;
    }
    public String getCPULimit() {
        return this.CPULimit;
    }

    public GetResourceSnapshotResponseBody setCPURequest(String CPURequest) {
        this.CPURequest = CPURequest;
        return this;
    }
    public String getCPURequest() {
        return this.CPURequest;
    }

    public GetResourceSnapshotResponseBody setAdpInfo(GetResourceSnapshotResponseBodyAdpInfo adpInfo) {
        this.adpInfo = adpInfo;
        return this;
    }
    public GetResourceSnapshotResponseBodyAdpInfo getAdpInfo() {
        return this.adpInfo;
    }

    public GetResourceSnapshotResponseBody setMemoryLimit(String memoryLimit) {
        this.memoryLimit = memoryLimit;
        return this;
    }
    public String getMemoryLimit() {
        return this.memoryLimit;
    }

    public GetResourceSnapshotResponseBody setMemoryRequest(String memoryRequest) {
        this.memoryRequest = memoryRequest;
        return this;
    }
    public String getMemoryRequest() {
        return this.memoryRequest;
    }

    public GetResourceSnapshotResponseBody setProductInfo(GetResourceSnapshotResponseBodyProductInfo productInfo) {
        this.productInfo = productInfo;
        return this;
    }
    public GetResourceSnapshotResponseBodyProductInfo getProductInfo() {
        return this.productInfo;
    }

    public GetResourceSnapshotResponseBody setStorageRequest(String storageRequest) {
        this.storageRequest = storageRequest;
        return this;
    }
    public String getStorageRequest() {
        return this.storageRequest;
    }

    public static class GetResourceSnapshotResponseBodyAdpInfoComponents extends TeaModel {
        @NameInMap("CPULimit")
        public String CPULimit;

        @NameInMap("CPURequest")
        public String CPURequest;

        @NameInMap("componentName")
        public String componentName;

        @NameInMap("componentReleaseName")
        public String componentReleaseName;

        @NameInMap("componentVersion")
        public String componentVersion;

        @NameInMap("memoryLimit")
        public String memoryLimit;

        @NameInMap("memoryRequest")
        public String memoryRequest;

        @NameInMap("orchestrationValue")
        public String orchestrationValue;

        @NameInMap("status")
        public String status;

        @NameInMap("storageRequest")
        public String storageRequest;

        public static GetResourceSnapshotResponseBodyAdpInfoComponents build(java.util.Map<String, ?> map) throws Exception {
            GetResourceSnapshotResponseBodyAdpInfoComponents self = new GetResourceSnapshotResponseBodyAdpInfoComponents();
            return TeaModel.build(map, self);
        }

        public GetResourceSnapshotResponseBodyAdpInfoComponents setCPULimit(String CPULimit) {
            this.CPULimit = CPULimit;
            return this;
        }
        public String getCPULimit() {
            return this.CPULimit;
        }

        public GetResourceSnapshotResponseBodyAdpInfoComponents setCPURequest(String CPURequest) {
            this.CPURequest = CPURequest;
            return this;
        }
        public String getCPURequest() {
            return this.CPURequest;
        }

        public GetResourceSnapshotResponseBodyAdpInfoComponents setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetResourceSnapshotResponseBodyAdpInfoComponents setComponentReleaseName(String componentReleaseName) {
            this.componentReleaseName = componentReleaseName;
            return this;
        }
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        public GetResourceSnapshotResponseBodyAdpInfoComponents setComponentVersion(String componentVersion) {
            this.componentVersion = componentVersion;
            return this;
        }
        public String getComponentVersion() {
            return this.componentVersion;
        }

        public GetResourceSnapshotResponseBodyAdpInfoComponents setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public GetResourceSnapshotResponseBodyAdpInfoComponents setMemoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        public GetResourceSnapshotResponseBodyAdpInfoComponents setOrchestrationValue(String orchestrationValue) {
            this.orchestrationValue = orchestrationValue;
            return this;
        }
        public String getOrchestrationValue() {
            return this.orchestrationValue;
        }

        public GetResourceSnapshotResponseBodyAdpInfoComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetResourceSnapshotResponseBodyAdpInfoComponents setStorageRequest(String storageRequest) {
            this.storageRequest = storageRequest;
            return this;
        }
        public String getStorageRequest() {
            return this.storageRequest;
        }

    }

    public static class GetResourceSnapshotResponseBodyAdpInfo extends TeaModel {
        @NameInMap("CPURequest")
        public String CPURequest;

        @NameInMap("componentNum")
        public Integer componentNum;

        @NameInMap("components")
        public java.util.List<GetResourceSnapshotResponseBodyAdpInfoComponents> components;

        @NameInMap("memoryRequest")
        public String memoryRequest;

        @NameInMap("podNum")
        public Integer podNum;

        @NameInMap("storageRequest")
        public String storageRequest;

        @NameInMap("workloadNum")
        public Integer workloadNum;

        public static GetResourceSnapshotResponseBodyAdpInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResourceSnapshotResponseBodyAdpInfo self = new GetResourceSnapshotResponseBodyAdpInfo();
            return TeaModel.build(map, self);
        }

        public GetResourceSnapshotResponseBodyAdpInfo setCPURequest(String CPURequest) {
            this.CPURequest = CPURequest;
            return this;
        }
        public String getCPURequest() {
            return this.CPURequest;
        }

        public GetResourceSnapshotResponseBodyAdpInfo setComponentNum(Integer componentNum) {
            this.componentNum = componentNum;
            return this;
        }
        public Integer getComponentNum() {
            return this.componentNum;
        }

        public GetResourceSnapshotResponseBodyAdpInfo setComponents(java.util.List<GetResourceSnapshotResponseBodyAdpInfoComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<GetResourceSnapshotResponseBodyAdpInfoComponents> getComponents() {
            return this.components;
        }

        public GetResourceSnapshotResponseBodyAdpInfo setMemoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        public GetResourceSnapshotResponseBodyAdpInfo setPodNum(Integer podNum) {
            this.podNum = podNum;
            return this;
        }
        public Integer getPodNum() {
            return this.podNum;
        }

        public GetResourceSnapshotResponseBodyAdpInfo setStorageRequest(String storageRequest) {
            this.storageRequest = storageRequest;
            return this;
        }
        public String getStorageRequest() {
            return this.storageRequest;
        }

        public GetResourceSnapshotResponseBodyAdpInfo setWorkloadNum(Integer workloadNum) {
            this.workloadNum = workloadNum;
            return this;
        }
        public Integer getWorkloadNum() {
            return this.workloadNum;
        }

    }

    public static class GetResourceSnapshotResponseBodyProductInfoComponents extends TeaModel {
        @NameInMap("CPULimit")
        public String CPULimit;

        @NameInMap("CPURequest")
        public String CPURequest;

        @NameInMap("componentName")
        public String componentName;

        @NameInMap("componentReleaseName")
        public String componentReleaseName;

        @NameInMap("componentVersion")
        public String componentVersion;

        @NameInMap("memoryLimit")
        public String memoryLimit;

        @NameInMap("memoryRequest")
        public String memoryRequest;

        @NameInMap("orchestrationValue")
        public String orchestrationValue;

        @NameInMap("status")
        public String status;

        @NameInMap("storageRequest")
        public String storageRequest;

        public static GetResourceSnapshotResponseBodyProductInfoComponents build(java.util.Map<String, ?> map) throws Exception {
            GetResourceSnapshotResponseBodyProductInfoComponents self = new GetResourceSnapshotResponseBodyProductInfoComponents();
            return TeaModel.build(map, self);
        }

        public GetResourceSnapshotResponseBodyProductInfoComponents setCPULimit(String CPULimit) {
            this.CPULimit = CPULimit;
            return this;
        }
        public String getCPULimit() {
            return this.CPULimit;
        }

        public GetResourceSnapshotResponseBodyProductInfoComponents setCPURequest(String CPURequest) {
            this.CPURequest = CPURequest;
            return this;
        }
        public String getCPURequest() {
            return this.CPURequest;
        }

        public GetResourceSnapshotResponseBodyProductInfoComponents setComponentName(String componentName) {
            this.componentName = componentName;
            return this;
        }
        public String getComponentName() {
            return this.componentName;
        }

        public GetResourceSnapshotResponseBodyProductInfoComponents setComponentReleaseName(String componentReleaseName) {
            this.componentReleaseName = componentReleaseName;
            return this;
        }
        public String getComponentReleaseName() {
            return this.componentReleaseName;
        }

        public GetResourceSnapshotResponseBodyProductInfoComponents setComponentVersion(String componentVersion) {
            this.componentVersion = componentVersion;
            return this;
        }
        public String getComponentVersion() {
            return this.componentVersion;
        }

        public GetResourceSnapshotResponseBodyProductInfoComponents setMemoryLimit(String memoryLimit) {
            this.memoryLimit = memoryLimit;
            return this;
        }
        public String getMemoryLimit() {
            return this.memoryLimit;
        }

        public GetResourceSnapshotResponseBodyProductInfoComponents setMemoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        public GetResourceSnapshotResponseBodyProductInfoComponents setOrchestrationValue(String orchestrationValue) {
            this.orchestrationValue = orchestrationValue;
            return this;
        }
        public String getOrchestrationValue() {
            return this.orchestrationValue;
        }

        public GetResourceSnapshotResponseBodyProductInfoComponents setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetResourceSnapshotResponseBodyProductInfoComponents setStorageRequest(String storageRequest) {
            this.storageRequest = storageRequest;
            return this;
        }
        public String getStorageRequest() {
            return this.storageRequest;
        }

    }

    public static class GetResourceSnapshotResponseBodyProductInfo extends TeaModel {
        @NameInMap("CPURequest")
        public String CPURequest;

        @NameInMap("componentNum")
        public Integer componentNum;

        @NameInMap("components")
        public java.util.List<GetResourceSnapshotResponseBodyProductInfoComponents> components;

        @NameInMap("memoryRequest")
        public String memoryRequest;

        @NameInMap("podNum")
        public Integer podNum;

        @NameInMap("storageRequest")
        public String storageRequest;

        @NameInMap("workloadNum")
        public Integer workloadNum;

        public static GetResourceSnapshotResponseBodyProductInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResourceSnapshotResponseBodyProductInfo self = new GetResourceSnapshotResponseBodyProductInfo();
            return TeaModel.build(map, self);
        }

        public GetResourceSnapshotResponseBodyProductInfo setCPURequest(String CPURequest) {
            this.CPURequest = CPURequest;
            return this;
        }
        public String getCPURequest() {
            return this.CPURequest;
        }

        public GetResourceSnapshotResponseBodyProductInfo setComponentNum(Integer componentNum) {
            this.componentNum = componentNum;
            return this;
        }
        public Integer getComponentNum() {
            return this.componentNum;
        }

        public GetResourceSnapshotResponseBodyProductInfo setComponents(java.util.List<GetResourceSnapshotResponseBodyProductInfoComponents> components) {
            this.components = components;
            return this;
        }
        public java.util.List<GetResourceSnapshotResponseBodyProductInfoComponents> getComponents() {
            return this.components;
        }

        public GetResourceSnapshotResponseBodyProductInfo setMemoryRequest(String memoryRequest) {
            this.memoryRequest = memoryRequest;
            return this;
        }
        public String getMemoryRequest() {
            return this.memoryRequest;
        }

        public GetResourceSnapshotResponseBodyProductInfo setPodNum(Integer podNum) {
            this.podNum = podNum;
            return this;
        }
        public Integer getPodNum() {
            return this.podNum;
        }

        public GetResourceSnapshotResponseBodyProductInfo setStorageRequest(String storageRequest) {
            this.storageRequest = storageRequest;
            return this;
        }
        public String getStorageRequest() {
            return this.storageRequest;
        }

        public GetResourceSnapshotResponseBodyProductInfo setWorkloadNum(Integer workloadNum) {
            this.workloadNum = workloadNum;
            return this;
        }
        public Integer getWorkloadNum() {
            return this.workloadNum;
        }

    }

}
