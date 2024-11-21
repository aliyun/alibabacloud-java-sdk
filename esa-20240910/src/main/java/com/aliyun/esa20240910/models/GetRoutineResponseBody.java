// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineResponseBody extends TeaModel {
    /**
     * <p>The code versions.</p>
     */
    @NameInMap("CodeVersions")
    public java.util.List<GetRoutineResponseBodyCodeVersions> codeVersions;

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
     * <p>The records associated with the routine.</p>
     */
    @NameInMap("RelatedRecords")
    public java.util.List<GetRoutineResponseBodyRelatedRecords> relatedRecords;

    /**
     * <p>The routes associated with the routine.</p>
     */
    @NameInMap("RelatedRoutes")
    public java.util.List<GetRoutineResponseBodyRelatedRoutes> relatedRoutes;

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

    public GetRoutineResponseBody setCodeVersions(java.util.List<GetRoutineResponseBodyCodeVersions> codeVersions) {
        this.codeVersions = codeVersions;
        return this;
    }
    public java.util.List<GetRoutineResponseBodyCodeVersions> getCodeVersions() {
        return this.codeVersions;
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

    public GetRoutineResponseBody setRelatedRecords(java.util.List<GetRoutineResponseBodyRelatedRecords> relatedRecords) {
        this.relatedRecords = relatedRecords;
        return this;
    }
    public java.util.List<GetRoutineResponseBodyRelatedRecords> getRelatedRecords() {
        return this.relatedRecords;
    }

    public GetRoutineResponseBody setRelatedRoutes(java.util.List<GetRoutineResponseBodyRelatedRoutes> relatedRoutes) {
        this.relatedRoutes = relatedRoutes;
        return this;
    }
    public java.util.List<GetRoutineResponseBodyRelatedRoutes> getRelatedRoutes() {
        return this.relatedRoutes;
    }

    public GetRoutineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRoutineResponseBodyCodeVersions extends TeaModel {
        /**
         * <p>The description of the code version.</p>
         * 
         * <strong>example:</strong>
         * <p>test ver code desc</p>
         */
        @NameInMap("CodeDescription")
        public String codeDescription;

        /**
         * <p>The code version.</p>
         * 
         * <strong>example:</strong>
         * <p>1710120201067203242</p>
         */
        @NameInMap("CodeVersion")
        public String codeVersion;

        /**
         * <p>The time when the code version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-11T01:23:21Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        public static GetRoutineResponseBodyCodeVersions build(java.util.Map<String, ?> map) throws Exception {
            GetRoutineResponseBodyCodeVersions self = new GetRoutineResponseBodyCodeVersions();
            return TeaModel.build(map, self);
        }

        public GetRoutineResponseBodyCodeVersions setCodeDescription(String codeDescription) {
            this.codeDescription = codeDescription;
            return this;
        }
        public String getCodeDescription() {
            return this.codeDescription;
        }

        public GetRoutineResponseBodyCodeVersions setCodeVersion(String codeVersion) {
            this.codeVersion = codeVersion;
            return this;
        }
        public String getCodeVersion() {
            return this.codeVersion;
        }

        public GetRoutineResponseBodyCodeVersions setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

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

        /**
         * <p>The specification.</p>
         * 
         * <strong>example:</strong>
         * <p>5ms</p>
         */
        @NameInMap("SpecName")
        public String specName;

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

        public GetRoutineResponseBodyEnvs setSpecName(String specName) {
            this.specName = specName;
            return this;
        }
        public String getSpecName() {
            return this.specName;
        }

    }

    public static class GetRoutineResponseBodyRelatedRecords extends TeaModel {
        /**
         * <p>The record ID.</p>
         * 
         * <strong>example:</strong>
         * <p>509348423011904</p>
         */
        @NameInMap("RecordId")
        public Long recordId;

        /**
         * <p>The record name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-record-1.example.com</p>
         */
        @NameInMap("RecordName")
        public String recordName;

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54362329990032</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>The website name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        public static GetRoutineResponseBodyRelatedRecords build(java.util.Map<String, ?> map) throws Exception {
            GetRoutineResponseBodyRelatedRecords self = new GetRoutineResponseBodyRelatedRecords();
            return TeaModel.build(map, self);
        }

        public GetRoutineResponseBodyRelatedRecords setRecordId(Long recordId) {
            this.recordId = recordId;
            return this;
        }
        public Long getRecordId() {
            return this.recordId;
        }

        public GetRoutineResponseBodyRelatedRecords setRecordName(String recordName) {
            this.recordName = recordName;
            return this;
        }
        public String getRecordName() {
            return this.recordName;
        }

        public GetRoutineResponseBodyRelatedRecords setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public GetRoutineResponseBodyRelatedRecords setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

    }

    public static class GetRoutineResponseBodyRelatedRoutes extends TeaModel {
        /**
         * <p>The route.</p>
         * 
         * <strong>example:</strong>
         * <p><em>.example.com/path1</em></p>
         */
        @NameInMap("Route")
        public String route;

        /**
         * <p>The route ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d501cb8a2c951f32922d260040780c06</p>
         */
        @NameInMap("RouteId")
        public String routeId;

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54362329990032</p>
         */
        @NameInMap("SiteId")
        public Long siteId;

        /**
         * <p>The website name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("SiteName")
        public String siteName;

        public static GetRoutineResponseBodyRelatedRoutes build(java.util.Map<String, ?> map) throws Exception {
            GetRoutineResponseBodyRelatedRoutes self = new GetRoutineResponseBodyRelatedRoutes();
            return TeaModel.build(map, self);
        }

        public GetRoutineResponseBodyRelatedRoutes setRoute(String route) {
            this.route = route;
            return this;
        }
        public String getRoute() {
            return this.route;
        }

        public GetRoutineResponseBodyRelatedRoutes setRouteId(String routeId) {
            this.routeId = routeId;
            return this;
        }
        public String getRouteId() {
            return this.routeId;
        }

        public GetRoutineResponseBodyRelatedRoutes setSiteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }
        public Long getSiteId() {
            return this.siteId;
        }

        public GetRoutineResponseBodyRelatedRoutes setSiteName(String siteName) {
            this.siteName = siteName;
            return this;
        }
        public String getSiteName() {
            return this.siteName;
        }

    }

}
