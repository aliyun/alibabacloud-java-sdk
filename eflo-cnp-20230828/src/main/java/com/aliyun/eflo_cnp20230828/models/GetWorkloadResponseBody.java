// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class GetWorkloadResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public GetWorkloadResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>E67E2E4C-2B47-5C55-AA17-1D771E070AEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static GetWorkloadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetWorkloadResponseBody self = new GetWorkloadResponseBody();
        return TeaModel.build(map, self);
    }

    public GetWorkloadResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public GetWorkloadResponseBody setData(GetWorkloadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetWorkloadResponseBodyData getData() {
        return this.data;
    }

    public GetWorkloadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetWorkloadResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class GetWorkloadResponseBodyDataParamSettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("ParamDesc")
        public String paramDesc;

        /**
         * <strong>example:</strong>
         * <p>ITERATION</p>
         */
        @NameInMap("ParamName")
        public String paramName;

        /**
         * <strong>example:</strong>
         * <p>[0-9]+</p>
         */
        @NameInMap("ParamRegex")
        public String paramRegex;

        /**
         * <strong>example:</strong>
         * <p>number</p>
         */
        @NameInMap("ParamType")
        public String paramType;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ParamValue")
        public String paramValue;

        public static GetWorkloadResponseBodyDataParamSettings build(java.util.Map<String, ?> map) throws Exception {
            GetWorkloadResponseBodyDataParamSettings self = new GetWorkloadResponseBodyDataParamSettings();
            return TeaModel.build(map, self);
        }

        public GetWorkloadResponseBodyDataParamSettings setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public GetWorkloadResponseBodyDataParamSettings setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public GetWorkloadResponseBodyDataParamSettings setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public GetWorkloadResponseBodyDataParamSettings setParamRegex(String paramRegex) {
            this.paramRegex = paramRegex;
            return this;
        }
        public String getParamRegex() {
            return this.paramRegex;
        }

        public GetWorkloadResponseBodyDataParamSettings setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public GetWorkloadResponseBodyDataParamSettings setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class GetWorkloadResponseBodyDataStaticConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>PyTorch</p>
         */
        @NameInMap("FrameWork")
        public String frameWork;

        /**
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <strong>example:</strong>
         * <p>7B</p>
         */
        @NameInMap("Parameters")
        public String parameters;

        /**
         * <strong>example:</strong>
         * <p>python</p>
         */
        @NameInMap("SoftwareStack")
        public String softwareStack;

        public static GetWorkloadResponseBodyDataStaticConfig build(java.util.Map<String, ?> map) throws Exception {
            GetWorkloadResponseBodyDataStaticConfig self = new GetWorkloadResponseBodyDataStaticConfig();
            return TeaModel.build(map, self);
        }

        public GetWorkloadResponseBodyDataStaticConfig setFrameWork(String frameWork) {
            this.frameWork = frameWork;
            return this;
        }
        public String getFrameWork() {
            return this.frameWork;
        }

        public GetWorkloadResponseBodyDataStaticConfig setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public GetWorkloadResponseBodyDataStaticConfig setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public GetWorkloadResponseBodyDataStaticConfig setSoftwareStack(String softwareStack) {
            this.softwareStack = softwareStack;
            return this;
        }
        public String getSoftwareStack() {
            return this.softwareStack;
        }

    }

    public static class GetWorkloadResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("DefaultCpuPerWorker")
        public Integer defaultCpuPerWorker;

        /**
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("DefaultGpuPerWorker")
        public Integer defaultGpuPerWorker;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("DefaultMemoryPerWorker")
        public Integer defaultMemoryPerWorker;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("DefaultShareMemory")
        public Integer defaultShareMemory;

        /**
         * <strong>example:</strong>
         * <p>AI</p>
         */
        @NameInMap("Family")
        public String family;

        /**
         * <strong>example:</strong>
         * <p>PyTorchJob</p>
         */
        @NameInMap("JobKind")
        public String jobKind;

        @NameInMap("ParamSettings")
        public java.util.List<GetWorkloadResponseBodyDataParamSettings> paramSettings;

        /**
         * <strong>example:</strong>
         * <p>NLP-LLM</p>
         */
        @NameInMap("Scene")
        public String scene;

        /**
         * <strong>example:</strong>
         * <p>common</p>
         */
        @NameInMap("Scope")
        public String scope;

        @NameInMap("StaticConfig")
        public GetWorkloadResponseBodyDataStaticConfig staticConfig;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VersionId")
        public Long versionId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadDescription")
        public String workloadDescription;

        /**
         * <strong>example:</strong>
         * <p>13</p>
         */
        @NameInMap("WorkloadId")
        public Long workloadId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("WorkloadName")
        public String workloadName;

        /**
         * <strong>example:</strong>
         * <p>AI</p>
         */
        @NameInMap("WorkloadType")
        public String workloadType;

        public static GetWorkloadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetWorkloadResponseBodyData self = new GetWorkloadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetWorkloadResponseBodyData setDefaultCpuPerWorker(Integer defaultCpuPerWorker) {
            this.defaultCpuPerWorker = defaultCpuPerWorker;
            return this;
        }
        public Integer getDefaultCpuPerWorker() {
            return this.defaultCpuPerWorker;
        }

        public GetWorkloadResponseBodyData setDefaultGpuPerWorker(Integer defaultGpuPerWorker) {
            this.defaultGpuPerWorker = defaultGpuPerWorker;
            return this;
        }
        public Integer getDefaultGpuPerWorker() {
            return this.defaultGpuPerWorker;
        }

        public GetWorkloadResponseBodyData setDefaultMemoryPerWorker(Integer defaultMemoryPerWorker) {
            this.defaultMemoryPerWorker = defaultMemoryPerWorker;
            return this;
        }
        public Integer getDefaultMemoryPerWorker() {
            return this.defaultMemoryPerWorker;
        }

        public GetWorkloadResponseBodyData setDefaultShareMemory(Integer defaultShareMemory) {
            this.defaultShareMemory = defaultShareMemory;
            return this;
        }
        public Integer getDefaultShareMemory() {
            return this.defaultShareMemory;
        }

        public GetWorkloadResponseBodyData setFamily(String family) {
            this.family = family;
            return this;
        }
        public String getFamily() {
            return this.family;
        }

        public GetWorkloadResponseBodyData setJobKind(String jobKind) {
            this.jobKind = jobKind;
            return this;
        }
        public String getJobKind() {
            return this.jobKind;
        }

        public GetWorkloadResponseBodyData setParamSettings(java.util.List<GetWorkloadResponseBodyDataParamSettings> paramSettings) {
            this.paramSettings = paramSettings;
            return this;
        }
        public java.util.List<GetWorkloadResponseBodyDataParamSettings> getParamSettings() {
            return this.paramSettings;
        }

        public GetWorkloadResponseBodyData setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public GetWorkloadResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public GetWorkloadResponseBodyData setStaticConfig(GetWorkloadResponseBodyDataStaticConfig staticConfig) {
            this.staticConfig = staticConfig;
            return this;
        }
        public GetWorkloadResponseBodyDataStaticConfig getStaticConfig() {
            return this.staticConfig;
        }

        public GetWorkloadResponseBodyData setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

        public GetWorkloadResponseBodyData setWorkloadDescription(String workloadDescription) {
            this.workloadDescription = workloadDescription;
            return this;
        }
        public String getWorkloadDescription() {
            return this.workloadDescription;
        }

        public GetWorkloadResponseBodyData setWorkloadId(Long workloadId) {
            this.workloadId = workloadId;
            return this;
        }
        public Long getWorkloadId() {
            return this.workloadId;
        }

        public GetWorkloadResponseBodyData setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

        public GetWorkloadResponseBodyData setWorkloadType(String workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public String getWorkloadType() {
            return this.workloadType;
        }

    }

}
