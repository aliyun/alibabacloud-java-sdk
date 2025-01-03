// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_cnp20230828.models;

import com.aliyun.tea.*;

public class ListWorkloadsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public java.util.List<ListWorkloadsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>4AC08332-436C-57A3-9FBA-26772B1A9901</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListWorkloadsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListWorkloadsResponseBody self = new ListWorkloadsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListWorkloadsResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListWorkloadsResponseBody setData(java.util.List<ListWorkloadsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListWorkloadsResponseBodyData> getData() {
        return this.data;
    }

    public ListWorkloadsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListWorkloadsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListWorkloadsResponseBodyDataParamSettings extends TeaModel {
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

        public static ListWorkloadsResponseBodyDataParamSettings build(java.util.Map<String, ?> map) throws Exception {
            ListWorkloadsResponseBodyDataParamSettings self = new ListWorkloadsResponseBodyDataParamSettings();
            return TeaModel.build(map, self);
        }

        public ListWorkloadsResponseBodyDataParamSettings setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ListWorkloadsResponseBodyDataParamSettings setParamDesc(String paramDesc) {
            this.paramDesc = paramDesc;
            return this;
        }
        public String getParamDesc() {
            return this.paramDesc;
        }

        public ListWorkloadsResponseBodyDataParamSettings setParamName(String paramName) {
            this.paramName = paramName;
            return this;
        }
        public String getParamName() {
            return this.paramName;
        }

        public ListWorkloadsResponseBodyDataParamSettings setParamRegex(String paramRegex) {
            this.paramRegex = paramRegex;
            return this;
        }
        public String getParamRegex() {
            return this.paramRegex;
        }

        public ListWorkloadsResponseBodyDataParamSettings setParamType(String paramType) {
            this.paramType = paramType;
            return this;
        }
        public String getParamType() {
            return this.paramType;
        }

        public ListWorkloadsResponseBodyDataParamSettings setParamValue(String paramValue) {
            this.paramValue = paramValue;
            return this;
        }
        public String getParamValue() {
            return this.paramValue;
        }

    }

    public static class ListWorkloadsResponseBodyDataStaticConfig extends TeaModel {
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

        public static ListWorkloadsResponseBodyDataStaticConfig build(java.util.Map<String, ?> map) throws Exception {
            ListWorkloadsResponseBodyDataStaticConfig self = new ListWorkloadsResponseBodyDataStaticConfig();
            return TeaModel.build(map, self);
        }

        public ListWorkloadsResponseBodyDataStaticConfig setFrameWork(String frameWork) {
            this.frameWork = frameWork;
            return this;
        }
        public String getFrameWork() {
            return this.frameWork;
        }

        public ListWorkloadsResponseBodyDataStaticConfig setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public ListWorkloadsResponseBodyDataStaticConfig setParameters(String parameters) {
            this.parameters = parameters;
            return this;
        }
        public String getParameters() {
            return this.parameters;
        }

        public ListWorkloadsResponseBodyDataStaticConfig setSoftwareStack(String softwareStack) {
            this.softwareStack = softwareStack;
            return this;
        }
        public String getSoftwareStack() {
            return this.softwareStack;
        }

    }

    public static class ListWorkloadsResponseBodyData extends TeaModel {
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
        public java.util.List<ListWorkloadsResponseBodyDataParamSettings> paramSettings;

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
        public ListWorkloadsResponseBodyDataStaticConfig staticConfig;

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

        public static ListWorkloadsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListWorkloadsResponseBodyData self = new ListWorkloadsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListWorkloadsResponseBodyData setDefaultCpuPerWorker(Integer defaultCpuPerWorker) {
            this.defaultCpuPerWorker = defaultCpuPerWorker;
            return this;
        }
        public Integer getDefaultCpuPerWorker() {
            return this.defaultCpuPerWorker;
        }

        public ListWorkloadsResponseBodyData setDefaultGpuPerWorker(Integer defaultGpuPerWorker) {
            this.defaultGpuPerWorker = defaultGpuPerWorker;
            return this;
        }
        public Integer getDefaultGpuPerWorker() {
            return this.defaultGpuPerWorker;
        }

        public ListWorkloadsResponseBodyData setDefaultMemoryPerWorker(Integer defaultMemoryPerWorker) {
            this.defaultMemoryPerWorker = defaultMemoryPerWorker;
            return this;
        }
        public Integer getDefaultMemoryPerWorker() {
            return this.defaultMemoryPerWorker;
        }

        public ListWorkloadsResponseBodyData setDefaultShareMemory(Integer defaultShareMemory) {
            this.defaultShareMemory = defaultShareMemory;
            return this;
        }
        public Integer getDefaultShareMemory() {
            return this.defaultShareMemory;
        }

        public ListWorkloadsResponseBodyData setFamily(String family) {
            this.family = family;
            return this;
        }
        public String getFamily() {
            return this.family;
        }

        public ListWorkloadsResponseBodyData setJobKind(String jobKind) {
            this.jobKind = jobKind;
            return this;
        }
        public String getJobKind() {
            return this.jobKind;
        }

        public ListWorkloadsResponseBodyData setParamSettings(java.util.List<ListWorkloadsResponseBodyDataParamSettings> paramSettings) {
            this.paramSettings = paramSettings;
            return this;
        }
        public java.util.List<ListWorkloadsResponseBodyDataParamSettings> getParamSettings() {
            return this.paramSettings;
        }

        public ListWorkloadsResponseBodyData setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public ListWorkloadsResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListWorkloadsResponseBodyData setStaticConfig(ListWorkloadsResponseBodyDataStaticConfig staticConfig) {
            this.staticConfig = staticConfig;
            return this;
        }
        public ListWorkloadsResponseBodyDataStaticConfig getStaticConfig() {
            return this.staticConfig;
        }

        public ListWorkloadsResponseBodyData setVersionId(Long versionId) {
            this.versionId = versionId;
            return this;
        }
        public Long getVersionId() {
            return this.versionId;
        }

        public ListWorkloadsResponseBodyData setWorkloadDescription(String workloadDescription) {
            this.workloadDescription = workloadDescription;
            return this;
        }
        public String getWorkloadDescription() {
            return this.workloadDescription;
        }

        public ListWorkloadsResponseBodyData setWorkloadId(Long workloadId) {
            this.workloadId = workloadId;
            return this;
        }
        public Long getWorkloadId() {
            return this.workloadId;
        }

        public ListWorkloadsResponseBodyData setWorkloadName(String workloadName) {
            this.workloadName = workloadName;
            return this;
        }
        public String getWorkloadName() {
            return this.workloadName;
        }

        public ListWorkloadsResponseBodyData setWorkloadType(String workloadType) {
            this.workloadType = workloadType;
            return this;
        }
        public String getWorkloadType() {
            return this.workloadType;
        }

    }

}
