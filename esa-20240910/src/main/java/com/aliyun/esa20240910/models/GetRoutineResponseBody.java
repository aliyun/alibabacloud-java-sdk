// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineResponseBody extends TeaModel {
    /**
     * <p>The time when the routine was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-03-11T01:23:21Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The default record name to access.</p>
     * 
     * <strong>example:</strong>
     * <p>routine1.example.com</p>
     */
    @NameInMap("DefaultRelatedRecord")
    public String defaultRelatedRecord;

    /**
     * <p>The description of the routine.</p>
     * 
     * <strong>example:</strong>
     * <p>ZWRpdCByb3V0aW5lIGNvbmZpZyBkZXNjcmlwdGlvbg</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The information about the environments.</p>
     */
    @NameInMap("Envs")
    public java.util.List<GetRoutineResponseBodyEnvs> envs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EDBD3EB3-97DA-5465-AEF5-8DCA5DC5E395</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetRoutineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineResponseBody self = new GetRoutineResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRoutineResponseBody setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetRoutineResponseBody setDefaultRelatedRecord(String defaultRelatedRecord) {
        this.defaultRelatedRecord = defaultRelatedRecord;
        return this;
    }
    public String getDefaultRelatedRecord() {
        return this.defaultRelatedRecord;
    }

    public GetRoutineResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetRoutineResponseBody setEnvs(java.util.List<GetRoutineResponseBodyEnvs> envs) {
        this.envs = envs;
        return this;
    }
    public java.util.List<GetRoutineResponseBodyEnvs> getEnvs() {
        return this.envs;
    }

    public GetRoutineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRoutineResponseBodyEnvs extends TeaModel {
        /**
         * <p>The regions for canary release.</p>
         */
        @NameInMap("CanaryAreaList")
        public java.util.List<String> canaryAreaList;

        /**
         * <p>The version number for canary release.</p>
         * 
         * <strong>example:</strong>
         * <p>1710120201067577628</p>
         */
        @NameInMap("CanaryCodeVersion")
        public String canaryCodeVersion;

        /**
         * <p>The version number of the code in the environment.</p>
         * 
         * <strong>example:</strong>
         * <p>1710120201067577628</p>
         */
        @NameInMap("CodeVersion")
        public String codeVersion;

        /**
         * <p>The environment type.</p>
         * 
         * <strong>example:</strong>
         * <p>production</p>
         */
        @NameInMap("Env")
        public String env;

        public static GetRoutineResponseBodyEnvs build(java.util.Map<String, ?> map) throws Exception {
            GetRoutineResponseBodyEnvs self = new GetRoutineResponseBodyEnvs();
            return TeaModel.build(map, self);
        }

        public GetRoutineResponseBodyEnvs setCanaryAreaList(java.util.List<String> canaryAreaList) {
            this.canaryAreaList = canaryAreaList;
            return this;
        }
        public java.util.List<String> getCanaryAreaList() {
            return this.canaryAreaList;
        }

        public GetRoutineResponseBodyEnvs setCanaryCodeVersion(String canaryCodeVersion) {
            this.canaryCodeVersion = canaryCodeVersion;
            return this;
        }
        public String getCanaryCodeVersion() {
            return this.canaryCodeVersion;
        }

        public GetRoutineResponseBodyEnvs setCodeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }
        public String getCodeVersion() {
            return this.codeVersion;
        }

        public GetRoutineResponseBodyEnvs setEnv(String env) {
            this.env = env;
            return this;
        }
        public String getEnv() {
            return this.env;
        }

    }

}
