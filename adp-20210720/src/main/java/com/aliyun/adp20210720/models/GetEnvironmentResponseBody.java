// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetEnvironmentResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public GetEnvironmentResponseBodyData data;

    @NameInMap("msg")
    public String msg;

    public static GetEnvironmentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEnvironmentResponseBody self = new GetEnvironmentResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEnvironmentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEnvironmentResponseBody setData(GetEnvironmentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEnvironmentResponseBodyData getData() {
        return this.data;
    }

    public GetEnvironmentResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public static class GetEnvironmentResponseBodyDataAdvancedConfigs extends TeaModel {
        @NameInMap("enableDeploySimulation")
        public Boolean enableDeploySimulation;

        @NameInMap("enableSiteSurvey")
        public Boolean enableSiteSurvey;

        public static GetEnvironmentResponseBodyDataAdvancedConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentResponseBodyDataAdvancedConfigs self = new GetEnvironmentResponseBodyDataAdvancedConfigs();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentResponseBodyDataAdvancedConfigs setEnableDeploySimulation(Boolean enableDeploySimulation) {
            this.enableDeploySimulation = enableDeploySimulation;
            return this;
        }
        public Boolean getEnableDeploySimulation() {
            return this.enableDeploySimulation;
        }

        public GetEnvironmentResponseBodyDataAdvancedConfigs setEnableSiteSurvey(Boolean enableSiteSurvey) {
            this.enableSiteSurvey = enableSiteSurvey;
            return this;
        }
        public Boolean getEnableSiteSurvey() {
            return this.enableSiteSurvey;
        }

    }

    public static class GetEnvironmentResponseBodyDataPlatform extends TeaModel {
        @NameInMap("architecture")
        public String architecture;

        @NameInMap("os")
        public String os;

        public static GetEnvironmentResponseBodyDataPlatform build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentResponseBodyDataPlatform self = new GetEnvironmentResponseBodyDataPlatform();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentResponseBodyDataPlatform setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public GetEnvironmentResponseBodyDataPlatform setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

    }

    public static class GetEnvironmentResponseBodyDataSiteSurveyReportCheckListFailedList extends TeaModel {
        @NameInMap("ip")
        public String ip;

        @NameInMap("reason")
        public java.util.Map<String, ?> reason;

        public static GetEnvironmentResponseBodyDataSiteSurveyReportCheckListFailedList build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentResponseBodyDataSiteSurveyReportCheckListFailedList self = new GetEnvironmentResponseBodyDataSiteSurveyReportCheckListFailedList();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentResponseBodyDataSiteSurveyReportCheckListFailedList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public GetEnvironmentResponseBodyDataSiteSurveyReportCheckListFailedList setReason(java.util.Map<String, ?> reason) {
            this.reason = reason;
            return this;
        }
        public java.util.Map<String, ?> getReason() {
            return this.reason;
        }

    }

    public static class GetEnvironmentResponseBodyDataSiteSurveyReportCheckList extends TeaModel {
        @NameInMap("description")
        public java.util.Map<String, ?> description;

        @NameInMap("failedList")
        public java.util.List<GetEnvironmentResponseBodyDataSiteSurveyReportCheckListFailedList> failedList;

        @NameInMap("level")
        public String level;

        @NameInMap("name")
        public String name;

        @NameInMap("status")
        public String status;

        public static GetEnvironmentResponseBodyDataSiteSurveyReportCheckList build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentResponseBodyDataSiteSurveyReportCheckList self = new GetEnvironmentResponseBodyDataSiteSurveyReportCheckList();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentResponseBodyDataSiteSurveyReportCheckList setDescription(java.util.Map<String, ?> description) {
            this.description = description;
            return this;
        }
        public java.util.Map<String, ?> getDescription() {
            return this.description;
        }

        public GetEnvironmentResponseBodyDataSiteSurveyReportCheckList setFailedList(java.util.List<GetEnvironmentResponseBodyDataSiteSurveyReportCheckListFailedList> failedList) {
            this.failedList = failedList;
            return this;
        }
        public java.util.List<GetEnvironmentResponseBodyDataSiteSurveyReportCheckListFailedList> getFailedList() {
            return this.failedList;
        }

        public GetEnvironmentResponseBodyDataSiteSurveyReportCheckList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public GetEnvironmentResponseBodyDataSiteSurveyReportCheckList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEnvironmentResponseBodyDataSiteSurveyReportCheckList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetEnvironmentResponseBodyDataSiteSurveyReport extends TeaModel {
        @NameInMap("checkList")
        public java.util.List<GetEnvironmentResponseBodyDataSiteSurveyReportCheckList> checkList;

        @NameInMap("result")
        public String result;

        public static GetEnvironmentResponseBodyDataSiteSurveyReport build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentResponseBodyDataSiteSurveyReport self = new GetEnvironmentResponseBodyDataSiteSurveyReport();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentResponseBodyDataSiteSurveyReport setCheckList(java.util.List<GetEnvironmentResponseBodyDataSiteSurveyReportCheckList> checkList) {
            this.checkList = checkList;
            return this;
        }
        public java.util.List<GetEnvironmentResponseBodyDataSiteSurveyReportCheckList> getCheckList() {
            return this.checkList;
        }

        public GetEnvironmentResponseBodyDataSiteSurveyReport setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class GetEnvironmentResponseBodyData extends TeaModel {
        @NameInMap("advancedConfigs")
        public GetEnvironmentResponseBodyDataAdvancedConfigs advancedConfigs;

        @NameInMap("clusterId")
        public String clusterId;

        @NameInMap("clusterUID")
        public String clusterUID;

        @NameInMap("createdAt")
        public String createdAt;

        @NameInMap("description")
        public String description;

        @NameInMap("expiredAt")
        public String expiredAt;

        @NameInMap("foundationType")
        public String foundationType;

        @NameInMap("foundationVersion")
        public String foundationVersion;

        @NameInMap("foundationVersionUID")
        public String foundationVersionUID;

        @NameInMap("instanceList")
        public java.util.List<InstanceInfo> instanceList;

        @NameInMap("instanceStatus")
        public String instanceStatus;

        @NameInMap("location")
        public String location;

        @NameInMap("name")
        public String name;

        @NameInMap("oldProductVersion")
        public String oldProductVersion;

        @NameInMap("oldProductVersionUID")
        public String oldProductVersionUID;

        @NameInMap("platform")
        public GetEnvironmentResponseBodyDataPlatform platform;

        @NameInMap("platformList")
        public java.util.List<Platform> platformList;

        @NameInMap("platformStatus")
        public String platformStatus;

        @NameInMap("productName")
        public String productName;

        @NameInMap("productVersion")
        public String productVersion;

        @NameInMap("siteSurveyReport")
        public GetEnvironmentResponseBodyDataSiteSurveyReport siteSurveyReport;

        @NameInMap("uid")
        public String uid;

        @NameInMap("vendorConfig")
        public String vendorConfig;

        @NameInMap("vendorType")
        public String vendorType;

        public static GetEnvironmentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEnvironmentResponseBodyData self = new GetEnvironmentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEnvironmentResponseBodyData setAdvancedConfigs(GetEnvironmentResponseBodyDataAdvancedConfigs advancedConfigs) {
            this.advancedConfigs = advancedConfigs;
            return this;
        }
        public GetEnvironmentResponseBodyDataAdvancedConfigs getAdvancedConfigs() {
            return this.advancedConfigs;
        }

        public GetEnvironmentResponseBodyData setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetEnvironmentResponseBodyData setClusterUID(String clusterUID) {
            this.clusterUID = clusterUID;
            return this;
        }
        public String getClusterUID() {
            return this.clusterUID;
        }

        public GetEnvironmentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetEnvironmentResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEnvironmentResponseBodyData setExpiredAt(String expiredAt) {
            this.expiredAt = expiredAt;
            return this;
        }
        public String getExpiredAt() {
            return this.expiredAt;
        }

        public GetEnvironmentResponseBodyData setFoundationType(String foundationType) {
            this.foundationType = foundationType;
            return this;
        }
        public String getFoundationType() {
            return this.foundationType;
        }

        public GetEnvironmentResponseBodyData setFoundationVersion(String foundationVersion) {
            this.foundationVersion = foundationVersion;
            return this;
        }
        public String getFoundationVersion() {
            return this.foundationVersion;
        }

        public GetEnvironmentResponseBodyData setFoundationVersionUID(String foundationVersionUID) {
            this.foundationVersionUID = foundationVersionUID;
            return this;
        }
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

        public GetEnvironmentResponseBodyData setInstanceList(java.util.List<InstanceInfo> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<InstanceInfo> getInstanceList() {
            return this.instanceList;
        }

        public GetEnvironmentResponseBodyData setInstanceStatus(String instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        public GetEnvironmentResponseBodyData setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public GetEnvironmentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEnvironmentResponseBodyData setOldProductVersion(String oldProductVersion) {
            this.oldProductVersion = oldProductVersion;
            return this;
        }
        public String getOldProductVersion() {
            return this.oldProductVersion;
        }

        public GetEnvironmentResponseBodyData setOldProductVersionUID(String oldProductVersionUID) {
            this.oldProductVersionUID = oldProductVersionUID;
            return this;
        }
        public String getOldProductVersionUID() {
            return this.oldProductVersionUID;
        }

        public GetEnvironmentResponseBodyData setPlatform(GetEnvironmentResponseBodyDataPlatform platform) {
            this.platform = platform;
            return this;
        }
        public GetEnvironmentResponseBodyDataPlatform getPlatform() {
            return this.platform;
        }

        public GetEnvironmentResponseBodyData setPlatformList(java.util.List<Platform> platformList) {
            this.platformList = platformList;
            return this;
        }
        public java.util.List<Platform> getPlatformList() {
            return this.platformList;
        }

        public GetEnvironmentResponseBodyData setPlatformStatus(String platformStatus) {
            this.platformStatus = platformStatus;
            return this;
        }
        public String getPlatformStatus() {
            return this.platformStatus;
        }

        public GetEnvironmentResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public GetEnvironmentResponseBodyData setProductVersion(String productVersion) {
            this.productVersion = productVersion;
            return this;
        }
        public String getProductVersion() {
            return this.productVersion;
        }

        public GetEnvironmentResponseBodyData setSiteSurveyReport(GetEnvironmentResponseBodyDataSiteSurveyReport siteSurveyReport) {
            this.siteSurveyReport = siteSurveyReport;
            return this;
        }
        public GetEnvironmentResponseBodyDataSiteSurveyReport getSiteSurveyReport() {
            return this.siteSurveyReport;
        }

        public GetEnvironmentResponseBodyData setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public GetEnvironmentResponseBodyData setVendorConfig(String vendorConfig) {
            this.vendorConfig = vendorConfig;
            return this;
        }
        public String getVendorConfig() {
            return this.vendorConfig;
        }

        public GetEnvironmentResponseBodyData setVendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }
        public String getVendorType() {
            return this.vendorType;
        }

    }

}
